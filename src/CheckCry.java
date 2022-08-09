interface Cry{
    void cry();
}

class Cat3 implements Cry{
    public void cry(){
        System.out.println("야옹~");
    }
}

class Dog implements Cry{
    public void cry(){
        System.out.println("멍멍");
    }
}

public class CheckCry {
    public static void main(String[] args) {
        Cat3 cat = new Cat3();
        Dog dog = new Dog();

        if(cat instanceof Cry){ //cat 객체가 Cry 클래스의 객체면 true 반환
            cat.cry();
        }
        else if (dog instanceof Cry) { //dog 객체가 Cry 클래스의 객체면 true 반환
            dog.cry();
        }
    }
}
