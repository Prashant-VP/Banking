package com.bank.nayana.pl.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.nayana.pl.model.PersonalLoan;

@Repository
public interface PLoanreposit extends JpaRepository<PersonalLoan, Integer> {

}
