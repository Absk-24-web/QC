import java.io.IOException;
import java.net.Socket;

public class Service {


    public Socket client;

    public Service() {

    }

    public void socket() throws IOException {

        client = new Socket("100.100.100.1", 3001);
        System.out.println("Just connected to " + client.getRemoteSocketAddress());

    }


}
