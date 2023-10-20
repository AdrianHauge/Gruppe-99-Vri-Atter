package no.hvl.dat100.prosjekt.modell;

import java.util.Random;
import java.util.Arrays;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START

		int[] numbers = { 5, 2, 9, 1, 5, 6 };

		Arrays.sort(numbers);

		System.out.println("Sorted array: " + Arrays.toString(numbers));

		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		// TODO - START{

		        Random random = new Random();
		        int n = samling.getAntalKort();

		        for (int i = n - 1; i > 0; i--) {
		            int j = random.nextInt(i + 1);
		            samling.bytt(i, j);
		        }
		    }

		    public static void main(String[] args) {
		        KortSamling samling = new KortSamling();

		        stokk(samling);

		    }
		}

	
	// TODO - END