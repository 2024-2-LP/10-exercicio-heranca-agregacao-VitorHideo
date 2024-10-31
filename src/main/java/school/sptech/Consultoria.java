package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

  private String nome;
  private Integer vagas;
  private List<Desenvolvedor> desenvolvedores;


  public Consultoria(String nome, Integer vagas , List desenvolvedores) {
    this.nome = nome;
    this.vagas = vagas;
    this.desenvolvedores = new ArrayList<>();
  }

  public Consultoria() {
  }

  public Boolean contratar(Desenvolvedor desenvolvedor) {
    if (vagas != null && vagas >= 1) {
      desenvolvedores.add(desenvolvedor);
    }
    return false;
  }

  public Boolean contratarFullstack(DesenvolvedorWeb desenvolvedor) {
    if (desenvolvedor.isFullstack()) {
      desenvolvedores.add(desenvolvedor);
    }
    return false;
  }

  public Double getTotalSalarios() {

    Double total = 0.0;
    for (Desenvolvedor desenvolvedor: desenvolvedores) {
      total += desenvolvedor.calcularSalario();
    }
    return total;
  }

  public Integer qtdDesenvolvedoresMobile() {
    Integer cont = 0;
    for (Desenvolvedor desenvolvedor : desenvolvedores) {
      if (desenvolvedor instanceof DesenvolvedorMobile) {
        cont++;
      }
    }
    return cont;
  }
  
  public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario) {

    List<Desenvolvedor> listaResultado = new ArrayList<>();

    for (Desenvolvedor desenvolvedor : desenvolvedores) {
      if (desenvolvedor.calcularSalario() >= salario) {
        listaResultado.add(desenvolvedor);
      }
    }
    return listaResultado;
  }

  public Desenvolvedor buscarMenorSalario() {

    if (desenvolvedores.isEmpty()) {
      return null;
    }

    Desenvolvedor devMenorSalario = desenvolvedores.get(0);
    for (Desenvolvedor desenvolvedor : desenvolvedores) {
      if (desenvolvedor.calcularSalario() < devMenorSalario.calcularSalario()) {
        devMenorSalario = desenvolvedor;
      }
    }
    return devMenorSalario;
  }

  public List<Desenvolvedor> buscarPorTecnologia(String tecnologia) {
    
    List<Desenvolvedor> listaResultado = new ArrayList<>();

    for (Desenvolvedor desenvolvedor : desenvolvedores) {
      if (desenvolvedor instanceof DesenvolvedorWeb) {
        listaResultado.add(desenvolvedor);
      }
      if (desenvolvedor instanceof  DesenvolvedorMobile) {
        listaResultado.add(desenvolvedor);
      }
    }
    return listaResultado;
  }

  public Double getTotalSalariosPorTecnologia(String tecnologia) {
    Desenvolvedor desenvolvedorSalario = (Desenvolvedor) buscarPorTecnologia(tecnologia);
    return desenvolvedorSalario.calcularSalario();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getVagas() {
    return vagas;
  }

  public void setVagas(Integer vagas) {
    this.vagas = vagas;
  }


}
