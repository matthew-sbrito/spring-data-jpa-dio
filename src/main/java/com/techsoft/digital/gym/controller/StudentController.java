package com.techsoft.digital.gym.controller;

import com.techsoft.digital.gym.service.impl.StudentServiceImpl;
import com.techsoft.digital.gym.entity.Student;
import com.techsoft.digital.gym.entity.PhysicalAssessment;
import com.techsoft.digital.gym.entity.form.StudentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

  private final StudentServiceImpl service;

  @Autowired
  public StudentController(StudentServiceImpl service) {
    this.service = service;
  }

  @PostMapping
  public Student create(@Valid @RequestBody StudentForm form) {
    return service.create(form);
  }

  @GetMapping("/assessments/{id}")
  public List<PhysicalAssessment> getAllPhysicalAssessmentId(@PathVariable Long id) {
    return service.getAllPhysicalAssessmentId(id);
  }

  @GetMapping
  public List<Student> getAll(
          @RequestParam(value = "birthDate", required = false)  String birthDate
  ){
    return service.getAll(birthDate);
  }


}
