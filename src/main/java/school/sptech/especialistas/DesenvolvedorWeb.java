package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {

  private String backend;
  private String frontend;
  private String sgbd;
  private Integer horasMentoria;

  @Override
  public Double calcularSalario() {
    return super.calcularSalario() + (horasMentoria * 300);
  }

  public Boolean isFullstack() {
    if (backend == null || frontend == null || sgbd == null) {
      return false;
    } else {
      return true;
    }
  }

}
