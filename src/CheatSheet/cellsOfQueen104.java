package CheatSheet;

import java.util.*;

public class cellsOfQueen104 {
    public static boolean isValidPosition(int n,int xaxis, int yaxis){
        return (n>=xaxis && n>=yaxis && xaxis>=1 && yaxis>=1 );
    }
 public static int squareGivenInDirection(int n,int xaxis,int yaxis, int xincrement, int yincrement, Set<String> set){

     int count=0;

     while(isValidPosition(n,xaxis,yaxis) && !set.contains(xaxis+" , "+yaxis)){
         xaxis+=xincrement;
         yaxis+=yincrement;
         count++;
     }
     return count++;
 }
    public static int queenMoves(int n,int x,int y,int k,int []obsx,int obsy[]){
       Set<String> set=new HashSet<>();
       for(int i=0;i<k;i++){
           set.add(obsx[i]+" , "+obsy[i]);
       }

       int ans=0;
       ans+=squareGivenInDirection(n,x+1,y,1,0,set);
        ans+=squareGivenInDirection(n,x,y+1,0,1,set);
        ans+=squareGivenInDirection(n,x-1,y,-1,0,set);
        ans+=squareGivenInDirection(n,x,y-1,0,-1,set);
        ans+=squareGivenInDirection(n,x-1,y-1,-1,-1,set);
        ans+=squareGivenInDirection(n,x+1,y+1,1,1,set);
        ans+=squareGivenInDirection(n,x+1,y-1,1,-1,set);
        ans+=squareGivenInDirection(n,x-1,y+1,-1,+1,set);

        return ans;
    }
    public static void main(String[] args){
        int n=8;
        int x=4,y=4;
        int k=1;
        int obsx[]={5};
        int obsy[]={3};
        int count=queenMoves(n,x,y,k,obsx,obsy);
        System.out.println(count);

    }
}
