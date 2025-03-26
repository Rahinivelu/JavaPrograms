package CheatSheet;

public class wordBreak {

    public static void main(String [] args){
        String s="ilike";
        String[] word={"i","hate","like","my","love"};

        for(int i=0;i<s.length();i++){
            for(int j=0;j<word.length;j++){
               int len=word[j].length();
               String get=s.substring(i,len);
               if(word[j].equals(get)){
                   System.out.println("true");
                   break;
               }

            }
        }
    }
}
