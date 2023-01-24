import java.util.*;
import java.io.*;

public class fileCopier{
    public static void copyFile(String src, String dest, String fileName) throws FileNotFoundException, IOException {
        File input = new File(src+"\\"+fileName);
        File output = new File(dest+"\\"+fileName);
        File temp=null;
        FileReader reading = new FileReader(input);
        FileWriter writing = null;
        if(input.exists()){
           int a;
           if(output.exists()){
               temp = new File(dest+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy"+fileName.substring(fileName.indexOf("."), fileName.length()));
               if(temp.exists()){
                   int i = 2;
                   while(true){
                       temp = new File(dest+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy ("+i+")"+fileName.substring(fileName.indexOf("."), fileName.length()));
                       if(!temp.exists())
                           break;
                       i++;
                   }
                   writing = new FileWriter(dest+"\\"+fileName.substring(0, fileName.indexOf("."))+"-Copy ("+i+")"+fileName.substring(fileName.indexOf("."), fileName.length()));    
                   while((a=reading.read()) != -1){
                       writing.write(a);
                   }
                   System.out.println("Successfully copied");
               }else{
                   writing = new FileWriter(dest+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy"+fileName.substring(fileName.indexOf("."), fileName.length()));
                   while((a=reading.read()) != -1){
                       writing.write(a);
                   }
                   System.out.println("Successfully copied");
               }
           }else{
               writing = new FileWriter(dest+"\\"+fileName);
               while((a=reading.read()) != -1){
                   writing.write(a);
               }
               System.out.println("Successfully copied");
           }
       }else{
           System.out.println("File does not exist");
       }
       reading.close();
       writing.close();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter path of source file :- ");
        String src = sc.nextLine();
        System.out.print("Enter path of destination :- ");
        String dest = sc.nextLine();
        System.out.print("Enter file name with extension :- ");
        String fileName = sc.nextLine();
        copyFile(src, dest, fileName);
        sc.close();
    }
}