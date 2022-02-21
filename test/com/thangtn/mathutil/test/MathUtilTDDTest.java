/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thangtn.mathutil.test;

import com.thangtn.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author thang
 */
@RunWith(value = Parameterized.class)
public class MathUtilTDDTest {

    //cần test hàm getFractorial()
    //3 việc: chuẩn bị data,  đưa data vào gọi hàm , kl đúng sai
    //tạo một mảng, bảng sql server .csv để chia các bộ dữ liệu table data 
    @Parameterized.Parameters //báo biết đây là data nguồn nhồi vao assert
    public static Object[][] initData() {
        int a[] = {2, 4, 6, 8};
        return new Integer[][]
        {
                                    {0,1},
                                    {1,1},
                                    {2,2},
                                    {3,6},
                                    {6,720},
            
        };
    }
    // cần trích data từ mảng lớn để dc cặp input, expected
    @Parameterized.Parameter(value = 0)
    public int input;
    
    @Parameterized.Parameter(value = 1)
    public int expected;
    
    @Test
    public void testFactorialGivenValidArgumentReturnWell() {

        long actual = MathUtil.getFratorial(input);
        assertEquals(expected, actual);
    }
//DDT tách data cần test ra 1 chổ, sau đó lấy từng miếng vào trong chỗ gọi hàm assert 
    //phải thông qua tên biến và tham số 
    // do đó DDT còn gọi là THAM SỐ HÓA 
    
    
}
