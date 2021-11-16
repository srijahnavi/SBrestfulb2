package dxc.b2;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * JpaRepository will generate the required sql statements for you
 * @author Jahnavi
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
  List<Student> findById(int id);

  List<Student> findByName(String name);
}


