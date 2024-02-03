
package lab3p2_jafethou;


public class Planta extends Pokemon{
    
    protected String habitat;
    protected int dominio;

    public Planta(String habitat, int dominio, String tipo, String nombre, int pokedex, String naturaleza, boolean atrapado) {
        super(tipo, nombre, pokedex, naturaleza, atrapado);
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat: " + habitat + ", dominio: " + dominio + '}';
    }
    
    
}
