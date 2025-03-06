package com.Lins.pharmacy.domain;

public record ProductRequest(String id, String name, String description, Integer price_in_cents, Integer stock_quantity, Boolean requires_prescription, String ean_code) {

}
