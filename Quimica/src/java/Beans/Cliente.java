/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 *
 * @author Simone
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente extends Pessoa{    
    
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario atendente;
    
    public Cliente(){}
    public Cliente(Usuario u){
        this.atendente = u;
    }

   

    public Usuario getAtendente() {
        return atendente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "atendente=" + atendente + '}';
    }

    

    
    
    
}
