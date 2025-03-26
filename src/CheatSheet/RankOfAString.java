package CheatSheet;

public class RankOfAString {
    public static int countLetter(int k,String word){
        int count=0;
        for(int j=k+1;j<word.length();j++){
           if(word.charAt(k)>word.charAt(j))
               count++;
        }
        return count;
    }

    public static int fact(int num){
        int value=1;
        for(int l=1;l<=num;l++)
            value=value*l;

        return value;
    }
    public static void main(String[] args){
        String word="bca";
        int len=word.length();
        int result=1;
        for(int i=0;i<word.length();i++){
            int count=countLetter(i,word);
            result=result+(count*fact(len-i-1));
        }
        System.out.println(result);
    }
}
