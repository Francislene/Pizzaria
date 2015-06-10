package Controller;

import Model.Estoque;
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


public class EstoqueController {
    
public void inserirEstoque(Estoque E) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
            
            
                //String nome_cliente, endereco, email_cliente, RG_cliente, CPF_cliente; 
   
            
            
          String sql = "INSERT INTO Estoque (Quantidade) VALUES (?)";
          PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
          statement.setInt(1,E.getQuantidade());
             
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
  public void selectEstoque()throws SQLException {
        try {
            String sql = "SELECT * FROM Estoque";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                
                int Quantidade = result.getInt("Quantidade");
                
                String output = "Estoque #%d: %s ";
                System.out.println(String.format(output, ++count,Quantidade));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Estoque SET Quantidade=?";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setString(1, "7");
            
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
}
}
  
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Estoque";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Estoque> lista = new ArrayList<Estoque>();
            int count = 0;
            while (result.next()) {
            Estoque E = new Estoque(result.getInt("Quantidade"));
            lista.add(E);
            }

            statement.close();
            conexao.close();
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
  
  public Vector getQuantidade() throws SQLException{
      String sql = "SELECT Quantidade FROM Estoque";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getInt("Quantidade"));
            }
            
        return v;
  }
 
  public int getIdByQuantidade(int Quantidade){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = util.conecta();
    String sql = "Select ID from Estoque where Quantidade like '"+Quantidade+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("ID");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(EstoqueController.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    return id;
} 
  }

