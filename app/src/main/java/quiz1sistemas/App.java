package quiz1sistemas;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
    
    System.out.println("ingrese el tipo de boleta (G,V): ");
    String tipodeboleta = scanner.nextLine();
    System.out.println("ingrese la cantidad de boletas: ");
    int cantidadBoletas = scanner.nextInt();
    System.out.println("ingrese el numero del combo (1,2 0 3)");
    int numeroCombo = scanner.nextInt();
    System.out.println("ingrese la cantidad de combos: ");
    int cantidadCombos = scanner.nextInt();
    scanner.nextLine();

    int precioBoleta;
    if (tipodeboleta == "G") {
        precioBoleta =10000 * cantidadBoletas;
        
    }   else {
        precioBoleta = 15000 *cantidadBoletas;
    } 
    int combo;
    int valorCombo;
    switch (numeroCombo) {
        case 1:
            valorCombo = 40000 * cantidadCombos;
            break;
        case 2:
        valorCombo = 30000 * cantidadCombos;
        break;
        case 3:
        valorCombo = 42000 *cantidadCombos;
        break;
        default:
            valorCombo = 0;
    }
    double descuento = 0;
    if (tipodeboleta == "v") {
        switch (numeroCombo) {
            case 1: descuento = (double) (valorCombo * 0.05);
                
                break;
                case 2: descuento = (double)(valorCombo * 0.06);
                break;
        case 3: descuento = (double)(valorCombo * 0.03);
        break;
            default:
            descuento = 0;
                
    
        
        }   
    }
    double valortotal = valorCombo + precioBoleta - descuento;
System.out.println("el precio total es: " + valortotal);


    }
}
// miguel lopez



