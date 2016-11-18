package com.lsf.exception;

/**
 * Created by shengfeng on 2016/7/11.
 */
public class NotFoundException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 5013398084857259413L;
    @SuppressWarnings("unused")
    private String message;

    public NotFoundException(String message) {
        super(message);
    }
}
