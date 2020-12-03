package br.com.cadastroalunos

data class Curso(val nome: String,
                 val codigoCurso: Int,
                 var professorTitular: Professor? = null,
                 var professorAdjunto: Professor? = null,
                 val qtdMaxAlunos: Int)
{

    private val listaAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if (!listaAlunosMatriculados.contains(umAluno)){
            listaAlunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno){
        if (listaAlunosMatriculados.contains(umAluno)){
            listaAlunosMatriculados.remove(umAluno)
            println("Aluno removido")
        }else{
            println("Aluno não encontrado")
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

}