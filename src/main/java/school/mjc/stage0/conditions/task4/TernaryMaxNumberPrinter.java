package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxx;
        maxx = first > second ? (maxx = first > third ? first: third): (maxx = second > third ? second: third);
        System.out.println(maxx);
    }
}// 1 2 3
