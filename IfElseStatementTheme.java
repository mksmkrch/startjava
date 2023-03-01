public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        short age = 26;
        if (age > 20) {
            System.out.println("Этому человеку " + age + " лет");
        } else {
            System.out.println("Этому человеку меньше 21 года");
        };
        boolean male = true;
        if (!male) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        };
        float height = 1.76f;
        if (height < 1.80f) {
            System.out.println("Его рост меньше 180 см");
        } else {
            System.out.println("Его рост больше 180 см");
        };
        char firstLetterName = "Максим".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Первая буква в его имени - " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква в его имени - " + firstLetterName);
        } else {
            System.out.println("Совпадений не найдено");
        };

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 2;
        int num2 = 5;
        if (num1 == num2) {
            System.out.println("Обе переменные равны " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + "<" + num2);
        } else {
            System.out.println(num1 + ">" + num2);
        };

        System.out.println("\n3. Проверка числа");
        int number = 23;
        System.out.println("Исходное число - " + number);
        if (number != 0) {
            if (number % 2 == 1) {
                System.out.println("Это нечетное число");
            } else {
                System.out.println("Это четное число");
            };
            if (number > 0) {
                System.out.println("Это положительное число");
            } else {
                System.out.println("Это отрицательное число");
            };
        } else {
            System.out.println("Число равно нулю");
        };

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
            };
            if (tensNum1 == tensNum2) {
                System.out.println("цифры " + tensNum1 + " одинаковые во 2 разряде");
            };
            if (onesNum1 == onesNum2) {
                System.out.println("цифры " + onesNum1 + " одинаковые в 1 разряде");
            };
        };

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println(symbol);
        if (symbol >= '\u0030' && symbol <= '\u0039') {
            System.out.println("Это число");
        } else if (symbol >= '\u0041' && symbol <= '\u005a') {
            System.out.println("Это большая буква");
        } else if (symbol >= '\u0061' && symbol <= '\u007a') {
            System.out.println("Это маленькая буква");
        } else {
            System.out.println("Это не буква и не число");
        };

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        float percent;
        if (depositAmount < 100000) {
            percent = 0.05f;
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            percent = 0.07f;
        } else {
            percent = 0.1f;
        };
        System.out.println("Сумма вклада - " + depositAmount + " руб.");
        int accuredInterest = (int) (depositAmount * percent);
        System.out.println("Начисленный % - " + accuredInterest + " руб.");
        System.out.println("Итоговая сумма с % - " + (depositAmount + accuredInterest) + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        float percentageScoreHistory = 0.59f;
        float percentageScoreProgramming = 0.91f;
        float averagePercentage = (percentageScoreProgramming + percentageScoreHistory) / 2 * 100;
        int markHistory;
        int markProgramming;
        if (percentageScoreHistory <= 0.6f) {
            markHistory = 2;
        } else if (percentageScoreHistory > 0.6f && percentageScoreHistory <= 0.73f) {
            markHistory = 3;
        } else if (percentageScoreHistory > 0.73f && percentageScoreHistory <= 0.91f) {
            markHistory = 4;
        } else {
            markHistory = 5;
        };
        System.out.println(markHistory + " - История");
        if (percentageScoreProgramming <= 0.6f) {
            markProgramming = 2;
        } else if (percentageScoreProgramming > 0.6f && percentageScoreProgramming <= 0.73f) {
            markProgramming = 3;
        } else if (percentageScoreProgramming > 0.73f && percentageScoreProgramming <= 0.91f) {
            markProgramming = 4;
        } else {
            markProgramming = 5;
        };
        System.out.println(markProgramming + " - Программирование");
        System.out.println("Средний балл - " + (markProgramming + markHistory) / 2);
        System.out.println("Средний % по предметам - " + (int) averagePercentage + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rentalPrice = 5000;
        int monthProfit = 13000;
        int costPrice = 9000;
        int yearProfit = (monthProfit - rentalPrice - costPrice) * 12;
        if (yearProfit >= 0) {
            System.out.println("прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("прибыль за год: " + yearProfit + " руб.");
        };

        System.out.println("\n9. Подсчет количества банкнот");
        int needMoney = 567;
        int notesDenomination100 = 10;
        int notesDenomination10 = 5;
        int notesDenomination1 = 50;
        int needHundreds = needMoney / 100;
        int needTens = needMoney / 10 % 10;
        int needOnes = needMoney % 10;
        if (notesDenomination100 < needHundreds) {
            needTens += (needHundreds - notesDenomination100) * 10;
            needHundreds = notesDenomination100;
        };
        if (notesDenomination10 < needTens) {
            needOnes += (needTens - notesDenomination10) * 10;
            needTens = notesDenomination10;
        };
        if (notesDenomination1 < needOnes) {
            System.out.println("Не хватает банкнот для выдачи нужной суммы");
        } else {
            System.out.println("Банкнота номиналом 100USD: " + needHundreds + " шт.");
            System.out.println("Банкнота номиналом 10USD: " + needTens + " шт.");
            System.out.println("Банкнота номиналом 1USD: " + needOnes + " шт.");
            System.out.println("Выдаваемая сумма: " + needMoney + "USD");
        };
    }
}