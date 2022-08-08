public class Break {
    public static void main(String[] args) {
        int a, b = 2;

        for(a = 0;a < 5; a++){
            if(b - a <= 0){
                break;
            }
            System.out.println(b+"-"+a+"="+(b-a));
        } //if 조건식에 걸려서 break문을 발견하면 이 블록으로 이동해 반복문 루프를 종료.
    }
}
