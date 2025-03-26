package CheatSheet;

public class LexicographicalOrder {
    public static int compareString(String l1, String l2){
       int len1=l1.length();
       int len2=l2.length();
       int minlength=Math.min(len1,len2);
       for(int i=0;i<minlength;i++){
           if(l1.charAt(i)!=l2.charAt(i)){
               return l1.charAt(i)-l2.charAt(i);
           }
       }
       return len1-len2;
    }

    public static void main(String[] args){
        String arr[]={"geeksforgeeks","for","geeks"};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(compareString(arr[j],arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(String res:arr)
            System.out.println(res);
    }
}
