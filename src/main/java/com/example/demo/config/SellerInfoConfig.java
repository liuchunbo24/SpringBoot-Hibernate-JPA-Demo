package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/24.
 */
@Data
@ConfigurationProperties(prefix = "seller-info")
@Component
public class SellerInfoConfig {

    String sellerId;

    String name;

    String sex;

    String phone;

    String address;
}
