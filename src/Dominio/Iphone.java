package Dominio;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int capacidade;
    private String sistemaOperacional;


    public Iphone(String modelo, int capacidade, String sistemaOperacional) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("O iphone esta ligado. ");
    }

    public void desligar() {
        System.out.println("O iphone esta desligado. ");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "modelo='" + modelo + '\'' +
                ", capacidade=" + capacidade +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                '}';
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo musica no meu iphone! ");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para proxima musica.");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para o numero: " + numero);
    }

    @Override
    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação do numero: " + numero);
    }

    @Override
    public void enviarMensagemTexto(String destinatario, String mensagem) {
        System.out.println("Enviado mensagem para: " + destinatario + "\n" + "Digitando mensagem: " + mensagem);
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Saindo do navegador! ");
    }

    @Override
    public void navegarParaUrl(String url) {
        System.out.println("Navegando para o site: " + url);
    }
}
