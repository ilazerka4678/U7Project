public class Main {
    public static void main(String[] args) {
        Address a1 = new Address(123, "Awesome Street", "9B", "Charleston", "SC", 12345);
        Address a2 = new Address(7203, "Pie Lane", "Fort Worth", "TX", 35630);
        System.out.println(a2);
        System.out.println(a1);
        Package boxOfGummyBears = new Package (a1, a2, 10, 10, 10, 10);
        System.out.println(PostageCalculator.calculatePostage(boxOfGummyBears));
    }
}
