
package Controller;

import Model.Funcionario;
import Model.ProdutoVendido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pizzaria.Util;

public class ProdutoVendidoController {
      public void inserirProdutoVendido(ProdutoVendido PV) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
                
            String sql = "INSERT INTO Funcionario (Quantidade) VALUES (?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
           statement.setInt(1,PV.getQuantidade());
          
           
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo usuário inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
  public void selectProdutoVendido()throws SQLException {
        try {
            String sql = "SELECT * FROM ProdutoVendido";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                int Quantidade = result.getInt("Quantidade");
                
                
                String output = "Agenda #%d: %s ";
                System.out.println(String.format(output, ++count, Quantidade ));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Funcionario SET Quantidade=?";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setInt(1,5);
            
            
        
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
    
}
  }
   
}  

