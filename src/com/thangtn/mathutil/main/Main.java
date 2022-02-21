/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thangtn.mathutil.main;

import com.thangtn.mathutil.core.MathUtil;

/**
 *
 * @author thang
 */
//static dùng cho các hàm dùng chung 
public class Main {
    public static void main(String[] args) {
        // test thử hàm tính giai thừ chạy đúng ko 
        // so sánh giữa expected và actual 
        // tưởng tượng các test case 
        
        //case #1 check the getF() with valid argument (n=0...20)
        //n = 0 expected 1 
        long expected = 1;
        long actual = MathUtil.getFratorial(0);
        // so sánh giữa expected và actual
        System.out.println("Check 0!; expected:  "+ expected + 
                "; actual: " +actual);
        
        //case #2 check the getF() with valid argument (n=0...20)
        //n = 6 expected 6! = 720
         actual = MathUtil.getFratorial(6);
        System.out.println("Check 0!; expected:  "+ expected + 
                "; actual: " +actual);
        
        //case #3: check the getF() with invalid argument
        //expected= illiagaal exception => n=-5
        actual = MathUtil.getFratorial(-5);
        
    }

}
