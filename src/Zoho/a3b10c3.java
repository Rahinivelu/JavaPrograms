package Zoho;

public class a3b10c3 {
    public static void main(String[] args) {
        String value="a3b10c7";

        char letter[]=new char[value.length()];
        for(int i=0;i<value.length();i++){
            letter[i]=value.charAt(i);
        }

        for(int j=0;j<value.length();j++){
            int num=0;
            if(letter[j]>='0' && letter[j]<='9'){
                char let=value.charAt(j-1);
                for(int k=j;k<value.length();k++){
                    if(letter[j]>='0' && letter[j]<='9'){
                        num=(num*10)+letter[j]-'0';
                    }else{
                        break;
                    }
                    j++;
                }
                for(int i=0;i<num;i++){
                    System.out.print(let);
                }
            }

        }


    }
}
