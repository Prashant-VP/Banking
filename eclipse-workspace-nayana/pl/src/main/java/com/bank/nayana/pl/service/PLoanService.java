package com.bank.nayana.pl.service;

import java.util.List;
import java.util.Optional;

import com.bank.nayana.pl.model.PersonalLoan;

public interface PLoanService {

	public PersonalLoan savePloan(PersonalLoan Pl);

	public PersonalLoan updatePloan(int loginId, String fullName, long contactNo, double income);

	public void deletePloanById(int loginId);

	public void deleteAll();

	public Optional<PersonalLoan> getPloanById(int loginId);

	public List<PersonalLoan> getAll();

}
