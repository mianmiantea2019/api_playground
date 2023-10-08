package com.shareapi.project.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author christyg
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
