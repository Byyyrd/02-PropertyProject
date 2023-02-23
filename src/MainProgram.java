public class MainProgram {
    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1",10,20.5);
        System.out.println("Address: " + p1.getAddress() + "\nSize: " + p1.getSize() + " m²");

        Property p2 = new Property("Erzbergerstraße 2",10,20.5);
        System.out.println("Address: " + p2.getAddress() + "\nSize: " + p2.getSize() + " m²");

        Property p3 = new Property("Erzbergerstraße 3",10,20.5);
        System.out.println("Address: " + p3.getAddress() + "\nSize: " + p3.getSize() + " m²");

        Property p4 = new Property("Erzbergerstraße 4",10,20.5);
        System.out.println("Address: " + p4.getAddress() + "\nSize: " + p4.getSize() + " m²");

        Property p5 = new Property("Erzbergerstraße 5",10,20.5);
        System.out.println("Address: " + p5.getAddress() + "\nSize: " + p5.getSize() + " m²");

        HotDonuts d1 = new HotDonuts("Vanilla","Erzbergerstraße 1",1,3);
        System.out.println("Address: " + d1.getAddress() + "\nFlavor: " + d1.getFlavor() + "\nPrice: " + d1.getPrice() + "$");

        HotDonuts d2 = new HotDonuts("Chocolate","Erzbergerstraße 2",1.50,5);
        System.out.println("Address: " + d2.getAddress() + "\nFlavor: " + d2.getFlavor() + "\nPrice: " + d2.getPrice() + "$");

        HotDonuts d3 = new HotDonuts("Lemon","Erzbergerstraße 3",1,10);
        System.out.println("Address: " + d3.getAddress() + "\nFlavor: " + d3.getFlavor() + "\nPrice: " + d3.getPrice() + "$");

    }
}