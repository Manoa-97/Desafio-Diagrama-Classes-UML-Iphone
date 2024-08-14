package Componente;

import Comportamentos.AparelhoTelefonico;
import Comportamentos.NavegadorInternet;
import Comportamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void ligar(){
        System.out.println("Fazendo Ligação ...");
    }
    public void atender(){
        System.out.println("atendendo Ligação ...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de voz ...");
    }

    public void exibirPagina(){
        System.out.println("Exibindo Página da Internet ...");
    }
    public void atualizarpagina(){
        System.out.println("Atualizando Página da Internet ...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicinonado Nova Aba ...");
    }

    public void tocar(){
        System.out.println("Tocando Música ...");
    }
    public void pausar(){
        System.out.println("Pausando Música ...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando Música ...");
    }

}
