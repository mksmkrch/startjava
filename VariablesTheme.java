public class VariablesTheme {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    static void task1() {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte version = 64;
        System.out.println(version + " - Разрядность процессора");
        short ram = 8192;
        System.out.println(ram+ " - Количество оперативной памяти в МБ");
        int memoryInKB = 209715200;
        System.out.println(memoryInKB + " - Объём жесткого диска в КБ");
        long memoryInByte = 214748364800l;
        System.out.println(memoryInByte + " - Объём жесткого диска в байтах");
        double frequencyCPU = 3.7d;
        System.out.println(frequencyCPU + " - Частота процессора в ГГц");
        float frequencyRAM = 1.866f;
        System.out.println(frequencyRAM + " - Частота оперативной памяти в ГГц");
        boolean j = true;
        System.out.println(j + " - Правда?");
        char h = 'A';
        System.out.println(h + " - Первая буква алфавита");
    }

    static void task2() {
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        short pen = 100;
        sohr book = 200;
        float discount = 0.11f;
        System.out.println("Общая стоимость товаров без скидки: " + (pen+book) + " рублей");
        System.out.println("Сумма скидки: " + (int) ((pen+book)*discount) + " рубля");
        System.out.print("Общая стоимость товаров со скидкой: ");
        System.out.println((int) ((pen+book)-(pen+book)*discount) + " рублей");
    }

    static void task3() {
        System.out.println ("\n3. Вывод слова JAVA");
        System.out.println ("   J    a  v     v  a        ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a");
    }

    static void task4() {
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        System.out.println ("byte, первоначальное значение: " + a);
        System.out.println ("byte, значение после инкремента: " + ++a);
        System.out.println ("byte, значение после декремента: " + --a);
        System.out.println ("short, первоначальное значение: " + b);
        System.out.println ("short, значение после инкремента: " + ++b);
        System.out.println ("short, значение после декремента: " + --b);
        System.out.println ("int, первоначальное значение: " + c);
        System.out.println ("int, значение после инкремента: " + ++c);
        System.out.println ("int, значение после декремента: " + --c);
        System.out.println ("long, первоначальное значение: " + d);
        System.out.println ("long, значение после инкремента: " + ++d);
        System.out.println ("long, значение после декремента: " + --d);
    }

    static void task5() {
        System.out.println("\n5. Перестановка значений переменных");
        int c;
        int a = 2;
        int b = 5;
        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения переменных: a = " + a + "," + " b = " + b);
        c = a;
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
    }

    static void task6() {
        System.out.println("\n6. Вывод символов и их кодов");
        char a = '#';
        char b = '&';
        char c = '@';
        char d = '^';
        char e = '_';
        System.out.println ((int) a + "  " + a);
        System.out.println ((int) b + "  " + b);
        System.out.println ((int) c + "  " + c);
        System.out.println ((int) d + "  " + d);
        System.out.println ((int) e + "  " + e);
    }

    static void task7() {
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char a = '\\';
        char b = '/';
        char c = '_';
        char d = '(';
        char e = ')';
        System.out.println("    " + b + a + "       ");
        System.out.println("   " + b + "  " + a + "         ");
        System.out.println("  "+ b + c + d + " " + e + a + "     ");
        System.out.println(" " + b + "      " + a +"   ");
        System.out.println("" + b + c + c + c + c + b + a + c + c + a + " ");
    }

    static void task8() {
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int numb = 123;
        System.out.println("Число 123 содержит: ");
        System.out.println(numb/100 + " сотен\n" + numb/10%10 + " десятков\n" + numb%10 + " единиц");
        System.out.println("Сумма его цифр = " + (numb/100 + numb/10%10 + numb%10));
        System.out.println("Произведение = " + (numb/100*numb/10%10*numb%10));
    }

    static void task9() {
        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        System.out.println(seconds/3600 + ":" + seconds%3600/60 + ":" + seconds%60);
    }
}

