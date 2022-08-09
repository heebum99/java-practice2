abstract class Study3{
    abstract void printmsg();
}

public class Study_Java2 extends Study3 {
    public void printmsg(){
        System.out.println("자바가 보이는 그림책");
    }

    public static void main(String[] args) {
        Study_Java2 study_java2 = new Study_Java2();
        study_java2.printmsg();
    }
}
