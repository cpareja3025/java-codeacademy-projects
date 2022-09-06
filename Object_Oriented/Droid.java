package Object_Oriented;
public class Droid {
    int batteryLevel = 100;
    String name;

    public Droid(String name) {
        this.name = name;

    }
    public String toString() {
        return "Hello, I'm the droid:" + name;

    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: "+ task);
        batteryLevel = batteryLevel - 10;
    }

    public String energyReport() {
        return "This is the Droid's battery level " + batteryLevel;
    }

    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey.toString());
        Codey.performTask("coding");
        Codey.performTask("jumping");
        System.out.println(Codey.energyReport());
    }
    
}
