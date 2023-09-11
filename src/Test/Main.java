package Test;

import Dominio.Iphone;


public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iphone X", 128, "IOS");


        meuIphone.ligar();
        System.out.println(meuIphone);
        System.out.println("----------//----------");
        System.out.println("Usando o iphone para reproduzir musica: ");
        meuIphone.reproduzirMusica();
        meuIphone.avancarMusica();
        meuIphone.pausarMusica();

        System.out.println("-----------//----------");
        System.out.println("Usando meu iphone para ligação e mensagem: ");
        meuIphone.fazerLigacao("1198545-5865");
        System.out.println("Recebendo ligação!!! ");
        meuIphone.receberLigacao("1195555-9696");
        System.out.println("Enviando mensagem de texto...");
        meuIphone.enviarMensagemTexto("Igor Maia", "Oi, esta estudando demais!!!!");

        System.out.println("---------//----------");
        System.out.println("Navegando na internet com meu iphone: ");
        meuIphone.abrirNavegador();
        meuIphone.navegarParaUrl("https://www.example.com");
        meuIphone.fecharNavegador();

        System.out.println("----------//----------");
        meuIphone.desligar();
    }
}