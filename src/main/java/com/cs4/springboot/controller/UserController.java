package com.cs4.springboot.controller;


import com.cs4.springboot.entity.CommonResult;
import com.cs4.springboot.entity.User;
import com.cs4.springboot.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 5703cs4
 * @since 2022-04-01
 */
@Api("user login")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
//    private IUserService userService;

//    @PostMapping("/login")
//    public boolean login(@RequestBody UserDTO userDTO) {
//        String username = userDTO.getLoginEmail();
//        String password = userDTO.getPassword();
//        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
//            return false;
//        }
//
//        return userService.login(userDTO);
//        TokenUtils.genToken();
//
//
//    }

//    @ApiResponses(value =
//            {
//                    @ApiResponse(responseCode = "200", description= "Successfully login"),
//                    @ApiResponse(responseCode = "404", description= "Error")
//            }
//    )
    @ApiOperation(value = "user login")
    @PostMapping("/login")
    public CommonResult login(@RequestBody User user) {

        return userService.login(user);
    }
//    public String login(@RequestBody User user) {
//        if(userService.login(user)) {
//            return "Successfully login!";
//        } else {
//            return "Login failed!";
//        }
//
//    }

}


