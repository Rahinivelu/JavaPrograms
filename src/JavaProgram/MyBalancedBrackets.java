package JavaProgram;

import java.util.Scanner;
import java.util.Stack;

public class MyBalancedBrackets {

    static boolean areBalanced(String exp){

         Stack <Character> st=new Stack<Character>();

         for(int i=0;i<exp.length();i++){
             char x=exp.charAt(i);



             if(x == '('||x=='{'||x=='['){
                 System.out.println("the pussed element is; "+x) ;

                 st.push(x);
                 continue;
             }

             else if((x==')' && st.peek()=='(')  || (x==']' && st.peek()=='[') || (x=='{' && st.peek()=='{')  ){
                 st.pop();
             }


             //if(st.empty())
                 //return false;

             //char check;

//             switch(x){
//
//                 case ')':
//                     check= st.pop();
//                     System.out.println("the popped element is; "+check) ;
//                     if(check=='[' ||check=='{')
//                         return false;
//                     break;
//
//                 case '}':
//                     check= st.pop();
//                     System.out.println("the popped element is; "+check) ;
//                     if(check=='[' ||check=='(')
//                         return false;
//                     break;
//
//                 case ']':
//                     check= st.pop();
//                     System.out.println("the popped element is; "+check) ;
//                     if(check=='{' ||check=='(')
//                         return false;
//                     break;
//             }
         }


        return (st.empty());
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Print the expression to check whether it is balanced not notBanalanced : ");
        String Expression=scan.next();
       if(areBalanced(Expression))
           System.out.println("The Expression is Balanced");
       else
           System.out.println("The Expression is Not Balanced");
    }


}
