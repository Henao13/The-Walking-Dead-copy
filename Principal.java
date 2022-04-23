import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.*;
import java.util.Collections;


public class Principal
{
    public static void Frases()
   {
    ArrayList<String> frases = new ArrayList<String>();
           frases.add("Cuando no quede mas sitio en el infierno, los muertos caminaran sobre la tierra");
       frases.add("Acércate, no muerdo… a menos que me dejes");
       frases.add("Ellos caminan, nosotros corremos");
       frases.add("He evitado a la gente como si fueran zombis, incluso antes de que lo fueran");
       frases.add("Un zombie muerto es un hombre vivo");
       frases.add("Estas rodeado de zombies. Eso son las malas noticias.");
       frases.add("No entres a la ciudad. Ahora pertenece a los muertos");
                      int indiceAleatorio = (int)(Math.random()*frases.size()); 
                      System.out.println("Su frase de zombie es: ");     
                      System.out.println(frases.get(indiceAleatorio));        
   }
   
   public static void main(String[]args)
   {
       printMenu();
       mostrarMenu();
       
   }

   
    

   
   
   public static void printMenu()
   {
       System.out.println("Ingrese una opción:");
       System.out.println("-0 Si quiere cerrar el programa");
       System.out.println("-1 Para registrar un zombie");
       System.out.println("-2 Ver la lista de zombies");
       System.out.println("-3 Para consultar la cantidad de zombies registrados");
       System.out.println("-4 Para consultar los zombies con tipo de sangre O+ o AB+");
       System.out.println("-5 Para consultar los zombies que nacieron después del 2000");
       System.out.println("-6 Disminuir a la mitad la salud de los zombies"); 
       System.out.println("-7 Para agregar una ubicación");
       System.out.println("-8 Para consultar las ubicaciones");
       System.out.println("-9 Para consultar la ubicación más segura de la ciudad");
       System.out.println("-10 Para consultar las ubicaciones de la ciudad según distancia");
       System.out.println("-11 Frase sobre zombie");
       System.out.println("-12 Ubicacion menos segura");
       System.out.println();
   }    
   
