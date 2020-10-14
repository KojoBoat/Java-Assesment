package io.turntabl;
import java.util.HashMap;
import java.util.HashSet;

public class MontrealApplication implements MontrealTradedProducts {
    HashMap<String, Product> Products = new HashMap<>();
    HashMap<String,Integer> Trade = new HashMap<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(Products.containsValue(product.getProductId())) {
           throw new ProductAlreadyRegisteredException("Product already exist");
        }else {
            Products.put(product.getProductId(),product);
        }
    }

    @Override
    public void trade(Product product, int quantity) {
        //first check if productId already exists in Products
            if(!Products.containsValue(product.getProductId() ) ){
                System.out.println("Product has not been registered yet");
            }else {
                HashMap<String, Integer> Trade = new HashMap<>();
                Trade.put(product.getProductId(), quantity);
            }
    }

    @Override
    public int totalTradeQuantityForDay() {
        //returns total products registered
        int totalQuantity = 0;
         for(String k : this.Trade.keySet()){
             totalQuantity += this.Trade.get(k);
         }
        return totalQuantity;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double totalValue = 0;
        for(String k : this.Trade.keySet()){
            Integer quantity = this.Trade.get(k);
            double price = this.Products.get(k).getPrice();
        }
        return 0;
    }
}


