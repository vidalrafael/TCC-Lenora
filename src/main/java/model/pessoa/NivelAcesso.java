package model.pessoa;

public class NivelAcesso {
  private Integer id;
  private NivelAcessoEnum nivelAcesso;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public NivelAcessoEnum getNivelAcesso() {
    return nivelAcesso;
  }
  public void setNivelAcesso(NivelAcessoEnum nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
  }  
}
