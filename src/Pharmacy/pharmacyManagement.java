package Pharmacy;


import java.util.*;

public class pharmacyManagement {

     static List<Map<String,Object>> branchList=new ArrayList<>();
     static List<Map<String,Object>> stockList=new ArrayList<>();
     static List<Map<String,Object>> customerList=new ArrayList<>();
     static List<Map<String,Object>> tansactionList=new ArrayList<>();
     static Map<String,String> AlternateMedicineList=new HashMap<>();
     static int transaction=1;
     public static void addBranch(BranchDetails BD){
         Map<String,Object> branchMap=new HashMap<>();
         branchMap.put("branchId",BD.branchId);
         branchMap.put("branchName",BD.branchName);
         branchMap.put("branchPhoneNum",BD.branchPhoneNum);
         branchList.add(branchMap);
         printBranchSummary();
     }

     public static void addStock(int branchId,String MedicineName,int MedicineQty,int MedicinePrice,int EachPrice){
         Map<String,Object> stockMap=new HashMap<>();
         stockMap.put("SbranchId",branchId);
         stockMap.put("Mname",MedicineName);
         stockMap.put("Mqty",MedicineQty);
         stockMap.put("Mprice",MedicinePrice);
         stockMap.put("EMprice",EachPrice);
         stockList.add(stockMap);
         printStockSummary();
     }

     public static void addAlternate(String Omedicine,String Amedicine){
                  AlternateMedicineList.put(Omedicine,Amedicine);
                  printAlternateMedicineSummary();

     }

     public static void addCustomerDetails(int CId,String CName,long Cphone){
         Map<String,Object> CustomerMap=new HashMap<>();
         CustomerMap.put("CustomerId",CId);
         CustomerMap.put("CustomerName",CName);
         CustomerMap.put("CustomerPhone",Cphone);
         customerList.add(CustomerMap);
         printCustomerSummary();

     }

     public static void purchaseProducts(int cid,int bid,String Mname,int Mqty) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Entered the original product");
         double productPrice = getProductprice(bid, Mname, Mqty);

         if (getProduct(bid, Mname, Mqty)) {
             int tran=transaction++;
             Map<String, Object> transMap = new HashMap<>();
             transMap.put("branchID", bid);
             transMap.put("customerId", cid);
             transMap.put("transactionId",tran);
             transMap.put("MedName", Mname);
             transMap.put("Medqty", Mqty);
             transMap.put("IndPrice", productPrice);
             tansactionList.add(transMap);
         } else if (!getProduct(bid, Mname, Mqty)) {
             System.out.println("The requested product is not in required Quantity");
             System.out.println("Do you want to purchase " + AlternateMedicineList.get(Mname) + " ?  Y/N");

             String choice = scan.next();
             if (choice.equalsIgnoreCase("Y")) {
                 System.out.println("Entered the Alternate product");
                 double AproductPrice = getProductprice(bid, AlternateMedicineList.get(Mname), Mqty);
                 if (getAlternateProduct(bid, Mname, Mqty)) {
                     int tran=transaction++;
                     Map<String, Object> transMap = new HashMap<>();
                     transMap.put("branchID", bid);
                     transMap.put("customerId", cid);
                     transMap.put("transactionId",tran);
                     transMap.put("MedName", AlternateMedicineList.get(Mname));
                     transMap.put("Medqty", Mqty);
                     transMap.put("IndPrice", AproductPrice);
                     tansactionList.add(transMap);
                 } else if (!getAlternateProduct(bid, Mname, Mqty)) {
                     System.out.println("Sorry! Alternate product is also not available.........");
                     System.out.println("Suggesting you an pharmacy whether the product is available");
                     for (Map branchL : branchList) {
                         int newBranchId = (int) branchL.get("branchId");
                         if (bid != newBranchId) {
                             for (Map stocksl : stockList) {
                                 int stocksBid = (int) stocksl.get("SbranchId");
                                 if (stocksBid == newBranchId) {
                                     String NewMed = (String) stocksl.get("Mname");
                                     if (NewMed.equalsIgnoreCase(Mname) ){
                                         int NewAvailableQty = (int) stocksl.get("Mqty");
                                         if (NewAvailableQty >= Mqty) {
                                             System.out.println("The product is available in " + newBranchId + " branch");
                                             return;
                                         }
                                     }
                                 }
                             }
                         }
                     }
                 }
             }
         }

