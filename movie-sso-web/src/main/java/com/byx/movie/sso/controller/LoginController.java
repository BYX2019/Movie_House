package com.byx.movie.sso.controller;

import com.byx.movie.common.utils.MovieResult;
import com.byx.movie.manager.pojo.UserBase;
import com.byx.movie.sso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Exler
 * @FileName LoginController
 * Time 2018-09-12 15:56
 * Description: 登录Controller
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Value("${TOKEN_KEY}")
    private String TOKEN_KEY;

    @RequestMapping("/page/login")
    public String showLogin(String redirect, Model model)
    {
        model.addAttribute("redirect", redirect);
        return "login";
    }

    /**
     * 登录方法
     *
     * @param user
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/user/login")
    @ResponseBody
    public MovieResult login(UserBase user, HttpServletRequest request, HttpServletResponse response) {
        MovieResult result = loginService.userLogin(user);
        // 判断是否登录成功
//        if (result.getStatus() == 200) {
//            String token = result.getData().toString();
//             如果登录成功把token写入cookie
//            CookieUtils.setCookie(request, response, TOKEN_KEY, token);
//        }
//        return result;
        return null;
    }
}
