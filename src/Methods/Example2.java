package Methods;

    public class Example2 {
        public static void publicInvoice (String item,int price,int quantity ) {
           int total = price* quantity;
            System.out.println("Item:"+item);
            System.out.println("Price:$"+price);
            System.out.println("Quantity:"+quantity);
            System.out.println("total:$"+total);
            System.out.println("-----------------------------");

        }

        public static void main(String[] args) {

            publicInvoice("laptop",800,2);
            publicInvoice("Mouse",25,2);
            publicInvoice("Keyboard",40,2);
            publicInvoice("Monitor",200,2);
        }
    }
