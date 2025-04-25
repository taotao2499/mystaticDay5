package a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {

        //设置老师的姓名
        Student.teacherName = "王老师";
        System.out.println(Student.teacherName);
        //创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        s1.show();
        s1.study();

        //创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setGender("女");
        s2.show();
        s2.study();
    }
}
