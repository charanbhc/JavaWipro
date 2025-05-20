package in.sp.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
	 List<User> findByFirstName(String firstName);

//	    @Query("SELECT u FROM User u WHERE u.lastName = :lastName") // Fixed query syntax
//	    List<User> findUsersByLastName(@Param("lastName") String lastName); // Fixed @Param
	    
//	    @Query("Select u  from u where u.department = : dept AND u.salary")
//	        List<USer> findbyDeptAdSalary(@Param("dept") String departmet,@Param("salary"))
}
