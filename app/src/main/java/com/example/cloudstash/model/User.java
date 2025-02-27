package com.example.cloudstash.model;

public class User {

    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String repeatedPassword;

    public User(){}

    public User( int id, String firstName, String lastName, String eMail, String phoneNumber, String password, String repeatedPassword){
        this.id = id;
        this.firstName = firstName;
        this.lastName=lastName;
        this.email = eMail;
        this.phoneNumber=phoneNumber;
        this.password=password;
        this.repeatedPassword= repeatedPassword;
    }

    public User(String phoneNumber, String password){
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public int getID() { return id; }

    public void setId(int id) {
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

    public void setEmail(String eMail){ this.email = eMail;}

    public String getEmail(){return email;}

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

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", repeatedPassword='" + repeatedPassword + '\'' +
                '}';
    }
}