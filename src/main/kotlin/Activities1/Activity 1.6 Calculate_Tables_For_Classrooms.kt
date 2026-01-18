package Activities_1
//Program :  Calculate the tables for 3 classrooms

//Enunciated : In a highschool we have 3 class, we want to know which number of tables we need in total.
//Depend on from the total numbers of studens for classroom, for each table the is 2 students.

/**
 * #Students for Classrooms
 * ##Three Classrooms, calculate the number of students for Each classroom, knowing that for Each table we need 2 students
 *
 * @author Ferran Martínez I Gilabert
 *
 * @param studentsClassroom1 Dada Type Integer, number of students for ClassRoom 1
 * @param studentsClassroom2 Dada Type Integer, number of students for ClassRoom 2
 * @param studentsClassroom3 Dada type Integer, number of students for ClassRoom 3
 * @return Return the number of Tables we need in total
 */
fun studentsForClassrooms(studentsClassroom1 : Int, studentsClassroom2 : Int, studentsClassroom3 : Int) : Int {
    val numTables1 : Int = studentsClassroom1 / 2 + studentsClassroom1 % 2
    val numTables2 : Int = studentsClassroom2 / 2 + studentsClassroom2 % 2
    val numTables3 : Int = studentsClassroom3 / 2 + studentsClassroom3 % 2

    val totalTables : Int = numTables1 + numTables2 + numTables3

    return totalTables
}