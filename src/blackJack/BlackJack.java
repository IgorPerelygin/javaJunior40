package blackJack;

import java.util.ArrayList;

public class BlackJack {

    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda){
        for (Player p: players) { //Проходимся по всем игрокам, не важно есть ли крупье
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p: players) { //Проходимся по всем игрокам, не важно есть ли крупье
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    // Метод который будет раздовать все нужные карты всем игрокам, пока не скажут хватит
    public void dealAllNeedCards(Koloda koloda){
        for (Player p: players){ // прохожусь по всем игрокам
            while (p.needMoreCards()){ //!!! смотрит игрок или крупье и запускает нужный метод(динамически подстраивается какой это объект)
                //!!! какой тип она взяла и вызывает имменно тот метод needMoreCards, который нужен.
                //!!! ПРОЯВЛЕНИЕ ПОЛИМОРФИЗМА (свойства программы работать с разными типами
                p.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    public void printWinner(){
        /**
         *  24  26  28  25  - победил крупье
         *  19  22  30  32 - победил у кого недобор
         *  21  21  21  21 - победили 3 человека
         *  18  18  24  12 - победили 2 у кого ближе к 21
         *  12  12  13  14 - победило 14
         */

        for (Player p: players){ // проходимся по всем и устанавливаем false тем кто не может претендовать на победу
            if (p.countBallInHand() > 21 ){
                p.setCanWin(false);
            }
        }
        // если у всех перебор, выиграл крупье
        if (countPlayersWhoCanWinn() == 0){
            for(Player p: players){
                if(p instanceof Dealer){
                    System.out.println("Победил крупье!!! Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }

        // если в игре остался только один
        if (countPlayersWhoCanWinn() == 1){
            for(Player p: players){
                if(p.isCanWin()){
                    System.out.println("Выиграл " + p.getName() + "! Его карты: ");
                    p.getName();
                    return;
                }
            }

        }

        int ballWiner = -1; // 12 перезатир на 16 и потом на 19
        for (Player p: players){ // 26  12 16  19
            if (p.isCanWin() && p.countBallInHand() > ballWiner){
                ballWiner = p.countBallInHand();
            }
        }

        // узнали бал победителя и печатаем тех игроков у кого такой бал(их может быть несколько)
        for(Player p: players){
            if(p.countBallInHand() == ballWiner){
                System.out.println("Победитель " + p.getName() + "! Его карты: ");
                p.openHand();
            }
        }

    }

    private int countPlayersWhoCanWinn(){
        int count = 0;
        for (Player p:players){
            if (p.isCanWin()){
                count++;
            }
        }
        return count;
    }

}