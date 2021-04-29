package Network_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public ChatServer(){
        ServerSocket serv = null;
        Socket sock;
        try {
            serv = new ServerSocket(8189);
            System.out.println("The server is running, waiting for connection...");
            sock = serv.accept();
            System.out.println("Quest connect");
            new Client(sock, "Server");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            serv.close();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Empty initial server");
        } finally {
            try {
                assert serv != null;
                serv.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
