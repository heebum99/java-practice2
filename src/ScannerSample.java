import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("역 이름을 입력하세요: ");
        String stationName = sc.next();
        System.out.print("플랫폼 번호를 입력하세요: ");
        int number = sc.nextInt();

        sc.close();

        System.out.println(stationName+"역 "+number+"번 홈에서 기다립니다.");
    }
}
