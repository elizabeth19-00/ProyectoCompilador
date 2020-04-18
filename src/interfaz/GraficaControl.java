package interfaz;


import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;

import application.Analizador_Lexico;
import application.tabla_de_errores;
import application.tabla_simbolos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class GraficaControl {

	@FXML
    private TextArea texto;

    @FXML
    private Button analizador;

    @FXML
    private TableView<?> tabla;

    @FXML
    void Presiona(ActionEvent event) {
    	
    }

    @FXML
    void click(ActionEvent event) {
String impresion = texto.getText();
    	
    	Analizador_Lexico analizar;

    			analizar=new Analizador_Lexico((new StringReader(impresion)));
	        try {
				analizar.yylex();
				LinkedList<tabla_de_errores> error_le=analizar.lexico_error;
				LinkedList<tabla_simbolos> sim=analizar.tabla_simb;
				
				if(!error_le.isEmpty()) {
					Ver_Error(error_le);
					Ver_Simbolos(sim);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
	        public static void Ver_Error(LinkedList<tabla_de_errores> E_lex) {
	    		for(tabla_de_errores tb:E_lex){
	                tb.VerInformacion();
	    		   }
	    			}
	    			
	    			public static void Ver_Simbolos(LinkedList<tabla_simbolos> sym) {
	    				for(tabla_simbolos tb:sym){
	    		            tb.Mostrar_Simbolo();
	    				 }
	    			}
    

    }


