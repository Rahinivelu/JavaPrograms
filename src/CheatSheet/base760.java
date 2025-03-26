package CheatSheet;

public class base760 {
    public static void main(String[] args){
        int base=100;
        int rev=0;
        StringBuilder str=new StringBuilder();

        if(base<0){
            base=base*-1;
        }
        while(base!=0){
            int quotient=base/7;
            int mul=quotient*7;
            int sub=base-mul;
            str.append(sub);
            base=quotient;
        }
      System.out.println(str.reverse().toString());
        //System.out.println(rev);




    }
}
