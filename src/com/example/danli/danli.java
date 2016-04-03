package com.example.danli;

public class danli {
   private static class Holder {    
       private static final Singleton INSTANCE = new Single();    
    }    
    private Single (){}    
    public static final Singleton getInstance() {    
       return Holder.INSTANCE;    
    }  
}
