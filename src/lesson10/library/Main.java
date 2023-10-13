package lesson10.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.fillEditions();
        library.printAllEditions();
        library.printLargestBook();
    }
}
