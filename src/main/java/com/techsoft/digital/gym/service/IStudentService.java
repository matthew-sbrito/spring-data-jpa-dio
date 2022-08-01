package com.techsoft.digital.gym.service;

import com.techsoft.digital.gym.entity.Student;
import com.techsoft.digital.gym.entity.PhysicalAssessment;
import com.techsoft.digital.gym.entity.form.StudentForm;
import com.techsoft.digital.gym.entity.form.StudentUpdateForm;

import java.util.List;

public interface IStudentService {
  /**
   * Cria um Aluno e salva no banco de dados.
   * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return Aluno recém-criado.
   */
  Student create(StudentForm form);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   * @param id id do Aluno que será exibido.
   * @return Aluno de acordo com o Id fornecido.
   */
  Student get(Long id);

  /**
   * Retorna os Alunos que estão no banco de dados.
   * @return Uma lista os Alunos que estão salvas no DB.
   */
  List<Student> getAll(String dataDeNascimento);

  /**
   * Atualiza o Aluno.
   * @param id id do Aluno que será atualizado.
   * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return Aluno recém-atualizado.
   */
  Student update(Long id, StudentUpdateForm formUpdate);

  /**
   * Deleta um Aluno específico.
   * @param id id do Aluno que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do aluno que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id);


}
