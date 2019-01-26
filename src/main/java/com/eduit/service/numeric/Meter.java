package com.eduit.service.numeric;

public class Meter {

       private static final String simbol = "M";
       private int quantity;

        public Meter(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return quantity + simbol;
        }
    }


