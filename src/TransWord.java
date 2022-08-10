import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TransWord {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new FileReader("C:/자바/intellij workspace/java-practice/src/mydic.txt")); //mydic 텍스트 파일을 행단위로 읽어오기.
            String a = args[0];
            String eword, kword = null;
            while((eword = in.readLine()) != null){
                if(a.equals(eword)){
                    kword = in.readLine();
                    break;
                }
            }
            if(kword == null){
                System.out.println(a+"이라는 단어는 없습니다.");
            }
            else{
                System.out.println(kword);
            }
            in.close();
        }
        catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch(Exception e){
            System.out.println("커맨드라인 인수가 없습니다.");
        }
    }
}
