package Model;

import java.sql.Date;

public class Venda {
    int idVenda, ID_cliente, ID_Funcionario;
    Date  Data;

   //consulta
    public Venda(int idVenda, Date Data, int ID_cliente, int ID_Funcionario, int ID_Item) {
        this.idVenda = idVenda;
        this.Data = Data;
        this.ID_cliente = ID_cliente;
        this.ID_Funcionario = ID_Funcionario;
    }
    //inserir

    public Venda(Date Data, int ID_cliente, int ID_Funcionario) {
        this.Data = Data;
        this.ID_cliente = ID_cliente;
        this.ID_Funcionario = ID_Funcionario;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
 
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }



  
    
}
