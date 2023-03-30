package client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static final String SERVER_URL = "127.0.0.1";
    public static final int SERVER_PORT = 8080;
    public static final String FILE_TO_SEND = "/Users/katya/Downloads/photo_naydenova.jpg";
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;

    public static String boundary = "===ENaydenova===";


    public static void main(String[] args)
    {
        // Here we define Server Socket running on port 900
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Server is Starting in Port " + Server.SERVER_PORT);
            // Accept the Client request using accept method
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected");
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            // Here we call receiveFile define new for that
            // file
            receiveFile(Server.FILE_TO_SEND);

            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // receive file function is start here

    private static void receiveFile(String fileName) throws Exception {
        int bytes;
        FileOutputStream fileOutputStream
                = new FileOutputStream(fileName);

        long size = dataInputStream.readLong(); // read file size
        byte[] buffer = new byte[10000000];
        while (size > 0 && (bytes = dataInputStream.read(buffer, 0, (int)Math.min(buffer.length, size))) != -1) {
            // Here we write the file using write method
            fileOutputStream.write(buffer, 0, bytes);
            size -= bytes; // read upto file size
        }
        // Here we received file
        System.out.println("File is Received");
        fileOutputStream.close();
    }
}