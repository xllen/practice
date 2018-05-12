package com.xielei;

public class Student {
    void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException("参数m大于1000");
        }
    }

    public static void main(String[] agrs) {
        try {
            Student s = new Student();
            s.speak(1002);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
