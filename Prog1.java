import java.io.*;
class Prog1 {
    public static void main(String[] args)
    {
        int i,count=0,count_words=0,count_lines=0,countnl=0;
        FileInputStream fin = null;
    try {
        fin = new FileInputStream("input.txt");
        do {
            i = fin.read();
            if(i!=-1){
            count++;
            if(((char) i)==' '){
                count_words++;
            }
            if(((char) i)=='\n'){
                count_lines++;
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
        System.out.println("Character count: "+(count-count_lines));
        System.out.println("Word Count: "+(count_words+count_lines));
        System.out.println("Line count: "+(count_lines));
    } catch(IOException e) {
        System.out.println("Error Closing File");
    }
    }
}
}