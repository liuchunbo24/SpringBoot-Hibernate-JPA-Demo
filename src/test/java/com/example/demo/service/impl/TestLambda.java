package com.example.demo.service.impl;

import com.example.demo.service.MyLambdaInterface;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/8/7.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TestLambda {

    @Autowired
    private MyInterfaceImpl myInterface;

    @Test
    public void test() throws Exception {
        myInterface.doSomeShit("fuck you , son of bitch!");
    }

    @Test
    public void testLambda() throws Exception {
        //通过Lambda表达式重写接口方法 ，与上面测试单元用法比起来  减少代码的书写量
        MyLambdaInterface myLambdaInterface=(s)-> log.info(s);
        myLambdaInterface.doSomeShit("fuck you , Lambda");

        //Lambda表达式遍历List
        List<String> list = new ArrayList<>();
        list.add("susan");
        list.add("jack");
        list.add("rose");
        list.add("evan");
        list.forEach(name-> System.out.println("name = " + name));
    }
}
