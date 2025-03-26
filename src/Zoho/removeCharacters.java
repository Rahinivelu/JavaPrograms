package Zoho;

public class removeCharacters {
    public static void main(String[] args) {
        String str="computer";
        String str1="cat";

        int arr[]=new int[26];

        for(int i=0;i<str1.length();i++){
            int index=str1.charAt(i)-97;
            arr[index]++;
        }
        String number="";
        for(int j=0;j<str.length();j++){
            int index=str.charAt(j)-97;
            if(arr[index]==0){
                number+=str.charAt(j);
            }
        }
        System.out.println(number);
    }
}
