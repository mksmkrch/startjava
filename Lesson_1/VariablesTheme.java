public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte version = 64;
        System.out.println(version + " - Разрядность процессора");
        short ram = 8192;
        System.out.println(ram + " - Количество оперативной памяти в МБ");
        int memoryKb = 209715200;
        System.out.println(memoryKb + " - Объём жесткого диска в КБ");
        long memoryByte = 214748364800l;
        System.out.println(memoryByte + " - Объём жесткого диска в байтах");
        double frequencyCpu = 3.7d;
        System.out.println(frequencyCpu + " - Частота процессора в ГГц");
        float frequencyRam = 1.866f;
        System.out.println(frequencyRam + " - Частота оперативной памяти в ГГц");
        boolean active = true;
        System.out.println(active + " - Активный");
        char symbol = 'A';
        System.out.println(symbol + " - Первая буква алфавита");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        float discount = 0.11f;
        int generalPrice = penPrice + bookPrice;
        int discountAmount = (int) (generalPrice * discount);
        System.out.println("Общая стоимость товаров без скидки: " + generalPrice + " рублей");
        System.out.println("Сумма скидки: " + discountAmount + " рубля");
        System.out.print("Общая стоимость товаров со скидкой: ");
        System.out.println((generalPrice - discountAmount) + " рублей");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;
        System.out.println("byte, первоначальное значение: " + maxByte);
        System.out.println("byte, значение после инкремента: " + ++maxByte);
        System.out.println("byte, значение после декремента: " + --maxByte);
        System.out.println("short, первоначальное значение: " + maxShort);
        System.out.println("short, значение после инкремента: " + ++maxShort);
        System.out.println("short, значение после декремента: " + --maxShort);
        System.out.println("int, первоначальное значение: " + maxInt);
        System.out.println("int, значение после инкремента: " + ++maxInt);
        System.out.println("int, значение после декремента: " + --maxInt);
        System.out.println("long, первоначальное значение: " + maxLong);
        System.out.println("long, значение после инкремента: " + ++maxLong);
        System.out.println("long, значение после декремента: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения переменных: a = " + a + "," + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения переменных: a = " + a + "," + " b = " + b);
        System.out.println("C помощью арифметических операций");
        System.out.println("Исходные значения переменных: a = " + a + "," + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных: a = " + a + "," + " b = " + b);
        System.out.println("С помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: a = " + a + "," + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных: a = " + a + "," + " b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underScore = '_';
        System.out.println((int) hash + "  " + hash);
        System.out.println((int) ampersand + "  " + ampersand);
        System.out.println((int) at + "  " + at);
        System.out.println((int) caret + "  " + caret);
        System.out.println((int) underScore + "  " + underScore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\';
        char slash = '/';
        char openBkt = '(';
        char closeBkt = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  "+ slash + underScore + openBkt + " " + closeBkt + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.print("" + slash + underScore + underScore + underScore + underScore);
        System.out.println("" + slash + backSlash + underScore + underScore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        System.out.println("Число 123 содержит: ");
        System.out.println(hundreds + " сотен\n" + tens + " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        System.out.println(seconds / 3600 + ":" + seconds % 3600 / 60 + ":" + seconds % 60);
    }
}

