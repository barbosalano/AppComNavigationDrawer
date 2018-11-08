package com.example.barbosa.appconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.barbosa.appconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_sobre);


        String descricao = "Começando com o primeiro item, é o ato ou efeito de dar consulta ou conselho. Especificando melhor, consultoria é uma prestação de serviço que visa auxiliar alguém (ou uma empresa) em determinada situação. \n \n "  + "A segunda definição indica uma característica essencial para qualquer bom serviço de consultoria: um consultor deve tratar de assuntos técnicos de sua especialidade. Em outras palavras, consultoria é um serviço especializado em determinado assunto.";

        View sobre = new AboutPage (this)



                .setDescription(descricao)
             //   .isRTL(false)
                .setImage(R.drawable.logo)
           //     .addItem(versionElement)
           //     .addItem(adsElement)
                .addGroup("Fale Conosco")
               .addEmail("atmconsultoria@gmail.com", "Envie um e-mail")
                .addGroup("Acesse nossas rede sociais")
               .addWebsite("http://www.google.com")
               .addFacebook("google", "Facebook")
               .addTwitter("medyo80")
               .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
               .addPlayStore("com.ideashower.readitlater.pro")
               .addGitHub("medyo")
               .addInstagram("google")
                .create();

        setContentView(sobre);
    }


}
