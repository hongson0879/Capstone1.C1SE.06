package com.example.retp.Models;

public class registerRequest {
    private String userName ;
    private String password ;
    private String confirmPassword ;
    private String firstName ;
    private String lastName;
    private String phoneNumber;
    private String Email ;
    public registerRequest(String UserName, String Password, String ConfirmPassword, String FirstName, String LastName, String PhoneNumber, String email){
        userName = UserName;
        password=Password;
        confirmPassword=ConfirmPassword;
        firstName=FirstName;
        lastName = LastName;
        phoneNumber=PhoneNumber;
        Email = email;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }









}
