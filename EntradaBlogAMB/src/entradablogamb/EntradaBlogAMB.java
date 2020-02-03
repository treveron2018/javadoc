package entradablogamb;

/**
 *
 * @author Andr�s Mart�nez
 * @version 1.1
 */
public class EntradaBlogAMB {

   
public static char separador=':';
private int id;
private String texto;
private String autor;
       
        /**
         *
         * @param id n�mero de entrada
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
         * Reescritura del m�todo toString para que nuestre autor y texto
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
         * M�todo que devuelve el n�mero de la entrada
         * @return n�mero de entrada (entero)
         */
public int getId(){
return this.id;
}

/**
         * M�todo que llama al texto de la entrada
         * @return texto de la entrada (cadena de caracteres)
         */
public String getTexto(){
return this.texto;
}

/**
         * M�todo que muestra el nombre del autor
         * @return Nombre del autor, en may�sculas (cadena de caracteres)
         */
public String getAutor(){
return this.autor.toUpperCase();
}

/**
         * M�todo (obsoleto) para llamar al nombre del autor
         * @return nombre del autor
         *
         */
public String devuelveAutor(){
return this.autor;
}


public static void main(String[] args) {
                //Modificar.
EntradaBlogAMB e1=new EntradaBlogAMB (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
System.out.println(e1);
}
}

