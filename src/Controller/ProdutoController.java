
package Controller;



import Model.Cliente;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import pizzaria.Util;

   
public class ProdutoController {
    
  public void inserirProduto(Produto P) throws SQLException {
        try {
            String sql = "INSERT INTO Produto (Valor_Compra,Plataforma,Tipo,Nome,Valor_Venda,Qtd_Min) VALUES (?,?,?,?,?,?)";
            Util util = new Util(); // inicializar a classe util
          try (Connection conexao = Util.conecta(); PreparedStatement statement = conexao.prepareStatement(sql)) {
              statement.setString(1,P.getValor_Compra());
              statement.setString(2,P.getPlataforma());
              statement.setString(3,P.getTipo());
              statement.setString(4,P.getNome());
              statement.setFloat(5,P.getValor_Venda());
              statement.setInt(6,P.getQtd_Min());

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
                String Tipo = result.getString("Tipo");
                String Nome = result.getString("Nome");
                float Valor_Venda = result.getFloat("Valor_Venda");
                 int Qtd_Min = result.getInt("Qtd_Min");
                
                String output = "Produto #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count,Valor_Compra, Plataforma, Tipo, Nome, Valor_Venda, Qtd_Min));
                             
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Cliente SET Valor_Compra=?, Plataforma=?, Tipo=?, Nome=?, Valor_Venda=?, Qtd_Min=? ";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setString(1, "10");
            statement.setString(2, "1");
            statement.setString(3, "Comestivel");
            statement.setString(4, "Molho");
            statement.setFloat(5, 1025 );
            statement.setInt(6, 6);
            
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
}
}
  
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Produto";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Produto> lista = new ArrayList<Produto>();
            int count = 0;
            while (result.next()) {
            Produto P = new Produto(result.getString("Valor_Compra"), result.getString("Plataforma"), result.getString("Tipo"), result.getString("Nome"), result.getFloat("Valor_Venda"),result.getInt("Qtd_Min"));
          
            lista.add(P);
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
      String sql = "SELECT Nome FROM Produto";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getString("Nome"));
            }
            
        return v;
  }

    

   

  }


