public class Entregable1 {
    public static void main(String[] args) {
		gato garfield = new gato();
        gato tom = new gato();
        gato bola_de_nieve = new gato();
        gato con_botas = new gato();
        gato silvestre = new gato();

        //NOMBRE
        garfield.nombre = "Garfiel";
        tom.nombre = "Tom";
        bola_de_nieve.nombre = "Bola de nieve";
        con_botas.nombre = "Gato con botas";
        silvestre.nombre = "Silvestre";
        
        
      //*************** CARACTERÍSTICAS   ***************
        //COLOR
        garfield.color = "naranja";
        /*  tom.color = "gris";
        bola_de_nieve.color = "negro";
        con_botas.color = "naranja";
        silvestre.color = "blanco con negro";  */
        
        //EMPRESA
        garfield.empresa = "Warner Brothers";
        /*  tom.empresa = " Van Beuren Studios,";
        bola_de_nieve.empresa = "negro";
        con_botas.empresa = "naranja";
        silvestre.empresa = "blanco con negro";  */
        
        //COMIDA
        garfield.comida = "spaguetti";
        /*  tom.comida = " jerry ";
        bola_de_nieve.comida = "pescado";
        con_botas.comida = " pescado ";
        silvestre.comida = " piolin ";  */
        
        //HABLA
        garfield.habla = true;
        /*  tom.comida = false ;
        bola_de_nieve.comida = false ;
        con_botas.comida = true ;
        silvestre.comida = false ;  */
        
        //AÑOS
        garfield.años = 1978;
        /*  tom.comida = 1940 ;
        bola_de_nieve.comida = 1987 ;
        con_botas.comida = 2001 ;
        silvestre.comida = 1989 ;  */
        
        //*************** ATRIBUTOS   ***************
        
        // ATRIBUTO COMIDA
        garfield.comer();
        /* tom.comer();
        bola_de_nieve.comer();
        con_botas.comer();
        silvestre.comer(); */
        
        // ATRIBUTO SALTAR
        garfield.trabajar();
        /* tom.saltar();
        bola_de_nieve.saltar();
        con_botas.saltar();
        silvestre.saltar(); */
        
        // ATRIBUTO HABLAR
        garfield.hablar();
        /* tom.hablar();
        bola_de_nieve.hablar();
        con_botas.hablar();
        silvestre.hablar(); */
        
        // TO STRING
        System.out.println(garfield.toString());
        /* System.out.println(tom.toString());
        System.out.println(bola_de_nieve.toString());
        System.out.println(con_botas.toString());
        System.out.println(silvestre.toString()); */
	} 
}
class gato {

public String nombre;
public String color;
public String empresa;
public int años;
public String comida;
public boolean habla;

public void comer (){
    System.out.println("El gato " + nombre + " es de color " + color + " come " + comida);
}

public void trabajar(){
    System.out.println("El gato " + nombre + " trabaja en " + empresa );
}

public boolean hablar (){
	//PUEDE HBALAR = TRUE
	//NO PUEDE HABLAR = FALSE 
	System.out.println("El gato " + nombre + " puede " + habla + " hablar." );
return true;
} 

@Override
public String toString() {
	return "El gato" + nombre + " es de color" + color + " come " + comida + " y fue creado en " + años;
}

}