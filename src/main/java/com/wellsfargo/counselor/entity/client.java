package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class client {

  @Id
  @GeneratedValue()
  private long ClientId;

  @Column(nullable = false)
  private String ClientName;
  
  @Column(nullable = false)
  private String ClientPhone;

  
  @Column(nullable = false)
  private String ClientEmail;


  public client(String ClientName, String ClientPhone, String ClientEmail ){
    this.ClientName = ClientName;
    this.ClientPhone = ClientPhone;
    this.ClientEmail = ClientEmail;
  }

  
  //------------------------------
  public String  getClientName(){
    return ClientName;
  }
  public void setClientName(String clientName) {
    ClientName = clientName;
  }

  
  //------------------------------
  public String  getClientPhone(){
    return ClientPhone;
  }
  public void setClientPhone(String clientPhone) {
    ClientPhone = clientPhone;
  }

  
  //------------------------------
  public String getClientEmail(){
    return ClientPhone;
  }
  public void setClientEmail(String clientEmail) {
    ClientEmail = clientEmail;
  }
}


