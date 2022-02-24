package com.lin.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author LINKEYI
 * @date 2022/02/07/10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {
    /**
     * 返回状态码
     **/
    private Integer code;
    /**
     * 返回是否调用成功
     **/
    private String message;
    /**
     * 返回的数据
     **/
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
