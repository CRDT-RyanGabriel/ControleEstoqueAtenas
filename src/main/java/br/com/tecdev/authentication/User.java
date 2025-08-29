package br.com.tecdev.authentication;

public class User {
    private String name;
    private String email;
    private String password;
    private String uuid;

    Permissions permissions = new Permissions();
    public String permission = permissions.USER;

    // TODO: make a setter for changing permissions inside the class only

    public boolean hasPermission(User user, String permissionToCheck) {
        if (permission == permissionToCheck) {
            return true;
        } else {
            return false;
        }
    }
}