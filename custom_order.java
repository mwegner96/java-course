//Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner; // Needed for the Scanner class to read input

public class custom_order {

	// STEP 1 PRINTING HELLO WORLD TO CONSOLE
	public static void main(String[] args) {

		// System.out.println("Hello World!"); // print Hello World to console

		// TEST CODE

		// STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS

		String strAngestellterName, strKundenname;
		String strMenuKuchenArr[] = new String[5];
		String strMenuCupcakeArr[] = new String[5];
		String strFrostingArr[] = new String[5];
		String strFillingArr[] = new String[5];
		String strToppingArr[] = new String[5];
		float fPreisKuchen[] = new float[5];
		float fPreisCupcake[] = new float[5];
		float fPreisFrosting[] = new float[5];
		float fPreisFilling[] = new float[5];
		float fPreisTopping[] = new float[5];
		int iOrderNr = 0, iOrderArt = 0, iOrderFrosting = 0, iOrderFilling = 0, iOrderTopping = 0, iNochmal;
		float fTax = 0, fCost = 0, fCostGesamt = 0;

		Scanner myScanner = new Scanner(System.in);

		strMenuKuchenArr[0] = "Bienenstich";
		strMenuKuchenArr[1] = "Schoko-Kuchen";
		strMenuKuchenArr[2] = "Donauwelle";
		strMenuKuchenArr[3] = "Gugelhupf";
		strMenuKuchenArr[4] = "Herrentorte";

		fPreisKuchen[0] = 3.00f;
		fPreisKuchen[1] = 2.50f;
		fPreisKuchen[2] = 3.50f;
		fPreisKuchen[3] = 2.00f;
		fPreisKuchen[4] = 3.00f;

		strMenuCupcakeArr[0] = "Schoko-CupCake";
		strMenuCupcakeArr[1] = "Vanille-CupCake";
		strMenuCupcakeArr[2] = "Erdbeer-CupCake";
		strMenuCupcakeArr[3] = "Karamell-CupCake";
		strMenuCupcakeArr[4] = "M&M-CupCake";

		fPreisCupcake[0] = 2.00f;
		fPreisCupcake[1] = 1.50f;
		fPreisCupcake[2] = 2.50f;
		fPreisCupcake[3] = 3.00f;
		fPreisCupcake[4] = 4.00f;

		strFrostingArr[0] = "Schoko";
		strFrostingArr[1] = "Vanille";
		strFrostingArr[2] = "Erdbeer";
		strFrostingArr[3] = "Karamell";
		strFrostingArr[4] = "Himbeere";

		fPreisFrosting[0] = 1.00f;
		fPreisFrosting[1] = 0.50f;
		fPreisFrosting[2] = 1.50f;
		fPreisFrosting[3] = 2.00f;
		fPreisFrosting[4] = 2.00f;

		strFillingArr[0] = "Schoko";
		strFillingArr[1] = "Vanille";
		strFillingArr[2] = "Erdbeer";
		strFillingArr[3] = "Karamell";
		strFillingArr[4] = "Himbeere";

		fPreisFilling[0] = 1.00f;
		fPreisFilling[1] = 0.50f;
		fPreisFilling[2] = 1.50f;
		fPreisFilling[3] = 1.00f;
		fPreisFilling[4] = 0.50f;

		strToppingArr[0] = "Schoko-Streusel";
		strToppingArr[1] = "Vanille-Streusel";
		strToppingArr[2] = "Haselnuss-Streusel";
		strToppingArr[3] = "Karamell-Streusel";
		strToppingArr[4] = "Schoko-Soße";

		fPreisTopping[0] = 1.00f;
		fPreisTopping[1] = 0.50f;
		fPreisTopping[2] = 0.50f;
		fPreisTopping[3] = 1.00f;
		fPreisTopping[4] = 0.50f;

		do {
			strAngestellterName = "";
			strKundenname = "";
			iNochmal = 0;
			iOrderNr = 0;
			iOrderArt = 0;
			iOrderFrosting = 0;
			iOrderFilling = 0;
			iOrderTopping = 0;
			fTax = 0;
			fCost = 0;
			fCostGesamt = 0;

			System.out.flush();

			System.out.println("----- Java's Cake & Cupcake Shop -----");
			System.out.println(" ");

			// Introduce shop and prompt user to input first name
			strAngestellterName = "Moritz";

			System.out.println("Hallo mein Name ist " + strAngestellterName
					+ " und herzlich Willkommen im Java's Cake & Cupcake Shop");
			System.out.println(" ");
			do {
				System.out.println("Bitte tragen Sie zunächst Ihren Namen ein: ");
				strKundenname = myScanner.nextLine();
			} while (strKundenname == "");
			System.out.println(" ");

			// TEST CODE

			// STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU

			// bei Step 2

			// TEST CODE

			// STEP 4 DISPLAY MENU
			System.out.println("Kuchen-Menu:");
			for (int i = 0; i < 5; i++) {
				System.out.println("Kuchen " + (i + 1) + ": " + strMenuKuchenArr[i]);
			}

			System.out.println(" ");

			System.out.println("CupCake-Menu:");
			for (int i = 0; i < 5; i++) {
				System.out.println("CupCake " + (i + 1) + ": " + strMenuCupcakeArr[i]);
			}

			System.out.println(" ");
			System.out.println("------------------------");
			System.out.println(" ");
			// TEST CODE

			// STEP 5 PROMPT USER TO ORDER

			do {
				System.out.println("Möchten Sie eine Kuchen (1) oder einen CupCake (2)? ");
				iOrderArt = myScanner.nextInt();

				if (iOrderArt != 1 && iOrderArt != 2) {
					System.out.println("Geben Sie eine gültige Zahl ein");
					System.out.println(" ");
				}
				System.out.println(" ");
			} while (iOrderArt != 1 && iOrderArt != 2);

			if (iOrderArt == 1) {
				do {
					System.out.println("Welchen Kuchen möchten Sie? (Nummer des Kuchen eingeben): ");
					iOrderNr = myScanner.nextInt();
					iOrderNr = iOrderNr - 1;

					if (iOrderNr < 0 || iOrderNr > 4) {
						System.out.println("Geben Sie eine gültige Zahl ein");
						System.out.println(" ");
					}

					if (iOrderNr >= 0 && iOrderNr <= 4) {
						System.out.println(" ");
						System.out.println("Sie haben einen " + strMenuKuchenArr[iOrderNr] + " gewählt.");
						System.out.println(" ");
						System.out.println("------------------------");
						System.out.println(" ");
					}

				} while (iOrderNr < 0 || iOrderNr > 4);
			} else {
				do {
					System.out.println("Welchen CupCake möchten Sie? (Nummer des CupCake eingeben): ");
					iOrderNr = myScanner.nextInt();
					iOrderNr = iOrderNr - 1;

					if (iOrderNr < 0 || iOrderNr > 4) {
						System.out.println("Geben Sie eine gültige Zahl ein");
						System.out.println(" ");
					}

					if (iOrderNr >= 0 && iOrderNr <= 4) {
						System.out.println(" ");
						System.out.println("Sie haben einen " + strMenuCupcakeArr[iOrderNr] + " gewählt.");
						System.out.println(" ");
						System.out.println("------------------------");
						System.out.println(" ");
					}

				} while (iOrderNr < 0 || iOrderNr > 4);
			}

			// TEST CODE

			// STEP 6 PROMPT USER TO CHOOSE FROSTING

			if (iOrderArt == 2) {
				System.out.println("Frostings:");
				for (int i = 0; i < 5; i++) {
					System.out.println("Frosting " + (i + 1) + ": " + strFrostingArr[i]);
				}

				System.out.println(" ");

				do {
					System.out.println("Welches Frosting möchten Sie? ");
					iOrderFrosting = myScanner.nextInt();
					iOrderFrosting -= 1;

					if (iOrderFrosting < 0 || iOrderFrosting > 4) {
						System.out.println("Geben Sie eine gültige Zahl ein");
						System.out.println(" ");
					}

					if (iOrderFrosting >= 0 && iOrderFrosting <= 4) {
						System.out.println(" ");
						System.out.println("Sie haben ein " + strFrostingArr[iOrderFrosting] + "-Frosting gewählt.");
						System.out.println(" ");
						System.out.println("------------------------");
						System.out.println(" ");
					}

				} while (iOrderFrosting < 0 || iOrderFrosting > 4);

				// TEST CODE

				// STEP 7 PROMPT USER TO CHOOSE FILLING

				System.out.println("Fillings:");
				for (int i = 0; i < 5; i++) {
					System.out.println("Filling " + (i + 1) + ": " + strFillingArr[i]);
				}

				System.out.println(" ");

				do {
					System.out.println("Welches Filling möchten Sie? ");
					iOrderFilling = myScanner.nextInt();
					iOrderFilling -= 1;

					if (iOrderFilling < 0 || iOrderFilling > 4) {
						System.out.println("Geben Sie eine gültige Zahl ein");
						System.out.println(" ");
					}

					if (iOrderFilling >= 0 && iOrderFilling <= 4) {
						System.out.println(" ");
						System.out.println("Sie haben ein " + strFillingArr[iOrderFilling] + "-Filling gewählt.");
						System.out.println(" ");
						System.out.println("------------------------");
						System.out.println(" ");
					}

				} while (iOrderFilling < 0 || iOrderFilling > 4);

				// TEST CODE

				// STEP 8 PROMPT USER TO CHOOSE TOPPINGS

				System.out.println("Toppings:");
				for (int i = 0; i < 5; i++) {
					System.out.println("Topping " + (i + 1) + ": " + strToppingArr[i]);
				}

				System.out.println(" ");

				do {
					System.out.println("Welches Topping möchten Sie? ");
					iOrderTopping = myScanner.nextInt();
					iOrderTopping -= 1;

					if (iOrderTopping < 0 || iOrderTopping > 4) {
						System.out.println("Geben Sie eine gültige Zahl ein");
						System.out.println(" ");
					}

					if (iOrderTopping >= 0 && iOrderTopping <= 4) {
						System.out.println(" ");
						System.out.println("Sie haben ein " + strToppingArr[iOrderTopping] + " gewählt.");
						System.out.println(" ");
						System.out.println("------------------------");
						System.out.println(" ");
					}

				} while (iOrderTopping < 0 || iOrderTopping > 4);

			}
			// TEST CODE

			// STEP 9 DISPLAY ORDER CONFIRMATION

			if (iOrderArt == 1) {
				System.out.println(" ");
				System.out.println("Bestellung von " + strKundenname + ": " + strMenuKuchenArr[iOrderNr]);
				System.out.println(" ");
				System.out.println("------------------------");
				System.out.println(" ");
			} else {
				System.out.println(" ");
				System.out.println("Bestellung von " + strKundenname + ": ");
				System.out.println(strMenuCupcakeArr[iOrderNr]);
				System.out.println(strFrostingArr[iOrderFrosting] + "-Frosting");
				System.out.println(strFillingArr[iOrderFilling] + "-Filling");
				System.out.println(strToppingArr[iOrderTopping]);
				System.out.println(" ");
				System.out.println("------------------------");
				System.out.println(" ");
			}

			// TEST CODE

			// STEP 10 DISPLAY COST AND SALES TAX
			if (iOrderArt == 1) {
				fCost = fPreisKuchen[iOrderNr];
				fTax = (fCost * 0.19f);
				fCostGesamt = fCost + fTax;
			} else {
				fCost = fPreisCupcake[iOrderNr] + fPreisFrosting[iOrderFrosting] + fPreisFilling[iOrderFilling]
						+ fPreisTopping[iOrderTopping];
				fTax = (fCost * 0.19f);
				fCostGesamt = fCost + fTax;
			}

			System.out.println(" ");
			System.out.println("Preis Ihrer Bestellung: ");
			System.out.println("------------------------");
			System.out.printf("Preis (netto): $%.2f\n", fCost);
			System.out.printf("MWST: $%.2f\n", fTax);
			System.out.printf("Preis (brutto): $%.2f\n", fCostGesamt);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Wir wünschen Ihnen einen schönen Tag - Ihr Java's Cake & Cupcake Shop!");

			System.out.println(" ");
			System.out.println(" ");
			System.out.println("------------------------");
			System.out.println(" ");

			do {
				System.out.println("Möchten Sie noch eine Bestellung tätigen? (1 für Ja / 2 für Nein)");
				
				iNochmal = myScanner.nextInt();

				if (iNochmal == 1 || iNochmal == 2) 
				{
					continue;
				}
				else
				{
					System.out.println(" ");
					System.out.println("------------------------");
					System.out.println("1 für Ja oder 2 für Nein eingeben!!!");
					System.out.println("------------------------");
					System.out.println(" ");
				}
			} while (iNochmal != 1 && iNochmal != 2);

		} while ((iNochmal == 1));
		myScanner.close();
	}

}



