package br.com.digitalhousemanager

data class Aluno (val nome: String, val sobrenome: String, val codigoAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigoAluno != other.codigoAluno) return false

        return true
    }
}