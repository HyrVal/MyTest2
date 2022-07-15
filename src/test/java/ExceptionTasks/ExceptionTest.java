package ExceptionTasks;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Scanner;

public class ExceptionTest {
    @Test
    public void fileNotFoundFirst() {
        File file= new File("testFil");
        try {
            Scanner scanner= new Scanner(file);
            System.out.println("method after Scanner");
            }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
//            throw new RuntimeException(e);
            }
        System.out.println("===============================================");
        System.out.println("code after block try-catch");
    }
@Test
    public void fileNotFoundSecond() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("testFile"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        }
        catch  (FileNotFoundException e){
            System.out.println("Ошибка! Файл не найден!");
        }
    }

}
