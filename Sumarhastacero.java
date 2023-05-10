import java.util.Scanner;

public class Sumarhastacero
{
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int input;

    public void Ejercicio2()
    {
    do {
    System.out.print("Ingrese un número (0 para salir): ");
    input = scanner.nextInt();
    sum += input;
    } while (input != 0);
    
    System.out.println("La suma de los números ingresados es: " + sum);
    }

    public static void main(String[] args) {
        Sumarhastacero rune = new Sumarhastacero();
        rune.Ejercicio2();
    }
}