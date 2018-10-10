package com.adineh.app;

import java.util.Scanner;

public interface CheckCoreectInputs {
	default  Integer correctIntegerReturn(Scanner inScan) {
		while(!inScan.hasNextInt()) {
			System.out.println("Please Enter Correct Number");
		}
		return inScan.nextInt();
	}
	
	default char correctGenderSelectionReturn(Scanner inScan) {
		while(inScan.next().charAt(0) != 'm' || inScan.next().charAt(0) != 'f') {
			System.out.println("Please Enter Correct Gender Selection (m/f)");
		}
		return inScan.next().charAt(0);
	}

}
