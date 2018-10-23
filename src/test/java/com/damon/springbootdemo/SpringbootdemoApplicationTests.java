package com.damon.springbootdemo;

import com.damon.springbootdemo.dao.TUserMapper;
import com.damon.springbootdemo.model.TUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

  @Autowired
  private TUserMapper tUserMapper;

  @Test
  public void contextLoads() {
    int pageNum=1;
    int pageSize=10;
    Page<TUser> page = PageHelper.startPage(pageNum, pageSize);
    tUserMapper.selectByExample(null);
    System.out.println("总共条数："+page.getTotal());
    for (TUser user : page.getResult()) {
      System.out.println(user.getUserName());
    }
  }

}
