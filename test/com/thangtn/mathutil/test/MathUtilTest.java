/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thangtn.mathutil.test;

import com.thangtn.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thang
 */
public class MathUtilTest {
    
    //case #1 check the getF() with valid argument (n=0...20)
    //n = 0 expected 1 
    @Test
    public void testFactorialGivenValidArgumentReturnWell() {
        long expected = 1;
        long actual = MathUtil.getFratorial(0);
        
        assertEquals(expected, actual);
    }
    //case #2 check the getF() with valid argument (n=0...20)
    //n = 6 expected 720 
    @Test
    public void testFactorialGivenValidArgumentN6ReturnWell() {
        long expected = 720;
        long actual = MathUtil.getFratorial(6);
        
        assertEquals(expected, actual);
    }
    //test ngoại lệ 
    // Nhó ngoại lệ ko phải là một value, mà nó là tình huống bất thường 
    // có khả năng xảy ra 
    //ko thể so sánh theo kiểu asserEqual()
    //Chỉ có thể do bằng cách nó có xuất hiện hay ko 
    
     //case #3 check the getF() with invalid 
    //n=-5
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        MathUtil.getFratorial(-5);
    }
}
