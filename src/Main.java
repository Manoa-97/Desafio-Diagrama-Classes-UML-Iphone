import Componente.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone novoIphone = new Iphone();

        novoIphone.ligar();
        novoIphone.atender();
        novoIphone.iniciarCorreioVoz();

        novoIphone.exibirPagina();
        novoIphone.atualizarpagina();
        novoIphone.adicionarNovaAba();

        novoIphone.tocar();
        novoIphone.pausar();
        novoIphone.selecionarMusica();
        
    }
}
