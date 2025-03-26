package CheatSheet;

public class minimumNoOfCharacter92 {
    public static void main(String [] args){
        String word="sabcdefghsocks";
        int max=-1;
        int result=0;
        int count=0;boolean flag=false;
        for(int i=0;i<word.length()-1;i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    int temp = j - i - 1;
                    max = max < temp ? temp : max;
                }

            }

        }
        System.out.print(max);
    }
}
