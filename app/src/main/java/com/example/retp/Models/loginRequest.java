package com.example.retp.Models;

public class loginRequest {
    private String userName ;
    private String password ;
    private Boolean rememberMe ;

    public loginRequest(String UserName, String PassWord){
        userName=UserName;
        password=PassWord;
        //rememberMe= RememberMe;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  //  public Boolean getRememberMe() {
    //    return rememberMe;
    //}

    //public void setRememberMe(Boolean rememberMe) {
      //  this.rememberMe = rememberMe;
    //}
}
