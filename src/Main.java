public class Main {
    public static void main(String[] args) {
        CalcIndexMB indexMB = new CalcIndexMB();
        double m = 110.5;
        double h = 1.92;

        double myIndexMB = indexMB.calc(m, h);
        System.out.println(" Индекс моего тела = " + myIndexMB);
    }

    // i= масса тела в кг. / рост^2 в метрах
}
