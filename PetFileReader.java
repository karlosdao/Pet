package OldStuff;
/**
 * Class: PetFileReader
 * @author Karlos Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2019
 * Written Mar 27, 2019
 * @note This class will read the Pets.txt and make new cat or dog depending on its attributes.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class PetFileReader
{
	/**
	 * 
	 * Method: readFile
	 * @return n/a
	 * @throws FileNotFoundException
	 * @note This method will read a txt file and create a new dog/cat PET.
	 */
	private HashSet<Pet> pets;

	public PetFileReader() throws FileNotFoundException
	{
		pets = new HashSet<Pet>();
		FileReader fr = new FileReader("Pets.txt"); 
		Scanner fileIn = new Scanner(fr); 
		try
		{
			while (fileIn.hasNextLine()) 
			{
				String[] word = fileIn.nextLine().split(" ");
				if(word[0].equals("Cat"))
				{
					//Cat
					pets.add(new Cat(word[1], word[2], word[3], Litter.valueOf(word[7].toUpperCase()),Integer.parseInt(word[5]), Integer.parseInt(word[4]), 
							Integer.parseInt(word[6])));
				}
				else
				{
					//Dog
					pets.add(new Dog(word[1], word[2], word[3], Integer.parseInt(word[4]), Integer.parseInt(word[5]), Integer.parseInt(word[6]), false,
							"large", TailType.valueOf(word[7].toUpperCase())));
				}
			}
			fileIn.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	
	/**
	 * 
	 * Method: getPets
	 * @param n/a
	 * @notes This method will return a HashSet of pets.
	 * @return pets
	 */
	public HashSet<Pet> getPets()
	{
		return pets;
	}
	/**
	 * 
	 * Method: setPets
	 * @param pets
	 * @notes This method will set the HashSet of pets to this set.
	 * @return n/a
	 */
	public void setPets(HashSet<Pet> pets)
	{
		this.pets = pets;
	}
	
}
