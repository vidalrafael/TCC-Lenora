package model.comum;

import java.time.LocalDate;

public class Data {
  private Integer id;
  private LocalDate data;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public LocalDate getData() {
    return data;
  }
  public void setData(LocalDate data) {
    this.data = data;
  }
}
