package application;


public class tabla_de_errores {
	int line,no_columna;
	String lexema, descripcion_error, tipo_error;
	
    
    public tabla_de_errores(String lexema, String descripcion, String tipo, int line, int columna){
    	
    	this.line=line;
    	this.no_columna=columna;
        this.descripcion_error=descripcion;
        this.tipo_error=tipo;
        this.lexema=lexema;
    }

    
    public void VerInformacion() {
    	System.out.println("Error Detectado:  "  +this.lexema + " de tipo:" + this.tipo_error);
    }
    public int getLine() {
        return line;
    }
    
    public int getColumna() {
        return no_columna;
    
    }
    
    public String getDescripcion() {
        return descripcion_error;
    }
    
    public String getTipo() {
        return tipo_error;
    }
    
    public String getLexema() {
        return lexema;
    }   
    
}

