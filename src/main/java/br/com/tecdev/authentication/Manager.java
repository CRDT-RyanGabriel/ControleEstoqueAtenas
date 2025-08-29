package br.com.tecdev.authentication;

public class Manager extends User {

  Permissions permissions = new Permissions();
  public String permission = permissions.MANAGER;

  public void getReports() {
    // lógica de relatórios (vendas, estoque, etc.)
  }

}