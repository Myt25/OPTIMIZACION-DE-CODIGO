/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizaciondecodigoejercicios;

/**
 *
 * @author Hyundai
 */
public class OptimizacionDeCodigoEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //EJERCICIO 1: --> CICLO
       int value= 0;
        //SIN OPTIMIZAR
        do
{
   int item = 10;
    
   value = value + item;
    System.out.println(value);
} while(value<100);
        //OPTIMIZADO SERA
        int item = 10;//las dos variables se encuentra n afuera y se toman de manera global
        //le evita mas trabajo a la hora de analizar el ciclo
do
{
        //OPTMIZADO
   value = value + item; 
} while(value<100);
     */
        //****************************************
        
        /*
        EJERCICIO 2: -->
        OPTIMIZACION LOCAL
        //SIN OPTIMIZAR
        int i,j;
        i = 2;
        j = i + 1;
         System.out.println(j);
        
         //OPTIMIZADO
        int i;
        int j;
        i = 2;
        j = i + 1;
         System.out.println(j);
*/
        //*************************************
        
        /*
        EJERCICIO 3:
        OPTIMIZACION LOCAL
        
        //SIN OPTIMIZAR
        int i;
        i = 3 + 2;
        System.out.println(i);
        //OPTIMIZADO
        int i = 3;
        int j = i + 2;
        System.out.println(j);
*/
        //***************************************
        /*
        EJERCICIO 4:
        OPTIMIZACION LOCAL
        
        //SIN OPTIMIZAR
        int x,y,a,b,c;
        x = 1;
        y = 2;
a = x + y;
b = 5;
c = (a + b)/2;
        System.out.println(c);

//OPTIMIZADO
int x,y,a,b,c;
 x= 1;
 y= 2;
 b = 5;
 c= ((x +y)+b)/2;
        System.out.println(c);
*/
        //*****************************
        /*
        EJERCICIO 5:
        OPTIMIZACION LOCAL
        BUCLES
        
        //SIN OPTIMIZAR
        int resultado;
        for (int i = 0; i < 10; i++) {
            int k,m;
            k = 2;
            m = 1;
            resultado = i * k + m;
            System.out.println(resultado);
        }
        
        //OPTIMIZADO
        int resultado, m,k;
        m = 2;
        k = 3;
        int count = m;
        for (int i = 0; i < 10; i++) {
            resultado = count;
            count += k;
            System.out.println(count);
        }
*/
        //********************************************
        /*
        //EJERCICIO 6:
        //OPTIMIZACION BUCLES
        
        //SIN OPTIMIZAR
        for (int i = 0; i < 10; i++) {
            int precision,simple,resultadosimple, resultadodoble;
            precision = 2;
            simple = 2;
            
            if (precision == simple) {
                resultadosimple = 1 * i;
            }else{
                resultadodoble = 2 * i;
            }
        }
        //OPTIMIZADO
        int precision = 2;
        int simple = 2;
        int resultadosimple, resultadodoble;
        if (precision == simple) {
            for (int i = 0; i < 10; i++) {
                resultadosimple = 1 * i;
            }
        }else{
            for (int i = 0; i < 10; i++) {
                resultadodoble = 2 * i;
            }
        }
        */
        
        //**************************************************
        /*
        //EJERCICIO 7:
        //OPTIMIZACION DE BUCLES
        
        //SIN OPTIMIZAR
        for (int i = 0; i < 10; i++) {
            int acumulador;
            if (i ==0) {
                acumulador = 0;
                acumulador += i;
                System.out.println(acumulador);
            }
        }
        
        //OPTIMIZADO
        int acumulador = 0;
        for (int i = 0; i < 10; i++) {
            acumulador += i;
        }
        System.out.println(acumulador);
*/
        
        //**************************************
        /*
        EJERCICIO 8:
        OPTIMIZACION DE BUCLES
        
        
        //SIN OPTIMIZAR
                for (int i = 0; i < 10; i++) {
            int acumulador = 2;
            
            acumulador += i;
            System.out.println(acumulador);
        }
        
        //OPTIMIZADO
        int factor = 10;
        for (int i = 0; i < 10; i+=factor) {
            int acumulador = 2;
            acumulador += i;
            acumulador += i + 1;
            acumulador += i + 2;
            acumulador += i + 3;
            acumulador += i + 4;
            acumulador += i + 5;
            acumulador += i + 6;
            acumulador += i + 7;
            acumulador += i + 8;
            acumulador += i + 9;
            System.out.println(acumulador);
        }
*/
        //***************************************************
        /*
        EJERCICIO 9:
        OPTIMIZACION DE BUCLES
        
        //SIN OPTIMIZAR
        for (int i = 0; i < 10; i++) {
            int m=100, n = 10,resultado;
            resultado = 100 * m + 10 * n * i;
            System.out.println(resultado);
        }
        //OPTMIZADO
        int t1,t2,M=100,N=10,resultado;
        t1 = 100 * M;
        t2 = 10 * N;
        for (int i = 0; i < 10; i++) {
            resultado = t1 * t2 * i;
            System.out.println(resultado);
        }
        */
        
        //************************************************************
        /*
        EJERCICIO 10:
        OPTIMIZACION DE BUCLES
        
        //SIN OPTIMIZAR
        int numeros[] = new int[10];
        int acumulador;
        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
        }
        acumulador = 0;
        for (int i = 0; i < 10; i++) {
            acumulador += numeros[i];
            System.out.println(acumulador);
        }
        
        //OPTIMIZADO
        int acumulador = 0;
        int numeros[] = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
            acumulador += numeros[i];
            System.out.println(acumulador);
        }
*/
    }

}
