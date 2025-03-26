package CheatSheet;

import java.util.Arrays;

public class program17 {

    public static void main(String[] args){
       String []words={"aba","bbccca","ba"};
       for(int i=0;i< words.length;i++){
           char[] letter=new char[words[i].length()];
           for(int j=0;j<words[i].length();j++){
               letter[j]=words[i].charAt(j);
           }

           for(int k=0;k<letter.length;k++){
               for(int l=0;l<letter.length-k-1;l++){
                   if(letter[l]<letter[l+1]){
                       char temp=letter[l];
                       letter[l]=letter[l+1];
                       letter[l+1]=temp;
                   }
               }
           }

           String [] error={null,null};
           char temp1=letter[0];
           int temp=0;
           int r=0;
           for(int m=0;m<letter.length;m++){
               if(temp1==letter[m]){
                   r++;
               }if(temp1!=letter[m]|| m==letter.length-1){
                   int value=temp1-96;
                   if(r==value-1){
                       if(temp<2){
                           error[temp]="less "+temp1+" shortlisted";
                       }
                       temp++;
                   }else if(r==value+1){
                       if(temp<2){
                           error[temp]="more "+temp1+" shortlisted";
                       }
                       temp++;
                   }
                   temp1=letter[m];
                   r=1;
               }
           }

           if(error[0]!=null && error[1]!=null){
               System.out.println("Rejected");
           }else if(error[0]!=null)
               System.out.println(error[0]);
           else
               System.out.println("Shortlisted");
       }
    }
}
