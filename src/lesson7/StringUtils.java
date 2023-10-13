package lesson7;

public class StringUtils {

    // метод который принимает входящим параметр email, делает проверку на валидацию
    // пишет на консоль коректный это email или нет
    public static void checkValidMail(String email) {
        /** 1) Проверяем содержание собачки. Если её нет - не валидный.
         * 2) Проверяем что собачка только одна. Если нет - не валидный.
         * 3) Собачка должна стоять не в начале и не в конце. Нет? - не валидный.
         * 4) Точка должна быть хотя бы одна, после собачки.
         * 5) Точка не должна быть сразу после собачки.
         * 6) Не используются ли запрещёный символы. (#$%&'*+/=?^`{|}()[]~)
         * 7) Мало или много символов до собаки (мин 4 макс 64)
         * 8) Не должно начинаться и заканчиваться точкой
         * 9) Не должны быть цифры после последней точки
         * 10) Не должно быть пробелов
         * 11)
         * 12)
         * // Добавить разные проверки на Email.
         */

        if (!email.contains("@")) {  // 1
            System.out.println("Не содержит собачку!!!");
            return;
        }
        // ["Kd","jtu",kjh] - разделяет по собачкам. можно понять сколько собак.
        String[] partsOfEmail = email.split("@"); // 2
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!!!");
            return;
        }

        if (email.startsWith("@") || email.endsWith("@")) {  // 3
            System.out.println("Email не может начинаться или заканчиваться собачкой!!!");
            return;
        }

        String lastPart = partsOfEmail[1]; // 4
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку после собачки!!!");
            return;
        }

        String lastPartForDot = partsOfEmail[1]; // 5
        if (lastPartForDot.startsWith(".")) {
            System.out.println("Email содержит точку сразу после собачки!!!");
            return;
        }

        if (email.contains("#") || email.contains("$") || email.contains("%") || email.contains("&")
                || email.contains("`") || email.contains("~") || email.contains("'") || email.contains("*")
                || email.contains("+") || email.contains("=") || email.contains("/") || email.contains("?")
                || email.contains("^") || email.contains("|") || email.contains("(") || email.contains(")")
                || email.contains("[") || email.contains("]") || email.contains("{") || email.contains("}")) {  // 6
            System.out.println("Содержит запрещеный символ!!!");
            return;
        }

        String numberCharactersFirstPart = partsOfEmail[0]; // 7
        int countNumberFirstPart = numberCharactersFirstPart.length();
        if (countNumberFirstPart < 4 || countNumberFirstPart > 20) { //
            System.out.println("Почта содержит не коректное количество символов!!!");
            return;
        }


        if (email.startsWith(".") || email.endsWith(".")) { // 8
            System.out.println("Email не может начинаться или заканчиваться точкой!!!");
            return;
        }

        String[] partsOfEmailDot = email.split("[.]"); // 9
        String lastPartDot = partsOfEmailDot[partsOfEmailDot.length - 1];
        if (lastPartDot.contains("0") || lastPartDot.contains("1") || lastPartDot.contains("2")
                || lastPartDot.contains("3") || lastPartDot.contains("4") || lastPartDot.contains("5")
                || lastPartDot.contains("6") || lastPartDot.contains("7") || lastPartDot.contains("8")
                || lastPartDot.contains("9")) {
            System.out.println("Содержит цифры после последней точки!!!");
            return;
        }

        if (email.contains(" ")) {  // 10
            System.out.println("Почта содержит пробелы!!!");
            return;
        }

        System.out.println("Email подходит!!!");

    }
}
