package Pharmacy;

public class BranchDetails {

    static int id=1;
    int branchId;
    String branchName;
    long branchPhoneNum;

    public BranchDetails(String branchName, long branchPhoneNum) {
        branchId=id++;
        this.branchName = branchName;
        this.branchPhoneNum = branchPhoneNum;
    }


   // BranchDetails(String )
}
