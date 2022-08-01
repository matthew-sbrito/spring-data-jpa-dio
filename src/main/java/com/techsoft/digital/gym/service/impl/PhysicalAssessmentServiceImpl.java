package com.techsoft.digital.gym.service.impl;

import com.techsoft.digital.gym.service.IPhysicalAssessmentService;
import com.techsoft.digital.gym.entity.Student;
import com.techsoft.digital.gym.entity.PhysicalAssessment;
import com.techsoft.digital.gym.entity.form.PhysicalAssessmentForm;
import com.techsoft.digital.gym.entity.form.PhysicalAssessmentUpdateForm;
import com.techsoft.digital.gym.repository.StudentRepository;
import com.techsoft.digital.gym.repository.PhysicalAssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {

  private final PhysicalAssessmentRepository physicalAssessmentRepository;
  private final StudentRepository studentRepository;

  @Autowired
  public PhysicalAssessmentServiceImpl(PhysicalAssessmentRepository physicalAssessmentRepository, StudentRepository studentRepository) {
    this.physicalAssessmentRepository = physicalAssessmentRepository;
    this.studentRepository = studentRepository;
  }

  @Override
  public PhysicalAssessment create(PhysicalAssessmentForm form) throws Exception {
    PhysicalAssessment physicalAssessment = new PhysicalAssessment();
    Optional<Student> optionalStudent = studentRepository.findById(form.getStudentId());

    if(optionalStudent.isEmpty()) {
        throw new Exception("Student not found!");
    }

    Student student = optionalStudent.get();

    physicalAssessment.setStudent(student);
    physicalAssessment.setWeight(form.getWeight());
    physicalAssessment.setHeight(form.getAltura());

    return physicalAssessmentRepository.save(physicalAssessment);
  }

  @Override
  public PhysicalAssessment get(Long id) {
    return null;
  }

  @Override
  public List<PhysicalAssessment> getAll() {

    return physicalAssessmentRepository.findAll();
  }

  @Override
  public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
