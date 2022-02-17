package com.ashen.design.principle.dependenceinversion;

public class Test {

    // v1
    // public static void main(String[] args) {
    //     Lucifer lucifer = new Lucifer();
    //     lucifer.studyJavaCourse();
    //     lucifer.studyFECourse();
    // }

    // v2
    // public static void main(String[] args) {
    //     Lucifer lucifer = new Lucifer();
    //     lucifer.studyItCourse(new JavaCourse());
    //     lucifer.studyItCourse(new FECourse());
    //     lucifer.studyItCourse(new PythonCourse());
    // }

    // v3
    // public static void main(String[] args) {
    //     Lucifer lucifer = new Lucifer(new JavaCourse());
    //     lucifer.studyItCourse();
    // }

    public static void main(String[] args) {
        Lucifer lucifer = new Lucifer();
        lucifer.setICourse(new JavaCourse());
        lucifer.studyItCourse();

        lucifer.setICourse(new FECourse());
        lucifer.studyItCourse();
    }

}
