package Pharmacy;

import java.util.*;

public class main {

    public static void main(String[]args){
       Scanner scan=new Scanner(System.in);
       boolean choice=true;
       // System.out.println();
       while(choice){
           System.out.println("The Pharmacy actions");
           System.out.println("1.Add Branch\n2.Add Stock\n3.Alternate Medicine\n4.Add Customer\n5.Purchase Medicine\n6.Exit");
           int value=scan.nextInt();
           pharmacyManagement pharmacy=new pharmacyManagement();
           switch(value){
               case 1:
                   System.out.println("Add the branch details");
                   scan.nextLine();
                   System.out.println("Enter the branch location");
                   String branchName=scan.nextLine();
                   System.out.println("Enter the branch phone number");
                   long phoneNum=scan.nextLong();

                   BranchDetails BD=new BranchDetails(branchName,phoneNum);
                   pharmacy.addBranch(BD);
                   break;
               case 2:
                   System.out.println("Add the Stock details here");
                   //scan.nextLine();
                   System.out.println("Enter the Branch Id:");
                   int branchID=scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter the Medicine name:");
                   String MedicineName=scan.nextLine();
                   System.out.println("Enter the Medicine Quantity:");
                   int MedicineQty=scan.nextInt();
                   System.out.println("Enter the Medicine Price:");
                   int MedicinePrice=scan.nextInt();

                   int EachPrice= MedicinePrice/MedicineQty;
                   pharmacy.addStock(branchID,MedicineName,MedicineQty,MedicinePrice,EachPrice);
                   break;
               case 3:
                   System.out.println("Alternate Medicines");
                   scan.nextLine();
                   System.out.println("Enter the Medicine name");
                   String OMedicine=scan.nextLine();
                   //scan.nextLine();
                   System.out.println("Enter the Alternate Medicine name");
                   String AMedicine=scan.nextLine();
                   pharmacy.addAlternate(OMedicine,AMedicine);
                   break;
               case 4:
                   System.out.println("Enter the customer details");
                   System.out.println("Enter the customer Id");
                   int customeId= scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter the customer name");
                   String customerName=scan.nextLine();
                   System.out.println("Enter the customer phone number");
                   long cPhoneNumber=scan.nextLong();
                   pharmacy.addCustomerDetails(customeId,customerName,cPhoneNumber);
                   break;
               case 5:
                   System.out.println("Enter the Required details");
                   System.out.println("Enter the customer Id");
                   int CId=scan.nextInt();
                   System.out.println("Enter the Branch Id");
                   int BId=scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter the Medicine Name");
                   String Mname=scan.nextLine();
                   System.out.println("Enter the Quantity of the Medicine required");
                   int Mqty=scan.nextInt();
                   pharmacy.purchaseProducts(CId,BId,Mname,Mqty);
                   break;
               case 6:
                   choice=false;
                   break;
           }
       }
    }
}