   public static void mostrarMenu()
   {
              
       
       ArrayList<Zombie> zombies= new ArrayList<Zombie>();
       Iterator<Zombie> itr = zombies.iterator();
       
       ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
       Iterator<Ubicacion> itr2 = ubicaciones.iterator();
       ArrayList<String> frases = new ArrayList<String>();
       
       Zombie z1=new Zombie();
       Ubicacion u1= new Ubicacion();
       
       
       
       
       
       
       
       int nacimiento;
       int salud;
       String nombreU;
       String nombreZ;
       String sangre;
       float distancia;
       int cantidadZ;
       
       Scanner s1= new Scanner(System.in);
       System.out.println("Comunidad de The Walking Dead");
       System.out.println();
       
       
       int x=12;
       while(x!=0)
       {
           x=s1.nextInt();
           String str1=s1.nextLine();
           switch(x)
           {
                case 0:
                    break;
               
                case 1:
                   System.out.println();
                   System.out.println("Ingrese el nombre del zombie:");
                   nombreZ = s1.nextLine();
                   
                   System.out.println("Ingrese la salud del zombie:");
                   salud=s1.nextInt();
                   System.out.println("Ingrese tipo de sangre:");
                   s1.nextLine();
                   sangre = s1.nextLine();
                   System.out.println("Ingrese año de nacimiento (yyyy):");
                   nacimiento = s1.nextInt();
                   zombies.add(new Zombie(nombreZ, sangre, nacimiento, salud));
                   System.out.println("zombie registrado. gracias");
                   break;
               
                case 2:
               
                    System.out.println("Lista de Zombies:");
                    System.out.println();
                    itr = zombies.iterator();
                    while (itr.hasNext()) 
                    {
                        Zombie zombie= itr.next();
                        System.out.println("Nombre="+zombie.getNombreZ()+" Salud="+zombie.getSalud()+" T. Sangre="+zombie.getSangre()+" F. Nac.="+zombie.getNacimiento());
                    }

                    break;
                case 3:
                   System.out.println();
                   System.out.println("Cantidad de zombies registrados: "+zombies.size());

                     break;  
                case 4:

                   System.out.println("Zombies con tipo de sangre O+ o AB+");
                   System.out.println();
                   itr = zombies.iterator();
                   while (itr.hasNext()) 
                   {
                        Zombie zombie = itr.next();
                        if(zombie.getSangre().equals("O+")||zombie.getSangre().equals("AB+")) 
                        {
                            System.out.println("Nombre="+zombie.getNombreZ()+" Salud="+zombie.getSalud()+" T. Sangre="+zombie.getSangre()+" F. Nac.="+zombie.getNacimiento());
                        }
                    }
                     break;          
                case 5:
    
                   System.out.println("Zombies que nacieron después del 2000");
                   System.out.println();
                   itr=zombies.iterator();
                   while(itr.hasNext())
                   {
                       Zombie zombie= itr.next();
                       if(zombie.getNacimiento()>2000) 
                       {
                         System.out.println("Nombre="+zombie.getNombreZ()+" F. Nac.="+zombie.getNacimiento());
                       }

                   }
                       break; 
                case 6:    
                   itr = zombies.iterator();
                   while (itr.hasNext()) 
                   {
                        Zombie zombie= itr.next();
                        zombie.splitSalud();
                    }
                    System.out.println("Salud disminuida");
                    System.out.println();

                     break;   
                case 7:    
                   System.out.println("Ingrese el nombre Ubicación:");
                   nombreU = s1.nextLine();
                   System.out.println("Ingrese cantidad de Zombies de la ubicación:");
                   cantidadZ = s1.nextInt();
                   System.out.println("Ingrese distancia de Alexandria:");
                   distancia = s1.nextFloat();
                   ubicaciones.add(new Ubicacion(nombreU, distancia, cantidadZ));
                   
                   System.out.println("ubicación registrada. gracias");

                     break; 
                   
                 case 8:
               
                    System.out.println("Lista de Ubicaciones:");
                    System.out.println();
                    itr2 = ubicaciones.iterator();
                    while (itr2.hasNext()) 
                    {
                        Ubicacion ubicacion= itr2.next();
                        System.out.println("Nombre="+ubicacion.getNombre()+" Distancia="+ubicacion.getDistancia()+" Cantidad Zombies="+ubicacion.getCantidad());
                    }

                    break; 
 
                case 9:
                    System.out.println("Lista de ubicaciones");
                    System.out.println();
                    int cantMin=0;
                    Ubicacion ubicacionMin;
                    itr2= ubicaciones.iterator();
                    
                    while(itr2.hasNext())
                    {
                        Ubicacion ubicacion= itr2.next();
                        if(cantMin==0)
                        {
                            cantMin=ubicacion.getCantidad();
                            ubicacionMin=ubicacion;
                        }
                        else if(cantMin>ubicacion.getCantidad())
                        {
                            ubicacionMin= ubicacion;
                            cantMin=ubicacion.getCantidad();
                        }
                        System.out.println(ubicacion.getNombre());
                    }
                    
                    break;
                        
                    
                case 10:
                    
                      


                  
                  break;
            
                    
                case 11:
                    Frases();
                      
                  break;
                  
                case 12:
                    System.out.println("Ubicacion menos segura: ");
                    itr2=ubicaciones.iterator();
                    int cantMax=0;
                    Ubicacion ubicacionMax;
                    while(itr2.hasNext())
                    {
                        Ubicacion ubicacion=itr2.next();
                        if(cantMax==0)
                        {
                            cantMax=ubicacion.getCantidad();
                            ubicacionMax=ubicacion;
                        }
                        else if(cantMax>ubicacion.getCantidad())
                        {
                            ubicacionMax=ubicacion;
                            ubicacion.getCantidad();
                        }
                        System.out.println(ubicacion.getNombre());
                    }

            }  
        }              
    }  
}
       
