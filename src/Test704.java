import java.io.FileOutputStream;
import java.io.FileWriter;

public class Test704 {
    public static void main(String[] args) {
        byte temp[] = new byte[100];
        try{
            FileOutputStream out = new FileOutputStream("Chapter7_4.txt");
            System.out.println("글을 모두 입력 후 엔터를 치시오.");
            System.in.read(temp); //temp -> 버퍼역할
            out.write(temp);
            out.close();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
