package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main (String args[]) {
        Socket cliente = null;
        int porta = 3030;
        DataInputStream in;
        DataOutputStream out;

        try {
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("Servidor criado na porta " + porta);
            
            while (true) {
                cliente = servidor.accept();
                System.out.println("Cliente conectado!");

                in = new DataInputStream(cliente.getInputStream());
                out = new DataOutputStream(cliente.getOutputStream());

                String mensagem = in.readUTF();

                System.out.println(mensagem);

                cliente.close();
            }

        } catch (IOException e) {
            System.out.println("Erro ao iniciar o servidor!");
        }
    }
}
