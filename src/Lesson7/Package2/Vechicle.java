package Lesson7.Package2;

public enum Vechicle {
    SKYLINE(35, "Blue"), NSX(50, "Red"), SILVIA(25, "Gray"), SUPRA(30, "Black"), CIVIC(10, "Yellow");

    private int price;
    private String color;
    Vechicle(int price, String color){
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String setCar(){
        return "Model: " + this.name() + " Price: " + this.price + " Color: " + this.color;
    }
}
