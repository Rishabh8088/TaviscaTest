package com.comp.beverage.menu.ingredients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShakeIngredients {

	public float finalPrice = 7.0f;

	public void shakesIngredient() {
		System.out.println("*******You Selected Tea*********");

		Scanner sc = new Scanner(System.in);
		int inputSelection = 0;

		int input;
		List<String> ingredientList = new ArrayList<String>(
				Arrays.asList("Strawberries", "Milk", "Sugar", "Water", "Confirm Order?"));

		List<String> removedIngredientList = new ArrayList<>();

		do {
			System.out.println("Select the ingredient you want to remove ");
			for (int counter = 0; counter < ingredientList.size(); counter++) {
				System.out.println(counter + 1 + " " + ingredientList.get(counter));
			}
			input = sc.nextInt();
			inputSelection++;

			switch (input) {
			case (STRAWBERRIES):
				finalPrice = finalPrice - 0.5f;
				removedIngredientList.add(ingredientList.remove(input - 1));
				checkSizeOfIngredients(ingredientList);
				break;
			case (SUGAR):
				finalPrice = finalPrice - 1f;
				removedIngredientList.add(ingredientList.remove(input - 1));
				checkSizeOfIngredients(ingredientList);
				break;
			case (MILK):
				removedIngredientList.add(ingredientList.remove(input - 1));
				checkSizeOfIngredients(ingredientList);
				finalPrice = finalPrice - 1.5f;
				break;
			case (WATER):
				removedIngredientList.add(ingredientList.remove(input - 1));
				checkSizeOfIngredients(ingredientList);
				finalPrice = finalPrice - 0.5f;
				break;
			case (CONFIRM_ORDER):
				displayPrice(ingredientList, removedIngredientList, finalPrice);
				break;
			default:
				System.out.println("This menu is not in option");
			}

		} while (input != 0 && inputSelection < 4);

	}

	private void checkSizeOfIngredients(List<String> ingredientList) {
		if (ingredientList.size() == 0)
			System.out.println("you can't remove more ingredients");
	}

	private void displayPrice(List<String> ingredients, List<String> removedIngredientList, float finalPrice) {
		System.out.println("Thankyou for your order :\n find details below  : \n" + "[Ingredients " + ingredients
				+ "], " + "RemovedIngredients" + removedIngredientList + " and Price : " + finalPrice);

	}

	private static final int STRAWBERRIES = 1;
	private static final int SUGAR = 2;
	private static final int MILK = 3;
	private static final int WATER = 4;
	private static final int CONFIRM_ORDER = 5;
}
