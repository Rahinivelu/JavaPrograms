package RecursionProblems;

public class subSeq {
    static void subSeqString(String value,String em){
        if(value.isEmpty())
        {
            System.out.println(em);
            return;
        }
        char c=value.charAt(0);
        subSeqString(value.substring(1),em+c);
        subSeqString(value.substring(1),em);


    }
    public static void main(String[] args) {
        subSeqString("abc","");
    }
}
