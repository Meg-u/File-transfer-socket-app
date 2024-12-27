import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;
        String filePath = "path_to_your_file.txt";

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to the server");

            FileInputStream fileInputStream = new FileInputStream(filePath);
            OutputStream outputStream = socket.getOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File sent");

            fileInputStream.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
