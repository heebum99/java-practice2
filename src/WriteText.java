import java.io.FileWriter;

public class WriteText {
    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter("math.txt");
            int a =10, b = 5;
            out.write("λ§μ:");
            out.write(a+" + "+ b+" = "+(a+b)+"\n");
            out.write("λΊμ:");
            out.write(a+" - "+ b+" = "+(a-b)+"\n");
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
