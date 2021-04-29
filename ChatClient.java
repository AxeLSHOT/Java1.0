package Network_1;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {

    public ChatClient() {
        try {
            int SERVER_PORT = 8189;
            String SERVER_ADDER = "localhost";
            Socket sock = new Socket(SERVER_ADDER, SERVER_PORT);
            new Client(sock, "Quest");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
