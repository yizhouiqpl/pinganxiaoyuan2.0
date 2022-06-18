package cn.yizhouiqpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yizhouiqpl.entity.User;
import cn.yizhouiqpl.service.UserService;
import cn.yizhouiqpl.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




