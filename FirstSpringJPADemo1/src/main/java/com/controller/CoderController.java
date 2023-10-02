package com.controller;
import java.util.ArrayList;

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

import org.springframework.web.bind.annotation.RestController;
import com.entity.Coder;
import com.service.CoderServiceImpl;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api")
public class CoderController {
	@Autowired
	CoderServiceImpl coderservice;
@GetMapping("/getcoder")
public Coder getCoder()
{
	 Coder c1=new Coder();
	 c1.setId(1);
	 c1.setCname("shravan");
	 c1.setTech("Java");
	 return c1;
}
@GetMapping("/getcoders")
	public List<Coder> getCoders() {

		List<Coder> list= coderservice.getcoders();

		return list;
}
@PostMapping("/addcoder")
public Coder addcoder(@Valid @RequestBody Coder c1) throws Throwable

{
	coderservice.addcoder(c1);
	 return c1;
}
@DeleteMapping(path="/deletecoder")
public Coder deleteCoder(@RequestBody Coder c2)throws Throwable

{
	  Coder c1=coderservice.deleteCoder(c2);
	  return c1;
	 // return "deleted";
}
@DeleteMapping(path="/deletecoder/{eid}")
public String deleteCoderById(@PathVariable String eid)

{
	  coderservice.deleteCoderById(eid);
	  return "deleted";
}
@PutMapping("/updatecoder")
public Coder updatecoder(@Valid @RequestBody Coder c3)throws Throwable

{
	 Coder c1=coderservice.updatecoder(c3);
	 
	 return c1;
} 
@GetMapping("/getcoderbycname/{cname}")
public Optional<Coder> getCoderByname(@PathVariable String cname) {
	Optional<Coder> c1=coderservice.getCoderByName(cname);
	return c1;
}
@GetMapping("/getcoderbytechsortedbycname/{tech}")
public ResponseEntity<List<Coder>>getCoderByTechSortedByCname(@PathVariable String tech)  {
	List<Coder> lc=coderservice.getCoderByTechSortedByCname(tech);
	ResponseEntity re=new ResponseEntity<List<Coder>>(lc,HttpStatus.OK);
	return re;
}
}