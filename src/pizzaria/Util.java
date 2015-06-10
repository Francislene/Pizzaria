
package pizzaria;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Classe para criar tabela(substituir nosso terminal)
public class Util {
        
       public static Connection conecta() throws SQLException{
    Connection conexao = null;

        String url = "jdbc:mysql://192.200.63.121:3306/Pizzaria";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try{
            conexao = DriverManager.getConnection(url, user, password);
}catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
 }
       
       public void desconecta(Connection conexao){
try{
conexao.close();
}catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
}
       public static void CriaTabela(String nomeTabela,String atributos) throws SQLException {
            Statement statement = null;
            Connection conexao = null;
        try {
            conexao = conecta();
            statement = conexao.createStatement();
            String createTableSQL = "CREATE TABLE "+nomeTabela+"("+atributos+");";
            System.out.println(createTableSQL);
               statement.execute(createTableSQL); // executa o comando de criação
            System.out.println("Tabela \"nomeTabela\" foi criada com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {   // sempre feche o statement a conexão com banco
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
    }
       public static void criaBanco(String banco) throws SQLException{
         String  sql="CREATE DATABASES"+banco;
           Connection conexao = conecta();
           Statement stmt = conexao.createStatement();
           stmt.execute(sql);
           
           
      
       }}