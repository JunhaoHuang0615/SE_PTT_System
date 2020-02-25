package Model;

import java.util.ArrayList;

public class List_Of_Teacher {

    private ArrayList<Teacher> teacherList;

    public List_Of_Teacher(){
        this.teacherList = new ArrayList<>();
    }

    public void add(Teacher teacher){
        for(Teacher teacher1 : teacherList){
            if(teacher1.getTeacherID() == teacher.getTeacherID()){
                return;
            }
        }
        teacherList.add(teacher);
    }

    public void remove(int teacherID){
        for (Teacher teacher : teacherList){
            if (teacher.getTeacherID() == teacherID){
                teacherList.remove(teacher);
                return;
            }
        }
    }

    public void remove(Teacher teacher){
        for(Teacher teacher1 : teacherList){
            if(teacher1.getTeacherID() == teacher.getTeacherID()){
                teacherList.remove(teacher1);
                return;
            }
        }
    }

    public Teacher get(int teacherID){
        for(Teacher teacher : teacherList){
            if(teacher.getTeacherID() == teacherID){
                return teacher;
            }
        }

        return null;
    }

    public ArrayList<Teacher> getTeacherBySkill(String skill){
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(Teacher teacher : teacherList){
            if(teacher.getSkill().contains(skill)){
                teachers.add(teacher);
            }
        }
        return teachers;
    }

    public ArrayList<Teacher> getTeacherByAvaliableTime(String avaliableTime){
        ArrayList<Teacher> teachers = new ArrayList<>();
        for(Teacher teacher : teacherList){
            if(teacher.getAvailableTime().contains(avaliableTime)){
                teachers.add(teacher);
            }
        }
        return teachers;
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Here are " + teacherList.size() +" teachers :");
        for(Teacher teacher : teacherList){
            stringBuilder.append("\n");
            stringBuilder.append("teacherId :" +teacher.getTeacherID());
            stringBuilder.append("name :" +teacher.getName());
            stringBuilder.append("skill :" +teacher.getSkill());
            stringBuilder.append("avaliableTime :" +teacher.getAvailableTime());

        }
        return stringBuilder.toString();
    }
}
