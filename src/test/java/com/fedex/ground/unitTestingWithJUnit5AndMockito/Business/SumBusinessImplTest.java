package com.fedex.ground.unitTestingWithJUnit5AndMockito.Business;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumBusinessImplTest {

    @Test
    public void calculate_basicData(){

        SumBusinessImpl sumBusiness = new SumBusinessImpl();

        int actualResult = sumBusiness.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculate_emptyData(){

        SumBusinessImpl sumBusiness = new SumBusinessImpl();

        int actualResult = sumBusiness.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }
}
