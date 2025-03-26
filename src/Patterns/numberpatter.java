package Patterns;

import java.util.Scanner;

public class numberpatter {
    public static void main(String[] args){
        String value="12345";
        System.out.println(value.length());
//        for(int i=0;i<value.length();i++){
//            for(int j=0;j<value.length();j++){
//                if(i==j){
//                    char word=value.charAt(i);
//                    System.out.print(word);
//                }else if(i+j==value.length()-1){
//                    char word=value.charAt(j);
//                    System.out.print(word);
//                }else
//                    System.out.print(" ");
//            }
//            System.out.println("");
//        }
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int middle=(a+1)/2;
        for(int i=1;i<=a;i++){
          for(int j=1;j<=a;j++){
              if(i==j){
                  if(i<middle)
                  {
                      System.out.print(a-i+1);
                  }else System.out.print(i);
                 // System.out.print(i);
              }else if(i+j==a+1){
                  if(i<middle)
                  {
                      System.out.print(i);}
                  else
                      System.out.print(j);
              }else {
                  System.out.print(" ");
              }
          }
          System.out.println();
        }
    }
}
