
package Controller;

import Model.Venda;
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




public class VendaController {
      
     public int inserirVenda(Venda V) throws SQLException {
       int rowsInserted = 0;
         try {
            
            Util util = new Util(); // inicializar a classe util
             try (Connection conexao = Util.conecta()) {
                 String sql = "INSERT INTO Venda (cliente_ID_cliente, Funcionario_ID_Funcionario, Data) VALUES (?,?,?)";
                 PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                 statement.setInt(1,V.getID_cliente());
                 statement.setInt(2,V.getID_Funcionario());
                 statement.setDate(3,V.getData());
                   
                    rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                   if (rowsInserted > 0) {
                       System.out.println("Novo usuário inserido com sucesso");
                                         //System.out.println(statement);

                   }
               statement.close();
             }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowsInserted;
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
                
                int Data = result.getInt("Data");
                
                String output = "Venda #%d: %s - %s - %s - %s - %s ";
                System.out.println(String.format(output, ++count,Data));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Venda SET Data=?";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            
            statement.setString(1, "17/07/2017");
            
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
//            Venda V = new Venda(result.getInt("idVenda"),result.getInt("cliente_ID_cliente"), result.getInt("Funcionario_ID_Funcionario"), result.getInt("Produto_Vendido_ID_Item"), result.getInt("Data"));
       //     lista.add(V);
            }
  
            statement.close();
            conexao.close();
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }/*
  public Vector getData() throws SQLException{
      String sql = "SELECT Data FROM Venda";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getInt("Data"));
            }
            
        return v;
  }
  
  
  public int getIdByidVenda(String Data){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = Util.conecta();
    String sql = "Select idVenda from Venda where Data like '"+Data+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("idVenda");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(VendaController.class.getName()).log(Level.SEVERE,null,ex);
    
    }

    return id;
} */
  }



