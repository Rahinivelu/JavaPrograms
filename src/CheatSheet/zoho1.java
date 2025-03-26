package CheatSheet;

public class zoho1 {
    public static void main(String[] args){
        String word="april";
        int space=(word.length()*2)-2;
        int mid=word.length()/2;
        for(int i=1;i<=word.length();i++) {
             for(int k=1;k<space;k++){
                 System.out.print(" ");
             }
             for(int l=1;l<=i;l++){
                 System.out.print(word.charAt(mid));
                 mid++;
                 if(mid==word.length()){
                     mid=0;
                 }
             }
                 mid=word.length()/2;
             System.out.println();
             space-=2;

        }
    }
}
