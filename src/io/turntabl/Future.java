package io.turntabl;

public class Future extends Product {
    private String exchange;
    private String ticker;
    private String contractCode;
    private int month;
    private int year;

    Future(String ProductId, double price, String exchange,String ticker,String contractCode, int month, int year) {
        super(ProductId, price);

        this.exchange = exchange;
        this.ticker = ticker;
        this.contractCode = contractCode;
        this.month= month;
        this.year = year;
    }

    public String getExchange() {
        return exchange;
    }


    public String getTicker() {
        return ticker;
    }

    public String getContractCode() {
        return contractCode;
    }


    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


}
