package controller;

import dao.PessoaDao;
import model.pessoa.CorEnum;
import model.pessoa.Pessoa;

public class Controller {
  
  public Pessoa montarPessoa(){
    PessoaDao dao = new PessoaDao();
    Pessoa pessoa = new Pessoa();

    pessoa.setCor(dao.retornarIdCor(CorEnum.BRANCO));


    return pessoa;
  }
}
