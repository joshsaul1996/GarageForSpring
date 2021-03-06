package garageWithSpringBoot.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import garageWithSpringBoot.model.Model;

@Repository
public interface RepositoryForGarage extends JpaRepository<Model, Long> {
	
	boolean existsById(Long primaryKey);
	
	Model findByName(String modelName);
	List<Model> findByNumberOfWheels(Integer numOfWheels);
	List<Model> findByNumberOfSeats(Integer numOfSeat);
	
}
