package edu.escuelaing.edu.ieti.laboratorio6.model;

public class User {

    private String Id;
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(String Id, String name, String email, String password) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + ", password=" + password + "}";
    }
}