class customer{
    int cid;
    String cname;
    double cdisc;
    double disc;
    double cbill;
    double camount;
    customer(int id, String name, double amount, double discount){
        cid = id;
        cname = name;
        camount = amount;
        disc = discount; 
    }
    void calcDisc()
    {
        System.out.println("Calculating discount... \n");

        cdisc = (disc)*camount;

        System.out.println("discount: "+cdisc+" \n");

    }
    void finalBill()
    {
        System.out.println("Calculating final amount... \n");

        cbill = camount - cdisc;

        System.out.println("Final amount: "+cbill+" \n");

    }
    void dispDetails()
    {
        System.out.println("ID: "+cid+"\n"+"Name: "+cname+"\n");
    }
    public static void main(String[] args){
        customer mrrmtyaid = new customer(18531, "Murtuza", 4500, 0.2); // creating new object who is murtuza.
        mrrmtyaid.dispDetails();
        mrrmtyaid.calcDisc();
        mrrmtyaid.finalBill();        
    }
}