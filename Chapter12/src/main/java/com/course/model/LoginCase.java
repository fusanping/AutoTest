package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024��11��04�� 22:50
 */
@Data
public class LoginCase {
    private String userName;
    private String password;
    private int id;
    private String expected;
}
