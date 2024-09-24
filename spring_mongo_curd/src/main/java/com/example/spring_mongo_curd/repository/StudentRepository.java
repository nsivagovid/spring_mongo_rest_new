package com.example.spring_mongo_curd.repository;



import com.example.spring_mongo_aggriate.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
