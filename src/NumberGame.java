import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int a, b = 7;
            System.out.println("이름을 입력하세요.");
            String name = in.readLine();
            System.out.println("숫자 맞추기 퀴즈!! 0에서 9까지의 숫자를 입력하세요.");
            String c = in.readLine();
            a = Integer.parseInt(c);
            while(a != b){
                if((a == b-1) || (a == b+1)){
                    System.out.println("아깝습니다~");
                }
                else if (a > b+1){
                    System.out.println("좀 더 작은 수 입니다.");
                }
                else if (a < b-1){
                    System.out.println("좀 더 큰 수 입니다.");
                }
                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("정답!! "+name+"님, 축하합니다!!");
        }
        catch(IOException ie){
            System.out.println("에러입니다.");
        }
    }
}
