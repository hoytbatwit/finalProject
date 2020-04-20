package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class main2 extends Application{

	public static void main(String[] args) {
		launch(args);	

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane root = new Pane();
		root.setStyle("-fx-background-color: black");
		AllOrbs Orbs = new AllOrbs(root);
		AllExit Border = new AllExit(root);
		AllRec Rec = new AllRec(root);
		AllRec SmallRec = new AllRec(root);
		AllRec TinyRec = new AllRec(root);
		AllExit Exit = new AllExit(root);
		AllExit SmallExit = new AllExit(root);
		AllExit ShortBorder = new AllExit(root);
		AllRec MediumRec = new AllRec(root);
		AllRec TopMediumRec = new AllRec(root);
		AllRec CenterRec = new AllRec(root);
		AllRec SkinnyHRec = new AllRec(root);
		AllRec OutsideMiddleRec = new AllRec(root);
		AllRec InsideMidRec = new AllRec(root);
		AllRec VMiddleRec = new AllRec(root);
		AllRec HMiddleRec = new AllRec(root);
		AllRec MicroMiddleRec = new AllRec(root);
		AllRec SideMicroMiddleRec = new AllRec(root);
		AllRec SideMMRec = new AllRec(root);
		AllRec HalfHMidleRec = new AllRec(root);
		AllRec BottomLRRec = new AllRec(root);
		Scene scene = new Scene(root, 1800, 1000);
		// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	 	
	}
}
