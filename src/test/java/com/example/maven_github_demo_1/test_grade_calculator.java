package com.example.maven_github_demo_1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class test_grade_calculator 
{
@Test
void testTotal()
{
	assertEquals(225,grade_calculator.calculatetotal(75,68,82));
}
@Test
void testaverage()
{
	assertEquals(75,grade_calculator.calculateaverage(75,68,82));
}
@Test
void testpass()
{
	assertTrue(grade_calculator.ispass(75.0));
}
@Test
void testFail()
{
	assertFalse(grade_calculator.ispass(35.0));
}
}
