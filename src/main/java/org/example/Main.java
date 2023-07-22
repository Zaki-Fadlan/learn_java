package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            // URL endpoint yang ingin diakses
            String urlEndpoint = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";

            // Membuat objek URL dari endpoint
            URL url = new URL(urlEndpoint);

            // Membuka koneksi menggunakan HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Mengatur metode request menjadi GET
            connection.setRequestMethod("GET");

            // Menerima respon dari server
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Membaca respon dari server
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Hasil respon dari server
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("HTTP Request Failed. Response Code: " + responseCode);
            }

            // Menutup koneksi
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Create
//        File myFile = new File("./myFile.txt");
//        try {
//            if (myFile.createNewFile()) {
//                System.out.println("File created : " + myFile.getName());
//            } else {
//                System.out.println("File already exist");
//                System.out.println(myFile.getPath());
//            }
//        } catch (IOException e) {
//            System.out.println("An error occcured");
//            e.printStackTrace();
//        }

//        Write
//        try {
//            FileWriter myFileWriter = new FileWriter("./myFile.txt");
//            myFileWriter.write("Hello World");
//            myFileWriter.close();
//            System.out.println("Writing succesfull");
//        } catch (IOException e) {
//            System.out.println("An error occured");
//            e.printStackTrace();
//        }

//        Read
//        try {
//            File myReadFile = new File("./myFile.txt");
//            Scanner myScanner = new Scanner(myReadFile);
//            while (myScanner.hasNextLine()) {
//                String dat = myScanner.nextLine();
//                System.out.println(dat);
//            }
//        } catch (IOException e) {
//            System.out.println("An Error occured");
//            e.printStackTrace();
//        }
//        Delete
//        if (myFile.delete()) {
//            System.out.println("File deleted");
//        } else {
//            System.out.println("Failed to delete file");
//        }

    }

}

