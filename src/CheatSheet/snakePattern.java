package CheatSheet;

public class snakePattern {
    public static void main(String[] args){
        int space=5;
        int num=5;
        for(int i=1;i<=num;i++) {
          for(int k=1;k<space;k++){
              System.out.print(" ");
          }
          space--;
            for (int j = i; j>0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        }
    }

/** Output:
 *      1
 *     21
 *    321
 *   4321
 *  54321
 *
 */