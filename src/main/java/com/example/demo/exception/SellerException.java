package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by Administrator on 2019/7/24.
 */

@Getter
public class SellerException extends RuntimeException {

    private Integer code;

    public SellerException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public SellerException(Integer code,String message){
        super(message);
        this.code=code;

    }
}
