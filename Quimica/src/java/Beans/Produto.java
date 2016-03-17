/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Simone
 */
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String descricao;
    
    @Column
    private Double valor;
    
    @Column
    private Double estoque;
    
    @Column
    private Double custo;
    
    @Column
    private Status status;
    
    @Column
    private Boolean produzir;
    
    @Column
    private String marca;
    
    @Column
    private String fabricante;
    
    @Column
    private String grupo;
    
    @Column
    private String codSuaEmpresa;
    
    @Column
    private String codFabricante;
    
    @Column
    private String codBarras;
    
    @Column
    private String cor;
    
    @Column
    private String formula;
    
    @Column
    private String especificacoes;
    
    @Column
    private String fornecedores;
    
    @Column
    private String embalagems;
    
    

    public Produto() {
        this.descricao = new String();
        this.valor = new Double(0);
        this.estoque = new Double(0);
        this.custo = new Double(0);
        this.status = Status.ATIVO;
        this.produzir = true;
        this.marca = new String();
        this.fabricante = new String();
        this.grupo = new String();
        this.codSuaEmpresa = new String();
        this.codFabricante = new String();
        this.codBarras = new String();
        this.cor = new String();
        this.formula = new String();
        this.especificacoes = new String();
        this.fornecedores = new String();
        this.embalagems = new String();
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean getProduzir() {
        return produzir;
    }

    public void setProduzir(Boolean produzir) {
        this.produzir = produzir;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCodSuaEmpresa() {
        return codSuaEmpresa;
    }

    public void setCodSuaEmpresa(String codSuaEmpresa) {
        this.codSuaEmpresa = codSuaEmpresa;
    }

    public String getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(String codFabricante) {
        this.codFabricante = codFabricante;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(String fornecedores) {
        this.fornecedores = fornecedores;
    }

    public String getEmbalagems() {
        return embalagems;
    }

    public void setEmbalagems(String embalagems) {
        this.embalagems = embalagems;
    }

    

    
}
