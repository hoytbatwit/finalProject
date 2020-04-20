package application;
	
import javafx.animation.* ;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;  // Arc, Circle, etc.
import javafx.stage.Stage;


public class Players extends Application
{
   public void start( Stage stage )
   {
      Group groupforpacman = new Group() ;
      stage.setTitle( "PACMAN" ) ;
      Scene scene = new Scene( groupforpacman, 300, 300 ) ;
      scene.setFill( Color.BLACK ) ;
      Arc pacmanshape = new Arc( 100, 150, // center 
                                  32, 24,   // width and height
                                  45,       // start angle in degrees
                                  270 ) ;   // length angle in degrees
      pacmanshape.setType( ArcType.ROUND ) ;
      pacmanshape.setFill( Color.YELLOW ) ; 

      groupforpacman.getChildren().add( pacmanshape ) ;
           
      stage.setScene( scene ) ;
      stage.show() ;

      Timeline timeline = new Timeline() ;
      timeline.setCycleCount( Animation.INDEFINITE ) ;
      timeline.setAutoReverse( true ) ;
      KeyValue startanglevalue = new KeyValue( pacmanshape.startAngleProperty(),
                                                 0 ) ;
      KeyValue lengthvalue = new KeyValue( pacmanshape.lengthProperty(), 360 ) ;

      KeyFrame closingofmouth = new KeyFrame( Duration.millis( 250 ),
                                                startanglevalue,
                                                lengthvalue ) ;
      timeline.getKeyFrames().add(closingofmouth) ;
      timeline.play() ;
   
      Group groupforghost1 = new Group() ;
      stage.setTitle( "GHOST1" ) ;
      Scene scene1 = new Scene( groupforghost1, 300, 300 ) ;
      scene1.setFill( Color.BLACK ) ;
      Arc ghost1shape = new Arc( 100, 150, 0, 0, 0, 0);
      pacmanshape.setType( ArcType.CHORD ) ;
      pacmanshape.setFill( Color.RED ) ; 

      groupforghost1.getChildren().add( ghost1shape ) ;
           
      stage.setScene( scene1 ) ;
      stage.show() ;

      Timeline timeline1 = new Timeline() ;
      timeline1.setCycleCount( Animation.INDEFINITE ) ;
      timeline1.setAutoReverse( true ) ;
      KeyValue startanglevalue1 = new KeyValue( pacmanshape.startAngleProperty(),
                                                 0 ) ;
      KeyValue lengthvalue1 = new KeyValue( pacmanshape.lengthProperty(), 360 ) ;

      KeyFrame closingofmouth1 = new KeyFrame( Duration.millis( 250 ),
                                                startanglevalue1,
                                                lengthvalue1 ) ;
      timeline1.getKeyFrames().add(closingofmouth1) ;
      timeline1.play() ;
      
      
      
      Group groupforghost11 = new Group() ;
      stage.setTitle( "GHOST1" ) ;
      Scene scene11 = new Scene( groupforghost11, 300, 300 ) ;
      scene11.setFill( Color.BLACK ) ;
      Arc ghost1shape1 = new Arc( 100, 150, 0, 0, 0, 0);
      pacmanshape.setType( ArcType.CHORD ) ;
      pacmanshape.setFill( Color.GREEN ) ; 

      groupforghost11.getChildren().add( ghost1shape1 ) ;
           
      stage.setScene( scene11 ) ;
      stage.show() ;

      Timeline timeline11 = new Timeline() ;
      timeline11.setCycleCount( Animation.INDEFINITE ) ;
      timeline11.setAutoReverse( true ) ;
      KeyValue startanglevalue11 = new KeyValue( pacmanshape.startAngleProperty(),
                                                 0 ) ;
      KeyValue lengthvalue11 = new KeyValue( pacmanshape.lengthProperty(), 360 ) ;

      KeyFrame closingofmouth11 = new KeyFrame( Duration.millis( 250 ),
                                                startanglevalue11,
                                                lengthvalue11 ) ;
      timeline11.getKeyFrames().add(closingofmouth11) ;
      timeline11.play() ;
   }
   

   public static void main(String[] command_line_parameters)
   {
      launch( command_line_parameters ) ;
   }
}
