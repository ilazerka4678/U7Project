import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate cost of one package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How package costs are calculated");
        System.out.print("Input: ");
        int choice = Integer.parseInt(s.nextLine());
        if (choice == 1) {
            System.out.print("Enter the weight of your package in pounds: ");
            String toParse = s.nextLine();
            double weight = Double.parseDouble(toParse);
            System.out.print("Enter the height of your package in inches: ");
            toParse = s.nextLine();
            double height = Double.parseDouble(toParse);
            System.out.print("Enter the length of your package in inches: ");
            toParse = s.nextLine();
            double length = Double.parseDouble(toParse);
            System.out.print("Enter the width of your package in inches: ");
            toParse = s.nextLine();
            double width = Double.parseDouble(toParse);
            System.out.print("Enter the origin street number: ");
            toParse = s.nextLine();
            int originStreetNum = Integer.parseInt(toParse);
            System.out.print("Enter the origin street name: ");
            String originStreetName = s.nextLine();
            System.out.print("If you have an apartment number, enter it. If not, enter -1: ");
            String originAptNum = s.nextLine();
            System.out.print("Enter the origin city: ");
            String originCity = s.nextLine();
            System.out.print("Enter the origin state: ");
            String originState = s.nextLine();
            System.out.print("Enter the origin zip: ");
            toParse = s.nextLine();
            int originZip = Integer.parseInt(toParse);
            System.out.print("Now enter the destination data, starting with the street num: ");
            toParse = s.nextLine();
            int destinationStreetNum = Integer.parseInt(toParse);
            System.out.print("Enter the destination street name: ");
            String destinationStreetName = s.nextLine();
            System.out.print("If the destination has an apartment number, enter it. If not, enter -1: ");
            String destinationAptNum = s.nextLine();
            System.out.print("Enter the destination city: ");
            String destinationCity = s.nextLine();
            System.out.print("Enter the destination state: ");
            String destinationState = s.nextLine();
            System.out.print("Enter the destination zip: ");
            toParse = s.nextLine();
            int destinationZip = Integer.parseInt(toParse);
            Address origin = new Address(originStreetNum, originStreetName, originAptNum, originCity, originState, originZip);
            Address destination = new Address(destinationStreetNum, destinationStreetName, destinationAptNum, destinationCity, destinationState, destinationZip);
            Package parcel = new Package(origin, destination, weight, width, length, height);
            System.out.println(PostageCalculator.calculatePostage(parcel));
        }
    }
}
