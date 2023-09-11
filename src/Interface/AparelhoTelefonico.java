package Interface;

public interface AparelhoTelefonico {

    void fazerLigacao(String numero);

    void receberLigacao(String numero);

    void enviarMensagemTexto(String destinatario, String mensagem);
}
