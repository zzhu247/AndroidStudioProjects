package com.example.demologin;

public class Credentials {

    // set default user name and password
    private  String defaultUserName = "Admin";
    private  String defaultPassword = "12345678";

    Credentials(String defaultUserName, String defaultPassword){
        this.defaultUserName = defaultUserName;
        this.defaultPassword = defaultPassword;
    }

    //getters and setters
    public  String getDefaultUserName() {
        return defaultUserName;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
            this.defaultPassword = defaultPassword;
    }

    public void setDefaultUserName(String defaultUserName) {
        this.defaultUserName = defaultUserName;
    }
}