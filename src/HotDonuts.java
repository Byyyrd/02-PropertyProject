public class HotDonuts {
    private String flavor;
    private String address;
    public double price;
    private int toppings;

    public HotDonuts(String flavor,String address,double price,int toppings){
        this.flavor = flavor;
        this.address = address;
        this.price = price;
        this.toppings = toppings;
    }

    public String getFlavor(){
        return this.flavor;
    }
    public String getAddress(){
        return this.address;
    }
    public double getPrice(){
        return this.price + this.toppings * 0.50;
    }
}
