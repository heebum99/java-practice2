import java.io.FileWriter;

public class WriteText {
    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter("math.txt");
            int a =10, b = 5;
            out.write("덧셈:");
            out.write(a+" + "+ b+" = "+(a+b)+"\n");
            out.write("뺄셈:");
            out.write(a+" - "+ b+" = "+(a-b)+"\n");
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
