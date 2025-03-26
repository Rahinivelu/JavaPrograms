package CheatSheet;

public class GroupAnagram2 {
    public static void main(String[]args){
        String s1="eat";
        String s2="ate";

        String s3=s2;

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    s3=s3.replaceFirst(""+s1.charAt(i),"");
                }
            }
        }

        if(s3.length()==0)
            System.out.println("Yes it is Anagram");
        else
            System.out.println("no it is not a Anagram");

        System.out.println(s3);
    }
}
