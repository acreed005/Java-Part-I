public class Main {

    public static void main(String[] args) {
        
        Money x = new Money(10,120); // (a dollar & 20 c.)
        System.out.println(x.cents()); // 20 
        System.out.println(x.euros()); // 11 
        System.out.println(x); // 11.20
        
        Money a = new Money(10,0); // a = 10.0
        Money b = new Money(5,0); // b = 5.0

        Money c = a.plus(b);    // obj c is equal to a(euros + cents) + b(euros + cents) 

        System.out.println(a);  // 10.0 
        System.out.println(b);  // 5.0
        System.out.println(c);  // 15.0

        a = a.plus(c);          /* NOTE: new Money-object is created and reference to that
                                   is assigned to variable a.
                                   The Money object 10.00e that variable 'a' used to hold
                                   is not referenced anymore
                                */
                        
        System.out.println(a);  // a = 10 + 15 = 25.0 
        System.out.println(b);  // b = 5.0 
        System.out.println(c);  // c = 15.0  
        
        Money d = new Money(10,0);
        Money e = new Money(3,0);
        Money f = new Money(5,0);

        System.out.println(d.less(e));  // 10 < 3 = false
        System.out.println(e.less(f));  // 3 < 5 = true
        
        Money g = new Money(10,0); // g = 10.0 
        Money h = new Money(3,50); // h = 3.50

              
        Money i = g.minus(h); // i = 10 - 3.50 = 6.50

        System.out.println(g);  // g = 10.0 
        System.out.println(h);  // h = 3.50 
        System.out.println(i);  // i = 6.50

        i = i.minus(g);         // NOTE: new Money-object is created and reference to that is assigned to variable c
                        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(g);  // 10.0
        System.out.println(h);  // 3.50
        System.out.println(i);  // 0.0
    }
}
