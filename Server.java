package NeTWORK;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
    private final Vector<ClientHandler> clients;
    private final AuthService authService;

    public AuthService getAuthService() {
        return authService;
    }

    public Server() {
        clients = new Vector<>();
        authService = new SimpleAuthService();
        ServerSocket server = null;
        Socket socket;

        try {
            server = new ServerSocket(8186);
            System.out.println("Сервер запущен");

            while (true){
                socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this,socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert server != null;
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void broadcastMsg(String msg){
        for (ClientHandler c:clients ) {
            c.sendMsg(msg);
        }
    }

    public void privateMsg(String msg, String nick){

        for (ClientHandler c:clients ) {
            if (c.getNick().equals(nick))
                c.sendMsg(msg);
        }

    }

    public void subscribe(ClientHandler clientHandler){
        clients.add(clientHandler);
    }

    public void unsubscribe(ClientHandler clientHandler){
        clients.remove(clientHandler);
    }
}
