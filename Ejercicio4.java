revision codigo 4revision codigo 4

package com.generation;

public class Codigo4 {
//agregando el metodo main
     public static void main(String[] args) {
    
//poniendo System.in a los scanners
//modificando nombre de las variables para que sean mas entendibles
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        Scanner jugador1 = new Scanner(System.in);
        String j1 = jugador1.nextLine();

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        Scanner jugador2 = new Scanner(System.in);
        String j2 = jugador2.nextLine();
        
//reemplazando el switch por estructura else if mucho mas entendible
        if(j1 == j2){
            System.out.println("ES UN EMPATE!");
        }else if((j1 == "piedra" && j2 == "tijera") || (j1 == "tijera" && j2 == "piedra" )){
            System.out.println("La piedra le ganó al papel!");
        } else if ((j1 == "papel" && j2 == "tijera") || (j1 == "tijera" && j2=="papel")) {
            System.out.println("Tijera le ganó a papel!");
        } else if ((j1 == "papel" && j2 == "pieda") || (j1 == "piedra" && j2 == "papel")) {
            System.out.println("El papel le gana a la piedra!");
        }
  }
  
}
