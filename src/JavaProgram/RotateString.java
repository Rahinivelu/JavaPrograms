package JavaProgram;

public class RotateString {

    public static void main(String[] args){
        String s= "abcde", goal = "cdeab";
        char[] lemon=s.toCharArray();
        for(int i=0;i<lemon.length;i++){
            char temp=lemon[0];
            int j=0;
            for( j=0;j<lemon.length-1;j++){
                lemon[j]=lemon[j+1];

            }
            lemon[j]= temp;
            String you="";
             for(int k=0;k<lemon.length;k++){
                 you+=lemon[k];
             }


            if(you.equals(goal)){
                System.out.println(you);
                System.out.println(goal);
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
            }
        }

    }
}
