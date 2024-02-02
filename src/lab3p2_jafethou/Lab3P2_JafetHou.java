package lab3p2_jafethou;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3P2_JafetHou {

    static Scanner lea = new Scanner (System.in);
    static Scanner leer = new Scanner (System.in);
    static Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        ArrayList <Pokemon> pokemones  = new ArrayList();
        
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
        System.out.println("Que tipo de pokemon desea agregar\n"
                + "1) Fire\n"
                + "2) Water\n"
                + "3) Grass\n");
        
        int num = lea.nextInt();
        
        if(num == 1){
            tipo = "Fire";
            System.out.println("Ingrese poder de ataque: ");
            int ataque = lea.nextInt();
            
        }else if(num == 2){
            tipo = "Water";
        }else if(num == 3){
            tipo = "Grass";
        }else{
            System.out.println("Numero incorrecto ingrese nuevamente ");
            crear(pokemones);
        }
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese numero en la pokedex: ");
        int pokedex = lea.nextInt();
        
        System.out.println("Ingrese la naturaleza del pokemon: ");
        String naturaleza = scanner.nextLine();
        
        pokemones.add((Fuego) new Fuego(
        
    return pokemones;
    }
    
}
