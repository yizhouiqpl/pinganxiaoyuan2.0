package cn.yizhouiqpl.controller;

import cn.yizhouiqpl.back.R;
import cn.yizhouiqpl.entity.Work;
import cn.yizhouiqpl.entity.WorkVO;
import cn.yizhouiqpl.entity.Zuoye;
import cn.yizhouiqpl.entity.ZuoyeNotify;
import cn.yizhouiqpl.enums.zuoye.ZuoyeStatus;
import cn.yizhouiqpl.service.WorkService;
import cn.yizhouiqpl.service.ZuoyeService;
import cn.yizhouiqpl.util.FastDFSUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/13/22:27
 */
@Api(tags = "作业管理")
@RestController
@RequestMapping("zuoye")
@Slf4j
public class ZuoYeController {

    @Resource
    private ZuoyeService zuoyeService;

    @Resource
    private WorkService workService;

    @ApiOperation("测试环境搭建")
    @GetMapping("hello/{id}")
    public R hello(@PathVariable int id) {
        log.info("测试环境搭建");
        return R.ok().setCode(200).setMessage("查询成功").data("zuoye", zuoyeService.getById(id));
    }

    @ApiOperation("添加作业")
    @PostMapping("add")
    public R createZuoye(Zuoye zuoye, HttpServletRequest request) throws Exception { // @RequestBody 接收JSON值
        log.info("添加作业");

//        List<MultipartFile> fileList = new ArrayList<>();
//
//        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
//        Iterator<String> fileNames = multiRequest.getFileNames();
//        while (fileNames.hasNext()) {
//            MultipartFile file = multiRequest.getFile(fileNames.next());
//            fileList.add(file);
//        }
//        System.out.println(fileList);

//        MultipartHttpServletRequest multiReq = (MultipartHttpServletRequest) request;
//        MultipartFile file = multiReq.getFile("file1");
        String fileStr = FastDFSUtil.uploadFile(request);
        zuoye.setzFile(fileStr);
        zuoye.setzCreatetime(new Date());

        if (zuoyeService.save(zuoye)) {
            return R.ok().setCode(200).setMessage("添加成功");
        } else {
            return R.error().setMessage("添加失败");
        }
    }
    
    @ApiOperation("添加作业-2")
    @PostMapping("add2")
    public R createZuoye2(Zuoye zuoye, MultipartFile[] files) throws Exception { // @RequestBody 接收JSON值
        log.info("添加作业-2");
        String fileStr = FastDFSUtil.uploadFile2(files);
        zuoye.setzFile(fileStr);
        zuoye.setzCreatetime(new Date());

        if (zuoyeService.save(zuoye)) {
            return R.ok().setCode(200).setMessage("添加成功");
        } else {
            return R.error().setMessage("添加失败");
        }
    }

    @ApiOperation("学生作业通知")
    @GetMapping("notify-list/{sId}/{date}")
    public R notifyList(
            @PathVariable int sId,
            @PathVariable String date
    ) {
        log.info("某一学生的全部作业");
        List<ZuoyeNotify> zuoyeNotifies = zuoyeService.notifyList(sId, date);
        return R.ok().data("zuoyeNotifies", zuoyeNotifies);
    }

    @ApiOperation("学生作业提交")
    @PostMapping("work/add")
    public R zuoyeSubmit(Work work, MultipartFile[] files) throws Exception {
        log.info("学生提交作业");

        String fileStr = FastDFSUtil.uploadFile2(files);
        work.setwFile(fileStr);
        work.setwSubtime(new Date());

        if (workService.save(work)) {
            return R.ok().setCode(200).setMessage("提交作业成功");
        } else {
            return R.error();
        }
    }

    @ApiOperation("老师端作业管理列表")
    @GetMapping("list/{date}/{status}")
    public R zuoyeAdministration(
            @PathVariable String date,
            @PathVariable int status) {
        log.info("作业管理列表");
        List<WorkVO> workVOList = workService.getWorkList(date, status);
        return R.ok().setMessage("查询成功").setCode(200).data("workList", workVOList);
    }

    @ApiOperation("老师批改作业")
    @PutMapping("comment")
    public  R teacherComment(int status, int wId, String comment) {
        log.info("老师批改作业");
        Work work = new Work();
        work.setwComment(comment); // 评语
        if (1 == status) { // 为 1 则表示 `通过`
            work.setwStatus(ZuoyeStatus.ADOPT.getType());
        } else {
            work.setwStatus(ZuoyeStatus.FAIL.getType());
        }
        QueryWrapper<Work> wrapper = new QueryWrapper<>();
        wrapper.eq("w_id", wId);
        if (workService.update(work, wrapper)) {
            return R.ok().setCode(200).setMessage("批改成功");
        } else {
            return R.error();
        }
    }

}
