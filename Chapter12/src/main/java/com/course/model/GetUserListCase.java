package com.course.model;

import lombok.Data;

/**
 * @author fusanping
 * @date 2024��11��04�� 22:49
 */
@Data
public class GetUserListCase {
    private String userName;
    private String age;
    private String sex;
    private String expected;
}
