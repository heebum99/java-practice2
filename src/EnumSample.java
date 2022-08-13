import java.util.ArrayList;
import java.util.List;

enum Animal2 {Cat, Dog, Rabbit}

class Pet3{
    private Animal2 kind;
    private String name;

    public Pet3(Animal2 aml, String nm ){
        kind = aml;
        name = nm;
    }

    public Animal2 getKind(){
        return kind;
    }

    public String getName(){
        return name;
    }
}

public class EnumSample {
    public static void main(String[] args) {
        List<Pet3>lst = new ArrayList<Pet3>(3);
        lst.add(new Pet3(Animal2.Dog, "바둑이"));
        lst.add(new Pet3(Animal2.Cat, "나비"));
        lst.add(new Pet3(Animal2.Rabbit, "초롱이"));

        for(Pet3 pt:lst){
            if(pt.getKind()==Animal2.Dog){
                System.out.println("Dog name : "+pt.getName());
            }
        }
    }
}
