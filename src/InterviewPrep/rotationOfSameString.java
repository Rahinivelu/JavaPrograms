package InterviewPrep;

public class rotationOfSameString {
    public static void main(String[] args){
       String s="ABCD" ;
       String n_s="CDIB";

       if((s.length()==n_s.length()) && ((s+n_s).indexOf(n_s)!=-1))
       {
           System.out.print("The string is in rotation");
       }
       else {
           System.out.print("The string is not in rotation");
       }

//       System.out.print((s+n_s).indexOf(n_s));
//       for(int i=0;i<s.length();i++){
//           String temp="";
//           for(int j=i+1;j<s.length();j++){
//               temp+=s.charAt(j);
//           }
//           System.out.println(temp);
//       }
    }
}
