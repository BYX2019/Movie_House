package com.byx.movie.sso.service.impl;

import com.byx.movie.common.utils.MovieResult;
import com.byx.movie.manager.pojo.UserBase;
import com.byx.movie.manager.pojo.UserBaseExample;
import com.byx.movie.mapper.UserBaseMapper;
import com.byx.movie.sso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Exler
 * @FileName LoginServiceImpl
 * Time 2018-09-12 16:02
 * Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public MovieResult userLogin(UserBase user) {
        UserBaseExample example = new UserBaseExample();
        UserBaseExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        List<UserBase> list = userBaseMapper.selectByExample(example);
        for (UserBase userBase : list) {
            System.out.println(userBase);
        }
        return null;
    }
}
