package com.example.genialteachers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.security.PrivateKey;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText senha;
    Button entrar;


    AddAluno addAluno = new AddAluno();
    List<Aluno> alunosMatriculados = addAluno.getAlunosMatriculados();

   Aluno alunoAutenticado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailAddress);
        senha = findViewById(R.id.numberPassword);
        entrar = findViewById(R.id.button);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String emailDigitado = email.getText().toString();
                String senhaDigitada = senha.getText().toString();
                if(autenticaAluno(emailDigitado, senhaDigitada)){
                    alunoAutenticado = alunoAutenticado(emailDigitado);
                    openNextActivity();


                }


                }
            private boolean autenticaAluno(String email, String senha){

                for(Aluno a : alunosMatriculados){
                    if(a.getId().equals(email) && a.getSenha().equals(senha)){
                        return true;

                    }

                }
                return false;
            }

            private Aluno alunoAutenticado(String email){
                for (Aluno a : alunosMatriculados){
                    if (a.getId().equals(email)) {
                        return a;
                    }
                }
                return null;

            }
            private void openNextActivity(){
                Intent intent = new Intent (MainActivity.this, Retorno.class);
                intent.putExtra("alunoAutenticado", alunoAutenticado);
                startActivity(intent);
            }




        });
    }
}