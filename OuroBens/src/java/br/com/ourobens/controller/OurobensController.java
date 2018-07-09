/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ourobens.controller;

import br.com.ourobens.dao.CadastroDAO;
import br.com.ourobens.dominio.CadastroImovel;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Genocide
 */

@Controller
public class OurobensController {
    
    @RequestMapping("/cadastroSucesso")
    public String ourobens(Model model, CadastroImovel cadastroImovel) throws Exception{
        
        CadastroDAO dao = new CadastroDAO();
        
        try {
            dao.cadastraImovel(cadastroImovel);
            
            model.addAttribute("retorno", cadastroImovel.getNomeImovel());
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return "index";
           
    }
    
    @RequestMapping("/cadastroImovel")
    public String cadastro_imovel(){
        
        return "cadastro_imovel";
        
    }
    
    @RequestMapping("/listarImovel")
    public String lista_imovel(Model model){
        CadastroDAO dao = new CadastroDAO();
        
        try {
            model.addAttribute("lista", dao.listarImovel());
        } catch (Exception e) {
        }
        
        return "listarImovel";
        
    }
    
}
