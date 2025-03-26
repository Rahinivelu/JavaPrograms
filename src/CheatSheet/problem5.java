package CheatSheet;

public class problem5 {
    public static void main(String[] args){
        String a="set";
        String b="sangeet";
        int pointerA=0;
        int pointerB=0;
        while(pointerA<a.length() && pointerB<b.length()){
            if(a.charAt(pointerA)==b.charAt(pointerB)){
                pointerA++;
            }
            pointerB++;
        }
        if(pointerA==a.length())
                System.out.println("YES");
        else
            System.out.println("NO");
    }
}
