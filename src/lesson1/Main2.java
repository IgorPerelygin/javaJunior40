package lesson1;

public class Main2 {


    public static void main(String[] args) {
        int widthRoom = 4;
        int longRoom = 8;
        int widthTable = 2;
        int longTable = 3;
        int perimeterRoom = widthRoom * longRoom;
        int perimeterTable = widthTable * longTable;
        int amountTableInRoom = perimeterRoom / perimeterTable;
// 5 столов, а остаток нам не интересен.
        System.out.println(amountTableInRoom);

    }
}
