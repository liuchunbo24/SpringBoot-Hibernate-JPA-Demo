package com.example.demo.service;

import com.example.demo.daoobject.SellerInfo;

/**
 * Created by Administrator on 2019/7/24.
 */
public interface SellerInfoService {

    /**
     *
     * @param sellerId
     * @return
     */
    SellerInfo findBySellerId(String sellerId);
}
