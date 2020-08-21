package org.eialid.joy.springboot.crudrestteacher.springDataJPA;

import org.eialid.joy.springboot.crudrestteacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
