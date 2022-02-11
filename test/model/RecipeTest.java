package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class RecipeTest {
	//Estado
	private Recipe recipe;
	
	//Escenario 1
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	//Escenario 2
	public void setupStage2() {
		recipe = new Recipe();
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}
	
	//primer test de la segunda tabla
	@test
	public void addIngredientTest{
		String n = "Pimienta";
		double w = 6;
		
		setupStage2();
		
		recipe.addIngredient(n, w);
		
		
		//Asserts
		assertEquals(recipe.getIngredients().get(3).getName(), n);
		assertEquals(recipe.getIngredients().get(3).getWeight(), w, 0.001);
	}
	
	
	//Segundo escenario de la segunda tabla
	@test
	public void addIngredientSecondTest(){	
		String n = "Pimienta";
		double w = 6;
		
		setupStage2();
		
		recipe.addIngredient(n, w);
				
		assertEquals(recipe.getIngredients().get(3).getName(), n);
		assertEquals(recipe.getIngredients().get(3).getWeight(), w, 0.001);
		
	}
	
	//Tercer escenario de la segunda tabla
	public void addIngredientThirdTest() {
		
		setupStage2();
		
		String n = "Ajo";
		double w = 21;
			
		try {
			recipe.getIngredients().get(1).addWeight(w);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		assertEquals(recipe.getIngredients().get(1).getName(), n);
		assertEquals(recipe.getIngredients().get(1).getWeight(), 79, 0.001);
		
	}
	
	//ultimo escenario de la segunda tabla
	public void removeIngredientTest() {
		setupStage2();
		
		String n = "Ajo";
		
		recipe.removeIngredient(n);
		
		assertEquals(recipe.getIngredients().get(1).getName(), "Arroz");
		assertEquals(recipe.getIngredients().get(1).getWeight(), 520, 0.001);
		
	}
	
	
	
	
	

}
