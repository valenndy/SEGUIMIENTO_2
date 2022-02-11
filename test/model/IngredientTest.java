package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	//Estado
	private Ingredient ingredient;
	
	
	//Primer escenario
	public void setupStage1() {
		ingredient = new Ingredient ("Tomate", 245);
	}
	
	//Primer test de la segunda tabla
	@test
	public void testAddPositiveWeight() throws NegativeNumberException {
		
		double w = 54;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 299, 0.001);
	}
	
	//Segundo test de la tabla
	@test
	public void testAddNegativeWeight() throws NegativeNumberException {
		double w = -100;
		
		setupStage1();
		ingredient.addWeight(w);
		
		assertEquals(ingredient.getWeight(), 245, 0.001);
		
	}
	
	//Tercer test de la tabla
	@test
	public void testRemovePositiveWeight() throws NegativeNumberException {
		double w = 45;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 200, 0.001);
		
	}
	
	//Cuarto test de la tabla
	@test
	public void testRemoveWeightNegative() throws NegativeNumberException{
		double w = -100;
		
		setupStage1();
		ingredient.removeWeight(w);

		assertEquals(ingredient.getWeight(), 245, 0.001);
	}
	
	
	
	

}
