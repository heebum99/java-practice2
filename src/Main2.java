public class Main2 {
    public static void main(String[] args) {
        try { //예외가 일어날것 같은 처리
            back(args[0]);
        } catch (Exception e) { //예외 발생시 수행할 처리
            System.out.println("커맨드라인 인수가 없습니다.");
        } finally {//예외가 발생하든 아니든 항상 실행, 생략 가능.
            System.out.println("종료합니다.");
        }
    }
        static void back(String a) throws Exception{ //예외가 발생할것 같은 메소드에 throws를 사용하고 예외클래스 지정
        // 예외를 받아줄 catch문이 없으면 컴파일 에러.
            System.out.println(a);
        }
}
