package com.example.test1904;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    private String id;
    private String phone;
    private String age;

}