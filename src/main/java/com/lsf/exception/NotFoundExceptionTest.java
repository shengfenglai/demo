package com.lsf.exception;

/**
 * Created by shengfeng on 2016/7/11.
 */
public class NotFoundExceptionTest {
    public static void main(String[] args) throws NotFoundException {
        if(null == null) {
            throw new NotFoundException("user not found");
        }
    }
}
