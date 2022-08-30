public class MainProgram {
    public static void main(String[] args) {
        Property p1 = new Property("Address: Erzbergerstraße 1",10,20.5);
        System.out.println("Address: " + p1.getAddress() + "\nSize: " + p1.getSize() + " m²");

        Property p2 = new Property("Address: Erzbergerstraße 2",10,20.5);
        System.out.println("Address: " + p2.getAddress() + "\nSize: " + p2.getSize() + " m²");

        Property p3 = new Property("Address: Erzbergerstraße 3",10,20.5);
        System.out.println("Address: " + p3.getAddress() + "\nSize: " + p3.getSize() + " m²");

        Property p4 = new Property("Address: Erzbergerstraße 4",10,20.5);
        System.out.println("Address: " + p4.getAddress() + "\nSize: " + p4.getSize() + " m²");

        Property p5 = new Property("Address: Erzbergerstraße 5",10,20.5);
        System.out.println("Address: " + p5.getAddress() + "\nSize: " + p5.getSize() + " m²");
    }
}