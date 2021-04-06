package Comunicação;

public class Email {
    private int id;
    private String destinatario;
    private String assunto;
    private String mensagem;
    private String autor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Email() {
        
    }
    
    public Email(String destinatario, String assunto, String mensagem, String autor) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.autor = autor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }    
}
