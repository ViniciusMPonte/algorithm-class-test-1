import java.util.Scanner;
import java.text.DecimalFormat;

public class Increasecode {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o valor do produto: ");
        double value = scanner.nextDouble();
        System.out.print("Digite código de aumento: ");
        int code = scanner.nextInt();
        double result = 0;
        
        switch (code) {
            case 1:
                result = value * 1.10;
                break;
            case 2:
                result = value * 1.15;
                break;
            case 3:
                result = value * 1.20;
                break;
            case 4:
                result = value * 1.25;
                break;
            default:
                System.out.println("Código inválido");
                return;
        }
        System.out.println("Resultado: " + df.format(result));
    }
}