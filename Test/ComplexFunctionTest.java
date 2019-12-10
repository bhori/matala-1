package Ex1.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ex1.ComplexFunction;
import Ex1.Operation;
import Ex1.Polynom;
import Ex1.function;

class ComplexFunctionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testF() {
		Polynom p1 = new Polynom("x+x^2");
		Polynom p2 = new Polynom("x^2");
		ComplexFunction cf1 = new ComplexFunction("plus", p1, p2);
		assertEquals(10, cf1.f(2));
		ComplexFunction cf2 = new ComplexFunction("mul", p1, p2);
		assertEquals(24, cf2.f(2));
		ComplexFunction cf3 = new ComplexFunction("div", p1, p2);
		assertEquals(1.5, cf3.f(2));
		ComplexFunction cf4 = new ComplexFunction("max", p1, p2);
		assertEquals(6, cf4.f(2));
		ComplexFunction cf5 = new ComplexFunction("min", p1, p2);
		assertEquals(4, cf5.f(2));
		ComplexFunction cf6 = new ComplexFunction("comp", p1, p2);
		assertEquals(20, cf6.f(2));
		function cf7 = cf1.copy();
		assertEquals(10, cf7.f(2));
	}
	
	@Test
	void testInitFromString() {
		Polynom p1 = new Polynom("x+x^2");
		Polynom p2 = new Polynom("x^2");
		ComplexFunction cf1 = new ComplexFunction("mul",p1,p2);
		function cf2 = cf1.initFromString(cf1.toString());
		assertEquals(cf1.toString(), cf2.toString());
		ComplexFunction cf3 = new ComplexFunction(Operation.None,p1,null);
		function cf4 = cf3.initFromString(cf3.toString());
		assertEquals(cf3.toString(), cf4.toString());
		ComplexFunction cf5 = new ComplexFunction("das2342",p1,p2);
		function cf6 = cf5.initFromString(cf5.toString());
		assertEquals(cf5.toString(), cf6.toString());
	}
	
	@Test
	void testToString() {
		
	}

	@Test
	void testEquals() {
		
	}
	
	@Test
	void testCopy() {
		Polynom p1 = new Polynom("x+x^2");
		Polynom p2 = new Polynom("x^2");
		ComplexFunction cf1 = new ComplexFunction("mul",p1,p2);
		function cf2 = cf1.copy();
		assertEquals(cf1, cf2);
		assertTrue(cf1.equals(cf2));
	}
	
	@Test
	void testPlus() {
		
	}
	
	@Test
	void testMul() {
		
	}
	
	@Test
	void testDiv() {
		
	}
	
	@Test
	void testMax() {
		
	}
	
	@Test
	void testMin() {
		
	}
	
	@Test
	void testComp() {
		
	}
	
	@Test
	void testLeft() {
		
	}
	
	@Test
	void testRight() {
		
	}
	
	@Test
	void testGetOp() {
		
	}
}
