
package lab3p2_jafethou;

public class Fuego extends Pokemon{
    
    protected int ataque;

    public Fuego(int ataque, String tipo, String nombre, int pokedex, String naturaleza, boolean atrapado) {
        super(tipo, nombre, pokedex, naturaleza, atrapado);
        this.ataque = ataque;
    }

    public void mostrar(){
        System.out.println("Ataque: "+ataque);
    }
    
    public int getAtaque() {
        return ataque;
    }
    

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return super.toString() +  ", ataque: " + ataque + '}';
    }
    
    
}
