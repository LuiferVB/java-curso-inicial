import java.util.Scanner;
public class MultyDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        //PREGUNTA AL USUARIO LAS OPCIONES DISPONIBLES
        System.out.println("Ingrese 1 para ver tabla de multiplicar: ");
        System.out.println("Ingrese 2 para ver tabla de division: ");
        System.out.println("Ingrese 3 para ver tabla de multiplicacion y division: ");

        int caso = scanner.nextInt(); //LEE COMO DATO DE ENTRADA LA OPCION ESCOGIDA

        switch (caso) {
            case 1:   //MULTIPLICACION
            do{ 
            
                System.out.println("Ingrese un numero del 1 al 10 para ver su tabla de multiplicar ");
                int n = scanner.nextInt();
                if (n>0) {   //VALIDACION PARA NUMEROS POSITIVOS
                    System.out.println("tabla de multiplicar de "+n);
                  for (int i =1;i<=10;i++){
                     System.out.println(n+" x "+i+" = "+(n*i));
                  }
                }
                else{
                    System.out.println("Ingrese Solo Valores Positivos ");
                }
                System.out.println("¿Desea ver otra tabla? (S/N) ");
                respuesta = scanner.next();
            }while(respuesta.equalsIgnoreCase("S"));
            System.out.println("Gracias por Usar el Programa ");
            scanner.close();
                break;

            case 2:   //DIVISION
            do{ 
                int s = 0;
                System.out.println("Ingrese un numero del 1 al 10 para ver su tabla de dividir ");
                int n = scanner.nextInt();
                if (n>0) {  //VALIDACION PARA NUMEROS POSITIVOS
                    System.out.println("tabla de dividir de "+n);
                    for (int i =1;i<=10;i++){
                     s=s+n;
                     System.out.println(s+" / "+n+" = "+(s/n));
                    }
                }
                System.out.println("¿Desea ver otra tabla? (S/N) ");
                respuesta = scanner.next();
            }while(respuesta.equalsIgnoreCase("S"));
            System.out.println("Gracias por Usar el Programa ");
            scanner.close();
    
                break;
            case 3:    //MULTIPLICACION Y DIVISION
             do {
                    int s = 0;
                    System.out.println("Ingrese un numero del 1 al 10 para ver su tabla de multiplicacion y division ");
                    int n = scanner.nextInt();
                    int m=n;
                    if ((n>0) && m>0) {
                      System.out.println("tabla de la multiplicacion y division de "+n+" son:");
                      System.out.println("--------------");
                      System.out.println("MULTIPLICACION");
                      for (int i =1;i<=10;i++){
                         System.out.println(n+" x "+i+" = "+(n*i));
                      }
                      System.out.println("-------------");
                      System.out.println("DIVISION");
                      for (int j =1;j<=10;j++){
                         s=s+m;
                         System.out.println(s+" / "+m+" = "+(s/m));
                      }
                    }
                    else {
                        System.out.println("Ingrese Solo Valores Positivos ");
                    }
                    System.out.println("¿Desea ver otra tabla? (S/N) ");
                    respuesta = scanner.next();
                } while (respuesta.equalsIgnoreCase("S"));
                System.out.println("Gracias por Usar el Programa ");
                scanner.close();
                break;

            default:   // OTRA OPCION
                System.out.println("Opcion No Valida!");
                System.out.println("FIN!");
                
                break;
        }
    }
}