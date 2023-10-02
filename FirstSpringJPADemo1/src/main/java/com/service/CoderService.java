package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Coder;

public interface CoderService {
		public List<Coder> getcoders();
		public Coder addcoder(Coder c);
		public Coder deleteCoder(Coder c2);
		public String deleteCoderById(@PathVariable String eid);
		public Optional<Coder> getCoderByName(String cname);
		public List<Coder> getCoderByTechSortedByCname(String tech);
		public Coder updatecoder(Coder c)throws Throwable; 
	}