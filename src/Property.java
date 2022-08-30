public class Property {
    private String address;
    public double width;
    private double length;

    public Property(){
        address = "Erzbergerstraße 1";
        width = 10;
        length = 20.5;
    }

    public String getAddress(){
        return address;
    }
    public double getSize(){
        return width * length;
    }
}
