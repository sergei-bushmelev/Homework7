public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        int deposit = 15_000;
        int Total = 0;
        int i = 0;
        while (Total < 2_459_000){
            i++;
            Total = Total + Total/100;
            Total = Total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total + " рублей");
        }
        System.out.println();

        //Задача 2
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a--){
            System.out.print(a + " ");
        }
        System.out.println();

        //Задача 3
        int population = 12_000_000;
        int birthRate = (population / 1000) * 17;
        int mortality = (population / 1000) * 8;
        for (i = 0; i < 11; i++){
            population = population + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();

        //Задача 4
        int depositVasia = 15_000;
        int month = 0;
        while (depositVasia < 12_000_000){
            depositVasia = depositVasia + ((depositVasia/100) * 7);
            month++;
            System.out.println("Месяц " + month + ". Накоплено " + depositVasia);
        }
        System.out.println();

        //Задача 5
        int newDepositVasia = 15_000;
        int newMonth = 0;
        while (newDepositVasia < 12_000_000) {
            newDepositVasia = newDepositVasia + ((newDepositVasia / 100) * 7);
            newMonth++;
            if (newMonth%6 == 0) {
                System.out.println("Месяц " + newMonth + ". Накоплено " + newDepositVasia);
            }
        }
        System.out.println();

        //Задача 6
        int money = 15_000;
        int percent = 7;
        int period = 9 * 12;
        for (i = 0; i < period; i++){
            money = money + ((money / 100) * percent);
            if (i % 6 == 0){
            System.out.println("Месяц " + i + ". Накоплено " + money);
            }
        }
        System.out.println();

        //Задача 7
        int friday = 5;
        for (; friday < 32; friday++){
            if ((friday -5) % 7 == 0){
                System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчёт.");
            }
        }
        System.out.println();

        //Задача 7
        int year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (i = 0; i < yearAfter; i++){
            if (i % 79 == 0 && i > yearBefore && i < yearAfter)
                System.out.println(i);
        }

    }
}