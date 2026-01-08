package com.viniprogr.jwt.domain.entities;



import java.util.UUID;

public class User {

    private UUID id;
    private String nome;
    private String senha;
    private UserRole role;


    // Construtor para criar um novo usuário (Cadastro)
    public User( String nome, String senha, UserRole role){
        this.nome = nome;
        this.senha = senha;
        this.role = role;
    }

    //Construtor para carregar usuário existente do banco
    public User(UUID id, String nome, String senha, UserRole role){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.role = role;
    }

    //Getter e Setters
    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public UserRole getRole() {
        return role;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

}
