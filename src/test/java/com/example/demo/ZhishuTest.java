package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ZhishuTest {

    @Autowired
    public Zhishu mockZhishu;

    @Test
    public void test(){

        boolean a= mockZhishu.judge(4);
        System.out.println(a);
        assertEquals(false, a);
//        assertEquals(true, a);
    }
}
