package com.bank.nayana.pl.serviceimpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.bank.nayana.pl.exception.CustomException;
import com.bank.nayana.pl.model.Incom;
import com.bank.nayana.pl.model.PersonalLoan;
import com.bank.nayana.pl.service.PLoanService;
import com.bank.nayana.pl.repository.PLoanreposit;

@Service
public class PLoanServiceImpl implements PLoanService {

	@Autowired
	PLoanreposit plr;

	@Override
	public PersonalLoan savePloan(PersonalLoan Pl) {
		return plr.save(Pl);
		// return sa.getLoginId();

	}

//	@Override
//	public PersonalLoan updatePloan(int loginId, String fullName, long contactNo, double income) {
//		Optional<PersonalLoan> Opl = plr.findById(loginId);
//		if (Opl != null) {
//			PersonalLoan up = Opl.get();
//			up.setFullName(fullName);
//			up.setContactNo(contactNo);
//			up.setIncome(income);
//			return up;
//		}
//		return null;
//
//	}
	
	@Override
	public PersonalLoan updatePloan(int loginId, String fullName, long contactNo, double income) {
//		Optional<PersonalLoan> Opl = plr.findById(loginId);
//		if (Opl != null) {
//			PersonalLoan up = Opl.get();
//			up.setFullName(fullName);
//			up.setContactNo(contactNo);
//			up.setIncome(income);
//			return up;
//		}
//		else {
//		throw new CustomException("id not found");
//		}
		return plr.findById(loginId).orElseThrow(()-> new CustomException("id not found"));
	}


	@Override
	public void deletePloanById(int loginId) {
		plr.deleteById(loginId);

	}

	@Override
	public void deleteAll() {
		plr.deleteAll();
	}

	@Override
	public Optional<PersonalLoan> getPloanById(int loginId) {
		Optional<PersonalLoan> g = plr.findById(loginId);
		if (g != null) {
			System.out.println(g);
		}
		return plr.findById(loginId);

	}

	@Override
	public List<PersonalLoan> getAll() {
		List<PersonalLoan> ga = plr.findAll();
		Collections.sort(ga, new Incom());
//		Iterator<PersonalLoan> it = ga.iterator();
//		while (it.hasNext()) {
//			PersonalLoan n = it.next();
		System.out.println(ga);
		return ga;
//		}

	}

}
