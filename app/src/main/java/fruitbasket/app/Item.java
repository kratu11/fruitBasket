package fruitbasket.app;

public class Item {

    private String fruitName;
    private String fruitColor;
    private int size;


    // class Item with 3 attributes

    public Item(String fruitName, String fruitColor, int size){
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.size = size;
    }

    public String getFruitName(){
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitColor(){
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
