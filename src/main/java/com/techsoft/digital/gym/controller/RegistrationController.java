package com.techsoft.digital.gym.controller;

import com.techsoft.digital.gym.service.impl.RegistrationServiceImpl;
import com.techsoft.digital.gym.entity.Registration;
import com.techsoft.digital.gym.entity.form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

  private final RegistrationServiceImpl service;

  @Autowired
  public RegistrationController(RegistrationServiceImpl service) {
    this.service = service;
  }

  @PostMapping
  public Registration create(@Valid @RequestBody RegistrationForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Registration> getAll(@RequestParam(value = "district", required = false) String district) {
    return service.getAll(district);
  }

}

