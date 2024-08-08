package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



public class Portifolio {
  @Id
  @GeneratedValue()
  private long PortifolioId;


  @Column(nullable = false)
  private Long ClientId;

  @Column(nullable = false)
  private float TotalValue;

  public Portifolio(Long ClientId, float TotalValue){
    this.ClientId = ClientId;
    this.TotalValue = TotalValue;
  }

  
  //------------------------------
  public Long getClientId() {
    return ClientId;
  }
  public void setClientId(Long clientId) {
    ClientId = clientId;
  }

  
  //------------------------------
  public float getTotalValue() {
    return TotalValue;
  }
  public void setTotalValue(float totalValue) {
    TotalValue = totalValue;
  }

}
