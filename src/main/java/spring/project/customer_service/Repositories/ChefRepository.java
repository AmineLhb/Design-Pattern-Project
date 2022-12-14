package spring.project.customer_service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import spring.project.customer_service.Models.Chef;

@Repository
@CrossOrigin("*")
public interface ChefRepository extends JpaRepository<Chef,Long> {
    Chef findChefByName(String name);
}
