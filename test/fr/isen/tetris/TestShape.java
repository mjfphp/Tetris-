package fr.isen.tetris;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.ubo.tetris.Tetrominoes;
import fr.ubo.tetris.Shape;
//import static org.junit.Assert.assertNoEquals;


public class TestShape {

	private static Shape shape;

	@BeforeClass
	public static void setup() {
		shape = new Shape();
	}
	
	@Test
	public void setRandomShape() {
		Assert.assertEquals(Tetrominoes.NoShape, shape.getShape());
		shape.setRandomShape();
		Assert.assertNotEquals(Tetrominoes.NoShape, shape.getShape());
	}
}
