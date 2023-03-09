public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        short age = 26;
        if (age > 20) {
            System.out.println("Этому человеку " + age + " лет");
        } else {
            System.out.println("Этому человеку меньше 21 года");
        }
        boolean male = true;
        if (!male) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }
        float height = 1.76f;
        if (height < 1.80f) {
            System.out.println("Его рост меньше 180 см");
        } else {
            System.out.println("Его рост больше 180 см");
        }
        char firstLetterName = "Максим".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Первая буква в его имени - " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква в его имени - " + firstLetterName);
        } else {
            System.out.println("Совпадений не найдено");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 2;
        int num2 = 5;
        if (num1 == num2) {
            System.out.println("Обе переменные равны " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + "<" + num2);
        } else {
            System.out.println(num1 + ">" + num2);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 23;
        System.out.println("Исходное число - " + num3);
        if (num3 != 0) {
            if (num3 % 2 == 1) {
                System.out.println("Это нечетное число");
            } else {
                System.out.println("Это четное число");
            }
            if (num3 > 0) {
                System.out.println("Это положительное число");
            } else {
                System.out.println("Это отрицательное число");
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 659;
        num2 = 959;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = num1 / 10 % 10;
        int tensNum2 = num2 /10 % 10;
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("В этих числах нет одинаковых цифр в одном и том же разряде");
        } else {
            if (hundredsNum1 == hundredsNum2) {
                System.out.println("цифры " + hundredsNum1 + " одинаковые в 3 разряде");
            }
            if (tensNum1 == tensNum2) {
                System.out.println("цифры " + tensNum1 + " одинаковые во 2 разряде");
            }
            if (onesNum1 == onesNum2) {
                System.out.println("цифры " + onesNum1 + " одинаковые в 1 разряде");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println(symbol);
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Это число");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Это большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это маленькая буква");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        float percent = 0.1f;;
        if (depositAmount < 100000) {
            percent = 0.05f;
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            percent = 0.07f;
        }
        System.out.println("Сумма вклада - " + depositAmount + " руб.");
        int accuredInterest = (int) (depositAmount * percent);
        System.out.println("Начисленный % - " + accuredInterest + " руб.");
        System.out.println("Итоговая сумма с % - " + (depositAmount + accuredInterest) + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyMark = 5;
        if (historyPercent <= 60) {
            historyMark = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        }
        System.out.println(historyMark + " - История");
        int programmingPercent = 91;
        int programmingMark = 5;
        if (programmingPercent <= 60) {
            programmingMark = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        }
        System.out.println(programmingMark + " - Программирование");
        System.out.println("Средний балл - " + (programmingMark + historyMark) / 2);
        int averagePercentage = (programmingPercent + historyPercent) / 2;
        System.out.println("Средний % по предметам - " + averagePercentage + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rentalPrice = 5000;
        int monthProfit = 13000;
        int costPrice = 9000;
        int yearProfit = (monthProfit - rentalPrice - costPrice) * 12;
        if (yearProfit > 0) {
            System.out.println("прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int needMoney = 567;
        int atbHundreds = 10;
        int atbTens = 5;
        int atbOnes = 50;
        int needOnes = needMoney % 10;
        int needTens = needMoney / 10 % 10;
        int needHundreds = needMoney / 100;
        int maxAtbTens = atbTens + (atbOnes - needOnes) / 10;
        int maxAtbHundreds = atbHundreds + (maxAtbTens - needTens) / 10;
        if (needOnes > atbOnes || needTens > maxAtbTens || needHundreds > maxAtbHundreds) {
            System.out.println("В банкомате недостаточно средств");
        } else {
            if (atbHundreds < needHundreds) {
                needTens += (needHundreds - atbHundreds) * 10;
                needHundreds = atbHundreds;
            }
            if (atbTens < needTens) {
                needOnes += (needTens - atbTens) * 10;
                needTens = atbTens;
            }
            System.out.println("Банкнота номиналом 100USD: " + needHundreds + " шт.");
            System.out.println("Банкнота номиналом 10USD: " + needTens + " шт.");
            System.out.println("Банкнота номиналом 1USD: " + needOnes + " шт.");
            System.out.println("Выдаваемая сумма: " + needMoney + "USD");
        }
    }
}