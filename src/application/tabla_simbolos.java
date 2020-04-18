package application;

public class tabla_simbolos {
		public String simbolo;
		public String tipo;
		
		public tabla_simbolos(String symbo,String tipo) {
			this.simbolo=symbo;
			this.tipo=tipo;
		}
		
		public void  Mostrar_Simbolo() {
			System.out.println( this.simbolo +  "  Es un lexema de tipo " + this.tipo);
		}
	}	


