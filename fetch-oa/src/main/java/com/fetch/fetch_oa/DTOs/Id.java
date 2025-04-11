package com.fetch.fetch_oa.DTOs;

/**
 * Data Transfer Object for Id.
 * This class is used to represent the unique ident
 */
public class Id {

    /**
     * Unique identifier for the receipt.
     */
    private String id;

    public Id(String id) {
        this.id = id;
    }

    /**
     * Getter for the unique identifier.
     * @return The unique identifier for the receipt.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for the unique identifier.
     * @param id The unique identifier for the receipt.
     */
    public void setId(String id) {
        this.id = id;
    }
}