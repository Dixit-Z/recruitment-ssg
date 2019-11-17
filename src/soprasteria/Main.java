package soprasteria;

import java.io.IOException;

import prompter.Prompter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Création d'un prompt console
		Prompter console = new Prompter();		
		
		//Exercice Sopra Steria
		soprasteria(RandomGenerator.roll(), console);
		
		//Fermeture du prompt 
		console.close();
		
	}
	
	/**
	 * Réaliser une boucle allant de 1 à {@code loop} en respectant les règles suivantes :
	 * R1 : Afficher la valeur de {@code loop} au début du programme
	 * R2 : Lorsque la valeur est divisible par 3 afficher Sopra
	 * R3 : Lorsque la valeur est divisible par 5 afficher Steria
	 * R4 : Lorsque la valeur est divisible par 3 et par 5 afficher SopraSteria
	 * R5 : Lorsque la valeur n'est pas divisible par 3 ni par 5 afficher la valeur courante de la loop
	 * 
	 * Example : 
	 * 12
	 * 1
	 * 2
	 * Sopra
	 * 4
	 * Steria
	 * Sopra
	 * 7
	 * 8
	 * Sopra
	 * Steria
	 * 11
	 * SopraSteria	
	 * 
	 * @param loop
	 * @param prompter
	 */
	static void soprasteria(Integer loop, Prompter prompter){
		//A implémenter
	}

}
