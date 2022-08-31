public class HotDonuts {
    private String Flavor;
    private String Address;
    public double Price;
    private double Toppings;

    public HotDonuts(String Flavor,String Address,double Price,double Toppings){
        this.Flavor = Flavor;
        this.Address = Address;
        this.Price = Price;
        this.Toppings = Toppings;
    }

    public String getFlavor(){
        return this.Flavor;
    }
    public String getAddress(){
        return this.Address;
    }
    public double getPrice(){
        return this.Price + this.Toppings * 0.50;
    }
}
