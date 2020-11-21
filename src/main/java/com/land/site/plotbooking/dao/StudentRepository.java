package com.land.site.plotbooking.dao;

import com.land.site.plotbooking.models.Student;
import org.springframework.data.repository.CrudRepository;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}