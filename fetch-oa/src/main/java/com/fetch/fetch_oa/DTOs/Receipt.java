package com.fetch.fetch_oa.DTOs;

/** 
 * Data Transfer Object for Receipt.
 * This class represents a receipt with details such as retailer name, purchase date, purchase time, total amount, and items purchased.
 */
public class Receipt {
    
    /**
     * The name of the retailer where the purchase was made.
     */
    private String retailer;

    /**
     * The date of purchase in the format yyyy-MM-dd.
     */
    private String purchaseDate;

    /**
     * The time of purchase in the format HH:mm.
     */
    private String purchaseTime;

    /**
     * The total amount of the purchase.
     */
    private String total;

    /**
     * An array containing the items purchased.
     */
    private Item[] items;

    public Receipt(String retailer, String purchaseDate, String purchaseTime, String total, Item[] items) {
        this.retailer = retailer;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.total = total;
        this.items = items;
    }

    /**
     * Get the name of the retailer.
     * @return the name of the retailer.
     */
    public String getRetailer() {
        return retailer;
    }

    /**
     * Set the name of the retailer.
     * @param retailer the name of the retailer.
     */
    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    /**
     * Get the purchase date.
     * @return the purchase date in the format yyyy-MM-dd.
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Set the purchase date.
     * @param purchaseDate the purchase date in the format yyyy-MM-dd.
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Get the purchase time.
     * @return the purchase time in the format HH:mm.
     */
    public String getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Set the purchase time.
     * @param purchaseTime the purchase time in the format HH:mm.
     */
    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * Get the total amount of the purchase.
     * @return the total amount of the purchase.
     */
    public String getTotal() {
        return total;
    }

    /**
     * Set the total amount of the purchase.
     * @param total the total amount of the purchase.
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Get the items purchased.
     * @return an array of items purchased.
     */
    public Item[] getItems() {
        return items;
    }

    /**
     * Set the items purchased.
     * @param items an array of items purchased.
     */
    public void setItems(Item[] items) {
        this.items = items;
    }
}
