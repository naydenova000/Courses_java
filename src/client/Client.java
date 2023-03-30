package client;

import java.io.*;
import java.net.Socket;


import static client.Server.SERVER_URL;

public class Client {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;

    public static void main(String[] args){
//        URLConnection connection = new URL(SERVER_URL).openConnection();
//        connection.setDoOutput(true);
//        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

        try (Socket socket = new Socket(SERVER_URL, Server.SERVER_PORT)) {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Sending the File to the Server");

            sendFile(Server.FILE_TO_SEND);


            dataInputStream.close();
            dataInputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // sendFile function define here
    private static void sendFile(String path) throws Exception {
        int bytes;
        // Open the File where he located in your pc
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        // Here we send the File to Server
        dataOutputStream.writeLong(file.length());
        // Here we  break file into chunks
        byte[] buffer = new byte[10000000];
        while ((bytes = fileInputStream.read(buffer)) != -1) {
            // Send the file to Server Socket
            dataOutputStream.write(buffer, 0, bytes);
            dataOutputStream.flush();
        }
        // close the file here
        fileInputStream.close();
    }
}









