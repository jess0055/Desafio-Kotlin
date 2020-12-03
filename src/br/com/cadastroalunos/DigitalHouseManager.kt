package br.com.cadastroalunos

class DigitalHouseManager {

    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessor = mutableListOf<Professor>()
    val listaCurso = mutableListOf<Curso>()
    val listaMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val novoCurso = Curso(nome = nome, codigoCurso = codigoCurso, qtdMaxAlunos = quantidadeMaximaDeAlunos)
        listaCurso.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int){
        val curso = encontrarCurso(codigoCurso)
         if (curso != null){
             listaCurso.remove(curso)
         }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val novoProfAdjunto = Adjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
        listaProfessor.add(novoProfAdjunto)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String){
        val novoProfTitular = Titular(especialidade, nome, sobrenome, 0, codigoProfessor)
        listaProfessor.add(novoProfTitular)
    }

    fun excluirProfessor(codigoProfessor: Int){
        val professor = encontrarProfessor(codigoProfessor)
            if (professor != null){
                listaProfessor.remove(professor)
            }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno = encontrarAluno(codigoAluno)
        val curso = encontrarCurso(codigoCurso)

        if (curso != null && aluno != null && verificaVagasDisponiveis(curso)){
            val matricula = Matricula(aluno, curso)
            listaMatricula.add(matricula)
            curso.adicionarUmAluno(aluno)
            println("Matricula realizada com sucesso")
        }else{
            println("Não há vagas para o curso")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val titular = encontrarProfessor(codigoProfessorTitular)
        val adjunto = encontrarProfessor(codigoProfessorAdjunto)
        val curso = encontrarCurso(codigoCurso)

        if (titular != null && adjunto != null && curso != null){
            curso.professorAdjunto = adjunto
            curso.professorTitular = titular
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

    private fun verificaVagasDisponiveis(curso: Curso) = curso.qtdMaxAlunos == listaAlunos.size

    private fun encontrarProfessor(codigoProfessor: Int): Professor? {
        var professorEncontrado: Professor? = null
        listaProfessor.forEach{professor->
            if(professor.codigoProfessor == codigoProfessor) {
                professorEncontrado = professor
            }
        }
        return professorEncontrado
    }
}