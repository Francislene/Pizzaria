
package Model;


public class ProdutoVendido {
    
    int ID_Item ,Quantidade;

    public ProdutoVendido(int ID_Item, int Quantidade) {
        this.ID_Item = ID_Item;
        this.Quantidade = Quantidade;
    }

    public int getID_Item() {
        return ID_Item;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
  
}
