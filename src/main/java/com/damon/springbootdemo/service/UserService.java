package com.damon.springbootdemo.service;

import com.damon.springbootdemo.dao.TUserMapper;
import com.damon.springbootdemo.model.TUser;
import com.damon.springbootdemo.model.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private TUserMapper tUserMapper;

  public TUser findAllUser(){
    TUserExample tUserExample = new TUserExample();
    TUserExample.Criteria criteria = tUserExample.createCriteria();
    criteria.andUserIdEqualTo(1);
    TUser tUser = tUserMapper.selectByPrimaryKey(1);
    return tUser;
  }
}
