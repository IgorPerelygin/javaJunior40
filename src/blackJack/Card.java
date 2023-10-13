package blackJack;

public class Card {
    private String nominal;
    private int ball;

    // конструкторы - особый метод, который вызывается после слова new в момент создания объекта
    public Card(String nominal, int ball){
        this.nominal = nominal;
        this.ball = ball;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}
