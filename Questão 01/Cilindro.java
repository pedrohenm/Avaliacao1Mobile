/* (b)
Utilizando o conceito de _composição_, crie uma classe `Cilindro` 
que tenha um atributo `base` de tipo `Circulo`, e um atributo `altura` 
de tipo `double`. Crie um _construtor_ para essa classe, que não receba 
parâmetros. Este construtor deve configurar o valor de 
`altura` para `1.0` e deve inicializar a `base` (criar o objeto).
*/
public class Cilindro {
    private Circulo circulo;
    private double Altura;
    
    public void Cilindro(){
        this.Altura = 1.0;
        circulo = new Circulo();
    }
}
