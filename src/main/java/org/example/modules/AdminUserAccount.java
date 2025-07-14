package org.example.modules;

public class AdminUserAccount {
    private static final String adminUsername = "admin";
    private static final String adminPassword = "adminadmin";

    public AdminUserAccount() {
    }
    public boolean checkAccountCredential(String username, String password){
        return((username.equals(adminUsername))&&(password.equals(adminPassword)));
    }
}
