package entradablogamb;

/**
 *
 * @author Andrés Martínez
 * @version 1.1
 */
public class EntradaBlogAMB {

   
public static char separador=':';
private int id;
private String texto;
private String autor;
       
        /**
         *
         * @param id número de entrada
         * @param autor autor de la entrada
         * @param texto contenido de la entrada
         * @throws IllegalArgumentException Da error si se introduce un id negativo
         */
public EntradaBlogAMB(int id,String autor,String texto)throws IllegalArgumentException{
if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
this.id=id;
this.autor=autor;
this.texto=texto;
}
       
        /**
         * Reescritura del método toString para que nuestre autor y texto
         * @return ENTRADA DE + autor
         */
@Override
public String toString(){
String cad="";
cad+="\nENTRADA DE"+separador+getAutor();
cad+="\n "+texto;
return cad;
}

/**
         * Método que devuelve el número de la entrada
         * @return número de entrada (entero)
         */
public int getId(){
return this.id;
}

/**
         * Método que llama al texto de la entrada
         * @return texto de la entrada (cadena de caracteres)
         */
public String getTexto(){
return this.texto;
}

/**
         * Método que muestra el nombre del autor
         * @return Nombre del autor, en mayúsculas (cadena de caracteres)
         */
public String getAutor(){
return this.autor.toUpperCase();
}

/**
         * Método (obsoleto) para llamar al nombre del autor
         * @return nombre del autor
         *
         */
public String devuelveAutor(){
return this.autor;
}


public static void main(String[] args) {
                //Modificar.
EntradaBlogAMB e1=new EntradaBlogAMB (3,"ana","Últimas noticias, está disponible BixBy 2.0");
System.out.println(e1);
}
}

