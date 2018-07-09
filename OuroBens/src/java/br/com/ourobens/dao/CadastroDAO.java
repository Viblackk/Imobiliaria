
package br.com.ourobens.dao;

import br.com.empregafacil.util.Conexao;
import br.com.ourobens.dominio.CadastroImovel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<CadastroImovel> listarImovel() throws SQLException, Exception{
        List<CadastroImovel> lista = new ArrayList<>();
        
        Conexao conn = new Conexao();
        
        String sql = "select * from ourobens_imoveis";
        
        PreparedStatement ps = conn.getConnection().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            CadastroImovel cadastroImovel = new CadastroImovel();
            
            cadastroImovel.setNomeImovel(rs.getString("nome_imovel"));
            cadastroImovel.setDescricaoImovel(rs.getString("descricao_imovel"));
            cadastroImovel.setPrecoImovel(rs.getString("preco_imovel"));
            cadastroImovel.setEnderecoImovel(rs.getString("endereco_imovel"));
            
            lista.add(cadastroImovel);
        }
        
        
        
        return lista;
    };
}
