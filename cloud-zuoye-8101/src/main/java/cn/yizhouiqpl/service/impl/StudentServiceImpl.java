package cn.yizhouiqpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yizhouiqpl.entity.Student;
import cn.yizhouiqpl.service.StudentService;
import cn.yizhouiqpl.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




