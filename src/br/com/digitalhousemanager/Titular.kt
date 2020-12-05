package br.com.digitalhousemanager

class Titular (val especialidade: String, nome: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int) :
    Professor(
        nome,
        sobrenome,
        tempoCasa,
        codigoProfessor
    )