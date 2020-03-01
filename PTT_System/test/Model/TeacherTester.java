package Model;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;

public class TeacherTester {

    @Test
    public void test() {
        for (int i = 1; i <= 100; ++i) {
            String name = "name" + i;
            String skill = "skill" + i;
            String avaliableTime = "time" + i;
            Teacher teacher = SystemFactory.createTeacher(name, skill, avaliableTime);
            assertNotEquals(-1, teacher.getTeacherID());
            assertEquals(name + " " + skill + " " + avaliableTime, teacher.toWriter());
            assertEquals(name, teacher.getName());
            assertEquals(skill, teacher.getSkill());
            assertEquals(avaliableTime, teacher.getAvaliableTime());
            System.out.println(teacher.toString());
            teacher.print(new PrintStream(System.out));
        }
    }

}
