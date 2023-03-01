import java.util.*;


public class BookStoreDriver {

public static void main(String[] args) {

ArrayList<Person> members = new ArrayList<Person>();
ArrayList<Book> Books = new ArrayList<Book>();
ArrayList<CD> CDs = new ArrayList<CD>();
ArrayList<DVD> DVDs = new ArrayList<DVD>();
ArrayList<Object> Inventory = new ArrayList<Object>();
boolean repeat = true;
int total=0;
int random = (int)(Math.random() * 100) + 1;

    Scanner scnr = new Scanner(System.in);

System.out.println("Hello, what is your name?");
String name = scnr.nextLine();

System.out.println("Hello " + name + ", Type Y to be enrolled into our premium membership or N to be a normal member");
String membership = scnr.nextLine();

//creation of person object
if(membership.equalsIgnoreCase("Y")){
    System.out.println("Do you want to pay the fee now or later?");
    String answer = scnr.nextLine();
    if (answer.equalsIgnoreCase("now")){
        System.out.println("Cash or card?");
        
        String p = scnr.nextLine();
        members.add(new Person(name, true, true, 0, p));
    }
    else{
        members.add(new Person(name, false, true, 0, null));
    }
}
else{
    
    members.add(new Person(name, 0));
}

//Items
Books.add( new Book("Peak", 20, 23, random));
Books.add( new Book("Chestnut", 20, 23, random));
Books.add( new Book("Johnny", 20, 23, random));
CDs.add(new CD("Jay-Z", 15,  random));
CDs.add(new CD("Tupac", 52,  random));
CDs.add(new CD("Kendrick", 35,  random));
DVDs.add(new DVD("Hunger Games", 12,  random));
DVDs.add(new DVD("Iron-Man", 34,  random));
DVDs.add(new DVD("End Game", 12,  random));
//MAKE DVDS

//While loop to stay inside store menu
while (repeat){
System.out.println("Please select from the following menu of options, by typing a number:");
System.out.println(" 1. Make a Purchase ");
System.out.println(" 2. Cancel last Selection");
System.out.println(" 3. Checkout");
System.out.println(" 4. Exit");
System.out.println(" 5. Store Inventory");

int num = scnr.nextInt();

                        switch (num) {

                        case 1:
                            //store menu
                        System.out.println("Enter 1 to purchase a Book, 2 for a CD, or 3 for a DVD");
                                int purchase = scnr.nextInt();
                                switch (purchase){
                                    case 1: //Purchasing a Book
                                   System.out.println();
                                         //printing inventory
                                   System.out.println(Books.toString().replace("[", "").replace("]", "").replace(",", "\n"));                                   
                                    
                                    System.out.println("Enter the number of which you would like to purchase");
                                    int select1 = scnr.nextInt();
                                    switch (select1){
                                        
                                        case 1: //selecting book one

                                        Books.get(select1-1).subtractQuantity();
                                        Inventory.add(Books.get(select1-1));
                                        total = total+Books.get(select1-1).getCost();
                                        break;


                                        case 2: //selecting book two
                                        Books.get(select1-1).subtractQuantity();
                                        Inventory.add(Books.get(select1-1));
                                        total = total+Books.get(select1-1).getCost();
                                        break;

                                        case 3: //selecting book three
                                        Books.get(select1-1).subtractQuantity();
                                        Inventory.add(Books.get(select1-1));
                                        total = total+Books.get(select1-1).getCost();
                                        break;
                                    }

                                    

                                    break;

                                    case 2: //Purchasing a CD
                                    System.out.println();
                                          //printing inventory
                                    System.out.println(CDs.toString().replace("[", "").replace("]", "").replace(",", "\n"));                                   

                                     System.out.println("Enter the number of which you would like to purchase");
                                     int select2 = scnr.nextInt();
                                     switch (select2){
                                         case 1: //purchasing cd 1
                                         CDs.get(select2-1).subtractQuantity();
                                         Inventory.add(CDs.get(select2-1));
                                        
                                         total = total+CDs.get(select2-1).getCost();
                                         break;

                                         case 2: //purchasing cd 2
                                         CDs.get(select2-1).subtractQuantity();

                                         Inventory.add(CDs.get(select2-1));
                                         total = total+CDs.get(select2-1).getCost();
                                         break;

 
                                         case 3: //purchasing cd 3
                                         CDs.get(select2-1).subtractQuantity();

                                         Inventory.add(CDs.get(select2-1));
                                         total = total+CDs.get(select2-1).getCost();
                                         break;

                                     }
                                    
                                     
  
                                     break;

                                    case 3: //Purchasing a DVD
                                    System.out.println();

                                    //printing inventory
                                    System.out.println(DVDs.toString().replace("[", "").replace("]", "").replace(",", "\n")); 

                                                                 
                                     System.out.println("Enter the number of which you would like to purchase");
                                     int select3 = scnr.nextInt();
                                     switch (select3){
                                         case 1: //purchasing DVD one
                                         DVDs.get(select3-1).subtractQuantity();

                                         Inventory.add(DVDs.get(select3-1));
                                         total = total+DVDs.get(select3-1).getCost();
                                         break;

                                         case 2: //purchasing dvd two
                                         DVDs.get(select3-1).subtractQuantity();

                                         Inventory.add(DVDs.get(select3-1));
                                         total = total+DVDs.get(select3-1).getCost();
                                        break;
 
                                         case 3: //purchasing dvd three 
                                         DVDs.get(select3-1).subtractQuantity();
                                         Inventory.add(DVDs.get(select3-1));
                                         total = total+DVDs.get(select3-1).getCost();
                                         break;

                                     }                                    
                                      
                                    
 
                                     break;

                                }                 

                                break;
                        case 2: // Delete last add to cart
                        

                        if (Inventory.size()>=1){
                            
                            Inventory.remove(Inventory.size() - 1);
                            System.out.println("\nYour last selection was deleted\n");

                        }
                        else{
                            System.out.println("\nThere's nothing in your cart\n");
                        }

                            break;

                        
                        case 3: // Print out cart/total spent/checkout
                        System.out.println(Inventory.size() + " ITEMS IN CART"); 
                        System.out.println(Inventory.toString().replace("[", "").replace("]", "").replace(",", "\n"));
                        System.out.println("TOTAL SPENT:");
                        System.out.println(total);

                        case 4: //exit store
                        repeat = false;
                            break;
                                                      

                        
                        case 5: //print out entire inventory
                        System.out.println(Books.toString().replace("[", "").replace("]", "").replace(",", "\n"));                                   
                        System.out.println(CDs.toString().replace("[", "").replace("]", "").replace(",", "\n"));                                   
                        System.out.println(DVDs.toString().replace("[", "").replace("]", "").replace(",", "\n"));    
                        

                        default:
                        System.out.println("Sorry, but you need to enter a 1, 2, 3, 4 or 5.");





} 

}//end of while



}
}