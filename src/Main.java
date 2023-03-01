public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month = month + 1;
            total = total + salary;
            System.out.println("Месяц " + month +" сумма накоплений равна " + total + " Рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int start = 0;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println(" ");
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void task3(){
        System.out.println("Задача 3");
        int stageY = 12_000_000;
        int newLive = 17;
        int oldDeath = 8;
        for (int i = 0; i <10 ; i++) {
            stageY= stageY+stageY/1000 *newLive -stageY/1000*oldDeath;
            System.out.println("Год " + i + " численность населения составляет " + stageY);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int investment = 15000;
        int total = 0;
        for (int i = 0; total < 12_000_000; i++) {
            total = total + total / 7;
            total = total + investment;
            if (i % 7 == 0)
                System.out.println("Месяц " + i + " Итого " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int investment = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 100;
            total = total + investment;
            if (i % 7 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int investment = 15_000;
        int monthlyInterest = 7;
        int totalTime = 9 * 12;
        int month = 1;
        while (month <= totalTime) {
            int percents = investment / 100 * monthlyInterest;
            investment = investment + percents;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накоплено " + investment + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        int day = 1;
        int month = 31;
        while (day <= month) {
            day++;
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, "+ day +" число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int start = 0;
        int startComet = 1850;
        int finishComet = 2100;
        while (startComet <= finishComet) {
            startComet++;
            if ((startComet - start) % 79 == 0) {
                System.out.println("Сегодня год, " + startComet + " комета летит");
            }
        }
    }
}


