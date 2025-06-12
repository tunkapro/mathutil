package com.duclh.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@Test mang ý nghĩa biến hàm ở sát dưới thành hàm main() thì mới chạy lệnh test khi run app!!!
    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1; //HI VỌNG N = 0, TỨC LÀ 0! SẼ CÓ GIÁ TRỊ LÀ 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so sánh giúp tui xem thực tế có như kì vọng hem???
        //nếu ko thì ra màu đỏ, tick đỏ
        //nếu expected == actual thì ra màu xanh, tick xanh
    }

    //TEST CASE #2: VERIFY GETFACTORIAL WITH N = 1
    @Test
    void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected = 1; //HI VỌNG N = 1, TỨC LÀ 0! SẼ CÓ GIÁ TRỊ LÀ 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so sánh giúp tui xem thực tế có như kì vọng hem???
        //nếu ko thì ra màu đỏ, tick đỏ
        //nếu expected == actual thì ra màu xanh, tick xanh
    }

    //TEST CASE #3: VERIFY GETFACTORIAL WITH N = 1
    @Test
    void testFactorialGivenRightArgumentRunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }

    //TEST CASE #4: (BẮT NGOẠI LỆ)
    //VERIFY getFactorial() WITH n < 0, e.g. n = 5 to throw an Exception
    //Steps:
    //1. Given an ivalid number, n = -5
    //2. Call/invoke the function getFactorial(-5)
    //Expected result:
    //                an IllegalArgumentException will be thrown
    //NẾU ĐƯA -5 CÀ CHỚN, HY VỌNG SẼ NHÌN THẤY NGOẠI LỆ
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException(){
        //MathUtility.getFactorial(-5);
        //ta phải kiểm soát, ta phải đo xem ngoại lệ đã đến chưa là -5 đưa vào !!!!!!
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
        //so sánh, đo xem, nhòm xem, ngoại lệ đã xh chưa nếu gọi -5!
        //cú pháp biểu thức lambda

    }
}