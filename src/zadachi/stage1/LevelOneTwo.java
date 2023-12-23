package zadachi.stage1;

public class LevelOneTwo {
    public static void main(String[] args) {
        int firstNums = 784546762;
        int x = Integer.parseInt(Integer.toString(firstNums).substring(0, 1));

        System.out.println("Первая цифра: " + x);

        int y = Math.abs(firstNums % 10);
        System.out.println("Последняя цифра: " + y);

        int summNum = x + y;
        System.out.println("Сумма первой и последней цифер: " + summNum);

        int summChar = (int)(Math.log10(firstNums)+1);
        System.out.println("Количество цифр в числе: " + summChar);

        int secondNums = 6465044;
        int oneNum = Integer.parseInt(Integer.toString(firstNums).substring(0,1));
        int twoNum = Integer.parseInt(Integer.toString(secondNums).substring(0,1));
        if (oneNum == twoNum){
            System.out.println("Первые числа совпадают!");
        }else {
            System.out.println("Первые числа не совпадают!");
        }
    }
}
