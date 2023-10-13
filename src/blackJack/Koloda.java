package blackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {

    private ArrayList<Card> koloda = new ArrayList<>();
    // массив заменяем на коллекцию
    // моллекция - Безразмерный массив (всего бывает более 15 видов) ArrayList


    public void prepared() {
        koloda.add(new Card("Двойка трефа", 2));
        koloda.add(new Card("Двойка бубна", 2));
        koloda.add(new Card("Двойка черви", 2));
        koloda.add(new Card("Двойка пика", 2));

        koloda.add(new Card("Тройка трефа", 3));
        koloda.add(new Card("Тройка бубна", 3));
        koloda.add(new Card("Тройка черви", 3));
        koloda.add(new Card("Тройка пика", 3));

        koloda.add(new Card("Четверка трефа", 4));
        koloda.add(new Card("Четверка бубна", 4));
        koloda.add(new Card("Четверка черви", 4));
        koloda.add(new Card("Четверка пика", 4));

        koloda.add(new Card("Пятерка трефа", 5));
        koloda.add(new Card("Пятерка бубна", 5));
        koloda.add(new Card("Пятерка черви", 5));
        koloda.add(new Card("Пятерка пика", 5));

        koloda.add(new Card("Шестерка трефа", 6));
        koloda.add(new Card("Шестерка бубна", 6));
        koloda.add(new Card("Шестерка черви", 6));
        koloda.add(new Card("Шестерка пика", 6));

        koloda.add(new Card("Семерка трефа", 7));
        koloda.add(new Card("Семерка бубна", 7));
        koloda.add(new Card("Семерка черви", 7));
        koloda.add(new Card("Семерка пика", 7));

        koloda.add(new Card("Восьмерка трефа", 8));
        koloda.add(new Card("Восьмерка бубна", 8));
        koloda.add(new Card("Восьмерка черви", 8));
        koloda.add(new Card("Восьмерка пика", 8));

        koloda.add(new Card("Девятка трефа", 9));
        koloda.add(new Card("Девятка бубна", 9));
        koloda.add(new Card("Девятка черви", 9));
        koloda.add(new Card("Девятка пика", 9));

        koloda.add(new Card("Десятка трефа", 10));
        koloda.add(new Card("Десятка бубна", 10));
        koloda.add(new Card("Десятка черви", 10));
        koloda.add(new Card("Десятка пика", 10));

        koloda.add(new Card("Валет трефа", 10));
        koloda.add(new Card("Валет бубна", 10));
        koloda.add(new Card("Валет черви", 10));
        koloda.add(new Card("Валет пика", 10));

        koloda.add(new Card("Дама трефа", 10));
        koloda.add(new Card("Дама бубна", 10));
        koloda.add(new Card("Дама черви", 10));
        koloda.add(new Card("Дама пика", 10));

        koloda.add(new Card("Король трефа", 10));
        koloda.add(new Card("Король бубна", 10));
        koloda.add(new Card("Король черви", 10));
        koloda.add(new Card("Король пика", 10));

        koloda.add(new Card("Туз трефа", 11));
        koloda.add(new Card("Туз бубна", 11));
        koloda.add(new Card("Туз черви", 11));
        koloda.add(new Card("Туз пика", 11));
    }

    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return koloda.get(randomNum);
    }
}
