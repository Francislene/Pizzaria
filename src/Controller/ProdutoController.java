
package Controller;



import Model.Cliente;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pizzaria.Util;

   
public class ProdutoController {
    private String sql;
    
  public void inserirProduto(Produto P) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
          try (Connection conexao = Util.conecta(); PreparedStatement statement = conexao.prepareStatement(sql)) {
              statement.setString(1,P.getValor_Compra());
              statement.setString(2,P.getPlataforma());
              statement.setString(3,P.getTipo());
              statement.setString(4,P.getNome());
              statement.setString(5,P.getValor_Venda());
              statement.setInt(6,P.getID_Produto());
              statement.setInt(7,P.getQtd_Min());

                int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                if (rowsInserted > 0) {
                    System.out.println("Novo usuário inserido com sucesso");
                }
          }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
  public void selectProduto()throws SQLException {
        try {
            String sql = "SELECT * FROM Produto";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = Util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                String Valor_Compra = result.getString("Valor_Compra");
                String Plataforma = result.getString("Plataforma");
                String Nome = result.getString("Nome");
                String Valor_Venda = result.getString("Valor_Venda");
                int ID_Produto = result.getInt("ID_Produto");
                int Qtd_Min = result.getInt("Qtd_Min");
                
                String output = "Produto #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count,Valor_Compra, Plataforma, Tipo, Nome, Valor_Venda));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Cliente SET Nome_cliente=?, Endereco=?, Email_cliente=?, RG_cliente=?, CPF_cliente=?, Telefone=? ";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setString(1, "Arthur");
            statement.setString(2, "Rua x");
            statement.setString(3, "Thur@hotmail.com");
            statement.setString(4, "MG 845751");
            statement.setString(5, "465465465");
            statement.setString(6, "3584145896");
            
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
}
}
  
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Cliente";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Cliente> lista = new ArrayList<Cliente>();
            int count = 0;
            while (result.next()) {
            Cliente C = new Cliente(result.getString("Nome_cliente"), result.getString("Endereco"), result.getString("Email_cliente"), result.getString("RG_cliente"), result.getString("CPF_cliente"),result.getInt("Telefone"));
            lista.add(C);
            }

            statement.close();
            conexao.close();
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
  
  public Vector getNomes() throws SQLException{
      String sql = "SELECT Nome_cliente FROM Cliente";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getString("Nome_cliente"));
            }
            
        return v;
  }
  public Cliente getPessoaByCPF(String CPF_cliente) throws SQLException {
        String sql = "SELECT * FROM Cliente WHERE CPF like '%" + CPF_cliente + "%'"; //Consulta SQL
        Util util = new Util(); //inicializando minha classe q faz conexão com banco de dados
        Connection conexao = Util.conecta(); //faz a conexão com banco
        Statement statement = conexao.createStatement();//usa da conqxão para pegar a credencial para acesso ao banco
        ResultSet result = statement.executeQuery(sql);//executa a consulta SQL e agora retoena valores, por isso ResultSet
        Cliente C = null;  //declaração de variavel  pessoa 
        while (result.next()) {
        C = new Cliente(result.getString("Nome_cliente"), result.getString("Endereco"), result.getString("Email_cliente"), result.getString("RG_cliente"), result.getString("CPF_cliente"),result.getInt("Telefone"));// inicializa pessoa
        }
        return C;

    }
  public int getIdByNome_cliente(String Nome_cliente){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = util.conecta();
    String sql = "Select ID from Cliente where Nome_cliente like '"+Nome_cliente+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("ID");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    return id;
} 
  }


