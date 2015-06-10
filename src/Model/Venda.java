package Model;

public class Venda {
    int idVenda, Data;

    public Venda(int idVenda, int Data) {
        this.idVenda = idVenda;
        this.Data = Data;
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
    
    
}
