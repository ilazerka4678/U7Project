public class Package {
    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double height;
    private double width;
    public Package(Address origin, Address destination, double weight, double width, double length, double height){
        if (width < 2 || length < 2 || height < 2 ){
            System.out.println("Package too small!");
        }
        if (weight < 0.1){
            System.out.println("Package too light!");
        }
        if (!(width < 2 || length < 2 || height < 2 || weight < 0.1)){
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
            this.width = width;
            this.length = length;
            this.height = height;
        }

    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
