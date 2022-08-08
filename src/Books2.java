class Book2{
    String title;
    String writer;

    //생성자
    Book2(String t, String w){
        title = t;
        writer = w;
    }
    
    //복제 생성자
    Book2(Book2 copy){
        title = copy.title;
        writer = copy.writer;
    }

    //메서드
    void print(){
        System.out.println("제 목: "+title);
        System.out.println("저 자: "+writer);
    }
}

public class Books2 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("C가 보이는 그림책","ANK");
        book1.print();

        Book2 book2 = new Book2(book1);
        book2.title = "Java가 보이는 그림책";
        book2.print();
    }
}
