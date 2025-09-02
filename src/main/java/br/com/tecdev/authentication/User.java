package br.com.tecdev.authentication;

public class User {
    private String name;
    private String email;
    private String password;
    private String uuid;

    Permissions permissions = new Permissions();
    public String permission = permissions.USER;

    //setter pra mudar a permissão.
    public void setPermissions(String permissions){
        this.permission = permission;
    }

    public User (String permission){
        this.permission = permission;
    }

    public String getPermission(){
        return this.permission;
    }

    public boolean hasPermission(User user, String permissionToCheck) {
        if (permission == permissionToCheck) {
            return true;
        } else {
            return false;
        }
    }
}