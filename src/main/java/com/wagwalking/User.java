package com.wagwalking;

public class User {

    private String email;
    private String passward;
    private String firstName;
    private String lastName;
    private String cellPhone;

    public User(String email, String passward, String firstName, String lastName, String cellPhone) {

        this.email = email;
        this.passward = passward;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassward() {
        return passward;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

}
