package com.example.demo.service.impl;


import com.example.demo.service.MyLambdaInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/8/7.
 */
@Service
@Slf4j
public class MyInterfaceImpl implements MyLambdaInterface {

    @Override
    public void doSomeShit(String str){
        log.info("【写点啥好呢:{}】",str);
    }
}
