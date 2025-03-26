package CheatSheet;

public class leastPrimeToAdd {
    private static void findLeast(int[] first,int [] second){
        int a[]=first;
        int b[]=second;
        int array[]=new int[first.length];
        int k=0;
        for(int i=0;i<first.length;i++){
            int prime=2;
            while(true){
                if((a[i]+prime)%b[i]==0 && isPrime(prime)){
                    array[k++]=prime;
                    break;
                }
                prime++;
            }

        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static boolean isPrime(int value) {
        if(value<2) return false;

        for(int i=2;i*i<=value;i++){
            if(value%i==0)
                return false;
        }
        return true;

    }

    public static void main(String[] args){
        int []first={5,10,15};
        int []second={3,7,5};

        findLeast(first,second);
    }
}
