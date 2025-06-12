package com.duclh.tool;

import com.duclh.tool.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunsWell();
        testFactorialGivenRightArgument1RunsWell();
        testFactorialGivenRightArgumentRunsWell();
    }

    public static void testFactorialGivenRightArgumentRunsWell()
    {
        System.out.println("2! expected: 2 actual: " + MathUtility.getFactorial(2));
        System.out.println("3! expected: 6 actual: " + MathUtility.getFactorial(3));
        System.out.println("4! expected: 24 actual: " + MathUtility.getFactorial(4));
        System.out.println("5! expected: 120 actual: " + MathUtility.getFactorial(5));
    }

    //TEST THỬ HÀM VỪA GÕ
    //CẦN CÓ TEST CASE
    //TEST CASE #1: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    //STEPS: GIVEN N = 0
    //       CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT 0!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY XEM SAO!

    public static void testFactorialGivenRightArgument0RunsWell()
     {
         int n = 0;
         long expected = 1;
         long actual = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
         System.out.println("0! expected: " + expected + " actual: " + actual);
     }

    //TEST CASE #1: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 1
    //STEPS: GIVEN N = 1
    //       CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT 1!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY XEM SAO!

    public static void testFactorialGivenRightArgument1RunsWell()
    {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        System.out.println("1! expected: " + expected + " actual: " + actual);
    }

     //TDD: TEST DRIVEN DEVELOPMENT
    //VIẾT CODE CHÍNH LÀ VIẾT TEST CASE/TEST RUN SONG SONG VỚI NHAU
    //CỨ VIẾT ĐC CODE NÀO, THÌ CÓ TEST CASE CHO NÓ
    //TEST CASE DÙNG ĐỂ TEST HÀM (KO NHẦM VỚI TEST APP - TEST MÀN HÌNH UI VÀ NHẬP LIỆU...)
    //CHỈ DÀNH CHO CHÍNH DÂN DEV (DÂN QA/QC KO DÍNH VÀO CODE CỦA PROJECT)

    //NHỜ TDD, TDD ĐÓNG GÓP 1 PHẦN GIÚP TA TỰ ĐỘNG HÓA QUÁ TRÌNH BUILD, CHECK BUG, ĐÓNG GÓI NẾU CODE ỔN
    //DEPLOY LÊN STAGING SERVER (SERVER ĐỂ TEST APP)
    //CODE ---> CHECK VAR CODE (UNIT TEST, TDD)
    //                OKIE THÌ ĐÓNG GÓI APP
    //                       ĐƯA APP LÊN SERVER
    //QUY TRÌNH NÀY LÀ CI/CD

    //CV CÓ 1 MỤC:
    //Technical Skills: ------------
    //JUnit
    //TDD
    //CI/CD
    //Maven
}