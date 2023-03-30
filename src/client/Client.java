package client;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Client {
    public static final int SERVER_PORT = 80;
    public static final String FILE_TO_SEND = "/Users/katya/Downloads/original-834f267912d710e88ef10a8d3843a2e1.jpg";

    public static String boundary = "===ENaydenova===";


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket( SERVER_PORT);
        Socket clientSocket = serverSocket.accept();

        String FileName = FILE_TO_SEND;
        File MyFile = new File(FileName);
        int FileSize = (int) MyFile.length();
        OutputStream os = clientSocket.getOutputStream();
        PrintWriter pr = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(MyFile));
        Scanner in = new Scanner(clientSocket.getInputStream());

        pr.println(FileName);
        pr.println(FileSize);
        byte[] filebyte = new byte[FileSize];
        bis.read(filebyte, 0, filebyte.length);
        os.write(filebyte, 0, filebyte.length);
        System.out.println(in.nextLine());
        os.flush();
        serverSocket.close();

    }


}









