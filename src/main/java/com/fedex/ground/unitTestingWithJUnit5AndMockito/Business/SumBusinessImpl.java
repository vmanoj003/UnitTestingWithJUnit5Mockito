package com.fedex.ground.unitTestingWithJUnit5AndMockito.Business;

import com.fedex.ground.unitTestingWithJUnit5AndMockito.Data.SumDataService;

public class SumBusinessImpl {

    private SumDataService sumDataService;

    public void setSumDataService(SumDataService sumDataService) {
        this.sumDataService = sumDataService;
    }


    public int calculateSum(int[] data){

        int sum =0;

        for(int value: data){

            sum+= value;
        }

        return sum;
    }


    public int calculateSum_usingDataService(){

        int sum =0;

        int[] data = sumDataService.retriveAllData();
        for(int value: data){

            sum+= value;
        }

        return sum;
    }
}
