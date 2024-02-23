package WorkWithFile;

import java.io.*;

public class WorkWithFile {
    public static void main (String[] args) throws IOException {
        String file = "Статические переменные и статические методы — две важные концепции в языке Java. " +
                "Всякий раз, когда переменная объявляется как статическая (static), это означает, что существует только одна ее копия для " +
                "всего класса, то есть не каждый экземпляр имеет свою собственную копию. Статический метод означает, что его можно " +
                "вызывать без создания экземпляра класса.";

//        try(FileWriter writer = new FileWriter("C:\\Users\\pyatukhova\\Desktop\\test.txt")) {
//            for(int i = 0; i<file.length(); i++){
//                writer.write(file.charAt(i));
//            }
//        }

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\pyatukhova\\Desktop\\test.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"))){

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        };
    }
}
