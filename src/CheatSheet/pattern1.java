package CheatSheet;

public class pattern1 {

    public static void main(String[] args){
        String input="geeksforgeeks";
        //String input="12345";

        for(int i=0;i<input.length();i++){
            for(int j=0;j<input.length();j++){
                if(i==j)
                    System.out.print(input.charAt(j));
                else if(i+j==input.length()-1)
                    System.out.print(input.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
