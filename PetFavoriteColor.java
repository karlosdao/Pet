package OldStuff;
/**
 * Class: PetFavoriteColor
 * @author Karlos Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2019
 * Written Mar 27, 2019
 * @note This class will create a GUI with color buttons. Each button can be clicked and a table GUI will appear.
 * @note The tables will change font color depending on the button color and contain pets with hash codes the same as the color index.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class PetFavoriteColor extends Application
{
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARKGRAY, Color.GRAY, 
			Color.GREEN,Color.LIGHTGRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, 
			Color.WHITE, Color.YELLOW};
	private HashMap<Color, HashSet<Pet>> petColorMap;

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
		
		Stage tableStage = new Stage();
		tableStage.setTitle("Pets Table");
		tableStage.setX(68); //window position on screen
		tableStage.setY(75); //window position on screen
		PetTableGUI ptg = new PetTableGUI();	
		
		r1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
            		Scene tableScene;
					try
					{
						tableScene = new Scene(ptg.getVBox(colors[0], "-fx-text-fill: black;"), 555, 400);
						tableStage.setScene(tableScene); //set scene to a stage.
	            			tableStage.show(); //shows scene, doesn't have to be in start method.
					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
            }
        });
		
		r2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene1;
				try
				{
					tableScene1 = new Scene(ptg.getVBox(colors[1], "-fx-text-fill: blue;"), 555, 400);
					tableStage.setScene(tableScene1);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene2;
				try
				{
					tableScene2 = new Scene(ptg.getVBox(colors[2], "-fx-text-fill: cyan;"), 555, 400);
					tableStage.setScene(tableScene2);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r4.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene3;
				try
				{
					tableScene3 = new Scene(ptg.getVBox(colors[3], "-fx-text-fill: darkgray;"), 555, 400);
					tableStage.setScene(tableScene3);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r5.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene4;
				try
				{
					tableScene4 = new Scene(ptg.getVBox(colors[4], "-fx-text-fill: gray;"), 555, 400);
					tableStage.setScene(tableScene4);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r6.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene5;
				try
				{
					tableScene5 = new Scene(ptg.getVBox(colors[5], "-fx-text-fill: green;"), 555, 400);
					tableStage.setScene(tableScene5);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r7.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene6;
				try
				{
					tableScene6 = new Scene(ptg.getVBox(colors[6], "-fx-text-fill: lightgray;"), 555, 400);
					tableStage.setScene(tableScene6);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r8.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene7;
				try
				{
					tableScene7 = new Scene(ptg.getVBox(colors[7], "-fx-text-fill: magenta;"), 555, 400);
					tableStage.setScene(tableScene7);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r9.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene8;
				try
				{
					tableScene8 = new Scene(ptg.getVBox(colors[8], "-fx-text-fill: orange;"), 555, 400);
					tableStage.setScene(tableScene8);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r10.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene9;
				try
				{
					tableScene9 = new Scene(ptg.getVBox(colors[9], "-fx-text-fill: pink;"), 555, 400);
					tableStage.setScene(tableScene9);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r11.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene10;
				try
				{
					tableScene10 = new Scene(ptg.getVBox(colors[10], "-fx-text-fill: red;"), 555, 400);
					tableStage.setScene(tableScene10);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r12.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene11;
				try
				{
					tableScene11 = new Scene(ptg.getVBox(colors[11], "-fx-text-fill: black;"), 555, 400);
					tableStage.setScene(tableScene11);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		r13.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
        		Scene tableScene12;
				try
				{
					tableScene12 = new Scene(ptg.getVBox(colors[12], "-fx-text-fill: yellow;"), 555, 400);
					tableStage.setScene(tableScene12);
            			tableStage.show();
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		Scene scene = new Scene(grid, 190, 250); //scene for color grid pane
		colorStage.setTitle("Choose Font Color");
		colorStage.setScene(scene);
		colorStage.show();

	}
	
	/**
	 * 
	 * Method: getPetColorMap
	 * @return petColorMap
	 * @throws FileNotFoundException
	 * @note This method will get the list of pets from the PetFileReader class and add them into a HashMap with a color.
	 */
	public HashMap<Color, HashSet<Pet>> getPetColorMap() throws FileNotFoundException
	{
		PetFileReader pfr = new PetFileReader();
		HashSet<Pet> pets = pfr.getPets();
		
		petColorMap = new HashMap<Color, HashSet<Pet>>();
		HashSet<Pet> petColorCollection = new HashSet<Pet>();
		
		for (Pet pet : pets)
		{
	 		petColorCollection = petColorMap.get(colors[pet.hashCode()]);
	 		if (petColorCollection == null) //if the set is empty, make a new HashSet<Pet>
	 		{
	 			petColorCollection = new HashSet<Pet>(); //instantiate a new set
	 		}
	 		
	 		petColorCollection.add(pet); //adding the pet to the new set.
	 		petColorMap.put(colors[pet.hashCode()], petColorCollection); //putting color and set of pet into the Map.
	    }
		return petColorMap;
	}
	
	public static void main(String[] args) throws IOException
	{		
		Application.launch(args);	
	}
}
