import java.io.*;
import java.util.Scanner;

class Prog5 {
public static void main(String[] args) throws IOException
{
    int sum=0;
    Scanner sc=new Scanner(System.in);
    String s="";
    int[] prod_code=new int[5];
    double[] cost=new double[5];
    int[] quantity=new int[5];
    for(int i=0;i<5;i++){
        System.out.println("Please enter the product code(integer),cost(double) and quantity of Product "+(i+1));
        prod_code[i]=sc.nextInt();
        cost[i]=sc.nextDouble();
        quantity[i]=sc.nextInt();
    }
        
    try {
        FileWriter fWriter = new FileWriter("output.txt");
        for(int i=0;i<5;i++){
            s=s+"Product Code: "+prod_code[i]+"\nCost: " + cost[i]+"\nQuantity: "+quantity[i]+"\n\n";
            sum+=(cost[i]*quantity[i]);
        }
        s=s+("Total Value of All Products: Rs"+sum);
        fWriter.write(s);
        fWriter.close();

        } catch(IOException e) {
        System.out.println("I/O Error: " + e);
        } 
    }
}