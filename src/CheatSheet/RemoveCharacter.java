package CheatSheet;

public class RemoveCharacter {

    public static void main(String[] args){
        String s1="occurence";
        String s2="car";

        for(int i=0;i<s2.length();i++){
            String s3="";
            for(int j=0;j<s1.length();j++){
                char d1=s1.charAt(j);
                char d2=s2.charAt(i);
                if(d1==d2){
                    continue;
                }
                s3+=d1;
            }
            s1=s3;
        }
        System.out.println(s1);
    }
}
