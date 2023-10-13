package lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру!");
        int[][] field = new int[9][9];
        boolean[][] mask = new boolean[9][9]; // заполнена сначало false
        SaperUtils.fillMines(field);
        SaperUtils.insertNumsAroundMines(field);
        SaperUtils.printField(field, mask);
        System.out.println();
    }
}
