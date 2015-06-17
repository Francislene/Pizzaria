
package Controller;

import Model.Cliente;
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


public class ClienteController {
    
     public void inserirCliente(Cliente C) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
            
            
                //String nome_cliente, endereco, email_cliente, RG_cliente, CPF_cliente; 
   
            
            
          String sql = "INSERT INTO Cliente (nome_cliente, endereco, email_cliente, RG_cliente, CPF_cliente, telefone) VALUES (?,?,?,?,?,?)";
          PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
          statement.setString(1,C.getNome_cliente());
          statement.setString(2,C.getEndereco());
          statement.setString(3,C.getEmail_cliente());
          statement.setString(4,C.getRG_cliente());
          statement.setString(5,C.getCPF_cliente());
          statement.setInt(6,C.getTelefone());
             
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
  public void selectCliente()throws SQLException {
        try {
            String sql = "SELECT * FROM Cliente";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                String nome_cliente = result.getString("nome_cliente");
                String endereco = result.getString("endereco");
                String email_cliente = result.getString("email_cliente");
                String RG_cliente = result.getString("RG_cliente");
                String CPF_cliente = result.getString("CPF_cliente");
                int telefone = result.getInt("telefone");
                
                String output = "Dono #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count,nome_cliente, endereco, email_cliente, RG_cliente, CPF_cliente, telefone));
                                
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
      String sql = "SELECT nome_cliente FROM Cliente";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getString("nome_cliente"));
            }
            
        return v;
  }
 
  public int getIdByNome_cliente(String Nome_cliente){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = Util.conecta();
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

