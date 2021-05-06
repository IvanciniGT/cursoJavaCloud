package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void probarSuma5y3(){
        assertTrue( 8 == App.suma(3,5) );
    }
    @Test
    public void probarSuma5yM3(){
        assertTrue( 2 == App.suma(-3,5) );
    }
    @Test
    public void probarSumaM5y3(){
        assertTrue( -2 == App.suma(3,-5) );
    }
    @Test
    public void probarSumaM5yM3(){
        assertTrue( -8 == App.suma(-3,-5) );
    }
    @Test
    public void probarSuma0yM5(){
        assertTrue( -5 == App.suma(0,-5) );
    }
    @Test
    public void probarSuma4y0(){
        assertTrue( 4 == App.suma(4,0) );
    }
    @Test
    public void probarSuma0y0(){
        assertTrue( 0 == App.suma(0,0) );
    }
    
    
}
