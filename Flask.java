public class Flask implements Bottle {
    double ounces;
    double ouncesConsumned;
    boolean empty;


    public Flask(double ounces, double ouncesConsumned, boolean empty){
        this.ounces = ounces;
        this.ouncesConsumned = ouncesConsumned;
        this.empty = empty;

    }
    public void drink(){
        if(this.ouncesConsumned < 90) {
            System.out.println("Drink 10 more ounces");
            this.ouncesConsumned +=10;
            this.ounces +=10;
        } else {
            System.out.println("You've drank enough water today, good job!");
        }

    }

    public void dump(){
        this.ounces = 0;
        System.out.println("Your Flask is empty now");

    }
    public double waterCount(){
        return 0;


    }
    public boolean bottleEmpty(){
        return this.empty;
    }

    public static void main(String[] args) {
        Flask hydro = new Flask(98, 32, true);
        hydro.drink();
    }

    }

