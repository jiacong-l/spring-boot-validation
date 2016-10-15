package com.zheng.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by zhenglian on 2016/10/15.
 */
public class User {
    private Long id;
    @NotEmpty(message = "${validation.notEmpty}")
    @Length(min = 5, max = 20, message = "${validation.length}")
    private String username;
    @NotEmpty(message = "${validation.notEmpty}")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
