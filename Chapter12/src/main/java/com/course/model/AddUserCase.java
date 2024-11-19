package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024Äê11ÔÂ04ÈÕ 19:16
 */
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
    private String expected;
}
