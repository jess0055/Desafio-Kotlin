package br.com.cadastroalunos

class Adjunto (val qtdHorasMonitoria: Int, nome: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int) :
    Professor(
        nome,
        sobrenome,
        tempoCasa,
        codigoProfessor
    )