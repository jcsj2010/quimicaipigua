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
 * @author JoseCarlos
 */
@Entity
public class Embalagem implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String descricao;
    Double volume;
    String fornecedor;
    Double preco;
    String cor;
    Double estoqueMin;
    Double estoque;
    
    //terminar essa classe
}
