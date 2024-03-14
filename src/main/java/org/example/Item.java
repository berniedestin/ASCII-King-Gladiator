package org.example;

public abstract class Item {
    //DATA
    private String name;
    private int itemNumber;
    private int mightMod = 0;
    private int speedMod = 0;
    private int intellectMod = 0;
    private int mightEdgeMod = 0;
    private int speedEdgeMod = 0;
    private int intellectEdgeMod = 0;
    private String[] itemSprite;

    //GETTERS AND SETTERS


    public String[] getItemSprite() {
        return itemSprite;
    }

    //CONSTRUCTOR
    public Item(String[] itemSprite){
        this.itemSprite = itemSprite;
    }

}
