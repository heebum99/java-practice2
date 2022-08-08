public class Sum {
    public static void main(String[] args) {
        int s = 0, i = 0;

        //do~while 반복문, 최초 한번은 무조건 실행, 이후 조건식 검사 후 참이면 실행.
        do{
            i++;
            s = s + i;
        } while(i < 10);

        System.out.println("1에서 "+i+"까지의 합은 "+s);

    }
}
