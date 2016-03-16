/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Simone
 */
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String descricao;
    Double valor;
    Double estoque;
    Status status;
    Boolean produzir;
    String marca;
    String fabricante;
    String grupo;
    String codSuaEmpresa;
    String codFabricante;
    String codBarras;
    String cor;
    
    public void teste() {
        valor = 2.2;
        
        System.out.println(valor);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
