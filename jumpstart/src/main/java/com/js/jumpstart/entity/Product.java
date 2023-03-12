package com.js.jumpstart.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_product")
  private int idProduct;

  @NotBlank(message = "Name is required")
  @Column(nullable = false)
  private String name;

  @NotBlank(message = "Brand is required")
  @Column(nullable = false)
  private String brand;

  @NotEmpty(message = "Serial No is required")
  @Size(min = 4, max = 4, message = "Serial No must be 4 characters long")
  @Column(nullable = false)
  private String serial;

  @Column(nullable = false)
  private String status;

  @Column(nullable = false)
  @Digits(integer = 10, fraction = 2)
  @Positive(message = "Price can't below 0 or Negative number")
  private int price;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "id_user")
  private UserAccount user;

  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "product")
  private ProductPicture productPicture;


  public Product() {
  }

  public String getName() {
    return name;
  }

  public void setMake(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserAccount getUser() {
    return user;
  }

  public void setUser(UserAccount user) {
    this.user = user;
  }

  public ProductPicture getProductPicture() {
    return productPicture;
  }

  public void setCarPicture(ProductPicture productPicture) {
    this.productPicture = productPicture;
  }

  public int getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(int idProduct) {
    this.idProduct = idProduct;
  }



}