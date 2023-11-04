import java.io.*;
 
class Prog4 {
 
    public static void appendStrToFile(String fileName,
                                       String str)
    {
        
        try {
 
            BufferedWriter out = new BufferedWriter(
                new FileWriter(fileName, true));
 
            out.write(str);
           
            out.close();
        }
 
        
        catch (IOException e) {
 
            
            System.out.println("exception occurred" + e);
        }
    }
 
    
    public static void main(String[] args) throws Exception
    {
        
        String fileName = "input.txt";
 
        
        String str = "String to be appended\n";
 
        appendStrToFile(fileName, str);

    }
}