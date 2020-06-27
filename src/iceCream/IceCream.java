import java.util.*;
package iceCream;
/*
 * Oh whow
 *  This is lit
 */

import java.util.Scanner;
class HaloTop extends IceCream{
	enum flavour{
		COOKIEDOUGH, BIRTHDAYCAKE, SMORE;
	}
	public HaloTop(){
		setBrand("HALOTOP");
	}
}
class Enlightened extends IceCream{
	enum flavour{
		MOVIENIGHT, DONUT, CANDYBAR;
	}
	public Enlightened(){
		setBrand("ENLIGHTENED");
	}
}
abstract public class IceCream {
	//Can only be initialized once
	public final String storageType = "Frozen";
	public IceCream() {

	}

	private brands brand;
	private Set<String> hash_Set;
	
	enum flavours{
	}
	public brands getBrand() {
		return brand;
	}

	public flavours getFlavour() {
		return flavour;
	}

	public void setFlavour(flavours flavour) {
		this.flavour = flavour;
	}

	public void setBrand(String GivenBrand) {
		this.brand = brands.valueOf(GivenBrand);
	}
	public void outputFlavourOption() {
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your fav ice cream brand: HALOTOP, ENLIGHTENED");
		String givenBrand = scan.nextLine();
		IceCream winnie = null;
		switch(givenBrand) {
			case "HALOTOP":
				winnie = new HaloTop();
				break;
			case "ENLIGHTENED":
				winnie = new Enlightened();
				break;
			default:
				System.out.println("No brand exists yet :(");
		}
		System.out.println("Flavour? ");
		String givenFlavour = scan.nextLine();
		winnie.outputFlavourOption();
	}
}
