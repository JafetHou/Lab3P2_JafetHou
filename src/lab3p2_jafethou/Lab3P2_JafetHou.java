package lab3p2_jafethou;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab3P2_JafetHou {

    static Scanner lea = new Scanner (System.in);
    static Scanner leer = new Scanner (System.in);
    static Scanner scanner = new Scanner (System.in);
    static Random ran = new Random ();
    
    public static void main(String[] args) {
        
        ArrayList <Pokemon> pokemones  = new ArrayList();
        ArrayList <Pokebola> pokebolas  = new ArrayList();
        
        boolean seguir = true;
        
        while(seguir){
            
            System.out.println("MENU\n"
                    + "1) Crear pokemon\n"
                    + "2) Crear pokebola\n"
                    + "3) Listar pokemon\n"
                    + "4) Eliminar pokemon\n"
                    + "5) Capturar pokemon\n"
                    + "6) Modificar pokemon\n"
                    + "Ingrese [7] para salir: ");
            int opc = lea.nextInt();
            
            switch(opc){
                
                case 1:{
                    
                    crear(pokemones);
                    
                    break;
                }
                case 2:{
                    
                    agregarpokebola(pokebolas);
                    
                    break;
                }
                case 3:{
                    
                    if(pokemones.size() > 0){
                        
                        listar(pokemones);
                        
                    }
                    
                    break;
                }
                case 4:{
                    
                    if(pokemones.size() > 0){
                        
                        eliminar(pokemones);
                    
                    }
                    
                    break;
                }
                
                case 5:{
                    
                    if(pokemones.size()>0 && pokebolas.size() > 0){
                        
                        capturar(pokemones,pokebolas);
                        
                    }else{
                        System.out.println("Faltan pokebolas o pokemones que agregar");
                    }
                    
                    break;
                }
                
                case 7:{
                    seguir = false;
                    break;
                }
            }
            
        }
        
        
    }
    
    public static ArrayList crear(ArrayList <Pokemon> pokemones){
        
        String tipo ="";
        int ataque = 0;
        boolean nada = false;
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese numero en la pokedex: ");
        int pokedex = lea.nextInt();
        
        System.out.println("Ingrese la naturaleza del pokemon: ");
        String naturaleza = scanner.nextLine();
        
        System.out.println("Que tipo de pokemon desea agregar\n"
                + "1) Fire\n"
                + "2) Water\n"
                + "3) Grass\n");
        
        int num = lea.nextInt();
        
        if(num == 1){
            tipo = "Fire";
            System.out.println("Ingrese poder de ataque: ");
            ataque = lea.nextInt();
            
            pokemones.add((Fuego) new Fuego(ataque, tipo, nombre, pokedex, naturaleza, false));
            
        }else if(num == 2){
            tipo = "Water";
            
            System.out.println("Ingrese si puede vivir en el agua [si/no]: ");
            String vivir = scanner.nextLine();
            
            if(vivir.equalsIgnoreCase("si")){
                nada = true;
            }else{
                nada = false;
            }
            
            System.out.println("ingrese la velocidad en el agua: ");
            int velocidad = lea.nextInt();
            
            pokemones.add((Agua) new Agua(nada, velocidad, tipo, nombre, pokedex, naturaleza, false));
            
            
        }else if(num == 3){
            tipo = "Grass";
            
            System.out.println("Ingrese el nombre de su habitat: ");
            String habitat = scanner.nextLine();
            
            System.out.println("Ingrese su dominio sobre plantas [0-100]: ");
            int dominio = lea.nextInt();
            
            if(dominio>=0 && dominio<=100){
                pokemones.add((Planta) new Planta(habitat, dominio, tipo, nombre, pokedex, naturaleza, false));
            }else{
                System.out.println("numero de dominio incorrecto ");
            }
            
        }else{
            System.out.println("Numero incorrecto ingrese nuevamente ");
            crear(pokemones);
        }
           
        return pokemones;
    }
    
    public static ArrayList agregarpokebola(ArrayList <Pokebola> pokebolas){
        
        System.out.println("Ingrese el color de la pokebola: ");
        String color = scanner.nextLine();
        
        System.out.println("Iingrese numero de serie de la pokebola: ");
        int serie = lea.nextInt();
        
        System.out.println("Ingrese su numero de eficiencia del [1-3]: ");
        int num = lea.nextInt();
        
        if(num >= 1 && num <= 3){
            
            pokebolas.add((Pokebola) new Pokebola(color, serie, num));
            
        }else{
            
            System.out.println("Numero de eficiencia equivocado");
        
        }
        
        return pokebolas;
    }
    
    public static void listar(ArrayList <Pokemon> pokemones){
        int i = 1;
        for (Pokemon p : pokemones) {
            if(p.getTipo().equalsIgnoreCase("Fire")){
                System.out.println(i+") "+p.toString());
                i=i+1;
            }
            
        }
        for (Pokemon p : pokemones) {
            if(p.getTipo().equalsIgnoreCase("Water")){
                System.out.println(i+") "+p.toString());
                i=i+1;
            }
            
        }
        for (Pokemon p : pokemones) {
            if(p.getTipo().equalsIgnoreCase("Grass")){
                System.out.println(i+") "+p.toString());
                i=i+1;
            }
            
        }
    }
    
    public static void eliminar(ArrayList <Pokemon> pokemones){
        
        String tipo = "";
        
        System.out.println("Ingrese el tipo de pokemon a eliminar: \n"
                + "1) Fire\n"
                + "2) Water\n"
                + "3) Grass\n");
        
        int num = lea.nextInt();
        
        if(num == 1){
            tipo = "Fire";
        }else if(num == 2){
            tipo = "Water";
        }else if (num == 3){
            tipo = "Grass";
        }else{
            System.out.println("Numero Incorrecto");
        }
        
        if(tipo != ""){
            int i = 0;
            for (Pokemon p: pokemones) {
                if(p.getTipo().equals(tipo)){
                    System.out.println(i+") "+ p.toString());
                    i = i+1;
                }
            }
            
            System.out.println("Ingrese el numero de pokedex del pokemon a eliminar: ");
            int indice = lea.nextInt();
            
            if(indice == 0 || indice>= 0 && indice <= i){
            
                if(tipo.equalsIgnoreCase("Fire") ){
                    
                    for (Pokemon p : pokemones) {
                        
                        if (pokemones.get(indice) instanceof Fuego) {
                            
                            pokemones.remove(indice);
                            
                        }
                    }
                
                
                }else if(tipo.equalsIgnoreCase("Water") ){
                    
                    for (Pokemon p : pokemones) {
                        
                        if (pokemones.get(indice) instanceof Agua) {
                            
                            pokemones.remove(indice);
                            
                        }
                    }
                
                
                }else if(tipo.equalsIgnoreCase("Grass") ){
                    
                    for (Pokemon p : pokemones) {
                        
                        if (pokemones.get(indice) instanceof Planta) {
                            
                            pokemones.remove(indice);
                            
                        }
                    }
                }

            }else{
                System.out.println("Ingreso un indice fuera de lugar ");
            }
        }
    }
    
    public static ArrayList capturar(ArrayList <Pokemon> pokemones, ArrayList <Pokebola> pokebolas){
        
        int i = 0;  
        int random = 1+ran.nextInt(3);
        
        for (Pokebola p : pokebolas) {
                
            System.out.println(i+") "+ p.toString());
            i=i+1;
        }
        
        System.out.println("Ingrese el numero de pokebola que desea usar: ");
        int numpokebola = lea.nextInt();
           
        int num = ran.nextInt(pokemones.size());
        System.out.println(num);
        System.out.println("random: "+random);
        
        System.out.println("EL POKEMON "+pokemones.get(num).nombre+" HA APARECIDO");
        
        System.out.println("Desea 1) capturar o 2) huir: ");
        int opc = lea.nextInt();
        
        if(opc == 1){
            if(pokebolas.get(numpokebola).getEficiencia()>=random){
                System.out.println("Pokemon atrapado");
                pokemones.get(num).setAtrapado(true);
                pokebolas.remove(numpokebola);
                
            }else{
                System.out.println("Pokemon no atrapado");
                pokebolas.remove(numpokebola);
            }
            
        }else if(opc == 2){
            return pokemones;
        }
    }
        
        
    }
    
}
