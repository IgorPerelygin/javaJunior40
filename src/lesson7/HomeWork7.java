package lesson7;

public class HomeWork7 {
    // Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static int sumVowelsLetters(String word) {
        int count = 0;
        char[] vowels = word.toCharArray();
        for (char i = 0; i < vowels.length; i++) {
            if (vowels[i] == 'а' | vowels[i] == 'у' | vowels[i] == 'о' | vowels[i] == 'ы' | vowels[i] == 'и' |
                    vowels[i] == 'э' | vowels[i] == 'я' | vowels[i] == 'ю' | vowels[i] == 'ё' | vowels[i] == 'е' |
                    vowels[i] == 'А' | vowels[i] == 'У' | vowels[i] == 'О' | vowels[i] == 'Ы' | vowels[i] == 'И' |
                    vowels[i] == 'Э' | vowels[i] == 'Я' | vowels[i] == 'Ю' | vowels[i] == 'Ё' | vowels[i] == 'Е') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    //Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке

    public static String reverseText(String word) {
        int j = word.length();
        char[] newWord = new char[j];
        for (int i = 0; i < word.length(); i++) {
            newWord[--j] = word.charAt(i);
        }
        System.out.println(newWord);
        return new String(newWord);

    }

    public static String reverseTextOneString(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        System.out.println(reverseWord);
        return reverseWord;
    }

    // Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
    public static int sumPunctuationSigns(String word) {
        int countSigns = 0;
        char[] punctuation = word.toCharArray();
        for (char i = 0; i < punctuation.length; i++) {
            if (punctuation[i] == '.' | punctuation[i] == ',' | punctuation[i] == ';' | punctuation[i] == ':' |
                    punctuation[i] == '?' | punctuation[i] == '!' | punctuation[i] == '-' | punctuation[i] == '(' |
                    punctuation[i] == ')' | punctuation[i] == '"') {
                countSigns++;
            }
        }
        System.out.println(countSigns);
        return countSigns;
    }

    //В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам
    public static void arraySquare(int a, int b) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }
}
