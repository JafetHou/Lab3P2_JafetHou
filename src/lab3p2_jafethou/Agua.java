
package lab3p2_jafethou;


public class Agua extends Pokemon{
    
    protected boolean nada;
    protected int velocidad;

    public Agua(boolean nada, int velocidad, String tipo, String nombre, int pokedex, String naturaleza, boolean atrapado) {
        super(tipo, nombre, pokedex, naturaleza, atrapado);
        this.nada = nada;
        this.velocidad = velocidad;
    }

    public boolean isNada() {
        return nada;
    }

    public void setNada(boolean nada) {
        this.nada = nada;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public String nadar(){
        if(nada == true){
            return "si";
        }else{
            return "no";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", nadar: " + nadar() + ", velocidad: " + velocidad + '}';
    }
    
    
    
}
