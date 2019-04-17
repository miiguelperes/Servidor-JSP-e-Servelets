package com.code.model;

public class Contato {
    
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private String nascimento;
    private String endereco;
    public static Contato contatoSave;

    public static Contato getContatoSave() {
        return contatoSave;
    }

    public static void setContatoSave(Contato contatoSave) {
        Contato.contatoSave = contatoSave;
    }
    
    public Contato() {
    }

    public Contato(Integer id, String nome, String telefone, String email, String nascimento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", nascimento=" + nascimento + ", endereco=" + endereco + '}';
    }
}
