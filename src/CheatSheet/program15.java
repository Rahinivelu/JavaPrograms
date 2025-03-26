package CheatSheet;

public class program15 {

    public static void main(String[] args){
        String word="greekforgeeks";
        for(int i=0;i<word.length();i++) {
            for(int j=0;j<word.length();j++){
                if(i==j || i+j==word.length()-1 ||j==word.length()/2) {
                    System.out.print(word.charAt(i) +" ");
                }
                else if(i==word.length()/2 ){
                    System.out.print(word.charAt(j)+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
