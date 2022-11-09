public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1");
        int mercury = 1;
        byte venus = 2;
        short earth = 3;
        long mars = 400_000_000_123L;
        float jupiter = 5.23456F;
        double saturn = 6.025;
        System.out.println("Значение переменной " + "mercury" + " с типом " + "int" + " равно " + mercury);
        System.out.println("Значение переменной " + "venus" + " с типом " + "byte" + " равно " + venus);
        System.out.println("Значение переменной " + "earth" + " с типом " + "short" + " равно " + earth);
        System.out.println("Значение переменной " + "mars" + " с типом " + "long" + " равно " + mars);
        System.out.println("Значение переменной " + "jupiter" + " с типом " + "float" + " равно " + jupiter);
        System.out.println("Значение переменной " + "saturn" + " с типом " + "double" + " равно " + saturn);

        //Задание №2
        System.out.println("Задание №2");
        System.out.println("Задание без вывода решения на консоль");
        double alpha = 27.12;
        long  beta = 987_678_965_549L;
        byte gamma = 2;
        short delta = 786;
        boolean dzeta = false;
        short omega = 569;
        short pi = -159;
        short ro = 27697;
        byte sigma = 67;

        //Задание №3
        System.out.println("Задание №3");
        byte studentLuidmmilaPavlovna = 23;
        byte studentAnnaSergeevna = 27;
        byte studentEkaterinaAndreevna = 30;
        short totalPapers = 480;
        int totalStudent = studentLuidmmilaPavlovna + studentAnnaSergeevna + studentEkaterinaAndreevna;
        int papersForStudent = totalPapers / totalStudent;
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");

        //Задание №4
        System.out.println("Задание №4");
        byte cpdTwoMinutes = 16;
        int cpdOneMinutes = cpdTwoMinutes / 2;// узаем сколько производится бутылок в минуту
        byte timeWork1 = 20;
        short timeWork2 = 24 * 60;// узнаем сколько минут в сутках
        int timeWork3 = timeWork2 * 3; // узнаем сколько минут в 3 сутках
        int timeWork4 = timeWork2 * 30; // узнаем сколько минут в месяце
        int cpdTimeWork1 = cpdOneMinutes * timeWork1;
        System.out.println("За " + timeWork1 + " минут, машина произвела бутылок - " + cpdTimeWork1 + " штук");
        int cpdTimeWork2 = cpdOneMinutes * timeWork2;
        System.out.println("За " + timeWork2 + " минут, машина произвела бутылок - " + cpdTimeWork2 + " штук");
        int cpdTimeWork3 = cpdOneMinutes * timeWork3;
        System.out.println("За " + timeWork3 + " минут, машина произвела бутылок - " + cpdTimeWork3 + " штук");
        int cpdTimeWork4 = cpdOneMinutes * timeWork4;
        System.out.println("За " + timeWork4 + " минут, машина произвела бутылок - " + cpdTimeWork4 + " штук");

        //Задание №5
        System.out.println("Задание №5");
        byte totalPaint = 120;
        byte oneClassPaintWhite = 4;
        byte oneClassPaintBrown = 2;
        int oneClassTotalPaint = oneClassPaintWhite + oneClassPaintBrown;
        int totalClass = totalPaint / oneClassTotalPaint;
        int totalPaintWhite = oneClassPaintWhite * totalClass;
        int totalPaintBrown = oneClassPaintBrown * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalPaintWhite + " банок белой краски и " +totalPaintBrown + " банок коричневой краски");

        //Задание №6
        System.out.println("Задание №6");
        byte weightBanana = 80;
        byte banana = 5;
        byte weightMilk = 105;
        byte milk = 2;
        byte weightIceCream = 100;
        byte iceCream = 2;
        byte weightEgg = 70;
        byte egg = 4;
        int totalWeightBreakfаstG = weightBanana * banana + weightMilk * milk + weightIceCream * iceCream + weightEgg * egg;// вес в граммах
        float totalWeightBreakFastKg = totalWeightBreakfаstG / 1000F;
        System.out.println("Общий вес спортивного завтрака составляет " + totalWeightBreakfаstG + "грамм, или " + totalWeightBreakFastKg + " килограмм");

        //Задание №7
        System.out.println("Задание №7");
        byte weightTotalLoseKg = 7;// в килограммах
        int weightTotalLoseG = weightTotalLoseKg * 1000;
        short weightLose1 = 250;
        short weightLose2 = 500;
        int dayWeightLose1 = weightTotalLoseG / weightLose1;
        int dayWeightLose2 = weightTotalLoseG / weightLose2;
        System.out.println("Если спортсмен будет худеть на " + weightLose1 + " грамм ежедневно, то ему понадобиться " + dayWeightLose1 + " дней для подготовки к соревнованиям");
        System.out.println("Если спортсмен будет худеть на " + weightLose2 + " грамм ежедневно, то ему понадобиться " + dayWeightLose2 + " дней для подготовки к соревнованиям");

        //Задание №8
        System.out.println("Задание №8");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double weigntSalaryMaria = salaryMaria * 0.1;
        double weigntSalaryDenis = salaryDenis * 0.1;
        double weigntSalaryKristina = salaryKristina * 0.1;
        double totalSalaryMaria = salaryMaria + weigntSalaryMaria;
        double totalSalaryDenis = salaryDenis + weigntSalaryDenis;
        double totalSalaryKristina= salaryKristina + weigntSalaryKristina;
        System.out.println("Маша теперь получает " +  totalSalaryMaria+ " рублей. Годовой доход вырос на " + weigntSalaryMaria * 12 + " рублей");
        System.out.println("Денис теперь получает " +  totalSalaryDenis + " рублей. Годовой доход вырос на " + weigntSalaryDenis * 12 + " рублей");
        System.out.println("Кристина теперь получает " +  totalSalaryKristina + " рублей. Годовой доход вырос на " + weigntSalaryKristina * 12 + " рублей");





















    }
}