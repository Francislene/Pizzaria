
package Model;


public class Funcionario {
    String nome_Funcionario, telefone, email_Funcionario, 
    RG_Funcionario, login_Funcionario, senha, CPF_Funcionario, 
    tipo_de_acesso, endereco_Funcionario, carteira_de_trabalho;
    
    int ID_Funcionario;

    public Funcionario(String nome_Funcionario, String telefone, String email_Funcionario, String RG_Funcionario, String login_Funcionario, String senha, String CPF_Funcionario, String tipo_de_acesso, String endereco_Funcionario, String carteira_de_trabalho, int ID_Funcionario) {
        this.nome_Funcionario = nome_Funcionario;
        this.telefone = telefone;
        this.email_Funcionario = email_Funcionario;
        this.RG_Funcionario = RG_Funcionario;
        this.login_Funcionario = login_Funcionario;
        this.senha = senha;
        this.CPF_Funcionario = CPF_Funcionario;
        this.tipo_de_acesso = tipo_de_acesso;
        this.endereco_Funcionario = endereco_Funcionario;
        this.carteira_de_trabalho = carteira_de_trabalho;
        this.ID_Funcionario = ID_Funcionario;
    }

    public String getNome_Funcionario() {
        return nome_Funcionario;
    }

    public void setNome_Funcionario(String nome_Funcionario) {
        this.nome_Funcionario = nome_Funcionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail_Funcionario() {
        return email_Funcionario;
    }

    public void setEmail_Funcionario(String email_Funcionario) {
        this.email_Funcionario = email_Funcionario;
    }

    public String getRG_Funcionario() {
        return RG_Funcionario;
    }

    public void setRG_Funcionario(String RG_Funcionario) {
        this.RG_Funcionario = RG_Funcionario;
    }

    public String getLogin_Funcionario() {
        return login_Funcionario;
    }

    public void setLogin_Funcionario(String login_Funcionario) {
        this.login_Funcionario = login_Funcionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF_Funcionario() {
        return CPF_Funcionario;
    }

    public void setCPF_Funcionario(String CPF_Funcionario) {
        this.CPF_Funcionario = CPF_Funcionario;
    }

    public String getTipo_de_acesso() {
        return tipo_de_acesso;
    }

    public void setTipo_de_acesso(String tipo_de_acesso) {
        this.tipo_de_acesso = tipo_de_acesso;
    }

    public String getEndereco_Funcionario() {
        return endereco_Funcionario;
    }

    public void setEndereco_Funcionario(String endereco_Funcionario) {
        this.endereco_Funcionario = endereco_Funcionario;
    }

    public String getCarteira_de_trabalho() {
        return carteira_de_trabalho;
    }

    public void setCarteira_de_trabalho(String carteira_de_trabalho) {
        this.carteira_de_trabalho = carteira_de_trabalho;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

  
    
}
