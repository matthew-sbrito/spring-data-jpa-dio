package com.techsoft.digital.gym.service.impl;

import com.techsoft.digital.gym.service.IStudentService;
import com.techsoft.digital.gym.entity.Student;
import com.techsoft.digital.gym.entity.PhysicalAssessment;
import com.techsoft.digital.gym.entity.form.StudentForm;
import com.techsoft.digital.gym.entity.form.StudentUpdateForm;
import com.techsoft.digital.gym.infra.utils.JavaTimeUtils;
import com.techsoft.digital.gym.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

  private final StudentRepository repository;

  @Autowired
  public StudentServiceImpl(StudentRepository repository) {
    this.repository = repository;
  }

  @Override
  public Student create(StudentForm form) {
    Student student = new Student();
    student.setName(form.getName());
    student.setRegistrationNumber(form.getRegistrationNumber());
    student.setRegistrationNumber(form.getDistrict());
    student.setBirthDate(form.getBirthDate());

    return repository.save(student);
  }

  @Override
  public Student get(Long id) {
    return null;
  }

  @Override
  public List<Student> getAll(String birthDate) {

    if(birthDate == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(birthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByBirthDate(localDate);
    }

  }

  @Override
  public Student update(Long id, StudentUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {

    Student student = repository.findById(id).get();

    return student.getAssessments();

  }

}
