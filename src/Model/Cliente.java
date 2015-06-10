/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Cliente {
    String nome_cliente, endereco, email_cliente, RG_cliente, CPF_cliente; 
    int telefone, ID_cliente;

    public Cliente(String nome_cliente, String endereco, String email_cliente, String RG_cliente, String CPF_cliente, int telefone, int ID_cliente) {
        this.nome_cliente = nome_cliente;
        this.endereco = endereco;
        this.email_cliente = email_cliente;
        this.RG_cliente = RG_cliente;
        this.CPF_cliente = CPF_cliente;
        this.telefone = telefone;
        this.ID_cliente = ID_cliente;
        
    }

    public Cliente(String nome_cliente, String endereco, String email_cliente, String RG_cliente, String CPF_cliente, int telefone) {
        this.nome_cliente = nome_cliente;
        this.endereco = endereco;
        this.email_cliente = email_cliente;
        this.RG_cliente = RG_cliente;
        this.CPF_cliente = CPF_cliente;
        this.telefone = telefone;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getRG_cliente() {
        return RG_cliente;
    }

    public void setRG_cliente(String RG_cliente) {
        this.RG_cliente = RG_cliente;
    }

    public String getCPF_cliente() {
        return CPF_cliente;
    }

    public void setCPF_cliente(String CPF_cliente) {
        this.CPF_cliente = CPF_cliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

}
   

   