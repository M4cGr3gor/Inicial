package classPersona;

public class persona
{
    private String nif, nombre;
    
    public persona(String name, int dni)
    {
        //this.nombre=name;       //al ser referencias, hay dos vias de entrada al objeto name y nombre
        
        nombre= new String(name); //para usar una copia de name y que haya privacidad del objeto, si no se podria acceder a el a traves de name (son referencias)        
        this.nif=calcNIF(dni);
    }
    
    public persona() //para que las referencias no tengan valores invalidos hacemos que apunten a null
    {
        this.nombre=null;
        this.nif=null;
    }
    
    
    private String calcNIF(int d)
    {
        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return String.format("%d%c", d, letras[d%23]);
    }
    
    public void setNombre(String n)
    {
        //this.nombre=n;  //al ser referencias, hay dos vias de entrada al objeto n y nombre
        
        nombre= new String(n);
    }
    
    public void setNIF(int d)
    {
        this.nif=calcNIF(d);
    }
    
    public String getNombre()
    {
        //return this.nombre;   //al ser referencias, hay dos vias de entrada al objeto this.nombre y la que devuelve
        
        //Se hace asi, por que si fuese null fallaria
        //Y tambien se devuelve una copia de la variable nombre, por la privacidad del objeto
        String resul=null;
        
        if(this.nombre!=null)
        {
            resul= new String(this.nombre);
        }
        
        return resul;
    }
    
    public String getNIF()
    {
        //return this.nif;   //al ser referencias, hay dos vias de entrada al objeto this.nif y la que devuelve
        
        //Se hace asi, por que si fuese null fallaria
        //Y tambien se devuelve una copia de la variable nombre, por la privacidad del objeto
        String resul=null;
        
        if(this.nif!=null)
        {
            resul= new String(this.nif);
        }
        
        return resul;
    }
}
