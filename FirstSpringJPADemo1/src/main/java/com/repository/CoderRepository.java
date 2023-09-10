package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.Coder;
@Repository
public interface CoderRepository extends JpaRepository<Coder,Integer>{
	// we need not to write any code beacuse internally Spring freamework written class

}