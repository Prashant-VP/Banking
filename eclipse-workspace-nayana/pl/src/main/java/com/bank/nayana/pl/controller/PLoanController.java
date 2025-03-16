package com.bank.nayana.pl.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.nayana.pl.model.PersonalLoan;
import com.bank.nayana.pl.serviceimpl.PLoanServiceImpl;

@RestController
@RequestMapping("/api/personalloan")
public class PLoanController {

	
	@Autowired
	PLoanServiceImpl psi;

//	@PostMapping
//	public int savePloan(@RequestBody PersonalLoan Pl) {
//		return psi.savePloan(Pl);
//
//	}
	@PostMapping
	public ResponseEntity<PersonalLoan> savePloan(@RequestBody PersonalLoan Pl) {
		return new ResponseEntity<PersonalLoan> (psi.savePloan(Pl), HttpStatus.CREATED);
//	return new ResponseEntity<CustomerDeatails>(d11.saveCustomer(c), HttpStatus.CREATED);
	}
//	@PutMapping
//	public void updatePloan(@RequestParam("loginId") int loginId, @RequestParam("fullName") String fullName,
//			@RequestParam("contactNo") long contactNo, @RequestParam("income") double income) {
//		psi.updatePloan(loginId, fullName, contactNo, income);
//	}

	@PutMapping
	public ResponseEntity<PersonalLoan> updatePloan(@RequestParam("loginId") int loginId, @RequestParam("fullName") String fullName,
			@RequestParam("contactNo") long contactNo, @RequestParam("income") double income) {
		return new ResponseEntity<PersonalLoan> (psi.updatePloan(loginId, fullName, contactNo, income),HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public void deletePloanById(@RequestParam("loginId") int loginId) {
		psi.deletePloanById(loginId);
	}

	@DeleteMapping
	public void deleteAll() {
		psi.deleteAll();
	}

	@GetMapping("/{loginId}")
	public Optional<PersonalLoan> getPloanById(@PathVariable("loginId") int loginId) {
		return psi.getPloanById(loginId);
	}

	@GetMapping
	public List<PersonalLoan> getAll() {
		return psi.getAll();
		
	}

}
