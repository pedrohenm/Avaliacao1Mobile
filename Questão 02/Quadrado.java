/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria{
  private double Lado;
  
  public Quadrado(double lado){
    this.Lado = lado;
  }
  
  @Override
  public double getPerimetro() {
    return (4.0 * this.Lado);
  }

  @Override
  public double getArea() {
    return (this.Lado * this.Lado);
  }

}
