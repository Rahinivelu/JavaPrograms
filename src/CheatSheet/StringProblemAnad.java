package CheatSheet;

public class StringProblemAnad {
    public static void main(String[] args){
        String word="abcac";
        int target=10;
        int len=word.length();
        int k=0;
        StringBuilder str=new StringBuilder(word);
        for(int i=word.length();i<10;i++){
            str.append(word.charAt(k));
            k++;
            if(k>=word.length()){
                k=0;
            }
        }

        word=new String(str);
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'){
                count++;
            }
        }


        System.out.println(str.toString());
        System.out.println("a "+ count);
    }
}
