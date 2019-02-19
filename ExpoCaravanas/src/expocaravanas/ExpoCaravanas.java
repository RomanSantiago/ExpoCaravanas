/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;
import java.util.*;
/**
 *
 * @author Milzork
 */
public class ExpoCaravanas 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        Ventas zona1=new Ventas(1000);
        Ventas zona2=new Ventas(200);
        Ventas zonaVip=new Ventas(25);
        
        int election=0;
        
        do 
        {   //menu, con un next line para que no de error al meter letras, se hace un conversor de String para Int, de esta manera no habra problemas
            System.out.println("1.- Mostrar entradas libres");
            System.out.println("2.- Comprar entradas");
            System.out.println("3.- Salir");
            
            //Try catch para que el error no salga si pones texto en vez de numeros (todos los try catch son para eso)
            try
                {
                String election1=sc.nextLine();
                election=Integer.parseInt(election1);
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error, pon un numero del 1 al 3");
                        election=3;
                    }
            
            int eleczone=0;
            //visibilizar los tickets restantes 
            if(election==1)
            {
                System.out.println("Quedan "+zona1.getTicket()+" en la zona principal, "+zona2.getTicket()+" en la zona de compra-venta, y "+zonaVip.getTicket()+" en la zona vip");  
            }
            //Siguiente menu para que se puedan comprar entradas, se integran de la misma manera que el otro menu.
            else if(election==2)
            {
                System.out.println("Escoja una zona");
                System.out.println("1.- Zona principal");
                System.out.println("2.- Zona compra-venta");
                System.out.println("3.- Zona Vip");
                          
                try
                {
                String electionZone=sc.nextLine();
                eleczone=Integer.parseInt(electionZone);
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error, pon un numero del 1 al 3");
                        election=3;
                    }
            }
                if(eleczone==1)
                {
                    System.out.println("¿Cuantas entradas desea?"); 
                    int elecTicket = 0;
                    try
                {
                    String elecTicketStr=sc.nextLine();
                    elecTicket=Integer.parseInt(elecTicketStr);
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error, solo se pueden comprar entradas con numeros enteros.");
                        election=3;
                    }
                    
                        if(elecTicket >0 || elecTicket >1000)
                        {
                            zona1.sell(elecTicket);
                            System.out.println("entradas conmpradas");
                        }    
                        else System.out.println("No hay tantas entradas.");
                }
                
                
                
                if(eleczone==2)
                {
                    System.out.println("¿Cuantas entradas desea?"); 
                    int elecTicket = 0;
                    try
                {
                    String elecTicketStr=sc.nextLine();
                    elecTicket=Integer.parseInt(elecTicketStr);
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error, solo se pueden comprar entradas con numeros enteros.");
                        election=3;
                    }
                    
                        if(elecTicket >0 || elecTicket >200)
                        {
                            zona1.sell(elecTicket);
                            System.out.println("entradas conmpradas");
                        }
                        else System.out.println("No hay tantas entradas.");
                }
                
                
                
                if(eleczone==3)
                {
                    System.out.println("¿Cuantas entradas desea?"); 
                    int elecTicket = 0;
                    try
                {
                    String elecTicketStr=sc.nextLine();
                    elecTicket=Integer.parseInt(elecTicketStr);
                }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error, solo se pueden comprar entradas con numeros enteros.");
                        election=3;
                    }
                    
                        if(elecTicket >0 || elecTicket >25)
                        {
                            zona1.sell(elecTicket);
                            System.out.println("entradas conmpradas");
                        }
                        else System.out.println("No hay tantas entradas.");
                }
                
                  
            }while(election!=3);                                      
        }
}
