package model.medico;

import model.pessoa.Pessoa;

public class Medico extends Pessoa {  
  private CRM crm;

  public CRM getCrm() {
    return crm;
  }
  public void setCrm(CRM crm) {
    this.crm = crm;
  }  
}
