package a01staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        //1.定义一个变量,记录最大的年龄
        int max = list.get(0).getAge();
        //2.遍历集合,获取每一个学生的年龄,和最大年龄进行比较
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }
        }
        return max;
    }
}
