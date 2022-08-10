import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("C:/자바/intellij workspace/java-practice/src/ganada.txt");
            int c;
            String s = new String(); //String 클래스의 객체 s 생성
            while((c=in.read())!=-1){ //read()메서드는 읽어올 문자가 없으면 -1을 반환 -> 읽어올 문자가 없을때까지 읽어온다.
                //read()메서드는 정수형으로 반환하기 때문에 문자형으로 바꿔서 문자열에 저장.
                s = s + (char)c;
            }
            System.out.println(s);
            in.close();
        }
        catch (IOException ie){ //IOException -> 입출력시 예외를 표시하는 예외 클래스
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch(Exception e){
            System.out.println("파일을 지정하지 않았습니다.");
        }
    }
}
