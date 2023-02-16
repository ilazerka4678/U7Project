public class PostageCalculator {

    public static double calculatePostage(int zip1, int zip2, double weight, double height, double length, double width){
        double cost = 3.75;
        if (weight > 40) {
            double additionalWeight = weight - 40;
            cost += (weight * 10) * 0.05;
            cost += (additionalWeight * 10) * 0.10;
        }
        else{
            cost += (weight * 10) * 0.05;
        }
        if (zip1 > zip2){
            cost += ((zip1 / 100.0) - (zip2 / 100.0))/100.0;
        }
        else {
            cost += ((zip2 / 100.0) - (zip1 / 100.0))/100.0 ;
        }
        if (height + length + width > 36){
            cost += ((height + length + width) - 36) * 0.10;
        }

        return cost;
    }
    public static double calculatePostage(Address address1, Address address2, double weight, double height, double length, double width){
        int zip1 = address1.getZip();
        int zip2 = address2.getZip();
        double cost = 3.75;
        if (weight > 40) {
            double additionalWeight = weight - 40;
            cost += (weight * 10) * 0.05;
            cost += (additionalWeight * 10) * 0.10;
        }
        else{
            cost += (weight * 10) * 0.05;
        }
        if (zip1 > zip2){
            cost += ((zip1 / 100.0) - (zip2 / 100.0))/100.0;
        }
        else {
            cost += ((zip2 / 100.0) - (zip1 / 100.0))/100.0 ;
        }
        if (height + length + width > 36){
            cost += ((height + length + width) - 36) * 0.10;
        }
        return cost;
    }
    public static double calculatePostage(Package newPackage){
        int zip1 = newPackage.getOrigin().getZip();
        int zip2 = newPackage.getDestination().getZip();
        double weight = newPackage.getWeight();
        double height = newPackage.getHeight();
        double length = newPackage.getLength();
        double width = newPackage.getWidth();
        double cost = 3.75;
        if (weight > 40) {
            double additionalWeight = weight - 40;
            cost += (weight * 10) * 0.05;
            cost += (additionalWeight * 10) * 0.10;
        }
        else{
            cost += (weight * 10) * 0.05;
        }
        if (zip1 > zip2){
            cost += ((zip1 / 100.0) - (zip2 / 100.0))/100.0;
        }
        else {
            cost += ((zip2 / 100.0) - (zip1 / 100.0))/100.0 ;
        }
        if (height + length + width > 36){
            cost += ((height + length + width) - 36) * 0.10;
        }
        return cost;
    }

}
