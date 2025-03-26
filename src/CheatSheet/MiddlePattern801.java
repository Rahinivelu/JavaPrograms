package CheatSheet;

public class MiddlePattern801 {
    public static void printPattern(String word){
        int len=word.length();
        int middle=len/2;
        String finalword="";
        String letter = "";
       while(middle<word.length()){
          letter="";
           for(int i=word.length()/2;i<middle+1;i++){
               letter+=word.charAt(i);
           }
           letter+='$';
           middle++;
           System.out.print(letter);
       }
        middle=len/2;
       finalword=letter;
       int k=0;
       while(k<middle){
           letter="";
           for(int j=0;j<k+1;j++){
               letter+=word.charAt(j);
           }
           k++;
           String dark=finalword.substring(0,finalword.length()-1);

           System.out.print(dark+letter+'$');
       }


    }
    public static void main(String[] args){
       // String word="program";
        String word="rahiniv";
        printPattern(word);
    }
}
