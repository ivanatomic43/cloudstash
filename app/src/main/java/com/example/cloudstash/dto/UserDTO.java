package com.example.cloudstash.dto;

import com.example.cloudstash.model.User;
public class UserDTO{

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;

    public UserDTO(){}

    public UserDTO(String firstName, String lastName, String email, String phoneNumber, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public UserDTO(User u){
        this.firstName = u.getFirstName();
        this.lastName = u.getLastName();
        this.email = u.getEmail();
        this.phoneNumber = u.getPhoneNumber();
        this.password = u.getPassword();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
