
package br.com.ourobens.dao;

import br.com.empregafacil.util.Conexao;
import br.com.ourobens.dominio.CadastroImovel;
import java.sql.PreparedStatement;

public class CadastroDAO {
    
    public void cadastraImovel(CadastroImovel cadastroImovel) throws Exception{
        
        Conexao conn = new Conexao();

        String sql = "insert into ourobens_imoveis (nome_imovel, descricao_imovel, preco_imovel, endereco_imovel) values (?,?,?,?)";
        
        PreparedStatement ps = conn.getConnection().prepareStatement(sql);
        
        ps.setString(1, cadastroImovel.getNomeImovel());
        ps.setString(2, cadastroImovel.getDescricaoImovel());
        ps.setString(3, cadastroImovel.getPrecoImovel());
        ps.setString(4, cadastroImovel.getEnderecoImovel());
        
        ps.execute();
    };
}
