
package Controller;

import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pizzaria.Util;




public class VendaController {
      
     public void inserirVenda(Venda V) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
             try (Connection conexao = Util.conecta()) {
                 String sql = "INSERT INTO Venda (idVenda, Data) VALUES (?,?)";
                 PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                 statement.setInt(1,V.getIdVenda());
                 statement.setInt(2,V.getData());
                    
                   int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                   if (rowsInserted > 0) {
                       System.out.println("Novo usuário inserido com sucesso");
                   }
               statement.close();
             }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
  public void selectVenda()throws SQLException {
        try {
            String sql = "SELECT * FROM Venda";
            Util util = new Util(); // inicializar a classe util
            Connection conexao = Util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                int idVenda = result.getInt("idVenda");
                int Data = result.getInt("Data");
                
                String output = "Venda #%d: %s - %s ";
                System.out.println(String.format(output, ++count, idVenda, Data));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Venda SET idVenda=?, Data=?";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setString(1, "122.589.659.78");
            statement.setString(2, "17/07/2017");
            
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
}
}
  
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Venda";

            Util util = new Util();
            Connection conexao = Util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Venda> lista = new ArrayList<>();
            int count = 0;
            while (result.next()) {
            Venda V = new Venda(result.getInt("idVenda"), result.getInt("Data"));
            lista.add(V);
            }

            statement.close();
            conexao.close();
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
  
  
  public int getIdByidVenda(String idVenda){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = Util.conecta();
    String sql = "Select idVenda from Venda where idVenda like '"+idVenda+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("idVenda");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(VendaController.class.getName()).log(Level.SEVERE,null,ex);
    
    }

    return id;
} 
  }



