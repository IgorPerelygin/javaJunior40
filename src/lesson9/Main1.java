package lesson9;

public class Main1 {
    public static void main(String[] args) {

        Books book1 = new Books("Картошка", "Антошка Гармошкин", 1883, 555,
                "Чистый лист");
        Books book2 = new Books("Кузнечик", "Прожорливое Брюшко", 1559, 730,
                "Тёмный лес");
        Books book3 = new Books("Два весёлых гуся", "Растроенная Бабуся", 1321, 227,
                "Лужа у канавки");
        Books book4 = new Books("Красная шапочка", "Серый Волк", 1922, 12,
                "Съеденная бабушка");
        Books book5 = new Books("Чебурашка", "Старушка Шапокляк", 1883, 555,
                "Зелёный Крокодил");

        Magazines magazine1 = new Magazines("Золотое Яйцо", 1777, 2,
                "Курочка Ряба");
        Magazines magazine2 = new Magazines("Семеро козлят", 1111, 1,
                "Голодный Волк");
        Magazines magazine3 = new Magazines("Золотая Рыбка", 3322, 8,
                "Бабка у корыта");


        System.out.println("Первая книга: " + book1.getNameBook() + "\n" +"Писатель: " + book1.getNameAuthorBook());
        System.out.println("Дата печати - " + book1.getYearOfPublicationBook() + ", страниц: " + book1.getNumberOfPagesBook()
                + ", Издательство: " + book1.getNamePublishingBook() + "\n");
        System.out.println("Вторая книга: " + book2.getNameBook() + "\n" +"Писатель: " + book2.getNameAuthorBook());
        System.out.println("Дата печати - " + book2.getYearOfPublicationBook() + ", страниц: " + book2.getNumberOfPagesBook()
                + ", Издательство: " + book2.getNamePublishingBook() + "\n");
        System.out.println("Третья книга: " + book3.getNameBook() + "\n" +"Писатель: " + book3.getNameAuthorBook());
        System.out.println("Дата печати - " + book3.getYearOfPublicationBook() + ", страниц: " + book3.getNumberOfPagesBook()
                + ", Издательство: " + book3.getNamePublishingBook() + "\n");
        System.out.println("Четвёртая книга: " + book4.getNameBook() + "\n" +"Писатель: " + book4.getNameAuthorBook());
        System.out.println("Дата печати - " + book4.getYearOfPublicationBook() + ", страниц: " + book4.getNumberOfPagesBook()
                + ", Издательство: " + book4.getNamePublishingBook() + "\n");
        System.out.println("Пятая книга: " + book5.getNameBook() + "\n" +"Писатель: " + book5.getNameAuthorBook());
        System.out.println("Дата печати - " + book5.getYearOfPublicationBook() + ", страниц: " + book5.getNumberOfPagesBook()
                + ", Издательство: " + book5.getNamePublishingBook() + "\n");


    }
}