package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author fusanping
 * @date 2024Äê11ÔÂ04ÈÕ 22:58
 */

public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;
    public static String getUserListUrl;


    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore store;
}
