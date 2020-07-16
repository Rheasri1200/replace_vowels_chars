
import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class Main{

     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
       // if(scan.hasNext()){
        String s=scan.nextLine();
        char c=scan.next().charAt(0);
        char[] charr = s.toCharArray();
        
        for(int i=0;i<charr.length;i++){
            if(charr[i]=='a' || charr[i]=='A' || charr[i]=='e' || charr[i]=='E' || charr[i]=='i' || charr[i]=='I' || charr[i]=='o' || charr[i]=='O' || charr[i]=='u' || charr[i]=='U'){
                charr[i]=c;
            }
        }
        String ss=new String(charr);
        System.out.println(ss);
        }
     
}
