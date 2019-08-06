package com.example.demo.repository;

import com.example.demo.daoobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/7/24.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findBySellerId(String sellerId);
}
