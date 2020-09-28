/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {
    
    private Jogador Pedro;
    private Jogador Leticia;
    private Baralho Baralho;
    private Carta cartaVirada;
    
    public void Truco(){
        Pedro = new Pedro();
        Leitica = new Leitica();
        Baralho = new Baralho();
    }
    
    private void embaralharCartas(){
        Baralho.embaralhar();
    }
    
    private void distribuirMaos(){
        for(int i = 0; i < 3){
            Pedro.receberCarta(Baralho.distribuir());
            Leticia.receberCarta(Baralho.distribuir());
        }  
    }
    
    private void inicializaManilha(){
        cartaVirada = Baralho.distribuir();
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }    
}
