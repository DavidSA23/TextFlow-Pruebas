import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primerStage) throws Exception {
		primerStage.setTitle("Prueba de TextFlow");
		
		//Creo el contenedor TextFlow
		TextFlow textflow1 = new TextFlow();
		//Aqui los elementos Text a contener formateados
		Text texto1=new Text("Texto en Negrita\n");
		texto1.setStyle("-fx-font-weight: bold");

		Text texto2=new Text("Texto grande\n");
		texto2.setStyle("-fx-font-size: 40px");
		
		Text texto3=new Text("Texto cursiva\n");
		texto3.setStyle("-fx-font-style: italic");
		
		Text texto4=new Text("Texto en rojo y mediano");
		texto4.setFill(Color.RED);
		texto4.setStyle("-fx-font-size: 20px");
		
		//Añado los elementos de texto al contenedor y lo muestro en ventana
		textflow1.getChildren().addAll(texto1, texto2, texto3, texto4);
        Scene escena1 = new Scene(textflow1, 400, 400);
        primerStage.setScene(escena1);
		
		primerStage.show();
		
	}

}