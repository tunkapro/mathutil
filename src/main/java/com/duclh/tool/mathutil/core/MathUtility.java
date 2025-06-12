package com.duclh.tool.mathutil.core;

public class MathUtility {

    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TỆN ÍCH DÙNG CHUNG CHO MỌI NƠI

    //ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    // HÀM NÀY TÍNH N!
    // N! = 1.2.3...N
    //KO CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    //20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG
//    public static long getFactorial(int n) {
//        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20");
//         //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về
//
//        if(n == 0)
//            return 1;
//
//        //sống sót tới đây n = 1..19
//        //for mà tính
//        long result = 1; //thuật toán dồn con heo đất
//        for(int i = 1; i <= n; i++)
//            result *= i;
//
//        return result;
//    }
    // đem lên server mà ra màu xanh
    // 1 code tối ưu ngon vì pass test case
    //2. test lại thứ từng test rất mất công, nay có script test, khỏe khỏi test lại chỉ biết màu xanh là đc
    // Đệ quy - Recursion - gọi lại chính mình voi quy mô nhỏ hơn
    public static long getFactorial(int n) {
        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về

        if(n == 0)
            return 1;

        return n*getFactorial(n-1);
    }

}
