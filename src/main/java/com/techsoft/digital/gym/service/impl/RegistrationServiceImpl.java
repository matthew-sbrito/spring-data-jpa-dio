package com.techsoft.digital.gym.service.impl;

import com.techsoft.digital.gym.entity.Student;
import com.techsoft.digital.gym.entity.Registration;
import com.techsoft.digital.gym.entity.form.RegistrationForm;
import com.techsoft.digital.gym.repository.StudentRepository;
import com.techsoft.digital.gym.repository.RegistrationRepository;
import com.techsoft.digital.gym.service.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

  private final RegistrationRepository registrationRepository;
  private final StudentRepository studentRepository;

  @Autowired
  public RegistrationServiceImpl(RegistrationRepository registrationRepository, StudentRepository studentRepository) {
    this.registrationRepository = registrationRepository;
    this.studentRepository = studentRepository;
  }

  @Override
  public Registration create(RegistrationForm form) {
    Registration registration = new Registration();
    Student student = studentRepository.findById(form.getStudentId()).get();

    registration.setStudent(student);

    return registrationRepository.save(registration);
  }

  @Override
  public Registration get(Long id) {
    return registrationRepository.findById(id).get();
  }

  @Override
  public List<Registration> getAll(String bairro) {

    if(bairro == null){
      return registrationRepository.findAll();
    }else{
      return registrationRepository.findStudentsRegisterByDistrict(bairro);
    }

  }

  @Override
  public void delete(Long id) {}



}
