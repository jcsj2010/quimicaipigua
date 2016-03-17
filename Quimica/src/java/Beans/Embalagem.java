/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.persistence.Column;
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
    private Integer id;
    @Column
    private String descricao;  
    @Column
    private String fornecedor;   
    @Column
    private String cor;
    @Column(precision = 2)
    private Double estoqueMin;
    @Column(precision = 2)
    private Double estoque;
    @Column(precision = 2)
    private Double volume;
    @Column(precision = 2)
    private Double preco;
    
    public void Embalagem(){
    this.descricao = new String();    
    this.fornecedor = new String();
    cor= new String();
    this.estoque = 0.0;
    this.estoqueMin = 0.0;
    this.volume = 0.0;
    this.preco = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(Double estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
