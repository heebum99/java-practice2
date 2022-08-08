public class Continue {
    public static void main(String[] args) {
        int a, b = 1;

        for(a=0;a<4;a++){ //if 조건문에 걸려서 continue를 만나면 루프의 시작으로 돌아와 반복문 실행.
            if(a+b==2){
                continue;
            }
            System.out.println(a+"+"+b+"="+(a+b));
        }
    }
}
