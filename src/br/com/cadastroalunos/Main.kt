package br.com.cadastroalunos

fun main() {

    val digitalHouseManager = DigitalHouseManager()
    //cadastrarProfessor(digitalHouseManager)
    cadastrarCurso(digitalHouseManager)
    //alocarProfessor(digitalHouseManager)
    matricularAluno(digitalHouseManager)
    matricularAlunoCurso(digitalHouseManager)
}

fun cadastrarProfessor(digitalHouseManager: DigitalHouseManager){
    digitalHouseManager.registrarProfessorTitular("Jessica", "Fernandes", 5, "Android")
    digitalHouseManager.registrarProfessorTitular("Vini", "Felipe", 55, "Android")
    digitalHouseManager.registrarProfessorTitular("Vini", "Felipe", 55, "Android")
    digitalHouseManager.registrarProfessorAdjunto("Ale", "Santos", 555, 40)
    digitalHouseManager.registrarProfessorAdjunto("Jon", "Alves", 5555, 40)
    digitalHouseManager.registrarProfessorAdjunto("Jon", "Alves", 5555, 40)

}

fun cadastrarCurso(digitalHouseManager: DigitalHouseManager){
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)
    digitalHouseManager.registrarCurso("Androi", 20002, 2)
}

fun alocarProfessor(digitalHouseManager: DigitalHouseManager){
    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)
    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)
}

fun matricularAluno(digitalHouseManager: DigitalHouseManager){
    digitalHouseManager.matricularAluno("Marie", "Curie", 1)
    digitalHouseManager.matricularAluno("Barry", "Allen", 2)
    digitalHouseManager.matricularAluno("Andrea", "Ghez", 3)
    digitalHouseManager.matricularAluno("Katie", "Bouman", 4)
    digitalHouseManager.matricularAluno("Bruce", "Wayne", 4)
    digitalHouseManager.matricularAluno("Diana", "Prince", 5)
}

fun matricularAlunoCurso(digitalHouseManager: DigitalHouseManager){
    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)
    digitalHouseManager.matricularAluno(3, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(5, 20002)

}