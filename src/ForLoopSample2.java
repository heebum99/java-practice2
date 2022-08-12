import java.util.ArrayList;
import java.util.List;

public class ForLoopSample2 {
    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add(new String("0"));
        lst.add(new String("1"));
        lst.add(new String("2"));

        for(Object obj : lst){
            System.out.println((String)obj); //Object 타입이므로 형변환 필요
        }
    }
}
