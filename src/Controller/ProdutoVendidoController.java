
package Controller;

import Model.Estoque;
import Model.Funcionario;
import Model.ProdutoVendido;
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

public class ProdutoVendidoController {
      public void inserirProdutoVendido(ProdutoVendido PV) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
                
            String sql = "INSERT INTO Produto_Vendido (Quantidade, Produto_ID_Produto,Venda_idVenda) VALUES (?,?,?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
           
            statement.setInt(1,PV.getQuantidade());
            statement.setInt(2,PV.getID_Produto());
            statement.setInt(3,PV.getID_venda());
          
           
             
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
            String sql = "SELECT * FROM Produto_Vendido";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                int Quantidade = result.getInt("Quantidade");
                int ID_venda = result.getInt("ID_venda");
                
                String output = "Agenda #%d: %s -%s -s% ";
                System.out.println(String.format(output, ++count, Quantidade,ID_venda  ));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Produto_Vendido SET Quantidade=? , Produto_ID_Produto=?, Venda_idVenda=? ";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setInt(1,6);
            
            
        
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
    
}
  }/*
    
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Produto_Vendido";

            Util util = new Util();
          ArrayList<ProdutoVendido> lista;
          try (Connection conexao = Util.conecta(); Statement statement = conexao.createStatement()) {
              ResultSet result = statement.executeQuery(sql);
              lista = new ArrayList<>();
              int count = 0;
              while (result.next()) {
              ProdutoVendido pv = new ProdutoVendido(result.getInt("Quantidade"),result.getInt("Produto_ID_Produto"), result.getInt("Venda_idVenda"));
              lista.add(pv);
              }
          }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
  
  public Vector getQuantidade() throws SQLException{
      String sql = "SELECT Quantidade FROM Produto_Vendido";
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
    Connection conexao = Util.conecta();
    String sql = "Select ID_Item from Produto_Vendido where Quantidade like '"+Quantidade+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("ID_Item");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(ProdutoVendidoController.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    return id;
} 

*/
 
}  

