package in.file;

import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best Java course.\n");
            for (int i = 0; i < 10; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written Successfully");
        } catch (IOException exception) {
            System.out.printf("Error occurred %s\n", exception.getMessage());
        }
    }
}
