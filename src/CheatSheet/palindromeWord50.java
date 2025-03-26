package CheatSheet;

public class palindromeWord50 {
    public static void main(String[] args){
        String Input="Madam Arora teaches malayalam";

        int count =0;
        String[] array=Input.split(" ");
        for(String green: array){
            green=green.toLowerCase();
            int pointerA=0;
            int pointerB=green.length()-1;
           boolean flag=false;
            while(pointerA<pointerB){
                if(green.charAt(pointerA)==green.charAt(pointerB)){
                    flag=true;
                    pointerA++;
                    pointerB--;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag)
                count++;
        }

        System.out.println(count);
    }
}
