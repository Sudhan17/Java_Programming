package course.mypackageA;

import course.mypackageB.Person; //"course.mypackageB.*" to access all classes in the package

public class ClassObjSample {
    public static void main(String[] args) {
        Person shak = new Person();
        shak.name = "Shak Mama";
        shak.age = 22;
        shak.gender = "Male";
        shak.sleep();

        Person biju = new Person();
        biju.name = "Biju";
        biju.age = 60;
        biju.gender = "male";
        biju.sleep();

        Person naidu = new Person();
        naidu.name = "Vignesh";
        naidu.age = 8;
        naidu.gender = "male";
        naidu.sleep();
    }

}


