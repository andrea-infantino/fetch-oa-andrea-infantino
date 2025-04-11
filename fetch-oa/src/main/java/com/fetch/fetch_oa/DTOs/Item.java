package com.fetch.fetch_oa.DTOs;

/**
 * Data Transfer Object for Item.
 * This class is used to represent an item in a receipt.
 */
public class Item {

    /**
     * Short description of the item.
     */
    private String shortDescription;

    /**
     * Price of the item.
     */
    private String price;

    public Item(String shortDescription, String price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    /**
     * Getter for the short description of the item.
     * @return The short description of the item.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Setter for the short description of the item.
     * @param shortDescription The short description of the item.
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Getter for the price of the item.
     * @return The price of the item.
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter for the price of the item.
     * @param price The price of the item.
     */
    public void setPrice(String price) {
        this.price = price;
    }
}
