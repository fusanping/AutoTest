package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024年11月06日 20:59
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
}
