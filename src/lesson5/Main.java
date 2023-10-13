package lesson5;

public class Main {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputfigure(); // рекурсивный вызов


        if (figura.equals("1") || figura.equalsIgnoreCase("Круг")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int radius = ScannerUtil.getParametr("Введите радиус:");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + 2 * 3.14 * radius);
            } else {
                System.out.println("Периметр круга: " + 3.14 * (radius * radius));
            }
        }

        if (figura.equals("2") || figura.equalsIgnoreCase("Овал")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int radiusMin = ScannerUtil.getParametr("Введите малый радиус:");
            int radiusMax = ScannerUtil.getParametr("Введите большой радиус:");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала: " + radiusMin * radiusMax * Math.PI);
            } else {
                System.out.println("Периметр овала: " + 4 * (Math.PI * radiusMin * radiusMax + (radiusMin - radiusMax)) / radiusMin + radiusMax);
            }
        }

        if (figura.equals("3") || figura.equalsIgnoreCase("Прямоугольник")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int sideA = ScannerUtil.getParametr("Введите сторону A:");
            int sideB = ScannerUtil.getParametr("Введите сторону B:");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь прямоугольника: " + sideA * sideB);
            } else {
                System.out.println("Периметр прямоугольника: " + 2 * (sideA * sideB));
            }
        }

        if (figura.equals("4") || figura.equalsIgnoreCase("Треугольник")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int sideA = ScannerUtil.getParametr("Введите сторону A:");
            int sideB = ScannerUtil.getParametr("Введите сторону B:");
            int sideC = ScannerUtil.getParametr("Введите сторону C:");
            if (action.equalsIgnoreCase("площадь")) {
                double p1 = (sideA + sideB + sideC) / 2.0;
                System.out.println("Площадь треугольника: " + Math.sqrt(p1 * (p1 - sideA) * (p1 - sideB) * (p1 - sideC)));
            } else {
                System.out.println("Периметр треугольника: " + (sideA + sideB + sideC));
            }
        }

        if (figura.equals("5") || figura.equalsIgnoreCase("Квадрат")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int sideSquere = ScannerUtil.getParametr("Введите сторону квадрата:");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь квадрата: " + (sideSquere * sideSquere));
            } else {
                System.out.println("Периметр квадрата: " + (sideSquere * 4));
            }
        }

        if (figura.equals("6") || figura.equalsIgnoreCase("Трапеция")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int sideA = ScannerUtil.getParametr("Введите большее основание A:");
            int sideB = ScannerUtil.getParametr("Введите мешьшее основание B:");
            int sideC = ScannerUtil.getParametr("Введите сторону C:");
            int sideD = ScannerUtil.getParametr("Введите сторону D:");
            int semiPerimetrTrapeze = (sideA + sideB + sideC + sideD) / 2;
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь трапеции: " + (((sideA + sideB) / (sideA - sideB)) * Math.sqrt((semiPerimetrTrapeze - sideA) *
                        (semiPerimetrTrapeze - sideB) * (semiPerimetrTrapeze - sideA - sideC) * (semiPerimetrTrapeze - sideA - sideD))));
            } else {
                System.out.println("Периметр трапеции: " + (sideA + sideB + sideC + sideD));
            }
        }
    }
}
