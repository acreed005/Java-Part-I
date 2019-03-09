public class Main {

    public static void main(String[] args) {
        CashRegister x = new CashRegister(); 
        LyyraCard cardOfA = new LyyraCard(50);
        
        double changeBack = x.payEconomical(10); 
        System.out.println(changeBack);
        double changeBack2 = x.payGourmet(9);
        System.out.println(changeBack2);
        
        boolean approvedCard = x.payEconomical(cardOfA);
        System.out.println(approvedCard);
        cardOfA.pay(30); 
        System.out.println(cardOfA.balance());
    }
}
