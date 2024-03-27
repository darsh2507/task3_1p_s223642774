package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh Patel";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		
		DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test 
	 public void testMinjune1ShouldIncrementTojune2() { 
	     DateUtil date = new DateUtil(1, 6, 1994); 
	     System.out.println("MinJune1ShouldIncrementToJune2 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(2, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 }
	
	
	
	@Test 
	 public void testMinjune2ShouldIncrementTojune3() { 
	     DateUtil date = new DateUtil(2, 6, 1994); 
	     System.out.println("MinJune2ShouldIncrementToJune3 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(3, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 }
	
	@Test 
	 public void testMinjune15ShouldIncrementTojune16() { 
	     DateUtil date = new DateUtil(15, 6, 1994); 
	     System.out.println("MinJune15ShouldIncrementToJune16 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 } 
	
	@Test 
	 public void testMinjune30ShouldIncrementTojuly1() { 
	     DateUtil date = new DateUtil(30, 6, 1994); 
	     System.out.println("MinJune30ShouldIncrementToJuly1 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(1, date.getDay()); 
	     Assert.assertEquals(7, date.getMonth()); 
	 }
	
	
	@Test 
	 public void testMinjune31ShouldIncrementTojuly1() { 
	     DateUtil date = new DateUtil(31, 6, 1994); 
	     System.out.println("MinJune31ShouldIncrementToJuly1 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(1, date.getDay()); 
	     Assert.assertEquals(7, date.getMonth()); 
	 } 
	
	
	
	@Test 
	 public void testMinjan15ShouldIncrementTojan16() { 
	     DateUtil date = new DateUtil(15, 1, 1994); 
	     System.out.println("MinJan15ShouldIncrementToJan16 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(1, date.getMonth()); 
	 } 
	  
	 @Test 
	 public void testMinfebruary15ShouldIncrementTofebruary16() { 
	     DateUtil date = new DateUtil(15, 2, 1994); 
	     System.out.println("MinFeb15ShouldIncrementToFeb16 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(2, date.getMonth()); 
	 } 
	
	
	 @Test 
	 public void testMinnovember15ShouldIncrementTonovember16() { 
	     DateUtil date = new DateUtil(15, 11, 1994); 
	     System.out.println("MinNov15ShouldIncrementToNov16 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(11, date.getMonth()); 
	 } 
	  
	 @Test 
	 public void testMindecember15ShouldIncrementTodecember16() { 
	     DateUtil date = new DateUtil(15, 12, 1994); 
	     System.out.println("MinDec15ShouldIncrementToDec16 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(12, date.getMonth()); 
	 }
	
	 
	 @Test 
	 public void testMinJune15ShouldIncrementToJune161700() { 
	     DateUtil date = new DateUtil(15, 6, 1700); 
	     System.out.println("MinJune15ShouldIncrementToJune161700 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 } 
	  
	 @Test 
	 public void testMinjune15ShouldIncrementTojune161701() { 
	     DateUtil date = new DateUtil(15, 6, 1701); 
	     System.out.println("MinJune15ShouldIncrementToJune161701 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 } 
	  
	 @Test 
	 public void testMinjune15ShouldIncrementTojune162023() { 
	     DateUtil date = new DateUtil(15, 6, 2023); 
	     System.out.println("MinJune15ShouldIncrementToJune162023 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 }
	
	
	 
	 @Test 
	 public void testMinjune15ShouldIncrementTojune162024() { 
	     DateUtil date = new DateUtil(15, 6, 2024); 
	     System.out.println("MinJune15ShouldIncrementToJune162024 > " + date); 
	     date.increment(); 
	     System.out.println(date); 
	     Assert.assertEquals(16, date.getDay()); 
	     Assert.assertEquals(6, date.getMonth()); 
	 }
	
	
	
	
	@Test
public void test28thfebruaryShouldIncrementTomarch1() {
	    DateUtil date = new DateUtil(28, 2, 2024);
    System.out.println("testFebruaryShouldIncrementToMarch > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testfebruary29ShouldIncrementTomarch1InLeapYear() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("testFebruary29ShouldIncrementToMarch1InLeapYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}
}
