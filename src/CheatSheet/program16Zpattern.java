package CheatSheet;

public class program16Zpattern {
    public static void main(String[] args){
        String word="zohocorporationteam";
        int index=0;
        boolean flag=false;
        for(index=1;index<word.length();index++){
            int condition_1=word.length()-(index*2);
            int condition_2=index-2;
            int k=0;
            if(condition_2==condition_1){
                flag=true;
                for(int i=0;i<index;i++){
                    for(int j=0;j<index;j++){
                        if(i==0|| i==index-1||i+j==index-1)
                            System.out.print(word.charAt(k++)+" ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();

                }




        }

    }
        if(flag==false){
            System.out.println("The word will not form 'z' pattern ");
        }
}
}
