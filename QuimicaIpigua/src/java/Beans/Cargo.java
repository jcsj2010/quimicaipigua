/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Simone
 */
public enum Cargo {
    ADMINISTRADOR("ADMIN"),VENDEDOR("VENDEDOR"),PRODUCAO("PRODUCAO");
    
    private String cargo;
    
    Cargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
