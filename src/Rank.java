public class Rank {
    public static void main(String[] args) {
        int num = 1000;
        System.out.print(num+"은 ");

        if(0 <= num && num <= 9){
            System.out.print("1자리 수입니다.");
        }
        else if(10 <= num && num <= 99){
            System.out.print("2자리 수입니다.");
        }
        else if (100 <= num && num <= 999) {
            System.out.print("3자리 수입니다.");
        }
        else{
            System.out.print("4자리 수입니다.");
        }
    }
}
