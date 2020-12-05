package br.com.digitalhousemanager

fun main() {

    val digitalHouseManager = DigitalHouseManager()

    //Cadastra professores e verifica  registro de professor já cadastrado

    println("###### CADASTRO DE PROFESSORES ########".separador())
    digitalHouseManager.registrarProfessorTitular("Jessica", "Fernandes", 5, "Android")
    digitalHouseManager.registrarProfessorTitular("Vini", "Felipe", 55, "Android")
    digitalHouseManager.registrarProfessorTitular("Vini", "Felipe", 55, "Android")
    digitalHouseManager.registrarProfessorAdjunto("Ale", "Santos", 555, 40)
    digitalHouseManager.registrarProfessorAdjunto("Jon", "Alves", 5555, 40)
    digitalHouseManager.registrarProfessorAdjunto("Jon", "Alves", 5555, 40)

    //Cadastra cursos e verifica registro de curso já cadastrado

    println("###### CADASTRO DE CURSOS ########".separador())
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    //Aloca professores e verifica registro de professores já alocados + dados incorretos

    println("###### ALOCAÇÃO DE PROFESSORES ########".separador())
    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)
    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)
    digitalHouseManager.alocarProfessores(20003, 5, 55)

    //Cadastra alunos e verifica registro de aluno já matriculado

    println("###### CADASTRO DE ALUNOS ########".separador())
    digitalHouseManager.matricularAluno("Marie", "Curie", 1)
    digitalHouseManager.matricularAluno("Barry", "Allen", 2)
    digitalHouseManager.matricularAluno("Andrea", "Ghez", 3)
    digitalHouseManager.matricularAluno("Katie", "Bouman", 4)
    digitalHouseManager.matricularAluno("Bruce", "Wayne", 4)
    digitalHouseManager.matricularAluno("Diana", "Prince", 5)

    //Matricula aluno no curso e valida vagas disponíveis e registro de aluno já matriculado + dados incorretos

    println("###### CADASTRO DE ALUNOS NOS CURSOS ########".separador())
    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)
    digitalHouseManager.matricularAluno(3, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(5, 20002)
    digitalHouseManager.matricularAluno(5, 20003)

    //valida exclusão de professor e curso

    println("###### EXCLUSÃO DE PROFESSORES E CURSO ########".separador())
    digitalHouseManager.excluirCurso(100)
    digitalHouseManager.excluirProfessor(200)
    digitalHouseManager.excluirCurso(20001)
    digitalHouseManager.excluirProfessor(5)


}