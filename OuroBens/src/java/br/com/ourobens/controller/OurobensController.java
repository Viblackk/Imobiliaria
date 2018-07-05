/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ourobens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Genocide
 */

@Controller
public class OurobensController {
    
    @RequestMapping("/olaMundo")
    public String ourobens(){
        
        return "index";
           
    }
    
    @RequestMapping("/cadastroImovel")
    public String cadastro_imovel(){
        
        return "cadastro_imovel";
        
    }
    
}
