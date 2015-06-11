package Model;


public class Estoque {
   int  Quantidade, ID_estoque; 

    public Estoque(int Quantidade, int ID_estoque) {
        this.Quantidade = Quantidade;
        this.ID_estoque = ID_estoque;
    }

    public Estoque(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getID_estoque() {
        return ID_estoque;
    }

    public void setID_estoque(int ID_estoque) {
        this.ID_estoque = ID_estoque;
    }
   
}
