
public class CD {

    private String title =null;
    private int cost = 0;;
    private int quantity = 0;

    

    CD(String t, int c, int num){
        this.title = t;
        this.cost=c;
        this.quantity = num;
    }



    public String getTitle(){
        return title;
      }

      public int getCost(){
        return cost;
      }

      public int getQuantity(){
        return quantity;
      }

      public void addQuantity(){
        quantity = quantity + 1;

}

public void subtractQuantity()
    {
        quantity = quantity - 1;   
    }

    public String toString(){
        return "Title: " + title  + " Price: $" + cost +" Stock Left: " + quantity + "\n";


    }

    public String toStringPurchase(){
      return "Title: " + title  + " Price: $" + cost + "\n";

    }



}