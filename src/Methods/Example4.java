        package Methods;
        public class Example4 {
            public static void printTransactionDetails(String transactionId,String type,int amount,String status,String date) {

                System.out.println("Transaction ID:"+transactionId);
                System.out.println("Type:"+type);
                System.out.println("Amount:$"+amount);
                System.out.println("Status:"+status);
                System.out.println("Date: "+date);
                System.out.println("-----------------------------");
            }
                public static void main(String[] args) {
                System.out.println("Enter The Transaction Details:");
                printTransactionDetails("TXN1001","Credit",500,"Successful", "2024-12-01");
                printTransactionDetails("TXN1002","Debit",200,"Failed", "2024-12-02");
                printTransactionDetails("TXN1003","Debit",100,"Successful", "2024-12-03");
                printTransactionDetails("TXN1004","Credit",300,"Pending", "2024-12-04");


            // HINT: You can create a method like:
            // printTransactionDetails("TXN1001", "Credit", 500, "Successful", "2024-12-01");
        }
    }
