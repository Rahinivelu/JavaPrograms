package DynamicPrograming;

public class LongestPalindromeSubsequence {

    public static void main(String[] args) {
        String s1="rahini";
        StringBuilder str=new StringBuilder(s1);
        String s2=str.reverse().toString();
        System.out.println(LPS(s1,s2));
    }

    private static int LPS(String s1, String s2) {

        int len=s1.length();
        int n=len+1;
        int dp[][]=new int[n][n];

        for(int i=0;i<=len;i++)
            dp[0][i]=0;
        for(int j=0;j<=len;j++)
            dp[j][0]=0;

        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[len][len];
    }
}
