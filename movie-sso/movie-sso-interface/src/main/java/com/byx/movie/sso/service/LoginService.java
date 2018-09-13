package com.byx.movie.sso.service;

import com.byx.movie.common.utils.MovieResult;
import com.byx.movie.manager.pojo.UserBase;

/**
 * @author Exler
 * Description: 登录service
 */
public interface LoginService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    MovieResult userLogin(UserBase user);
}
