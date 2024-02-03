
package lab3p2_jafethou;


public class Pokemon {
    
    protected String tipo;
    protected String nombre;
    protected int pokedex;
    protected String naturaleza;
    protected boolean atrapado;
    protected String pokebola;

    public Pokemon() {
    }

    public Pokemon(String tipo, String nombre, int pokedex, String naturaleza, boolean atrapado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.pokedex = pokedex;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }
        

    
    
    public Pokemon(String tipo, String nombre, int pokedex, String naturaleza, boolean atrapado, String pokebola) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.pokedex = pokedex;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
        this.pokebola = pokebola;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPokedex() {
        return pokedex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public String getPokebola() {
        return pokebola;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public void setPokebola(String pokebola) {
        this.pokebola = pokebola;
    }

    @Override
    public String toString() {
        return "Pokemon{" + " nombre: " + nombre + ", tipo: " + tipo + ", pokedex: " + pokedex + ", naturaleza: " + naturaleza + ", atrapado: " + atrapado + ", pokebola: " + pokebola + ' ';
    }
    
    
    
}
