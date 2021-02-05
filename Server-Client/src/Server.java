import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;

/* implementing a Server for Receiving the Clients using UDP Method
 *** Autor: Mojtaba
*/
public class Server {

    // declear a  Port final port
    private static final int  PORT = 9999;

    public Server(){
        try{
            // createing a server DataGramsocket

            System.out.println("wating for Client .... ");
            DatagramSocket ds = new DatagramSocket(PORT);

            // receiving data from Client
            byte[] b1 = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
            ds.receive(dp1);
            String str = new String (dp1.getData());
            System.out.println(str);

            // edit the String
            String str2 = str + " have passion and courage.";

            // sending data to client
            byte[] b2 = str2.getBytes();
            InetAddress i = InetAddress.getLocalHost();
            DatagramPacket dp2 = new DatagramPacket(b2, b2.length, i, dp1.getPort());
            ds.send(dp2);

            System.out.println("data is sent back to Client ");


        }catch(Exception e){
            e.printStackTrace();
        }

    }




    public static void main(String[] args) {
        // create an instanz of Sercer
        Server server = new Server();
    }


}
