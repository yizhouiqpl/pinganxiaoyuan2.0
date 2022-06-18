package cn.yizhouiqpl.util;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/14/21:38
 */
public class FastDFSUtil {

    public static String uploadFile(HttpServletRequest request) throws Exception {
        List<String> fileList = new ArrayList<>(); // 用来保存上传到FastDFS上面的图片地址
        MultipartHttpServletRequest multiReq = (MultipartHttpServletRequest) request;

        Iterator<String> fileNames = multiReq.getFileNames();

        while (fileNames.hasNext()) {

            MultipartFile file = multiReq.getFile(fileNames.next());

            //获取文件名
            String filename = file.getOriginalFilename();
            //获得文件后缀名
            String suffix = StringUtils.substringAfterLast(filename, ".");
            /**
             * 三种方式获得resources 下面的配置文件
             * 1、ClientGlobal.init("H:\\workingspaceA\\JavaA\\IDEA\\ProjectA\\afengshortvideo2.0\\common\\src\\main\\resources\\fastdfs-client.properties");
             *      里面放的是绝对路径，但是一般不这么直接放绝对路径，而是通过第2种方式
             * 2、String fdfsPath = new ClassPathResource("fastdfs-client.properties").getFile().getAbsolutePath();
             *      通过这个方法获得resources下的"fastdfs-client.properties"文件，再获得其绝对路径
             *    ClientGlobal.init(fdfsPath); 将其放入init方法中
             *      要求这两种方式，都需要配置文件各参数前面都不带"fastfds."才可以
             * 3、ClientGlobal.initByProperties("fastdfs-client.properties");
             *      这样直接获取，但是需要配置文件中需要带前缀"fastfds."
             */
//        ClientGlobal.init("H:\\workingspaceA\\JavaA\\IDEA\\ProjectA\\afengshortvideo2.0\\common\\src\\main\\resources\\fastdfs-client.properties");
//        String fdfsPath = new ClassPathResource("fastdfs-client.properties").getFile().getAbsolutePath();
//        ClientGlobal.init(fdfsPath);
            //创建管理端对象
            ClientGlobal.initByProperties("fastdfs-client.properties");
            TrackerClient client = new TrackerClient();
            //通过管理端获得连接
            TrackerServer connection = client.getConnection();
            StorageClient1 storageClient1 = new StorageClient1(connection, null);
            NameValuePair[] meta_list = new NameValuePair[1];
            // 需要传入文件名
            meta_list[0] = new NameValuePair("fileName", filename);

//        System.out.println(meta_list);
//        System.out.println(file.getBytes());
            String path = storageClient1.upload_file1(file.getBytes(), suffix, meta_list);
            fileList.add(path);
        }

        Gson gson = new Gson();


        return gson.toJson(fileList);
    }


    public static String uploadFile2(MultipartFile[] files) throws Exception {
        List<String> fileList = new ArrayList<>();
        for (MultipartFile file : files) {
            //获取文件名
            String filename = file.getOriginalFilename();
            //获得文件后缀名
            String suffix = StringUtils.substringAfterLast(filename, ".");
            ClientGlobal.initByProperties("fastdfs-client.properties");
            //创建管理端对象
            TrackerClient client = new TrackerClient();
            //通过管理端获得连接
            TrackerServer connection = client.getConnection();
            StorageClient1 storageClient1 = new StorageClient1(connection, null);
            NameValuePair[] meta_list = new NameValuePair[1];
            // 需要传入文件名
            meta_list[0] = new NameValuePair("fileName", filename);

            String path = storageClient1.upload_file1(file.getBytes(), suffix, meta_list);
            fileList.add(path);
        }
        Gson gson = new Gson();
        return gson.toJson(fileList);
    }

}
