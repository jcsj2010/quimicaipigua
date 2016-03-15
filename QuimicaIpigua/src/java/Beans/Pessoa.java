/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simone
 */
public abstract class Pessoa {

    private Long idPessoa;
    private String codigo;
    private Status status;
    private String nomerazãosocial;
    private String apelidofantasia;
    private String cpfcnpj;
    private String rgie;
    private String im;
    private java.sql.Date DataAdd; private java.util.Date DataAddAux;
    private java.sql.Date DataUpd; private java.util.Date DataUpdAux;
    private Endereco enderecoPrincipal;
    private List<Endereco> enderecos;
    private Email emailPrincipal;
    private List<Email> emails;
    private Telefone telefonePrincipal;
    private List<Telefone> telefones;

    public Pessoa() {
        this.codigo = new String();
        this.status = Status.ATIVO;
        this.nomerazãosocial = new String();
        this.apelidofantasia = new String();
        this.cpfcnpj = new String();
        this.rgie = new String();
        this.im = new String();
        //formatacao data
        this.DataAddAux = new Date(System.currentTimeMillis());
        this.DataUpdAux = new Date(System.currentTimeMillis());
        this.DataAdd = new Date(this.DataAddAux.getTime());
        this.DataUpd = new Date(this.DataUpdAux.getTime());
        //////////////////
        this.enderecoPrincipal = new Endereco(this);
        this.enderecos = new ArrayList();
        this.emailPrincipal = new Email(this);
        this.emails = new ArrayList();
        this.telefonePrincipal = new Telefone();
        this.telefones = new ArrayList();
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNomerazãosocial() {
        return nomerazãosocial;
    }

    public void setNomerazãosocial(String nomerazãosocial) {
        this.nomerazãosocial = nomerazãosocial;
    }

    public String getApelidofantasia() {
        return apelidofantasia;
    }

    public void setApelidofantasia(String apelidofantasia) {
        this.apelidofantasia = apelidofantasia;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getRgie() {
        return rgie;
    }

    public void setRgie(String rgie) {
        this.rgie = rgie;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public java.sql.Date getDataAdd() {
        return DataAdd;
    }

    public void setDataAdd(java.sql.Date DataAdd) {
        this.DataAdd = DataAdd;
    }

    public java.util.Date getDataAddAux() {
        return DataAddAux;
    }

    public void setDataAddAux(java.util.Date DataAddAux) {
        this.DataAddAux = DataAddAux;
    }

    public java.sql.Date getDataUpd() {
        return DataUpd;
    }

    public void setDataUpd(java.sql.Date DataUpd) {
        this.DataUpd = DataUpd;
    }

    public java.util.Date getDataUpdAux() {
        return DataUpdAux;
    }

    public void setDataUpdAux(java.util.Date DataUpdAux) {
        this.DataUpdAux = DataUpdAux;
    }

    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    public void setEnderecoPrincipal(Endereco enderecoPrincipal) {
        this.enderecoPrincipal = enderecoPrincipal;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Email getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(Email emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Telefone getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public void setTelefonePrincipal(Telefone telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    

}
