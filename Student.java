package a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public  static  String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public  void  study(){
        System.out.println("学生正在学习");
    }
    public  void  show(){
        System.out.println("姓名："+name+",年龄："+age+",性别："+gender+"，老师："+teacherName);
    }
}
