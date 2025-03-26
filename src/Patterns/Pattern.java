package Patterns;

public class Pattern {

    public static void main(String [] args){
//        System.out.println(" The triangle pattern");
//        for(int i=0;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//
//        System.out.println(" The inverted triangle pattern");
//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//
//        System.out.println(" Both the triangle pattern clubed together");
//        for(int i=0;i<=4;i++){
//
//        }

//        System.out.println("The prymid pattern");
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
 //       }
//     System.out.println(" Prymid pattern with numbers");
//        for(int i=1;i<=5;i++){
//            for(int j=5-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }

        System.out.println("Square hollow pattern- pattern 1");
        for(int i=0;i<6;i++){
            for(int j =0;j<6;j++){
                if(i==0||i==5||j==0 ||j==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

        System.out.println("Number Triangle pattern- pattern 2");
        for(int i=1;i<=5;i++)
        {
            for(int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        System.out.println("number increasing pattern - pattern 3");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("number increasing reverse pattern - pattern 4");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println(" Number changing prymid - pattern 5");
        int k=1;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" zero- one triangle - pattern 6");
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println("");
        }

        System.out.println(" Palindrome trianglar - pattern 7");
        int i, j,n=3;

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
