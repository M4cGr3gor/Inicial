package classPersona;
import java.util.Scanner;

public class usaPersona
{
    public static void main()
    {
        Scanner teclado=new Scanner(System.in);
        persona vecPersona[]=new persona[3];
        String nombre;
        int dni;
        boolean swt=true;
        
        System.out.printf("Introduzca datos de personas\n");
        System.out.printf("----------------------------\n\n");
        
        for(int i=0; i<vecPersona.length; i++)
        {
            System.out.printf("Introduzca el Nombre> ");
            nombre=teclado.next(); //al usar nextInt se queda almacenado el ENTER y en la 2ª iteracion falla
            System.out.printf("Introduzca el DNI> ");
            dni=teclado.nextInt();
            //teclado.nextLine(); //Si en vez de usar next, para el nombre, usamos nextLine, habria que limpiar el buffer asi
            System.out.printf("\n");
            
            vecPersona[i]=new persona(nombre, dni);
        }
        
        System.out.printf("----------------------------\n");
        System.out.printf("DNI a buscar\n");
        System.out.printf("Introduzca el Nombre> ");
        nombre=teclado.next();
        
        for(int i=0; i<vecPersona.length && swt==true; i++)
        {
            if(nombre.equalsIgnoreCase(vecPersona[i].getNombre()))
            {
                System.out.printf("DNI> %s", vecPersona[i].getNIF());
                swt=false;
            }
        }
        
        if(swt)
        {
            System.out.printf("El nombre no existe.");
        }
    }
}
