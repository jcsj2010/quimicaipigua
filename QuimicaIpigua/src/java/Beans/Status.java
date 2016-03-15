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
public enum Status {
    ATIVO(true),INATIVO(false);
    
    private Boolean status;
    
    Status(Boolean status ){
        this.status = status;
    }

    

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
