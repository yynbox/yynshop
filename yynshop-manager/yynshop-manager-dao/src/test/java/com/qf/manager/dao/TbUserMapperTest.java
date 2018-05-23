package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbUser;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yyn on 2018/5/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TbUserMapperTest extends TestCase {

    @Autowired
    private TbUserMapper tbUserMapper;
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(10L);
        System.err.println("名字是:"+tbUser.getPname());
    }
}