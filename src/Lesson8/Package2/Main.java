package Lesson8.Package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, Exception {
        Price[] prices = new Price[2];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < prices.length; i++) {
            String Product_name = "";
            String Market_name = "";
            Double Price = 0.0;

            System.out.println("Enter Product: ");
            Product_name = in.readLine();
            System.out.println("Enter Market: ");
            Market_name = in.readLine();
            System.out.println("Price: ");
            Price = Double.parseDouble(in.readLine());

            prices[i] = new Price(Product_name, Market_name, Price);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        System.out.println("Input product:");
        String name_Market = in.readLine();

        for (int i = 0; i < prices.length; i++) {
            String m = prices[i].market_name;

            if(name_Market.equals(m)){
                System.out.println(prices[i].product_name);
            }else {
                try {
                    throw new Exception("Market not found!");
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }

        }




    }
}
