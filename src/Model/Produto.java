package Model;


public class Produto {
    String Valor_Compra, Plataforma, Tipo, Nome, Valor_Venda;
    int ID_Produto,Qtd_Min;

    public Produto(String Valor_Compra, String Plataforma, String Tipo, String Nome, String Valor_Venda, int ID_Produto, int Qtd_Min) {
        this.Valor_Compra = Valor_Compra;
        this.Plataforma = Plataforma;
        this.Tipo = Tipo;
        this.Nome = Nome;
        this.Valor_Venda = Valor_Venda;
        this.ID_Produto = ID_Produto;
        this.Qtd_Min = Qtd_Min;
    }

    public String getValor_Compra() {
        return Valor_Compra;
    }

    public void setValor_Compra(String Valor_Compra) {
        this.Valor_Compra = Valor_Compra;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getValor_Venda() {
        return Valor_Venda;
    }

    public void setValor_Venda(String Valor_Venda) {
        this.Valor_Venda = Valor_Venda;
    }

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int ID_Produto) {
        this.ID_Produto = ID_Produto;
    }

    public int getQtd_Min() {
        return Qtd_Min;
    }

    public void setQtd_Min(int Qtd_Min) {
        this.Qtd_Min = Qtd_Min;
    }

}
