import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String a = "a", b = "b", c = "c";
        Integer d = new Integer(3); //랩퍼 클래스

        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);
        
        list.add(2,d); //인덱스 2번에 삽입
        System.out.println(list);

        list.set(1,d); //인덱스 1번을 변경
        System.out.println(list);
    }
}
