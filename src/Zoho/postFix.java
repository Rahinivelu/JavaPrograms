package Zoho;

import java.util.Stack;

public class postFix {
    public static void main(String[] args) {
        String number="231*+9-";
        char[] chars=number.toCharArray();
         int num1,num2;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<chars.length;i++){
            char str=chars[i];
            if(Character.isDigit(str)){
                stack.push(str-'0');
            }else{
                num1= stack.pop();
                num2=stack.pop();

                switch (str){
                    case '+':
                        stack.push(num1+num2);
                        break;
                    case '-':
                        stack.push(num1-num2);
                        break;
                    case '*':
                        stack.push(num1*num2);
                        break;
                    case '/':
                        stack.push(num1/num2);
                        break;
                }



            }
        }
        System.out.println(stack.peek());
    }
}
