package com.example.demo.service.impl;

import com.example.demo.config.SellerInfoConfig;
import com.example.demo.daoobject.SellerInfo;
import com.example.demo.repository.SellerInfoRepository;
import com.example.demo.service.SellerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


/**
 * Created by Administrator on 2019/7/24.
 */
@Service
@Slf4j
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findBySellerId(String sellerId){
        SellerInfo sellerInfo = repository.findBySellerId(sellerId);
        return sellerInfo;
    }
}
