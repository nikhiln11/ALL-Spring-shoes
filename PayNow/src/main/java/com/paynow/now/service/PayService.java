package com.paynow.now.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paynow.now.model.BIC;
//import com.paynow.now.model.Account;
import com.paynow.now.model.Sender;
import com.paynow.now.repo.BICRepo;
//import com.paynow.now.repo.AccountRepo;
import com.paynow.now.repo.SenderRepo;

@Service
public class PayService {
	@Autowired
	SenderRepo myRepo; 
	@Autowired
	BICRepo iRepo;
	public List<Sender> getAllSenders()
	{
		List<Sender> a = myRepo.findAll();
		return a;
	}
	public List<BIC> getAllBIC()
	{
		List<BIC> a = iRepo.findAll();
		return a;
	}
	public Optional<Sender> authenticate(double a)
	{
		Optional<Sender> a1=myRepo.findById(a);
		return a1;
	}
	public Optional<BIC> bicAuthen(String a)
	{
		Optional<BIC> b1=iRepo.findById(a);
		return b1;
	}

}
