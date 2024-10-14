public class EX3TuitionIncrease {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double currentTuition = initialTuition;
        double targetTuition = initialTuition * 2;
        double increaseRate = 0.07;
        int years = 0;

        while (currentTuition < targetTuition) {
            currentTuition += currentTuition * increaseRate;
            years++;
        }

        System.out.printf("Tuition will be doubled in %d years%n", years);
        System.out.printf("Tuition will be ￥%.2f in %d years%n", currentTuition, years);
    }
}
