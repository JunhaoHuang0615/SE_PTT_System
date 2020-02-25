package Model;

public class Teacher {
    private int teacherID;
    private String name;
    private String skill;
    private String availableTime;
    private int responsedClassID;

    public Teacher(int teacherID, String name, String skill, String availableTime, int responsedClassID) {
        this.teacherID = teacherID;
        this.name = name;
        this.skill = skill;
        this.availableTime = availableTime;
        this.responsedClassID = responsedClassID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public String getAvailableTime() {
        return availableTime;
    }


}
