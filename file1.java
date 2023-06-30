import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

class Writers{
    void FileWriter(){
    File file = new File("ram.txt");
        try {
        Writer out = new FileWriter(file);
        System.out.println("enter info");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
            out.write(name);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}


class Readers{
    void FileRead(){
      File file = new File("ram.txt");
        try {
        Reader out = new FileReader(file);
            
      int data = out.read();
      while(data!=-1){
        System.out.print((char)data);
        data = out.read();
      }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class file1{
    public static void main(String...r) {
        
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("1 for read file\n2 for write file\n3 for break ");
       
       int ch =sc.nextInt();
        if(ch==1){
        Readers rr=new Readers();
        rr.FileRead();
        }
        else if(ch==2){
        Writers ww =new Writers();
        ww.FileWriter();
        }
           else if(ch==3){
            break;
           }
        else{
            System.out.println("nor use");
        }
    }
    }
}