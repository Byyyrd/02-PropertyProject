public class MainProgram {
    public static void main(String[] args) {
        Property p1 = new Property("Address: Erzbergerstraße 1",10,20.5);
        System.out.println("Address: " + p1.getAddress() + "\nSize: " + p1.getSize() + " m²");

        Property p2 = new Property("Address: Erzbergerstraße 2",20,41);
        System.out.println("Address: " + p2.getAddress() + "\nSize: " + p2.getSize() + " m²");
    }
}