package collectionapp;

import java.io.*;

public class FilesApp {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("C:\\Users\\ivc6-10\\come.txt", false)) {
            // запись всей строки
            String text = "Здравствуй юность в сапогах";
            writer.write(text);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("C:\\Users\\ivc6-10\\come.txt")) {
            // читаемпосимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());


    }
    }
}
