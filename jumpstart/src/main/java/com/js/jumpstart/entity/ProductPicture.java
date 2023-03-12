package com.js.jumpstart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product_picture")
public class ProductPicture {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_picture")
  private int idPicture;

  @Column(name = "file_name", nullable = false)
  private String fileName;

  @Column(name = "file_type", nullable = false)
  private String fileType;

  @Lob
  @Column(nullable = false)
  private String image;

  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "id_product")
  private Product product;

  public ProductPicture() {
  }

  public int getIdPicture() {
    return idPicture;
  }

  public void setIdPicture(int idPicture) {
    this.idPicture = idPicture;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

}