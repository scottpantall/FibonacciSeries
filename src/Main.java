/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(fibonacci(Integer.parseInt(line)));
        }
    }
    
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        
        if(n == 1 || n == 2) {
            return 1;
        }
        
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
