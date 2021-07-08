package model.exame;

public class TipoExame {
  private Integer id;
  private TipoExameEnum exame;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public TipoExameEnum getExame() {
    return exame;
  }
  public void setExame(TipoExameEnum exame) {
    this.exame = exame;
  }
  
}
