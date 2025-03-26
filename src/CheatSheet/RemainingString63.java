package CheatSheet;

public class RemainingString63 {
    public static void main(String[] args){
      // String word="Thisisdemostring";
        String word="Thisisdemostri";
        //String word="abcd";
        int count =3;
        char letter='i';

        String newLetter="";
          int i=0;
        int index=0;
        for( i=0;i<word.length();i++){
            if(word.charAt(i)==letter){
                index++;

            }
            if(index==count){
                break;
            }
        }

        if(i<word.length()-1){
            System.out.println(word.substring(i+1));
        }else{
            System.out.println("\"\"");
        }
    }
}
