package com.muzeaback.back.DTO;



public class UserDTO {

    private String login;
    private String pass;
    private String fName;
    private String lName;
    private String email;
    private boolean admin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                '}';
    }

    public UserDTO(String login, String pass, String fName, String lName, String email, boolean admin) {
        this.login = login;
        this.pass = pass;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.admin = admin;
    }

    public UserDTO() {
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}
