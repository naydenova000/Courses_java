package client;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Client {
    public static final int SERVER_PORT = 80;
    public static final String FILE_TO_SEND = "/Users/katya/Downloads/photo_naydenova.jpg";
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;

    public static String boundary = "===ENaydenova===";


    public static void main(String[] args) throws IOException {
        Socket sock = new Socket(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("http://194.99.21.219/upload.php", 80)));;
        String FileName = "/Users/katya/Downloads/photo_naydenova.jpg";
        File MyFile = new File(FileName);
        int FileSize = (int) MyFile.length();
        OutputStream os =sock.getOutputStream();
        PrintWriter pr = new PrintWriter(sock.getOutputStream(), true);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(MyFile));
        Scanner in = new Scanner(sock.getInputStream());

        pr.println(FileName);
        pr.println(FileSize);
        byte[] filebyte = new byte[FileSize];
        bis.read(filebyte, 0, filebyte.length);
        os.write(filebyte, 0, filebyte.length);
        System.out.println(in.nextLine());
        os.flush();
        sock.close();

//      try (Socket socket = new Socket("http://194.99.21.219/upload.php")) {

//        try (Socket socket = new Socket(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("http://194.99.21.219/upload.php", 80)));) {
//            dataInputStream = new DataInputStream(socket.getInputStream());
//            dataOutputStream = new DataOutputStream(socket.getOutputStream());
//            System.out.println("Sending the File to the Server");
//
//
//            dataInputStream.close();
//            dataInputStream.close();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
    }


}









