package com.main.generics;

// Method to handle variable arguments
public class VarArgs {

    public static void main(String[] args){
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(item1,item2,item3);
        printShoppingList("Bread","Milk","Eggs","Bananas");
    }

    /***
     * Implementation of variable arguments
     * ... denotes variable arguments
     * ... adds multiple arguments in an array
     * can pass multiple items or an array of items
     */
    private static void printShoppingList(String... list){
        System.out.println("Shopping List");
        for(int i = 0;i<list.length;i++){
            System.out.println(i+1 +": "+list[i]);
        }
    }
}
