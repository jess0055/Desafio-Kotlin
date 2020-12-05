package br.com.digitalhousemanager

data class Curso(val nome: String,
                 val codigoCurso: Int,
                 var professorTitular: Professor? = null,
                 var professorAdjunto: Professor? = null,
                 val qtdMaxAlunos: Int)
{

    private val listaAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if (possoAdicionar(umAluno)){
            listaAlunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno){
        if (listaAlunosMatriculados.contains(umAluno)){
            listaAlunosMatriculados.remove(umAluno)
            println("Aluno ${umAluno.nome} removido".separador())
        }else{
            println("Aluno não encontrado".separador())
        }
    }

    private fun possoAdicionar(umAluno: Aluno) =
            !listaAlunosMatriculados.contains(umAluno) && listaAlunosMatriculados.size < qtdMaxAlunos

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

}