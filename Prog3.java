import java.io.*;

class Prog3 {
    public static void main(String[] args)
    {
        int i,count=0,count_words=0,count_lines=0,max_count=-1;
        String s="";
        String s1="";
        FileInputStream fin = null;
    
try {
    fin = new FileInputStream("input.txt");
    do {
        i = fin.read();
        if(i!=-1){
            if((((char) i)!=' ') && (((char) i)!='\n') && (((char) i)!='.')){
                s=s+((char) i);
                count++;
                if(count>max_count){
                    s1=s;
                    max_count=count;
                }
            }
            else{
                count=0;
                s="";
            }
        }

       
    } while(i != -1);
    } catch(FileNotFoundException e) {
        System.out.println("File Not Found.");
    } catch(IOException e) {
        System.out.println("An I/O Error Occurred");
    } finally {
    try {
        if(fin != null) 
        fin.close();
        System.out.println("Longest word: "+s1);
    } catch(IOException e) {
        System.out.println("Error Closing File");
    }
    }
}
}