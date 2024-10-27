import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conversion hacerConversion = new Conversion();
        int opcion;

        do {
            System.out.println("*****************************++++++++++++++++");
            System.out.println("Bienvenido/a al conversor de moneda.");
            System.out.println("1) Dòlar =>> peso argentino");
            System.out.println("2) Peso argentino =>> Dòlar");
            System.out.println("3) Dòlar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dòlar");
            System.out.println("5) Dòlar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dòlar");
            System.out.println("7) Salir");
            System.out.println("Elija una opciòn Vàlida.");
            System.out.println("**********************************************");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    hacerConversion.pedirDatos("usd","ars");
                    System.out.println("Ingrese la cantidad a convertir en: ");
                    double cantidad = scanner.nextDouble();
                    Moneda moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;
                case 2:
                    hacerConversion.pedirDatos("ars","usd");
                    System.out.println("Ingrese la cantidad a convertir en:");
                    cantidad = scanner.nextDouble();
                    moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;
                case 3:
                    hacerConversion.pedirDatos("usd","brl");
                    System.out.println("Ingrese la cantidad a convertir");
                    cantidad = scanner.nextDouble();
                    moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;
                case 4:
                    hacerConversion.pedirDatos("brl","usd");
                    System.out.println("Ingrese la cantidad a convertir");
                    cantidad = scanner.nextDouble();
                    moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;
                case 5:
                    hacerConversion.pedirDatos("usd","cop");
                    System.out.println("Ingrese la cantidad a convertir");
                    cantidad = scanner.nextDouble();
                    moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;
                case 6:
                    hacerConversion.pedirDatos("cop","usd");
                    System.out.println("Ingrese la cantidad a convertir");
                    cantidad = scanner.nextDouble();
                    moneda = hacerConversion.convertirMoneda(cantidad);
                    System.out.println("Cantidad convertida: " + moneda.conversion_result()+" "+moneda.target_code());
                    break;

                default:
                    System.out.println("Ocion invalida intentalo de nuevo");




            }



        }while (opcion!=7);
        scanner.close();


    }
}
