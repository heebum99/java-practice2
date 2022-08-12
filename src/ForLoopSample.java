public class ForLoopSample {
    public static void main(String[] args) {
        String [] season = {"봄","여름","가을","겨울"};

        for(String s:season){ //s에 season의 요소를 하나씩 넣으면서 반복
            System.out.println(s);
        }
    }
}
