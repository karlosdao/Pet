package OldStuff;
/**
 * Class: PetTableGUI
 * @author Karlos Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2019
 * Written Mar 27, 2019
 * @note This class will display a GUI and print a list of attributes in different rows and columns.
 */

import java.io.FileNotFoundException;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class PetTableGUI
{
	private TableView<Pet> table;
    
	/**
	 * 
	 * Method: getVBox
	 * @param color
	 * @param textColor
	 * @return VBox
	 * @throws FileNotFoundException
	 * @note This method will create a table with a set of pets in it and the text will have color.
	 */
	@SuppressWarnings("unchecked")
	public VBox getVBox(Color color, String textColor) throws FileNotFoundException
	{
		
		VBox vbox = new VBox();
		
		TableColumn<Pet, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(100); 
		nameColumn.setCellValueFactory(new PropertyValueFactory<Pet, String>("name"));
		nameColumn.setStyle(textColor);
		
		TableColumn<Pet, String> breedColumn = new TableColumn<>("Breed");
		breedColumn.setMinWidth(80);
		breedColumn.setCellValueFactory(new PropertyValueFactory<Pet, String>("breed"));
		breedColumn.setStyle(textColor);
		
		TableColumn<Pet, String> colorColumn = new TableColumn<>("Color");
		colorColumn.setMinWidth(80);
		colorColumn.setCellValueFactory(new PropertyValueFactory<Pet, String>("color"));
		colorColumn.setStyle(textColor);
		
		TableColumn<Pet, Integer> legColumn = new TableColumn<>("Legs");
		legColumn.setMinWidth(50);
		legColumn.setCellValueFactory(new PropertyValueFactory<Pet, Integer>("legs"));
		legColumn.setStyle(textColor);
		
		TableColumn<Pet, Integer> weightColumn = new TableColumn<>("Weight");
		weightColumn.setMinWidth(50);
		weightColumn.setCellValueFactory(new PropertyValueFactory<Pet, Integer>("weight"));
		weightColumn.setStyle(textColor);
		
		TableColumn<Pet, Integer> toyColumn = new TableColumn<>("# of Toys");
		toyColumn.setMinWidth(50);
		toyColumn.setCellValueFactory(new PropertyValueFactory<Pet, Integer>("numberOfToys"));
		toyColumn.setStyle(textColor);
		
		TableColumn<Pet, String> typeColumn = new TableColumn<>("Type");
		typeColumn.setMinWidth(100);
		typeColumn.setStyle(textColor);

		typeColumn.setCellValueFactory(param -> {
			Pet petPara = param.getValue();
			if(petPara instanceof Cat)
			{
				return Bindings.createStringBinding(() -> ((Cat) petPara).getLitterType().toString());
			}
			else
			{
				return Bindings.createStringBinding(() -> ((Dog) petPara).getTail().toString());
			}
		});

		PetFavoriteColor pfc = new PetFavoriteColor();
		ObservableSet<Pet> observableSet = FXCollections.observableSet(pfc.getPetColorMap().get(color));
        ObservableList<Pet> observableList = FXCollections.observableArrayList(observableSet);
		table = new TableView<Pet>();
		table.setItems(observableList); 
		table.getColumns().addAll(nameColumn, breedColumn, colorColumn, legColumn, weightColumn, toyColumn, typeColumn);

		vbox.getChildren().addAll(table);
		
		return vbox;
	}
}
