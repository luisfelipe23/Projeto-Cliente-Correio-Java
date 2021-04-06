package Comunicação;

import DTO.EmailDTO;

public class Consultas {
    public static String usuario;
    public static Email emails[] = new Email[200];
    
    public static EmailDTO inserir(String autor, String destinatario, String assunto, String mensagem) {
        EmailDTO objEmailDTO = new EmailDTO();
        objEmailDTO.setAutor(autor);
        objEmailDTO.setDestinatario(destinatario);
        objEmailDTO.setAssunto(assunto);
        objEmailDTO.setMensagem(mensagem);

        return objEmailDTO;
    }
}
