package io.turntabl;

public class Product {
    private String ProductId;
    private double price;


    Product(String ID, double price){
        this.ProductId = ID;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return ProductId;
    }

    ProductPricingService Price = new ProductPricingService() {
        @Override
        public double price(String exchange, String ticker) {
            return 0;
        }

        @Override
        public double price(String exchange, String contractCode, int month, int year) {
            return 0;
        }

    };

}
