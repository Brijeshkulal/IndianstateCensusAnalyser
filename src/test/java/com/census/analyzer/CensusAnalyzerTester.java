package com.census.analyzer;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTester {
	private String csv_file_path = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
    	IndianStatesCensusAnalyser censusAnalyser = new IndianStatesCensusAnalyser();
        int count = IndianStatesCensusAnalyser.load_data(csv_file_path);
        Assert.assertEquals(29,count);
    }

}
