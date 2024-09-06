package com.learning;

public class Identity {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("Username is : " + username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("Password is : " + password);
        this.password = password;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
