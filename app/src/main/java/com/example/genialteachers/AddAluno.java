package com.example.genialteachers;

import java.util.ArrayList;
import java.util.List;

public class AddAluno {

    private List<Aluno> alunosMatriculados = new ArrayList<>();

    AddAluno(){
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Gabriel");
        aluno1.setId("Gabriel@gmail.com");
        aluno1.setSenha("12345678");
        aluno1.setSituacao("ativo");
        aluno1.setTurma("Turma A");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Milena");
        aluno2.setId("Milena@gmail.com");
        aluno2.setSenha("12345678");
        aluno2.setSituacao("ativo");
        aluno2.setTurma("Turma B");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Felipe");
        aluno3.setId("Felipe@gmail.com");
        aluno3.setSenha("12345678");
        aluno3.setSituacao("inativo");
        aluno3.setTurma("Turma C");

        alunosMatriculados.add(aluno1);
        alunosMatriculados.add(aluno2);
        alunosMatriculados.add(aluno3);
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}



