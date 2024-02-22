import java.util.Scanner;

public class NumerosIguais {
            public static void main (String [] args){

                int numeroA=0;
                int numeroB=0;
                
                
                try (Scanner scan = new Scanner(System.in)) {
                    System.out.println(" Digite Número A: ");
                    numeroA=scan.nextInt();

                    System.out.println(" Digite Número B:");
                    numeroB=scan.nextInt();
                }
        

               if (numeroA==numeroB) {
                System.out.println("São iguais");
               }

               else if (numeroA!=numeroB) {
                System.out.println("Não são iguais");
                
               } }}