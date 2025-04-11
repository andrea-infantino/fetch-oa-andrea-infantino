package com.fetch.fetch_oa.DTOs;

/**
 * Data Transfer Object for Points.
 * This class is used to represent the points earned from a receipt.
 */
public class Points {

    /**
     * Points earned from the receipt.
     */
    private int points;

    public Points(int points) {
        this.points = points;
    }

    /**
     * Getter for the points earned from the receipt.
     * @return The points earned from the receipt.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Setter for the points earned from the receipt.
     * @param points The points earned from the receipt.
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
