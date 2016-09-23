package base;
//changessss
import static org.junit.Assert.*;



public class MyInteger_Tests {
	public static MyInteger num1;
	public static MyInteger num2;
	public static MyInteger num3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		num1 = new MyInteger(5);
		num2 = new MyInteger(10);
		num3 = new MyInteger(5);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_1()
	{
		assertFalse(num1.isEven());
		assertTrue(num2.isEven());
	
		
	}
	
	@Test
	public void test_2()
	{
		assertTrue(num1.isOdd());
		assertFalse(num2.isOdd());
	}
	
	@Test
	public void test_3()
	{
		assertTrue(num1.isPrime());
		assertFalse(num2.isPrime());
	}
	@Test 
	public void test_4()
	{
		assertTrue(MyInteger.isEven(6))
		
	}
	@Test
	public void test_5()
	{
		assertTrue(MyInteger.isOdd(7));
		assertFalse(MyInteger.isOdd(8));
	}
	@Test 
	public void test_6()
	{
		assertTrue(MyInteger.isPrime(5));
		assertFalse(MyInteger.isPrime(8));
	}
	@Test
	public void test_7()
	{
		assertTrue(MyInteger.isPrime(num1));
		assertFalse(MyInteger.isPrime(num2));
	}
	@Test
	public void test_8()
	{
		assertTrue(MyInteger.isPrime(num1));
		assertFalse(MyInteger.isPrime(num2));
		
	}
	@Test
	public void test_9()
	{
		assertTrue(MyInteger.isEven(num3));
		assertTrue(MyInteger.isEven(num2));
		
	}
	@Test
	public void test_10()
	{
		assertTrue(MyInteger.isOdd(num2));
		assertTrue(MyInteger.isOdd(num1));
		
	}
	@Test 
	public void test_11()
	{
		assertTrue(num1.isEquals(5))
		assertFalse(num2.isEquals(6));
		
	}
	@Test
	public void test_12()
	{
		assertTrue(num1.isEquals(num3));
		assertFalse(num2.isEquals(num3));
		
	}
	

}
