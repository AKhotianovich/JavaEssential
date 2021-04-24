package Lesson8.Package2;

public class Price {
    public String product_name;
    public String market_name;
    public Double price_UA;

    public Price(String product_name, String market_name, Double price_UA) {
        this.product_name = product_name;
        this.market_name = market_name;
        this.price_UA = price_UA;
    }

    @Override
    public String toString(){
        return "Product: " + this.product_name + " Market: " + this.market_name + " Price: " + this.price_UA;
    }
}

