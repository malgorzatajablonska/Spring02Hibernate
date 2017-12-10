package pl.coderslab;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository <Publisher, Integer>{
	
	public List<Publisher> findByNip(int nip);
	
	public List<Publisher> findByRegon(int regon);

	

}
