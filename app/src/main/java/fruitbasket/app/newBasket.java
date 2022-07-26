package fruitbasket.app;

import java.util.ArrayList;

public class newBasket {

    private oldBasket oldbasket;

    private ArrayList<Item> fruitsSize1 = new ArrayList<>();
    private ArrayList<Item> fruitsSize2 = new ArrayList<>();
    private ArrayList<Item> fruitsSize3 = new ArrayList<>();

    public void sortFruits(){
        ArrayList<Item> oldfruit = new ArrayList<>(oldbasket.getItems());

        for(Item item: oldfruit){
            if(item.getSize()==1) {
                fruitsSize1.add(item);
            }
            if(item.getSize()==2) {
                fruitsSize2.add(item);
            }
            if(item.getSize()==3) {
                fruitsSize3.add(item);
            }
        }

    }

    public oldBasket getoldBasket(){
        return oldbasket;
    }

    public void setoldBasket(oldBasket oldbasket){
        this.oldbasket = oldbasket;
    }

    public ArrayList<Item> getFruitsSize1() {
        return fruitsSize1;
    }

    public void setFruitsSize1(ArrayList<Item> fruitsSize1) {
        this.fruitsSize1 = fruitsSize1;
    }

    public ArrayList<Item> getFruitsSize2() {
        return fruitsSize2;
    }

    public void setFruitsSize2(ArrayList<Item> fruitsSize2) {
        this.fruitsSize2 = fruitsSize2;
    }

    public ArrayList<Item> getFruitsSize3() {
        return fruitsSize3;
    }

    public void setFruitsSize3(ArrayList<Item> fruitsSize3) {
        this.fruitsSize3 = fruitsSize3;
    }

}
