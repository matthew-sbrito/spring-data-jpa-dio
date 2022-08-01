package com.techsoft.digital.gym.controller;

import com.techsoft.digital.gym.service.impl.PhysicalAssessmentServiceImpl;
import com.techsoft.digital.gym.entity.PhysicalAssessment;
import com.techsoft.digital.gym.entity.form.PhysicalAssessmentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

  private final PhysicalAssessmentServiceImpl service;

  @Autowired
  public PhysicalAssessmentController(PhysicalAssessmentServiceImpl service) {
    this.service = service;
  }

  @PostMapping
  public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm form) throws Exception {
    return service.create(form);
  }

  @GetMapping
  public List<PhysicalAssessment> getAll(){
    return service.getAll();
  }

}
