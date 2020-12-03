package br.com.cadastroalunos

class DigitalHouseManager {

    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessor = mutableListOf<Professor>()
    val listaCurso = mutableListOf<Curso>()
    val listaMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        var novoCurso = Curso(nome = nome, codigoCurso = codigoCurso, qtdMaxAlunos = quantidadeMaximaDeAlunos, )
    }

}