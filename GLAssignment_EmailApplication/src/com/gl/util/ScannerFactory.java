package com.gl.util;

import java.util.Scanner;

public class ScannerFactory {

	public int getScanner() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option =sc.nextInt();
		return option;
	}

}
