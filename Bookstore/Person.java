
public class Person {

private String name = null;
private boolean isPaid = false;
private boolean isPremium = false;
private int spent = 0;
private String paymentMethod = null;


Person(String n, boolean paid, boolean prem, int s, String p)
{
    // for premium
    this.name = n;
    this.isPaid = paid;
    this.isPremium = prem;
    this.spent = s;
    this.paymentMethod = p;
}

Person(String n, int s)
{
    // for normal
    this.name = n;
    this.spent = s;
    this.isPremium =false; // try making a function to spit out info on each person

}








public void setSpent(int s){
    this.spent = s;
}

public String getName(){
    return this.name;
}

public int getSpent(){
    return this.spent;
}




//premium member stuff
public String getPaymentMethod() {

    return paymentMethod;
    
    }


    public void setPaymentMethod(String p) {

        this.paymentMethod = p;
        
        }

        public void setPrem(boolean prem){
            this.isPremium=prem;
        }


        public boolean getPrem(){
            return this.isPremium;
        }


        public void setPaid(boolean pa){
            this.isPaid = pa;
            }

            public boolean getPaid(){
                return this.isPaid;
            }


            //extra

        
}


