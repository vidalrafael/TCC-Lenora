package model.exame;

public class ResultadoExame {
  private Integer id;
  private TipoExameEnum resultadoExameEnum;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public TipoExameEnum getResultadoExameEnum() {
    return resultadoExameEnum;
  }
  public void setResultadoExameEnum(TipoExameEnum resultadoExameEnum) {
    this.resultadoExameEnum = resultadoExameEnum;
  }

}
