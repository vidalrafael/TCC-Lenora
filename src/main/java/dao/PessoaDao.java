package dao;

import model.pessoa.CPF;
import model.pessoa.Cor;
import model.pessoa.CorEnum;
import model.pessoa.Nacionalidade;
import model.pessoa.NivelAcesso;
import model.pessoa.Nome;
import model.pessoa.NomeDaMae;
import model.pessoa.Sexo;
import model.pessoa.Telefone;

public class PessoaDao {
  
  public Cor retornarIdCor(CorEnum corEnum){
    return new Cor();
  }

  public CPF retornarIdCpf(Integer cpf){
    return new CPF();
  }

  public Nacionalidade retornarIdNacionalidade(String nacionalidade){
    return new Nacionalidade();
  }

  public Nome retornarIdNome(String nome){
    return new Nome();
  }

  public NomeDaMae retornarIdNomeDaMae(String nomeDaMae){
    return new NomeDaMae();
  }

  public NivelAcesso retornarIdNivelAcesso(String nivelAcesso){
    return new NivelAcesso();
  }

  public Sexo retornarIdSexo(String sexo){
    return new Sexo();
  }

  public Telefone retornarIdtTelefone(String telefone){
    return new Telefone();
  }
}