         while (true) {
             System.out.println("Do you want to continue ? Y?N ");

             String choice = scan.next();
             if (choice.equalsIgnoreCase("y")) {
                 scan.nextLine();
                 System.out.println("Enter the Medicine name ");
                 String new_med = scan.nextLine();
                 System.out.println("Enter the Medicine Quantity ");
                 int new_med_qty = scan.nextInt();

                 if (getProduct(bid, new_med, new_med_qty)) {
                     double NproductPrice = getProductprice(bid, new_med, new_med_qty);
                     int tran=transaction++;
                     Map<String, Object> transMap = new HashMap<>();
                     transMap.put("branchID", bid);
                     transMap.put("customerId", cid);
                     transMap.put("transactionId",tran);
                     transMap.put("MedName", new_med);
                     transMap.put("Medqty", new_med_qty);
                     transMap.put("IndPrice", NproductPrice);
                     tansactionList.add(transMap);
                 }else if (!getProduct(bid, new_med, new_med_qty)) {
                     System.out.println("The requested product is not in required Quantity");
                     System.out.println("Do you want to purchase " + AlternateMedicineList.get(new_med) + " ?  Y/N");

                     String choices = scan.next();
                     if (choices.equalsIgnoreCase("Y")) {
                         new_med=AlternateMedicineList.get(new_med);

                         System.out.println("Entered the Alternate product");
                         if (getAlternateProduct(bid, new_med, new_med_qty)) {
                             double NAproductPrice = getProductprice(bid, new_med, new_med_qty);
                             int tran=transaction++;
                             Map<String, Object> transMap = new HashMap<>();
                             transMap.put("branchID", bid);
                             transMap.put("customerId", cid);
                             transMap.put("transactionId",tran);
                             transMap.put("MedName", new_med);
                             transMap.put("Medqty", new_med_qty);
                             transMap.put("IndPrice", NAproductPrice);
                             tansactionList.add(transMap);
                         } else if (!getAlternateProduct(bid, new_med, new_med_qty)) {
                             System.out.println("Sorry! Alternate product is also not available.........");
                             System.out.println("Suggesting you an pharmacy whether the product is available");
                             for (Map branchL : branchList) {
                                 int newBranchId = (int) branchL.get("branchId");
                                 if (bid != newBranchId) {
                                     for (Map stocksl : stockList) {
                                         int stocksBid = (int) stocksl.get("SbranchId");
                                         if (stocksBid == newBranchId) {
                                             String NewMed = (String) stocksl.get("Mname");
                                             if (NewMed.equalsIgnoreCase(Mname) ){
                                                 int NewAvailableQty = (int) stocksl.get("Mqty");
                                                 if (NewAvailableQty >= new_med_qty) {
                                                     System.out.println("The product is available in " + newBranchId + " branch");
                                                     break;
                                                 }else{
                                                     System.out.println("None branch have the qty you required");
                                                 }
                                             }
                                         }

                                     }
                                 }
                             }
                         }
                     }
                 }
             }else{
                 printTransactionSummary();
                 System.out.println("Pharamacy is over");
                 break;
             }

         }
     }


     public static void printTransactionSummary(){
         System.out.println("=================================================================================================================================================");
         System.out.println("BranchId"+"        "+"TransactionId"+"        "+"customerId"+"            "+"MedicineName"+"             "+"MedQuantity"+"          "+"CummalativePrice");
         System.out.println("=================================================================================================================================================");
         for(Map trans:tansactionList){

             System.out.println(trans.get("branchID")+"                "+trans.get("transactionId")+"                        "+trans.get("customerId")+"                    "+trans.get("MedName")+"                     "+trans.get("Medqty")+"                      "+trans.get("IndPrice"));
             System.out.println("===============================================================================================================================================");
         }
     }
     public static boolean getAlternateProduct(int branchId, String MedName,int Requiredqty){
         int stockqty=0;
        String alternateMedicine= AlternateMedicineList.get(MedName);
        for(Map stocks:stockList){
            int MbranchId=(int)stocks.get("SbranchId");
            if(MbranchId==branchId){
                String Medicine= (String)stocks.get("Mname");
                if(Medicine!=null && alternateMedicine.equalsIgnoreCase(Medicine)){
                     stockqty=(int)stocks.get("Mqty");
                    if(stockqty>=Requiredqty){
                        stocks.put("Mqty",stockqty-Requiredqty);
                        System.out.println("purchased "+Requiredqty+" "+alternateMedicine);
                        System.out.println("Price "+ Requiredqty*((int)stocks.get("EMprice")));
                        return true;
                       // return stockqty>=Requiredqty;
                    }
                }
            }
         }
        return false;

     }
     public static double getProductprice(int branchId, String MedName,int Requiredqty){
         for(Map stock:stockList){
             String medicine=(String)stock.get("Mname");
             if(medicine!=null && medicine.equalsIgnoreCase(MedName)){
                 int price=(int)stock.get("EMprice");
                 return Requiredqty*price;
             }
         }

         return Requiredqty*0.00;
     }
     public static boolean getProduct(int branchId, String MedName,int Requiredqty){
         int MedQuantity=0;
         for(Map stock:stockList){
             int MbranchId=(int)stock.get("SbranchId");
             if(MbranchId==branchId){
                 String Mname=(String)stock.get("Mname");
                 if(Mname.equalsIgnoreCase(MedName)){
                     MedQuantity=(int)stock.get("Mqty");
                     if(Requiredqty<=MedQuantity){
                         stock.put("Mqty",MedQuantity-Requiredqty);
                         return Requiredqty<=MedQuantity;
                     }
                 }
             }
         }
         return Requiredqty<=MedQuantity;
     }

     public static void printCustomerSummary(){
         System.out.println("List of customer details");
         System.out.println("=======================================================================================");
         System.out.println("CustomerId"+"      |          "+"CustomerName"+"       |         "+"CustomerPhoneNumber");
         System.out.println("=======================================================================================");
         for(Map customer:customerList){
             System.out.println(customer.get("CustomerId")+"            |          "+customer.get("CustomerName")+"                 |             "+customer.get("CustomerPhone"));
         }
     }

     public static void printAlternateMedicineSummary(){
         System.out.println("List of stock details");
         System.out.println("Medicine"+"   "+"AlternateMedicine");
         for(Map.Entry<String,String> set:AlternateMedicineList.entrySet()){
             System.out.println("=====================================");
             System.out.println(set.getKey()+"    |    "+set.getValue());
         }
     }

     public static void printStockSummary(){
         System.out.println("List of stock details");
         System.out.println("==========================================================================================================");
         System.out.println("BranchId"+"       |      "+"MName"+"          |       "+"Mqty"+"        |       "+"Mprice");
         System.out.println("==========================================================================================================");

         for(Map branch:branchList){
            int branchNumber=(int) branch.get("branchId");
            for(Map stock:stockList){
                if(branchNumber==(int)stock.get("SbranchId")){

                    System.out.println((int)stock.get("SbranchId")+"      |       "+(String)stock.get("Mname")+"       |          "+(int)stock.get("Mqty")+"       |       "+(int)stock.get("Mprice"));
//                    System.out.println("BranchId : "+(int)stock.get("SbranchId"));
//                    System.out.println("MName : "+(String)stock.get("Mname"));
//                    System.out.println("Mqty : "+(int)stock.get("Mqty"));
//                    System.out.println("Mprice : "+stock.get("Mprice"));
                  //  System.out.println("EMprice : "+(int)stock.get("EMprice"));
                    System.out.println("======================================================================================");

                }
            }
         }
     }

     public static void printBranchSummary(){
         System.out.println("branchId"+"          "+"branchName"+"          "+"branchPhoneNum");
         System.out.println("======================================================================");
         for(Map branch: branchList ){
             System.out.println(branch.get("branchId")+"                 "+branch.get("branchName")+"                "+branch.get("branchPhoneNum"));
             System.out.println("==================================================================");
         }
     }

}
