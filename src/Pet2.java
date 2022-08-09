class Animal{
    String name;
    int age;

    void printPet(){
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
    }
}

class Cat2 extends Animal{
    String variety;

    //메서드 오버라이딩 -> 상속된 메서드와 동일한 메서드명, 동일 인자, 동일 반환값을 갖는 메서드를 새로 정의.
    void printPet(){
        super.printPet(); //super -> 슈퍼클래스의 printPet() 메서드를 참조 -> 이름, 나이 출력
        System.out.println("종류: "+variety);
    }
}

public class Pet2 {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        cat.name = "양순이";
        cat.age = 5;
        cat.variety = "페르시안";

        cat.printPet();
    }
}
