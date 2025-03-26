package CheatSheet;

public class FormTheLargestNumber70 {
    public static int comparing(String s1, String s2){
        String a=s1+s2;
        String b=s2+s1;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                return 1;
            }else if(a.charAt(i)<b.charAt(i)){
                return -1;
            }else{
                return 0;
            }
        }
        return a.compareTo(b);
    }
    public static void main(String[] args){
       int arr[]={54,546,548,60};
       // int arr[]={3,30,34,5,9};
         String word[]=new String[arr.length];

         for(int i=0;i<arr.length;i++){
             word[i]=String.valueOf(arr[i]);
         }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(comparing(word[j],word[j+1])<0){
                    String temp=word[j];
                    word[j]=word[j+1];
                    word[j+1]=temp;
                }
            }
        }

        String newWord="";

        for(int i=0;i<arr.length;i++){
            newWord+=word[i];
        }

        System.out.println(newWord);

    }
}
