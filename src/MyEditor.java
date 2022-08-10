import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MyEditor {
    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter(args[0]);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String data;
            System.out.println("데이터를 입력해 주세요. (종료:0)");
            while(!(data=in.readLine()).equals("0")){
                out.write(data+"\n");
            }
            System.out.println("종료했습니다.");
            out.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
