package com.example.demo.dao;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class TestMapperTest {

    @Resource
    private TestMapper testMapper;

    @Test
    public void insert() {
        com.example.demo.entity.Test t = new com.example.demo.entity.Test();
        String v = "haha\nhehe";
        String v2 = "qqqaaa";
        t.setValue(v);
        t.setValuez(v2);
        testMapper.insert(t);
    }

}