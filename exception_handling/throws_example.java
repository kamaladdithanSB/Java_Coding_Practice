package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throws_example {
    public static void readfile() throws IOException{
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
    public static void main(String[] args) {
        try{
            readfile();
        }
        catch(IOException e){
            System.out.println("handled exception: "+e.getMessage());
        }
    }
    
}
