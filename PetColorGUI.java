package OldStuff;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PetColorGUI extends Application
{
	@Override
	public void start(Stage colorStage) throws Exception
	{
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10);
		grid.setHgap(10);
		
		Rectangle r1 = new Rectangle(50, 35);
		r1.setFill(Color.BLACK);
		GridPane.setConstraints(r1, 0, 0);
		
		Rectangle r2 = new Rectangle(50, 35);
		r2.setFill(Color.BLUE);
		GridPane.setConstraints(r2, 1, 0);
		
		Rectangle r3 = new Rectangle(50, 35);
		r3.setFill(Color.CYAN);
		GridPane.setConstraints(r3, 2, 0);
		
		Rectangle r4 = new Rectangle(50, 35);
		r4.setFill(Color.DARKGRAY);
		GridPane.setConstraints(r4, 0, 1);
		
		Rectangle r5 = new Rectangle(50, 35);
		r5.setFill(Color.GRAY);
		GridPane.setConstraints(r5, 1, 1);
		
		Rectangle r6 = new Rectangle(50, 35);
		r6.setFill(Color.GREEN);
		GridPane.setConstraints(r6, 2, 1);
		
		Rectangle r7 = new Rectangle(50, 35);
		r7.setFill(Color.LIGHTGRAY);
		GridPane.setConstraints(r7, 0, 2);
		
		Rectangle r8 = new Rectangle(50, 35);
		r8.setFill(Color.MAGENTA);
		GridPane.setConstraints(r8, 1, 2);
		
		Rectangle r9 = new Rectangle(50, 35);
		r9.setFill(Color.ORANGE);
		GridPane.setConstraints(r9, 2, 2);
		
		Rectangle r10 = new Rectangle(50, 35);
		r10.setFill(Color.PINK);
		GridPane.setConstraints(r10, 0, 3);
		
		Rectangle r11 = new Rectangle(50, 35);
		r11.setFill(Color.RED);
		GridPane.setConstraints(r11, 1, 3);
		
		Rectangle r12 = new Rectangle(50, 35);
		r12.setFill(Color.WHITE);
		r12.setStroke(Color.BLACK);
		GridPane.setConstraints(r12, 2, 3);
		
		Rectangle r13 = new Rectangle(50, 35);
		r13.setFill(Color.YELLOW);
		GridPane.setConstraints(r13, 1, 4);
		
		grid.getChildren().addAll(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
		
		Scene scene = new Scene(grid, 190, 250);
		colorStage.setTitle("Choose Font Color");
		colorStage.setScene(scene);
		colorStage.show();
	}
}
