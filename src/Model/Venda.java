package Model;

public class Venda {
    int idVenda, Data, ID_cliente, ID_Funcionario, ID_Item;

    public Venda(int idVenda, int Data, int ID_cliente, int ID_Funcionario, int ID_Item) {
        this.idVenda = idVenda;
        this.Data = Data;
        this.ID_cliente = ID_cliente;
        this.ID_Funcionario = ID_Funcionario;
        this.ID_Item = ID_Item;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
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

    public int getID_Item() {
        return ID_Item;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }

  
    
}
