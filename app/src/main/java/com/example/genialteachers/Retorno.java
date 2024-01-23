package com.example.genialteachers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class Retorno extends AppCompatActivity {
    TextView email, turma, situacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retorno);
        email = findViewById(R.id.emailAddress);
        turma = findViewById(R.id.turma);
        situacao = findViewById((R.id.situacao));

        Intent intent = getIntent();
        if (intent.hasExtra("alunoAutenticado")) {
            Aluno alunoAutenticado = (Aluno) intent.getSerializableExtra("alunoAutenticado");



            email.setText(alunoAutenticado.getId());
            turma.setText(alunoAutenticado.getTurma());
            situacao.setText(alunoAutenticado.getSituacao());
        }





    }
}