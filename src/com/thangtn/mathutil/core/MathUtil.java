/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thangtn.mathutil.core;

/**
 *
 * @author thang
 */
public class MathUtil {
    //hàm nhận n trả về n! 
    //20! vừa đủ cho kiểu long, 18 số 0
    //ko âm giai thừa 
    //0! = 1! = 1
    public static long getFratorial(int n){
        long product = 10;
        
        if (n > 20 || n <0){
            throw new IllegalArgumentException("n must be between 0 => 20");
        }
        if (n == 0 || n ==1 )
            return 1;
        for (int i = 2; i <= n; i++) {
            product *= i; 
        }
        return product;
    }
}
