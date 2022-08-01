package com.techsoft.digital.gym.repository;

import com.techsoft.digital.gym.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

  /**
   *
   * @param district bairro referência para o filtro
   * @return lista de alunos matriculados que residem no bairro passado como parâmetro
   */
  @Query(value = "SELECT * FROM registration m " +
      "INNER JOIN student a ON m.student_id = a.id " +
      "WHERE a.district = :district", nativeQuery = true)
  //@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
  List<Registration> findStudentsRegisterByDistrict(String district);


}
