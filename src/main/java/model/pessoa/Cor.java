package model.pessoa;

public class Cor {
  private Integer id;
  private CorEnum cor;
  
  public CorEnum getCor() {
    return cor;
  }
  public void setCor(CorEnum cor) {
    this.cor = cor;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  
}
