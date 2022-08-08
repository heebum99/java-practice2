public class Even {
    public static void main(String[] args) {
        int a = 5;

        if(a % 2 == 0){ //if 조건에 만족하면 아래의 내용을 출력
            System.out.println(a+"는 짝수입니다.");
        }
        else //if 조건에 만족하지 않으면 아래의 내용을 출력
            System.out.println(a+"는 홀수입니다.");
    }
}
