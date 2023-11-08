public class MyCar2 {
    public String color;
    public int yearOfProduction;

    public MyCar2(String color, int yearOfProduction) {
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public void printMyCar() {
        System.out.println("Color: " + color);
        System.out.println("Year Of production: " + yearOfProduction);
    }

    public void turnOnMachine() {
        System.out.println("Machine is turned ON");
    }

    public void changeGear() {
        System.out.println("Changed gear");
    }

    public void turnOffMachine() {
        System.out.println("Machine is turned OFF");
    }
}
