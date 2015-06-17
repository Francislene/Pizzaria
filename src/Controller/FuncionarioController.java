
package Controller;

import Model.Cliente;
import Model.Funcionario;
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


public class FuncionarioController {
    public void inserirFuncionario(Funcionario F) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
                
            String sql = "INSERT INTO Funcionario (nome_Funcionario, telefone, email_Funcionario, RG_Funcionario, login_Funcionario, senha, CPF_Funcionario, tipo_de_acesso, endereco_Funcionario, carteira_de_trabalho) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
           statement.setString(1,F.getNome_Funcionario());
           statement.setString(2, F.getTelefone());
           statement.setString(3, F.getEmail_Funcionario());
           statement.setString(4, F.getRG_Funcionario());
           statement.setString(5, F.getLogin_Funcionario());
           statement.setString(6, F.getSenha());
           statement.setString(7, F.getCPF_Funcionario());
           statement.setString(8, F.getTipo_de_acesso());
           statement.setString(9, F.getEndereco_Funcionario());
           statement.setString(10, F.getCarteira_de_trabalho());
           
             
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
  public void selectFuncionario()throws SQLException {
        try {
            String sql = "SELECT * FROM Funcionario";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                                    System.out.println(result);
                String nome_Funcionario = result.getString("nome_Funcionario");
                String telefone = result.getString("telefone");
                String email_Funcionario = result.getString("email_Funcionario");
                String RG_Funcionario = result.getString("RG_Funcionario");
                String login_Funcionario = result.getString("login_Funcionario");
                String senha = result.getString("senha");
                String CPF_Funcionario = result.getString("CPF_Funcionario");
                String tipo_de_acesso = result.getString("tipo_de_acesso");
                String endereco_Funcionario = result.getString("endereco_Funcionario");
                String carteira_de_trabalho = result.getString("carteira_de_trabalho");
                //nome_Funcionario, telefone, email_Funcionario, RG_Funcionario, 
           //login_Funcionario, senha, CPF_Funcionario, tipo_de_acesso,
           //endereco_Funcionario, carteira_de_trabalho
                
                String output = "Agenda #%d: %s - %s - %s - %s - %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, nome_Funcionario, telefone, email_Funcionario, RG_Funcionario, login_Funcionario, senha, CPF_Funcionario, tipo_de_acesso, endereco_Funcionario, carteira_de_trabalho  ));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
  
  public void atualiza() throws SQLException{
  String sql = "UPDATE Funcionario SET nome_Funcionario=?, telefone=?, email_Funcionario=?, RG_Funcionario=?, login_Funcionario=?, senha=?, CPF_Funcionario=?, tipo_de_acesso=?, endereco_Funcionario=?, carteira_de_trabalho=? ";
  Connection conexao = null;
 
PreparedStatement statement = conexao.prepareStatement(sql);{
            statement.setString(1, "Rafinha");
            statement.setString(2, "89277772");
            statement.setString(3, "rafinha@htmail.com");
            statement.setString(4, "1234567890");
            statement.setString(5, "rafa2");
            statement.setString(6, "******");
            statement.setString(7, "987456321");
            statement.setString(8, "vip");
            statement.setString(9, "rua x");
            statement.setString(10, "ok");
            
        
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Atualizado com sucesso");
}
    
}
  }

  
  public ArrayList getAll() throws SQLException {
        try {
            String sql = "SELECT * FROM Funcionario";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
                ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
            int count = 0;
            while (result.next()) {
            Funcionario F = new Funcionario(result.getString("nome_Funcionario"),  result.getString("telefone"), result.getString("email_Funcionario"),result.getString("RG_Funcionario"), result.getString("login_Funcionario"),result.getString(" senha"),result.getString("CPF_Funcionario"),result.getString("tipo_de_acesso"),result.getString("endereco_Funcionario"),result.getString("carteira_de_trabalho"));
            lista.add(F);
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
      String sql = "SELECT nome_Funcionario FROM Funcionario";
      Vector v = new Vector();
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                v.add(result.getString("nome_Funcionario"));
            }
            
        return v;
  }
 
  public int getIdBynome_Funcionario(String nome_Funcionario){
      
      int id=-1;
//    consultar no banco o usuário que tem nome igual ao Nome, retornar o ID desse usuário
try{
    Util util = new Util();
    Connection conexao = Util.conecta();
    String sql = "Select ID from Funcionario where nome_Funcionario like '"+nome_Funcionario+"'";
    Statement statement = conexao.createStatement();
    ResultSet result = statement.executeQuery(sql);
    while (result.next()){
        id=result.getInt("ID");
       
    }
}catch (SQLException ex ){
    Logger.getLogger(FuncionarioController.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    return id;
} 

}
