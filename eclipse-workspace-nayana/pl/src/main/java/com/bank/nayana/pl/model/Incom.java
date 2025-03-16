package com.bank.nayana.pl.model;

import java.util.Comparator;

public class Incom implements Comparator<PersonalLoan> {

	@Override
	public int compare(PersonalLoan o1, PersonalLoan o2) {
		// TODO Auto-generated method stub
		double in = o1.getIncome();
		double in1 = o2.getIncome();
		if (in > in1) {
			return -1;
		} else if (in < in1) {
			return 1;
		} else {
			return 0;
		}
	}

}
