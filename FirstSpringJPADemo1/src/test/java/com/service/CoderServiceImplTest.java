package com.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.entity.Coder;
import com.repository.CoderRepository;
@SpringBootTest
class CoderServiceImplTest {
@Autowired
CoderServiceImpl coderservice;
@MockBean
CoderRepository repo;
	@Test
	void testGetcoders() {
	Coder c1=new Coder();
	c1.setId(1);
	c1.setCname("Shravan");
	c1.setTech("JAVA FS");
	Coder c2=new Coder();
	c2.setId(2);
	c2.setCname("KUMAR");
	c2.setTech("JAVA");
	List<Coder> coderlist=new ArrayList<>();
	coderlist.add(c1);
	coderlist.add(c2);
	Mockito.when(repo.findAll()).thenReturn(coderlist);
   assertThat(coderservice.getcoders()).isEqualTo(coderlist);
	}
		@Test
		void testUpdateCoder() throws Throwable{

			Coder c1 = new Coder();

			c1.setId(1);

			c1.setCname("Mrinal");

			c1.setTech("JavaFS");

			Optional<Coder> c2= Optional.of(c1);
			Mockito.when(repo.findById(1)).thenReturn(c2);

			Mockito.when(repo.save(c1)).thenReturn(c1);

			c1.setCname("Malhotra");

			c1.setTech("AI");

			assertThat(coderservice.updatecoder(c1)).isEqualTo(c1);
		}
		@Test
		void testAddCoder() throws Throwable  {
			Coder c1=new Coder();
			c1.setId(1);
			c1.setCname("Madhu");
			c1.setTech("JavaFs");

			Mockito.when(repo.save(c1)).thenReturn(c1);
			assertThat(coderservice.addcoder(c1)).isEqualTo(c1);
		}
		@Test
		void testDeleteCoder() {
			Coder c1=new Coder();
			c1.setId(1);
			c1.setCname("Madhu");
			c1.setTech("JavaFs");
			Optional<Coder> c2=Optional.of(c1);

			Mockito.when(repo.findById(1)).thenReturn(c2);
			Mockito.when(repo.existsById(c1.getId())).thenReturn(false);
			assertFalse(repo.existsById(c1.getId()));
		}
}
