package br.com.cadastroalunos

class DigitalHouseManager {

    private val listaAlunos = mutableListOf<Aluno>()
    private val listaProfessor = mutableListOf<Professor>()
    private val listaCurso = mutableListOf<Curso>()
    private val listaMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val novoCurso = Curso(nome = nome, codigoCurso = codigoCurso, qtdMaxAlunos = quantidadeMaximaDeAlunos)
            if (!listaCurso.contains(novoCurso)){
                listaCurso.add(novoCurso)
                println("Curso de ${novoCurso.nome} registrado com sucesso")
            }else{
                println("O curso de ${novoCurso.nome} já está registrado")
            }
    }

    fun excluirCurso(codigoCurso: Int){
        val curso = encontrarCurso(codigoCurso)
         if (curso != null){
             listaCurso.remove(curso)
         }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val novoProfAdjunto = Adjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
        if (!listaProfessor.contains(novoProfAdjunto)){
            listaProfessor.add(novoProfAdjunto)
            println("Professor adjunto ${novoProfAdjunto.nome} registrado com sucesso")
        }else{
            println("O professor adjunto ${novoProfAdjunto.nome} já está registrado")
        }
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String){
        val novoProfTitular = Titular(especialidade, nome, sobrenome, 0, codigoProfessor)
        if (!listaProfessor.contains(novoProfTitular)) {
            listaProfessor.add(novoProfTitular)
            println("Professor titular ${novoProfTitular.nome} registrado com sucesso")
        }else{
            println("O professor titular ${novoProfTitular.nome} já está registrado")
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        val professor = encontrarProfessor(codigoProfessor)
            if (professor != null){
                listaProfessor.remove(professor)
            }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        if (!listaAlunos.contains(novoAluno)) {
            listaAlunos.add(novoAluno)
            println("Aluno ${novoAluno.nome} matriculado com sucesso")
        }else{
            println("O aluno ${novoAluno.nome} já está matriculado")
        }

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno = encontrarAluno(codigoAluno)
        val curso = encontrarCurso(codigoCurso)

        if (curso != null && aluno != null){
               if(curso.adicionarUmAluno(aluno)){
                   val novaMatricula = Matricula(aluno, curso)
                   listaMatricula.add(novaMatricula)
                   println("Aluno ${aluno.nome} matriculado no curso de ${curso.nome} com sucesso. Data da matricula ${novaMatricula.dataMatricula}")
               }else{
                   if (encontraMatricula(curso, aluno)){
                       println("Aluno ${aluno.nome} já está matriculado no curso de ${curso.nome}")
                   }else{
                       println("Quantidade maxima de ${curso.qtdMaxAlunos} vagas já preenchidas para o curso de ${curso.nome}")
                   }
               }
        }else{
            println("Dados para matricula não encontrados")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val titular = encontrarProfessor(codigoProfessorTitular)
        val adjunto = encontrarProfessor(codigoProfessorAdjunto)
        val curso = encontrarCurso(codigoCurso)

        if (titular != null && adjunto != null && curso != null){

            if (curso.professorAdjunto == null && curso.professorTitular == null){
                curso.professorAdjunto = adjunto
                curso.professorTitular = titular
                println("Professores ${titular.nome} e ${adjunto.nome} alocados no curso ${curso.nome}")
            }else{
             println("O curso ${curso.nome} já possui os professores ${curso.professorTitular?.nome} e ${curso.professorAdjunto?.nome} alocados")
            }
        }else{
            println("Dados para alocação não encontrados")
        }
    }

    private fun encontrarCurso(codigoCurso: Int): Curso? {
        var cursoEncontrado: Curso? = null
        listaCurso.forEach{curso->
            if(curso.codigoCurso == codigoCurso) {
                cursoEncontrado = curso
            }
        }
        return cursoEncontrado
    }

    private fun encontrarAluno(codigoAluno: Int): Aluno? {
        var alunoEncontrado: Aluno? = null
        listaAlunos.forEach{aluno->
            if(aluno.codigoAluno == codigoAluno) {
                alunoEncontrado = aluno
            }
        }
        return alunoEncontrado
    }

    private fun encontrarProfessor(codigoProfessor: Int): Professor? {
        var professorEncontrado: Professor? = null
        listaProfessor.forEach{professor->
            if(professor.codigoProfessor == codigoProfessor) {
                professorEncontrado = professor
            }
        }
        return professorEncontrado
    }

    private fun encontraMatricula(curso: Curso, aluno: Aluno): Boolean{
     var aux = false
      listaMatricula.forEach{matricula->
          if (matricula.curso == curso && matricula.aluno == aluno){
              aux = true
          }
      }
        return aux
    }





}