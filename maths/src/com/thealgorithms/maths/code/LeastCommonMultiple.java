package com.thealgorithms.maths.code;

import java.util.*;

/**
 * Is a common mathematics concept to find the smallest value number that can be
 * divide using either number without having the remainder.
 * https://maticschool.blogspot.com/2013/11/find-least-common-multiple-lcm.html
 * 
 * @author LauKinHoong
 */

public class LeastCommonMultiple {
	

	/*
	 * get least common multiple from two number
	 */
	public static int lcm(int num1, int num2) {
		int high = 0;
		int num3 = 0;
		int cmv = 0;
		/*
		 * value selection for the numerator
		 */
		if (num1 > num2) {
			high = num3 = num1;
		} else {
			high = num3 = num2;
		}

		while (num1 != 0) {
			if (high % num1 == 0 && high % num2 == 0) {
				cmv = high;
				break;
			}
			high += num3;
		}
		return cmv;
	}
	
	   public static int lcm2(int num1, int num2) {
	        int high = 0;
	        int num3 = 0;
	        int cmv = 0;
	        /*
	         * value selection for the numerator
	         */
	        if (num1 <= num2) {
	            high = num3 = num1;
	        } else {
	            high = num3 = num2;
	        }

	        while (num1 != 0) {
	            if (high % num1 == 0 && high % num2 == 0) {
	                cmv = high;
	                break;
	            }
	            high += num3;
	        }
	        return cmv;
	    }
}
