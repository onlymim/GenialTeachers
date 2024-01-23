package com.example.genialteachers;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String id;
    private String nome;

    private String senha;

    private String situacao;

    private String turma;

    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public String getSituacao(){
        return situacao;
    }

    public String getTurma(){
        return turma;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
