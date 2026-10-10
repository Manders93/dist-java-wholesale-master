package edu.wctc.wholesale;

import java.time.LocalDateTime;

public class OrderDTO {

    private String customerName;
    private LocalDateTime purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private LocalDateTime shippedDate;
    private Double productCost;

    public OrderDTO(Order order) {
        this.customerName = order.getCustomer().getName();
        this.purchaseDate = order.getPurchaseDate();
        this.purchaseOrderNumber = order.getPurchaseOrderNumber();
        this.productName = order.getProduct().getName();
        this.terms = order.getTerms();
        this.shippedDate = order.getShippedDate();
        this.productCost = order.getProduct().getCost();
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getTerms() {
        return terms;
    }

    public LocalDateTime getShippedDate() {
        return shippedDate;
    }

    public Double getProductCost() {
        return productCost;
    }
}