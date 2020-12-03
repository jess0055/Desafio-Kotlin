package br.com.cadastroalunos

open class Professor (val nome: String, val sobrenome: String, val tempoCasa: Int, val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }
}