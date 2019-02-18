package model;

import java.util.Date;

public class Cliente {

    int cod;
    String nome;
    String endereco;
    String cidade;
    String bairro;
    String uf;
    String cep;
    String telefone;
    Date dataNasc;

    public Cliente() {
        this(0, "", "", "", "", "", "", "", new Date());
    }

    public Cliente(int cod, String nome, String endereco, String cidade, String bairro, String uf, String cep, String telefone, Date dataNasc) {
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

}
