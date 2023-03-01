import java.util.*;

public class Book {

    private String title =null;
    private int cost = 0;;
    private int pages = 0;
    private int quantity = 0;

    ArrayList<Book> Books = new ArrayList<Book>();


    Book(String t, int c, int p, int num){
        this.title = t;
        this.cost=c;
        this.pages=p;
        this.quantity = num;
    }


  



    public String getTitle(){
        return title;
      }

      public int getCost(){
        return cost;
      }

      public int getPages(){
        return pages;
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
           return "Title: " + title + " Number of pages: " + pages + " Price: $" + cost +" Stock Left on Sheleves: " + quantity + "\n";


       }

       
       public String toStringPurchase(){
        return "Title: " + title  + " Price: $" + cost + "\n";
  
      }










}