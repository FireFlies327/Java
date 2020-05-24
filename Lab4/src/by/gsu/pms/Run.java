package by.gsu.pms;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class Run {
    private static final Logger log = Logger.getLogger(Run.class.getName());
    public static void main(String[] args) {
        Text text = new Text(new Book("text.txt", "UTF8"));
        System.out.println(text);
        text.sort();
        System.out.println(text);
    }
}