package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024年11月01日 11:04
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int role_ids;
}
