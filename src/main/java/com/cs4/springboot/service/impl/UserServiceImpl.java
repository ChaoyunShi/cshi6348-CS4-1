package com.cs4.springboot.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cs4.springboot.entity.CommonResult;
import com.cs4.springboot.entity.User;
import com.cs4.springboot.mapper.UserMapper;
import com.cs4.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  Service implementation
 * </p>
 *
 * @author 5703cs4
 * @since 2022-04-01
 */
@MapperScan("com.cs4.springboot.mapper")
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public CommonResult login(User user) {
        if (StrUtil.isEmpty(user.getLoginEmail())){
            return CommonResult.validateFailed(" Account number cannot be empty ");
        }
        if (StrUtil.isEmpty(user.getPassword())){
            return CommonResult.validateFailed(" The password cannot be empty ");
        }
// Query users by login name
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("login_email", user.getLoginEmail());
        User user1=userMapper.selectOne(wrapper);
// Compare passwords
        if (user1!=null&&user1.getPassword().equals(user.getPassword())){
            return CommonResult.success(user1.getAuth(),"Successfully login");
        }
        return CommonResult.validateFailed(" Login failed ");
    }

}
//    @Override
//    public Boolean login(User user) {
//        if(StrUtil.isEmpty(user.getLoginEmail()) || StrUtil.isEmpty(user.getPassword())) {
//            return false;
//        }
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("login_email",user.getLoginEmail());
//        User user1 = userMapper.selectOne(queryWrapper);
//        if (user1==null) {
//            return false;
//        }
//        if (!user1.getPassword().equals(user.getPassword())) {
//            return false;
//        }
//        return true;
//    }

