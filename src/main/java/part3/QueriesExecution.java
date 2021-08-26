package part3;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        // =========================== 1 - Consulta =================================================
        List<Student> students = studentDAO.list();

        students.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Student studentForConsultation = studentDAO.getById(1);

        //System.out.println(studentForConsultation);


        // =========================== 2 - Inserção =================================================
        Student studentForInsertion = new Student(
                "Matheus",
                43,
                "SP"
        );

        //studentDAO.create(studentForInsertion);


        // =========================== 3 - Delete ===================================================
        //studentDAO.delete(1);


        // =========================== 4 - Atualizar ================================================
        Student studentToUpdate = studentDAO.getById(3);
        studentToUpdate.setName("Joaquim");
        studentToUpdate.setAge(18);
        studentToUpdate.setState("RS");

        //studentDAO.update(studentToUpdate);
    }

}


