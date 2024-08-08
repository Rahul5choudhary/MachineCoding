package com.example.practice.Solid;

public class Liskov {

    public static class Menuitem {
        public int price;
        public String name;
        public String description;

        public Menuitem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        public double getDiscount() {
            return 0;
        }

    }

    ;

    public static class BereverageItem extends Menuitem {

        public BereverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        public double getDiscount() {
            int discountPercentage = 10;
            return discountPercentage * 0.01 * this.price;
        }
    }

    public static void printItemPrice(Menuitem item) {
        if (item instanceof BereverageItem) {
            System.out.println("BereverageItem Item Discounted price :" + item.getPrice());
        } else {
            System.out.println("Menu item discounted price :" + item.getPrice());
        }
    }

    public static void main(String[] args) {
        Menuitem maggi = new Menuitem(100,"Maggi","Nestle");
        BereverageItem coke = new BereverageItem(60,"Coke","Coca Cola");

        printItemPrice(maggi);
        printItemPrice(coke);
        
    }


}
