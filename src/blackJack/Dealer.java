package blackJack;

public class Dealer extends Player{

    // переопределение метода
    @Override // анотация
    public boolean needMoreCards() {
        if(countBallInHand() < 18){
            return true;
        }
        return false;
    }
}
