package br.com.tecdev.authentication;

public class Seller extends User {

  Permissions permissions = new Permissions();
  public String permission = permissions.SELLER;

  public void sell() {
    // lógica de venda
  }

}