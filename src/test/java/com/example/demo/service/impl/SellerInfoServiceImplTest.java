package com.example.demo.service.impl;

import com.example.demo.config.SellerInfoConfig;
import com.example.demo.daoobject.SellerInfo;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.SellerException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/7/24.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class SellerInfoServiceImplTest {

    public final String SELLERID="1001";

    @Autowired
    private SellerInfoServiceImpl sellerInfoService;

    @Test
    public void testFindBySellerId() throws Exception {
        SellerInfo result = sellerInfoService.findBySellerId(SELLERID);
        if(result == null){
            log.error("【"+SELLERID+"的卖家信息未查出!!】");
            throw new SellerException(ResultEnum.SELLINFO_FIND_FAIL);
        }else{
            log.info("【"+SELLERID+"的卖家姓名为：{}，手机号：{},地址：{}】",result.getUsername());
        }
    }
}