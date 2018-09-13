package com.byx.movie.sso.service.impl;

import com.byx.movie.common.utils.MovieResult;
import com.byx.movie.manager.pojo.UserBase;
import com.byx.movie.mapper.IUserBaseDao;
import com.byx.movie.sso.service.LoginService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author Exler
 * @FileName LoginServiceImpl
 * Time 2018-09-12 16:02
 * Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private IUserBaseDao userBaseDao;

    @Override
    public MovieResult userLogin(UserBase user) {
        Example example = new Example(UserBase.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("USER_NAME", user.getUserName());
//        UserBase userBase = userBaseDao.selectOne(user);
//        System.out.println(userBase);
        return null;
    }
}
