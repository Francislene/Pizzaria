package Model;


public class Estoque {
   int  Quantidade, ID_estoque,ID_Produto; 

    public Estoque(int Quantidade, int ID_Produto) {
        this.Quantidade = Quantidade;
        this.ID_Produto = ID_Produto;
    }

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int ID_Produto) {
        this.ID_Produto = ID_Produto;
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
