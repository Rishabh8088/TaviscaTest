package com.comp.beverage.menu;

import java.util.Scanner;

import com.comp.beverage.menu.ingredients.CoffeeIngredients;
import com.comp.beverage.menu.ingredients.MojitoIngredients;
import com.comp.beverage.menu.ingredients.ShakeIngredients;
import com.comp.beverage.menu.ingredients.SmootheeIngredients;
import com.comp.beverage.menu.ingredients.TeaIngredients;
import com.comp.beverage.menu.menu.ShopMenu;

public class DisplayMenu {

	public static void showMenu() {
		System.out.println("*************************Welcome to Coffee Shop***************************************");

		Scanner sc = new Scanner(System.in);
		int inputSelection = 0;
		int input;
		do {
			System.out.println(
					"Would you like to \n 1. Tea \n 2. Coffee \n 3. Banana Smoothee \n 4. Strawerry Shake \n 5. Mojito \n 6. QUIT?");

			input = sc.nextInt();
			inputSelection++;

			switch (input) {

			case (ShopMenu.TEA):
				new TeaIngredients().teaIngredient();

				break;
			case (ShopMenu.COFFEE):
				new CoffeeIngredients().coffeeIngredient();
				break;
			case (ShopMenu.SMOOTHEE):
				new SmootheeIngredients().smootheeIngredient();
				break;
			case (ShopMenu.SHAKES):
				new ShakeIngredients().shakesIngredient();
				break;
			case (ShopMenu.MOJITO):
				new MojitoIngredients().mojitoIngredient();
				break;
			case (ShopMenu.QUIT):
				System.exit(0);
				break;
			default:
				System.out.println("This menu is not in option");
			}

		} while (input != 0 && inputSelection < 6);

	}

}
