package com.lsf.object;

import java.io.Serializable;

public class ObjectCloneBean implements Serializable {

    private static final long serialVersionUID = -8302871064487814045L;
    
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
