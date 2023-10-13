package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;

    private ArrayList<Card> cardsInHand = new ArrayList<>();

    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card){
        cardsInHand.add(card);
    }

    public boolean needMoreCards(){
        System.out.println(" ---- Ваши карты, " + name);
        this.openHand();
        System.out.println(" ---- Будете брать ещё карту? ----- ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equalsIgnoreCase("да")){
            return true;
        }
        return false;
    }

    public void openHand(){
        for (Card c: cardsInHand){
            System.out.println(c.getNominal());
        }
    }

    public int countBallInHand(){
        int count = 0;
        for (Card c: cardsInHand){
            count = count + c.getBall();
        }
        return count;
    }


}

