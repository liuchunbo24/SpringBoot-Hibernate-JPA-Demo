package com.example.demo.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2019/7/24.
 */
@Getter
public enum ResultEnum {
    SUCCESS(0,"成功"),
    SELLINFO_FIND_FAIL(1,"卖家信息查询失败");

    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
