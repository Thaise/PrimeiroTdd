import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomarUmMaisUm(){
		int resultado = Calculadora.somar(1,1);
		assertEquals(2, resultado);
	}
	
	@Test
	public void deveSomarDoisMaisDois(){
		int resultado = Calculadora.somar(2,2);
		assertEquals(4, resultado);
	}
	
	@Test
	public void deveSomarTresMaisTres(){
		int resultado = Calculadora.somar(3,3);
		assertEquals(6, resultado);
	}
	@Test
	public void deveSomarQuatroMaisQuatro(){
		int resultado = Calculadora.somar(4,4);
		assertEquals(8, resultado);
	}

	@Test
	public void deveMultiplicarUmVezesUm(){
		int resultado = Calculadora.multiplicar(1,1);
		assertEquals(1, resultado);
	}
	
	@Test
	public void deveMultiplicarDoisVezesDois(){
		int resultado = Calculadora.multiplicar(2, 2);
		assertEquals(4, resultado);
	}
	
	@Test
	public void deveDividirUmDivididoPorUm(){
		int resultado = Calculadora.dividir(1,1);
		assertEquals(1, resultado);
	}
}
