package model.pessoa;

import model.comum.Data;

public class Pessoa {
  private Cor cor;
  private CPF cpf;
  private Data dataDeNascimento;
  private Nacionalidade nacionalidade;
  private Nome nome;
  private NomeDaMae nomeDaMae;
  private NivelAcesso nivelAcesso;
  private Sexo sexo;
  private Telefone telefone;

  public Cor getCor() {
    return cor;
  }
  public void setCor(Cor cor) {
    this.cor = cor;
  }
  public CPF getCpf() {
    return cpf;
  }
  public void setCpf(CPF cpf) {
    this.cpf = cpf;
  }
  public Data getDataDeNascimento() {
    return dataDeNascimento;
  }
  public void setDataDeNascimento(Data dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }
  public Nacionalidade getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(Nacionalidade nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  public Nome getNome() {
    return nome;
  }
  public void setNome(Nome nome) {
    this.nome = nome;
  }
  public NomeDaMae getNomeDaMae() {
    return nomeDaMae;
  }
  public void setNomeDaMae(NomeDaMae nomeDaMae) {
    this.nomeDaMae = nomeDaMae;
  }
  public NivelAcesso getNivelAcesso() {
    return nivelAcesso;
  }
  public void setNivelAcesso(NivelAcesso nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
  }
  public Sexo getSexo() {
    return sexo;
  }
  public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }
  public Telefone getTelefone() {
    return telefone;
  }
  public void setTelefone(Telefone telefone) {
    this.telefone = telefone;
  }
  
}
