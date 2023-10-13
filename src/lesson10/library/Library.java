package lesson10.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<PrintEdition> editions = new ArrayList<>();

    public void fillEditions(){
        Book book1 = new Book("Азбука", 1930, "АБВ", "Иванов", 690);
        Book book2 = new Book("Тарас Бульба", 1950, "Толстой", "Толстой", 300);
        Book book3 = new Book("Война и мир", 1970, "АБВ", "АБВ", 999);
        Jurnal jurnal1 = new Jurnal("Бурда", 2010, "qwerty", 11);
        Jurnal jurnal2 = new Jurnal("Бурда", 2010, "qwerty", 8);
        editions.add(book1);
        editions.add(jurnal1);
        editions.add(book2);
        editions.add(book3);
        editions.add(jurnal2);
    }

    public void printAllEditions(){
        for(PrintEdition edition: editions){
            System.out.println(edition); /// !!!!! проявление полиморфизма
        }
    }

    public void printLargestBook(){
        PrintEdition largest = new Book("Заглушка", 1990, "dfd", "df", -1); // заглушка
        for(PrintEdition edition: editions){
            if(edition instanceof Book){ // проверка, является ли объект определённого класса или интерфейса
                if(((Book) edition).getPages() > ((Book) largest).getPages()){ // нисходящие преобразование
                    largest = edition;
                }
            }
        }
        System.out.println(" ----- САМАЯ ТОЛСТАЯ КНИГА: ------- ");
        System.out.println(largest);
    }

}
