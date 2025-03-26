package CheatSheet;

public class isSequenece {

    public static boolean isSequenece(String s,String t){
        if(s.length()==0)
            return true;
        if(t.length()==0)
            return false;

        boolean[][] dp=new boolean[s.length()][t.length()];

        for(int i=0;i<dp.length;i++){
            if(i==0&& s.charAt(0)==t.charAt(0))
                dp[i][0]=true;
            else
                dp[i][0]=false;
        }

        for(int k=1;k<dp[0].length;k++){
            if(s.charAt(0)==t.charAt(k))
                dp[0][k]=true;
            else
                dp[0][k]=dp[0][k-1];
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i)==t.charAt(j))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        return dp[s.length()-1][t.length()-1];
    }
    public static void main(String[] args){
        String t="cdasfgn";
        String s="afn";

        boolean value=isSequenece(s,t);
        System.out.print(value);

    }
}
