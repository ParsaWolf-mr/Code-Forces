/*
*** implementing a Clinet for sending and receiving data From
*** server using UDP Method
*** Autor : Mojtaba Rostami
*** Date:  04.02.2021
 */


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {

    // declare a PORT
    private static final int PORT = 9999;

    public Client()  {

        try {

            System.out.println("Strarting the connection ....");
            DatagramSocket ds = new DatagramSocket();

            // getting data from System input
            Scanner scanner = new Scanner(System.in);
            System.out.println("> ");
            String input = scanner.nextLine();

            // converting the String to bytes
            byte[] b1 = input.trim().getBytes();
            InetAddress i = InetAddress.getLocalHost();
            DatagramPacket dp1 =new DatagramPacket(b1,b1.length, i, PORT);
            ds.send(dp1);

            // getting data from Server
            byte[] b2 = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(b2, b2.length);
            ds.receive(dp2);
            String data = new String(dp2.getData());

            // printing on Console
            System.out.println(data);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
