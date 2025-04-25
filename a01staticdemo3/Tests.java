package a01staticdemo3;

import java.util.ArrayList;

public class Tests {
    public static void main(String[] args) {
        //1.创建
        ArrayList<Student> list = new ArrayList<>();
        //
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 20, "女");
        Student s3 = new Student("王五", 22, "男");
        Student s4 = new Student("赵六", 24, "女");
        Student s5 = new Student("钱七", 26, "男");
        //2.添加
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //3.遍历
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);

    }
}
