package InterviewPrep;

public class StringNumber {

    public static void main(String[] args) {

        /// The following code is for the alphabet and by using single digit number
//        String s="a11b22c44";
//
//        for(int i=0;i<s.length();i++){
//            char letter=s.charAt(i);
//            if (letter >= '0' && letter <= '9') {
//                 for(int j=0;j<letter-48;j++){
//                     System.out.print(s.charAt(i-1));
//                 }
//            }
//        }

        /// The following code is for the alphabet and by using double digit number

        String word = "a1b9c2";
        System.out.print(word.length());
        char letter=0;
        int num = 0;
        for (int i = 0; i < word.length(); i++) {

            if((word.charAt(i)>='a'&& word.charAt(i)<='z' )||(word.charAt(i)>='A'&& word.charAt(i)<='B')){
                letter = word.charAt(i);
            }
            else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                num=0;
                while (word.charAt(i) >= '0' && word.charAt(i) <= '9' && i<word.length()) {
                    num = (num * 10) + (word.charAt(i) - 48);
                    i++;
                }
                i--;
                for (int j = 0; j < num; j++) {
                    System.out.print(letter);
                }


            }

        }

    }
}