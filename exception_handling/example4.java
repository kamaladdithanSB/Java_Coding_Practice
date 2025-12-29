package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class example4 {
    public static void main(String[] args) {
        
        FileReader reader = null;
        try{
            reader = new FileReader("nonexistent.txt");
            int data = reader.read();
            System.out.println((char) data);
            data = reader.read();
        }

        catch(FileNotFoundException e){
            System.out.println("Error:file not found!");
        }
        catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        finally{
            try{
                if(reader != null){
                    reader.close();
                    System.out.println("file closed successfully");
                }
            }
                catch(IOException e){
                    System.out.println("error closing file.");
                }
            }
        
    
  
}
    }
