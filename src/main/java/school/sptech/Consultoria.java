package school.sptech;

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
    
  }




}
