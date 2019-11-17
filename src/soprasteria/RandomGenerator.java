package soprasteria;

import java.util.Random;

/**
 * Générateur statique d'aléatoire 
 * @author btrinta
 *
 */
public class RandomGenerator {
	
	private static final Integer MAX_LOOP = 100000;

	
	/**
	 * Méthode de génération d'un nombre aléatoire. 
	 * 
	 * @return Une valeur alétoire entre  entre 100 et {@code this.MAX_LOOPS}.
	 * 
	 * @see {@code Random().nextInt(int bound)} 
	 */
	public static Integer roll(){
		Integer next = new Random().nextInt(MAX_LOOP) + 1;
		while(next < 100){
			next = new Random().nextInt(MAX_LOOP) + 1;
		}
		return next;
	}
}
