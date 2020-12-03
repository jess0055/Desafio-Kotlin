package br.com.cadastroalunos

fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Jessica", "Fernandes", 5, "Android")
    digitalHouseManager.registrarProfessorTitular("Jessica", "Fernandes", 55, "Android")
    digitalHouseManager.registrarProfessorAdjunto("Jessica", "Fernandes", 555, 40)
    digitalHouseManager.registrarProfessorAdjunto("Jessica", "Fernandes", 5555, 40)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)

    //matricula aluno na escola
    digitalHouseManager.matricularAluno("jess", "Oli", 19)
    digitalHouseManager.matricularAluno("jess", "Oli", 10)
    digitalHouseManager.matricularAluno("jess", "Oli", 1)
    digitalHouseManager.matricularAluno("jess", "Oli", 9)
    digitalHouseManager.matricularAluno("jess", "Oli", 99)

    //matricula aluno no curso
    digitalHouseManager.matricularAluno(19, 20001)
    digitalHouseManager.matricularAluno(10, 20001)
    digitalHouseManager.matricularAluno(1, 20002)
    digitalHouseManager.matricularAluno(9, 20002)
    digitalHouseManager.matricularAluno(99, 20002)
}