package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security {

  @Id
  @GeneratedValue()
  private long SecurityId;

  @Column(nullable = false)
  private Long PortifolioId;

  @Column(nullable = false)
  private String SecurityName;

  @Column(nullable = false)
  private String Category;
  
  @Column(nullable = false)
  private String PurchaseDate;

  @Column(nullable = false)
  private float PurchasePrice;


  @Column(nullable = false)
  private int Quantity;

  
  public Security(Long PortifolioId, String SecurityName, String Category, String PurchaseDate, float PurchasePrice, int Quantity){
    this.PortifolioId = PortifolioId;
    this.SecurityName = SecurityName;
    this.Category = Category;
    this.PurchaseDate = PurchaseDate;
    this.PurchasePrice = PurchasePrice;
    this.Quantity = Quantity;
  }

  
  //------------------------------
  public Long getPortifolioId() {
    return PortifolioId;
  }
  public void setPortifolioId(Long portifolioId) {
    PortifolioId = portifolioId;
  }

  //------------------------------
  public String getSecurityName() {
    return SecurityName;
  }
  public void setSecurityName(String securityName) {
    SecurityName = securityName;
  }
  
  
  //------------------------------
  public String getCategory() {
    return Category;
  }
  public void setCategory(String category) {
    Category = category;
  }

  
  //------------------------------
  public String getPurchaseDate() {
    return PurchaseDate;
  }
  public void setPurchaseDate(String purchaseDate) {
    PurchaseDate = purchaseDate;
  }

  
  //------------------------------
  public float getPurchasePrice() {
    return PurchasePrice;
  }
  public void setPurchasePrice(float purchasePrice) {
    PurchasePrice = purchasePrice;
  }

  
  //------------------------------
  public int getQuantity() {
    return Quantity;
  }
  public void setQuantity(int quantity) {
    Quantity = quantity;
  }


}
