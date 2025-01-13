package org.example.Practice_Program;

public enum Laptop {

    MacBook(2000),
    XPS;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;


    private Laptop(){
        price=200;
    }
    private Laptop(int price){
        this.price=price;
    }
}
