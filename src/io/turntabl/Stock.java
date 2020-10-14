package io.turntabl;

public class Stock extends Product {

    private String exchange;
    private String ticker;

    Stock(String ProductId, double price, String exchange, String ticker) {
        super(ProductId, price);
        this.exchange = exchange;
        this.ticker = ticker;
    }


    public String getExchange(){
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

}
