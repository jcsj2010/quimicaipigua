/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Beans.Pessoa;
import Beans.Status;
import Beans.Usuario;

/**
 *
 * @author Simone
 */
public class FabricaBeans {
    Usuario usuario;
    Pessoa pessoa;
    
    public FabricaBeans(){}
    
    public Usuario criaUsuario(){
        if(usuario != null){
            usuario = null;
        }
        usuario = new Usuario();
        usuario.setStatus(Status.ATIVO);
        return usuario;
    }
    public Pessoa criaPessoa(){
        if(pessoa != null){
            pessoa = null;
        }
        pessoa = new Usuario();
        pessoa.setStatus(Status.ATIVO);
        return pessoa;
    }
    
}
