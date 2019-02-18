/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

/**
 *
 * @author Milzork
 */
public class Ventas 
{
    private int Ticket=0;

    public Ventas() 
    {
        
    }
    
    public Ventas(int Ticket) 
    {
        this.Ticket=Ticket;
    }
    
    public int getTicket() 
    {
        return Ticket;
    }

    public void setTicket(int Ticket) 
    {
        this.Ticket = Ticket;
    }
    
        public boolean verify(int number)
    {
        boolean Ticket=true;
        
        if((this.Ticket -number)>0)
        {
            Ticket=true;
        }
        else
        {
            Ticket=false;
        }
        
        return Ticket;
    }
    
    public int sell(int number)
    {
        if(verify(number)==true)
        {
            this.Ticket -=number;
        }
        
        else if(verify(number)==false)
        {
            System.out.println("No quedan entradas, lo sentimos mucho");
        }
        
        return this.Ticket;
    }
}
