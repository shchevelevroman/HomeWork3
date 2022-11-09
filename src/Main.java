public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание №1
        int mercury = 1;
        byte venus = 2;
        short earth = 3;
        long mars = 4;
        float jupiter = 5;
        double saturn = 6;
        System.out.println("Значение переменной " + "mercury" + " с типом " + "int" + " равно " + mercury);
        System.out.println("Значение переменной " + "venus" + " с типом " + "byte" + " равно " + venus);
        System.out.println("Значение переменной " + "earth" + " с типом " + "short" + " равно " + earth);
        System.out.println("Значение переменной " + "mars" + " с типом " + "long" + " равно " + mars);
        System.out.println("Значение переменной " + "jupiter" + " с типом " + "float" + " равно " + jupiter);
        System.out.println("Значение переменной " + "saturn" + " с типом " + "double" + " равно " + saturn);

        //Задание №2
        double ab = 27.12;
        long  bc = 1212121212;//должно быть число 987678965549
        byte cd = 2;
        short de = 786;
        boolean ef = false;
        short fj = 569;
        short jh = -159;
        short hi = 27697;
        byte ig = 67;

        //Задание №3
        byte studentLuidmmilaPavlovna = 23;
        byte studentAnnaSergeevna = 27;
        byte studentEkaterinaAndreevna = 30;
        short totalPapers = 480;
        int totalStudent = studentLuidmmilaPavlovna + studentAnnaSergeevna + studentEkaterinaAndreevna;
        int papersForStudent = totalPapers / totalStudent;
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");

        //Задание №4
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
        System.out.println("За " + timeWork3 + " минут, машина произвела бутылок - " + cpdTimeWork4 + " штук");

        //Задание №5
        byte totalPaint = 120;
        byte oneClassPaintWhite = 4;
        byte oneClassPaintBrown = 2;
        int oneClassTotalPaint = oneClassPaintWhite + oneClassPaintBrown;
        int totalClass = totalPaint / oneClassTotalPaint;
        int totalPaintWhite = oneClassPaintWhite * totalClass;
        int totalPaintBrown = oneClassPaintBrown * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalPaintWhite + " банок белой краски и " +totalPaintBrown + " банок коричневой краски");

        //Задание №6








    }
}