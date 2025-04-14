/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programayankay;

/**
 *
 * @author Usuario
 */

import java.util.Scanner; 
public class ProgramaYankay {

    public static void main(String[] args) {
       //PROGRAMA NOTAS YANKAY-Espoch
        Scanner num = new Scanner(System.in);
        float b;
        float a;
        float evaluacion; 
        float acumulativo ; 
        float promedioF; 
        int opcion = 0; 
        int matricula =0; 
        
        do{
        System.out.println("Bienvenido al sistema de calificaciones Espoch");
        System.out.println("Asignaturas");
        System.out.println("1. Ingles II");
        System.out.println("2. Calculo I");
        System.out.println("3. Programacion");
        System.out.println("4. Comunicacion Oral y escrita");
        System.out.println("5. Administracion Sistemas Operativos");
        System.out.println("6. Arquitectura de la informacion");
        System.out.println("7. Gestion de proyectos TI");
        System.out.println("Elija una opcion (1-7); ");
        opcion = num.nextInt (); 
        if (opcion >7 || opcion <1){
            System.out.println("Error: asignatatura no verificada");
        }
        } while (opcion >7 || opcion <1);
     
        switch (opcion){
            case 1: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Ingles II");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio1= (a+b)/2; 
                System.out.println(":|"+ promedio1 + "|");
                if (promedio1 >7 && promedio1 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio1 <7 && promedio1 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio1 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio1)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }             
            break; 
            case 2: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Calculo I");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio2= (a+b)/2;
                System.out.println(":|"+ promedio2 + "|");
                if (promedio2 >7 && promedio2 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio2 <7 && promedio2 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio2 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio2)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
            break; 
            case 3: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Programacion");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio3= (a+b)/2;
                System.out.println(":|"+ promedio3 + "|");    
                if (promedio3 >7 && promedio3 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio3 <7 && promedio3 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio3 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio3)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
                
            break; 
            case 4:
                System.out.println("||||INFORMACION||||");
                System.out.println("Comunicacion Oral y Escrita");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio4= (a+b)/2;
                System.out.println(":|"+ promedio4 + "|");
                if (promedio4 >7 && promedio4 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio4 <7 && promedio4 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio4 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio4)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
            break; 
            case 5: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Administracion Sistemas Operativos");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio5= (a+b)/2;
                System.out.println(":|"+ promedio5 + "|");
                if (promedio5 >7 && promedio5 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio5 <7 && promedio5 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio5 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio5)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
            break; 
            case 6: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Arquitectura de la informacion");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio6= (a+b)/2;
                System.out.println(":|"+ promedio6 + "|");
                if (promedio6 >7 && promedio6 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio6 <7 && promedio6 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio6 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio6)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
            break; 
            case 7: 
                System.out.println("||||INFORMACION||||");
                System.out.println("Gestion de proyectos TI");
                System.out.println("Matricula (1-2)");
                do {
                matricula = num.nextInt ();
                if (matricula <1 || matricula >2 ){
                    System.out.println("Matricula invalida.");
                }
                } while (matricula >2 || matricula <1);
                System.out.println("Paralelo: 1");
                System.out.println("Pao 2");
                System.out.println("||||ACUMULATIVO||||");
                System.out.println("CICLO 1 (10 pts)");
                do{
                a = num.nextFloat();
                if (a > 10 || a <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (a > 10 || a <0);
                System.out.println("CICLO 2 (10 pts)");
                do {
                b = num.nextFloat();
                if (b > 10 || b <0)
                {
                    System.out.println("Error: nota fuera del limite");
                }
                } while (b >10 || b <0);
                System.out.println("ASISTENCIA (%)");
                System.out.println("100%");
                System.out.println("PROMEDIO");
                float promedio7= (a+b)/2;
                System.out.println(":|"+ promedio7 + "|");
                if (promedio7 >7 && promedio7 <=10)
                {
                    System.out.println("APROBADO");
                } else if (promedio7 <7 && promedio7 >=0)
                {
                    System.out.println("REPROBADO");
                    System.out.println("||||RECUPERACION||||");
                    System.out.println("ACUMULATIVO:");
                    System.out.println(":|"+ promedio7 + "|"); 
                    System.out.println("EVALUACION: (Suspenso)");
                    evaluacion = num.nextFloat();
                    System.out.println("PROMEDIO");
                    promedioF = (evaluacion + promedio7)/2; 
                    if (promedioF < 7 )
                    {
                        System.out.println(":|"+promedioF+"|");
                        System.out.println("REPROBADO");
                    } else if (promedioF >= 7)
                    {
                        System.out.println(":|"+ promedioF +"|");
                        System.out.println("APROBADO");
                    }
                }
            break; 
        }
       
        
    }
}
