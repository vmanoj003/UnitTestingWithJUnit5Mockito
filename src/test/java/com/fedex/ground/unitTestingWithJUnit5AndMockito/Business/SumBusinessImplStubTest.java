package com.fedex.ground.unitTestingWithJUnit5AndMockito.Business;


import com.fedex.ground.unitTestingWithJUnit5AndMockito.Data.SumDataService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumBusinessImplStubTest {

    //private SumDataService sumDataServiceMock = mock(SumDataService.class);


    @InjectMocks
    SumDataService sumDataServiceMock = mock(SumDataService.class);
    SumBusinessImpl sumBusiness = new SumBusinessImpl();

    @Before
    public void before(){
        sumBusiness.setSumDataService(sumDataServiceMock);
    }

    @Test
    public void calculate_basicData_usingStub(){


        when(sumDataServiceMock.retriveAllData()).thenReturn(new int[] {1,2,3});

        int actualResult = sumBusiness.calculateSum_usingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculate_emptyData(){

        when(sumDataServiceMock.retriveAllData()).thenReturn(new int[] {});

        int actualResult = sumBusiness.calculateSum_usingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculate_OneDataElement(){

        when(sumDataServiceMock.retriveAllData()).thenReturn(new int[] {57});

        int actualResult = sumBusiness.calculateSum_usingDataService();
        int expectedResult = 57;
        assertEquals(expectedResult,actualResult);
    }
}
