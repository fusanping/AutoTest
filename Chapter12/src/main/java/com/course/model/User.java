package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024Äê11ÔÂ04ÈÕ 18:59
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

    @Override
    public String toString() {
        return (
                "{id:" + id + "," +
                "userName:" + userName + "," +
                "password:" + password + "," +
                "age:" + age + "," +
                "sex:" + sex + "," +
                "permission:" + permission + "," +
                "isDelete:" + isDelete + "}"
        );
    }

}
