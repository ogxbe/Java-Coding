public class Deck{

public Card drawCard(){

String suit = null;
int value = (int)(Math.random() * 13)+1;
int sut = (int)(Math.random() * 4)+1;

switch(sut){
case 1:
    suit = "Spades";
case 2:
    suit = "Clubs";
case 3:
    suit = "Hearts";
case 4:
    suit = "Diamonds";

}

    return new Card(value, suit);
}














}