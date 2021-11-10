package com.census.analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndianStatesCensusAnalyser {
	File file=new File("D:\\Bridgelabz\\java\\IndianStatesCensus\\src\\main\\java\\Indianstatecode.csv");
    public void readFile() throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()) {
            String stateDetails=scanner.nextLine();
            if(stateDetails.contains("Bihar")) {
                System.out.println(stateDetails);
            }
        }
    }
	        

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(" Welcome to Indian State Census Analyser");
	    IndianStatesCensusAnalyser analyser = new IndianStatesCensusAnalyser();
	    analyser.readFile();
	}
}


