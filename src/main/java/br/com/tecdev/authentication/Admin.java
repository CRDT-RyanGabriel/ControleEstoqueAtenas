package br.com.tecdev.authentication;

public class Admin extends User {

    Permissions permissions = new Permissions();
    public String permission = permissions.ADMIN;

    UserManagerSystem userManager = new UserManagerSystem();
    // agora podemos fazer userManager.addUser() ou userManager.removeUser() etc...

    public void getAllUsers() {
        // metodo para pegar todos os usuarios do sistema e mostrar na tela
    }

    public void manageSystemSettings() {
        // lógica para gerenciar configurações do sistema
    }

}
