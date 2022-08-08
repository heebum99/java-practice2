public class Test405 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("이름과 직위를 입력하지 않았거나 잘못 입력하셨습니다.");
            System.out.println("사용법 : java Test405 이름 직위");
        }
        else{
            System.out.println("이름: "+args[0]);
            System.out.println("직위: "+args[1]);
        }
    }
}
