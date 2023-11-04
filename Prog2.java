import java.io.*;
class Prog2 {
public static void main(String[] args) throws IOException
{
    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;
    
    try {
        fin = new FileInputStream("input.txt");
        fout = new FileOutputStream("output.txt");
    do {
        i = fin.read();
        if(i != -1){
            fout.write(i);
        }
    } while(i != -1);
    } catch(IOException e) {
    System.out.println("I/O Error: " + e);
    } finally {
        try {
            if(fin != null) {
                fin.close();
            }
        } catch(IOException e2) {
    System.out.println("Error Closing Input File");
    }
    try {
        if(fout != null){
            fout.close();
        } 
    } catch(IOException e2) {
        System.out.println("Error Closing Output File");
    }
    }
}
}