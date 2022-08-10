import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test705 {
    public static void main(String[] args) {
        int c;
        try{
            FileInputStream in = new FileInputStream("Chapter7_4.txt");
            FileOutputStream out = new FileOutputStream("Chapter7_5.txt");

            while((c=in.read())!=-1){
                out.write(c);
            }

            out.close();
            in.close();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
