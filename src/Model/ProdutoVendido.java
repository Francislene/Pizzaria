
package Model;


public class ProdutoVendido {
    String Quantidade;
    int ID_Item;

    public ProdutoVendido(String Quantidade, int ID_Item) {
        this.Quantidade = Quantidade;
        this.ID_Item = ID_Item;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getID_Item() {
        return ID_Item;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }
    
}
