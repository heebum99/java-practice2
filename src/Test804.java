import java.util.StringTokenizer;

public class Test804 {
    public static void main(String[] args) {
        String a = "자바가,출판사,보이는,성안당,그림책";
        StringTokenizer token = new StringTokenizer(a,",");
        String [] b = new String[token.countTokens()];

        for(int i=0; token.hasMoreTokens();i++){
            b[i] = token.nextToken();
        }

        System.out.println(b[0]+" "+b[2]+" "+b[4]);
        System.out.println(b[1]+":"+b[3]);
    }
}
