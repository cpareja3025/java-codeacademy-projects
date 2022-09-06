package Object_Oriented;
public class Store {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice;   
    }
    public double getPriceWithTax(){
        double totalPrice = price + (price*0.08);
        return totalPrice;
    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      lemonadeStand.increasePrice(3.5);
      double lemonadePrice = lemonadeStand.getPriceWithTax();
      System.out.println("This is the price of lemonade"+ lemonadeStand.price);
      System.out.println(lemonadePrice);
      System.out.println(lemonadeStand);
      
    }
  }