package com.cs4.springboot.service;

import com.cs4.springboot.entity.CommonResult;
import com.cs4.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 5703cs4
 * @since 2022-04-01
 */

public interface IUserService extends IService<User> {

//    Boolean login(User user);
      CommonResult login(User user) ;
}
