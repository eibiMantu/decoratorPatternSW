public class testCoffee {
    public static void main(String[] args) {
        coffee black = new blackCoffee();
        coffee blackWithMilk = new milk(black);
        coffee blackWithCaramelSyrup = new caramelSyrup(black);

        System.out.println("===== Coffee Menu =====");
        System.out.printf("1. %s - ₱ %.2f\n", black.getDescription(), black.getCost());
        System.out.printf("2. %s - ₱ %.2f\n", blackWithMilk.getDescription(), blackWithMilk.getCost());
        System.out.printf("3. %s - ₱ %.2f\n", blackWithCaramelSyrup.getDescription(), blackWithCaramelSyrup.getCost());
        System.out.println("=======================");
    }
}