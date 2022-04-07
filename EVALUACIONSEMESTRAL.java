/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion.semestral;
import java.util.Scanner;
/**
 *
 * @author roddy
 */
public class EVALUACIONSEMESTRAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int evs;
        
        System.out.println("MENU PRINCIPAL");
        System.out.println("Evaluacion Semestral");
        System.out.println("1.- Calcular el perímetro de un triangulo equilatero");
        System.out.println("2.- Calcular el area de un circulo");
        System.out.println("3.- Multiplicacion de dos numeros, si es menor a 40 dividir para 2,");
        System.out.println("caso contrario dividir para 4.");
        System.out.println("4.- Promedio de 5 notas");
        System.out.println("5.- Salir");
        
        Scanner g1= new Scanner(System.in);
        evs = g1.nextInt();
        switch (evs) {
            case 1:
                double ld1;
                double res;
              System.out.println("");
              System.out.println("Calcular el perímetro de un triangulo equilatero");
              System.out.println("Ingrese un lado del triangulo equilatero en centrimetros");
              ld1 = g1.nextDouble();
              res= ld1*3;            
              System.out.println("");
              System.out.println("El perimetro del triangulo equilatero es");
              System.out.print("de "+res);
              System.out.println(" cm");
                break;
            case 2:
                double r1;
                double ar;
              System.out.println("");
              System.out.println("Calcular el area de un circulo");
              System.out.println("Ingrese el valor del radio en centimetros");
              r1= g1.nextDouble();
              ar= r1*r1*Math.PI;
              System.out.println("");
              System.out.println("El area del circulo es");
              System.out.print("de "+ar);
              System.out.println(" cm2");
              break;
            case 3:
                double n1;
                double n2;
                double res1;
                double res2;
              System.out.println("");
              System.out.println("Multipliacacion de dos numeros, si es mayor a 40 dividir para 2 caso contrario dividir para 4");
              System.out.println("Ingrese el primer numero: ");
              n1=g1.nextDouble();
              System.out.println("Ingrese el segundo numero: ");
              n2=g1.nextDouble();
              res1=n1*n2;
              if (res1<40){
                    System.out.println("");
                    System.out.println("El resultado de la multiplicacion es: "+res1);
                    System.out.println("Como el resultado es menor a 40 de dividira para 2 ");
                    res2 = res1/2;
                    System.out.println("");
                    System.out.println("El resultado es: "+res2);
                    System.out.println("");
                    
                }
                else{
                    System.out.println(""); 
                    System.out.println("El resultado de la multiplicacion es: "+res1);
                    System.out.println("Como el resultado es mayor a 40 de dividira para 4 ");
                    res2 = res1/4;
                    System.out.println("");
                    System.out.println("El resultado es: "+res2);
                    System.out.println("");
                }
                 
                 break;
            case 4:
                double nt1;
                double nt2;
                double nt3;
                double nt4;
                double nt5;
                double prom;
                System.out.println("");
                System.out.println("Promedio de 5 notas");
                System.out.println("Ingrese nota 1");
                nt1=g1.nextDouble();
                System.out.println("Ingrese nota 2");
                nt2=g1.nextDouble();
                System.out.println("Ingrese nota 3");
                nt3=g1.nextDouble();
                System.out.println("Ingrese nota 4");
                nt4=g1.nextDouble();
                System.out.println("Ingrese nota 5");
                nt5=g1.nextDouble();
                prom=(nt1+nt2+nt3+nt4+nt5)/5;
                if(prom>=7){
                 System.out.println("");
                 System.out.println("Su promedio es:"+prom);
                 System.out.println("Usted a Aprobado el semestre");
                 System.out.println(""); 
                 break;
                }
                 System.out.println("");
                 System.out.println("Su promedio es:"+prom);
                 System.out.println("Usted a Reprobado el semestre");
                 System.out.println("");  
                break;
            default:
                 System.out.println("");
                 System.out.println("Ha salido del menu");
                 System.out.println("Buen dia");
                 System.out.println("");  
        }
        System.out.println(""); 
        System.out.println("Realizado por: AC, EC, RC, AG ");
                 
    }
    
}
