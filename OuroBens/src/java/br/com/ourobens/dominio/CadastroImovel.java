/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ourobens.dominio;

/**
 *
 * @author Genocide
 */
public class CadastroImovel {
    
    private String nomeImovel;
    private String descricaoImovel;
    private String precoImovel;
    private String enderecoImovel;

    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
        this.nomeImovel = nomeImovel;
    }

    public String getDescricaoImovel() {
        return descricaoImovel;
    }

    public void setDescricaoImovel(String descricaoImovel) {
        this.descricaoImovel = descricaoImovel;
    }

    public String getPrecoImovel() {
        return precoImovel;
    }

    public void setPrecoImovel(String precoImovel) {
        this.precoImovel = precoImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }
   
}
