/*
Notes on && and || operators.
On some occasions, the compiler can determine the truth value of a logical
expression by only evaluating the first boolean operand. This is called 
"short circuted evaluation". There is no need sometimes to evaluate the second
boolean operand in an || operation if the first boolean value evaluates to true.
*/

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
      //isConfirmed = false;
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    // Create instances here
    Reservation res1 = new Reservation(3,40, true);
    Reservation res2 = new Reservation(0, 35, true);
    //res1.confirmReservation();
    //res1.informUser();
    res2.confirmReservation();
    //res2.informUser();
    
  }
}