package kk;
import java.util.*;
/*
 * Oh whow
 *  This is lit
 */

import java.util.Scanner;
class HaloTop extends IceCream{
//	enum flavour{
//		COOKIEDOUGH, BIRTHDAYCAKE, SMORE;
//	}
	public HaloTop(String givenFlavour){
		super(givenFlavour);
		setBrand("HALOTOP");
		ArrayList<Integer> data_SMORE = new ArrayList<Integer>(Arrays.asList(330, 40,3));
		nutrition.put("smore", data_SMORE);
		ArrayList<Integer> data_BIRTHDAYCAKE = new ArrayList<Integer>(Arrays.asList(280, 40,3));
		nutrition.put("birthdaycake", data_BIRTHDAYCAKE);
	}
	public void outPutCalorie(Double percentage) {
		int Whole_Calorie = nutrition.get(getFlavour()).get(0);
		System.out.println("Calorie for 1 pint: " + Whole_Calorie * percentage);
	}
	
}
class Enlightened extends IceCream{
//	enum flavour{
//		MOVIENIGHT, DONUT, CANDYBAR;
//	}
	public Enlightened(String givenFlavour){
		super(givenFlavour);
		setBrand("ENLIGHTENED");
	}

	
}
abstract public class IceCream {
	//Can only be initialized once
	public final String storageType = "Frozen";
	enum brands{ENLIGHTENED, HALOTOP};
	private brands brand;
	private String flavour;
	Map<String, List<Integer>> nutrition = new HashMap<String, List<Integer>>();
	
	public void outPutCalorie(Double percentage) {
		
	}
	public IceCream(String givenFlavour) {
		this.flavour = givenFlavour;
	}
	
	
	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	public brands getBrand() {
		return brand;
	}

	public void setBrand(String GivenBrand) {
		this.brand = brands.valueOf(GivenBrand);
	}
	public void outputFlavourOption() {
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your fav ice cream brand: HALOTOP(h/H), ENLIGHTENED(e/E)");
		String givenBrand = scan.nextLine();
		IceCream winnie = null;
		System.out.println("Flavour? ");
		String givenFlavour = scan.nextLine();
		switch(givenBrand) {
			case "h":
			case "H":
				winnie = new HaloTop(givenFlavour);
				break;
			case "E":
			case "e":
				winnie = new Enlightened(givenFlavour);
				break;
			default:
				System.out.println("No brand exists yet :(");
		}
		System.out.println("How much did you eat?(0-1.0) ");
		String volume_percentage = scan.nextLine();
		
		winnie.outPutCalorie(Double.valueOf(volume_percentage));
		
	}
}
