package com.afl.utils.except;

/**
 * 通用异常类
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-07 21:43
 */
public class CommonException extends RuntimeException {

    public CommonException(String msg) {
        super(msg);
    }

}
