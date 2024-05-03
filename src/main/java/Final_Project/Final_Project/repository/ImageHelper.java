package Final_Project.Final_Project.repository;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ImageHelper {


    public static String PATH = "static/";
    public static byte[] getImage(int id) throws IOException {
        Path path = Paths.get(PATH+id+".jpg");
        return Files.readAllBytes(path);
    }
}
