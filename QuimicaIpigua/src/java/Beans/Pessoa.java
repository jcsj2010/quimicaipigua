/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Simone
 */
public class Pessoa {

    Long id;    
    String codigo;
    Status status;
    String nomerazãosocial;
    String apelidofantasia;
    String cpfcnpj;
    String rgie;
    String região;                    
    
    
    Date DataAdd;
    Date DataUpd;
    
    Endereco enderecoPrincipal;
    List<Endereco> enderecos;
    String emailPrincipal;
    List<String> emails;
    String telefonePrincipal;  
    List<String> telefones;  
    
    public void teste(){
        Status st = Status.INATIVO;
        System.out.println( st.getStatus() ); 
    }
}
