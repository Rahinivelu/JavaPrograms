package CheatSheet;

public class countTheVowlesInTheString {
    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
    public static void main(String[] args){
        String word="welcome to anadh tech tamil";
        int count=0;

        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}
