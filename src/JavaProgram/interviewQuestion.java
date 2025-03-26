package JavaProgram;

public class interviewQuestion {


    public static void main(String [] args){

        String word="acdcaf";
        int[] lowercase=new int[26];

        for(char c: word.toCharArray())
            lowercase[c-'a']++;

        for(int i=0;i<word.length();i++){
            if(lowercase[word.charAt(i)-'a']==1){
                System.out.println(i);
                break;
            }
        }

    }
}
