import java.util.*;
import java.util.ArrayList;
import java.util.List;

interface Payment{  
    void display();
}

class Standard implements Payment{
    int id;
    String nm;
    float amt;
    Standard s;
    float tempx = 0, tempy = 0;
    ArrayList<Standard> std = new ArrayList<Standard>();
    public Standard(int i, String n, float a){
        id = i;
        nm = n;
        amt = a;
    }
    void accept(Standard s){
        std.add(s);
    }
    public void display(){
        float tamt, damt;
        for(int i = 0; i < std.size(); i++){
            Standard s2 = std.get(i);
            damt = (s2.amt * 0)/100;
            tamt = s2.amt - damt;  
            System.out.print("\t"+s2.id+"\t"+s2.nm+"\t"+""+tamt+"\t\t"+damt);
			System.out.println();
            System.out.println(); 

            }
    }
}

class Loyalty implements Payment{
    int id;
    String nm;
    float amt;
    Loyalty l;
    ArrayList<Loyalty> loy = new ArrayList<Loyalty>();
    public Loyalty(int i, String n, float a){
        id = i;
        nm = n;
        amt = a;
    }
    void accept(Loyalty l){
        loy.add(l);
    }
    public void display(){
        float tamt, damt;
        for(int i = 0; i < loy.size(); i++){
            Loyalty l2 = loy.get(i);
            damt = (l2.amt * 10)/100;
            tamt = l2.amt - damt; 
			System.out.print("\t"+l2.id+"\t"+l2.nm+"\t"+""+tamt+"\t\t"+damt);
			System.out.println();
            System.out.println();
            }
    }
}

class Staff implements Payment{
    int id;
    String nm;
    float amt;
    Staff st;
    ArrayList<Staff> staf = new ArrayList<Staff>();
    public Staff(int i, String n, float a){
        id = i;
        nm = n;
        amt = a;
    }
    void accept(Staff st){
        staf.add(st);
    }
    public void display(){
        float tamt, damt;
        for(int i = 0; i < staf.size(); i++){
            Staff st2 = staf.get(i);
            damt = (st2.amt * 20)/100;
            tamt = st2.amt - damt;  
			System.out.print("\t"+st2.id+"\t"+st2.nm+"\t"+""+tamt+"\t\t"+damt);
			System.out.println();
            System.out.println();
            }
    }
}

///////////////////////////////////////////////////////////

class Fed2 {
    public static void main(String args[]) {
        int count;
        Standard s, s3;
        Loyalty l, l3;
        Staff st, st3;

     {
        int cnt=1;
        s = new Standard(cnt, "Ivan", 100);
        s.accept(s);
        cnt++;
        l = new Loyalty(cnt, "zeld", 200);
        l.accept(l);
        cnt++;
        st = new Staff(cnt, "Anne", 300);
        st.accept(st);
        count = cnt;
     }

        Scanner sc = new Scanner(System.in);
        int id;
        String nm;
        float amt;
        int ch;        
        do{
            System.out.println();
            System.out.println("Federation Car Rental Payment Tracking System");
            System.out.println("=============================================");
            System.out.println();
            System.out.println("Select an option from the menu below:");
            System.out.println("1. Standard Payment");
            System.out.println("2. Loyalty Payment");
            System.out.println("3. Employee Payment");
            System.out.println("4. Display List of Clients");
            System.out.println("5. Generate Report To View Payments Received");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1: 
                System.out.println("\tID    NAME     TOTAL_AMOUNT    DISCOUNTED_AMOUNT");
                    s.display();
                    System.out.println("Enter the name of Client:");
                        nm = sc.next();
                    System.out.println("Enter the amount of this payment:");
                        amt = sc.nextInt();
                        count++;
                    Standard s2 = new Standard(count, nm, amt);
                    s.accept(s2);
                    System.out.println("--Processing Standard Payment--");
                    System.out.println("...");
                    System.out.println("Finished processing payment.");
                    break;
                case 2:
                System.out.println("\tID    NAME     TOTAL_AMOUNT    DISCOUNTED_AMOUNT");
                    l.display();
                    System.out.println("Enter the name of Client:");
                        nm = sc.next();
                    System.out.println("Enter the amount of this payment:");
                        amt = sc.nextInt();
                        count++;
                    Loyalty l2 = new Loyalty(count, nm, amt);
                    l.accept(l2);
                    System.out.println("--Processing Loyalty Payment--");
                    System.out.println("...");
                    System.out.println("Finished processing payment.");
                    break;
                case 3:
                System.out.println("\tID    NAME     TOTAL_AMOUNT    DISCOUNTED_AMOUNT");
                    st.display();
                    System.out.println("Enter the name of Client:");
                        nm = sc.next();
                    System.out.println("Enter the amount of this payment:");
                        amt = sc.nextInt();
                        count++;
                    Staff st2 = new Staff(count, nm, amt);
                    st.accept(st2);
                    System.out.println("--Processing Staff Payment--");
                    System.out.println("...");
                    System.out.println("Finished processing payment.");
                    break;
                case 4:
                    System.out.println("--List of Clients--");
                    System.out.println("\tID    NAME     TOTAL_AMOUNT    DISCOUNTED_AMOUNT");
                    System.out.println("Standard Clients:");
                    s.display();
                    System.out.println("loyalty Clients:");
                    l.display();
                    System.out.println("Staff Clients:");
                    st.display();
                    break;
                case 5:
                float tempsx = 0, tempsy = 0;
                float templx = 0, temply = 0;
                float tempstx = 0, tempsty = 0;
                float damt , tamt;
                    for(int i = 0; i < s.std.size();i++)
                    {   
                         s3 = s.std.get(i);
                        damt = (s3.amt * 0)/100;
                        tamt = s3.amt - damt;  
                        tempsx = tempsx + tamt;
                        tempsy = tempsy + damt;
                    }
                    for(int i = 0; i < l.loy.size();i++)
                    {   
                         l3 = l.loy.get(i);
                        damt = (l3.amt * 10)/100;
                        tamt = l3.amt - damt;  
                        templx = templx + tamt;
                        temply = temply + damt;
                    }
                    for(int i = 0; i < st.staf.size();i++)
                    {   
                         st3 = st.staf.get(i);
                        damt = (st3.amt * 20)/100;
                        tamt = st3.amt - damt;  
                        tempstx = tempstx + tamt;
                        tempsty = tempsty + damt;
                    }
                    float totalamt = tempsx  + templx + tempstx;
                    float totaldamt = tempsy + temply + tempsty;
                    System.out.println("--Report to View Payments Received--");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Type of Account      Total Amount Received      Discounts Given");
                    System.out.println("----------------------------------------------------------------");

                    System.out.println("Standard\t\t\t"+tempsx+"\t\t\t"+tempsy);
                    
                    System.out.println("Loyalty\t\t\t"+templx+"\t\t\t"+temply);

                    System.out.println("Staff\t\t\t"+tempstx+"\t\t\t"+tempsty);
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Total\t\t\t"+totalamt+"\t\t\t"+totaldamt);
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-- Exiting Federation Car Rental Payment Tracking System --\n ....\n  -- Goodbye! --\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection! A number between 1 and 6 was expected.");
                    break;
            }
        }while(ch!=7);
    }   
} 
