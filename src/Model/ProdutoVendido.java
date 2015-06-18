
package Model;


public class ProdutoVendido {
    
    int ID_Item ,Quantidade,ID_venda,ID_Produto;

    public ProdutoVendido(int ID_Item, int Quantidade, int ID_Produto, int ID_venda) {
        this.ID_Item = ID_Item;
        this.Quantidade = Quantidade;
        this.ID_Produto = ID_Produto;
         this.ID_venda = ID_venda;
    }

    public ProdutoVendido(int ID_venda, int Quantidade, int ID_Produto) {
        this.Quantidade = Quantidade;
        this.ID_venda = ID_venda;
        this.ID_Produto = ID_Produto;
    }
    

    public int getID_venda() {
        return ID_venda;
    }

    public void setID_venda(int ID_venda) {
        this.ID_venda = ID_venda;
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

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int id_produto) {
        this.ID_Produto = id_produto;
    }




}
