package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            // Membuat server socket pada port 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server berjalan, menunggu koneksi...");

            // Menerima koneksi dari client
            Socket socket = serverSocket.accept();
            System.out.println("Koneksi dari client diterima.");

            // Membaca data dari client
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            System.out.println("Pesan dari client: " + message);

            // Mengirim balasan ke client
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Pesan diterima.");

            // Menutup koneksi
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

