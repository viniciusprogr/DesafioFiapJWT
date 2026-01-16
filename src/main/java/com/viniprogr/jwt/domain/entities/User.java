package com.viniprogr.jwt.domain.entities;

public class User {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private UserRole role;

    public User() {
    }

    // Construtor para criar um novo usuário (Cadastro)
    public User( Long id, String nome,String email, String senha, UserRole role){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
    }

    //Getter

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public UserRole getRole() {
        return role;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
