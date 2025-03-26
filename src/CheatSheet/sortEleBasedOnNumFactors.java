package CheatSheet;

public class sortEleBasedOnNumFactors {

    public static void main(String[] args){
        int[] numbers={11,10,20,9,5,16,23};
        int [] fact=new int[numbers.length];

        for(int i=0;i<numbers.length;i++){
            int count=0;
            for(int j=1;j<=numbers[i];j++){
                if(numbers[i]%j==0){
                    count++;
                }
            }
            fact[i]=count;
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(fact[j]<fact[j+1]){
                    int temp=fact[j+1];
                    fact[j+1]=fact[j];
                    fact[j]=temp;

                    temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int i=0;i<fact.length;i++){
            System.out.println(fact[i]+"  "+numbers[i]);
        }


        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                if(fact[j]==fact[j+1] && numbers[j]>numbers[j+1] ){
                    if(numbers[j]>numbers[j+1]){
                        int temp=numbers[j+1];
                        numbers[j+1]=numbers[j];
                        numbers[j]=temp;
                    }
                }
            }
        }
        System.out.println("break");
        for(int i=0;i<fact.length;i++){
            System.out.println(fact[i]+"  "+numbers[i]);
        }

    }
}
