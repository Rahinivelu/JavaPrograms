package CheatSheet;

public class a3b1c10 {
    public static void main (String[] args){
        String word="a4b10c5";
        char[] letters=new char[word.length()];

        for(int i=0;i<word.length();i++)
            letters[i]=word.charAt(i);

        for(int i=0;i<letters.length;i++){
            int nums=0;
            if(letters[i]>='0'&& letters[i]<='9'){
                char newLet=letters[i-1];
                for(int j=i;j<letters.length;j++){
                    if(letters[j]>='0'&& letters[j]<='9')
                       nums=(nums*10)+(letters[j]-'0');
                    else
                        break;
                    i++;
                }
                for(int k=0;k<nums;k++)
                    System.out.print(newLet);
            }
        }

    }
}
