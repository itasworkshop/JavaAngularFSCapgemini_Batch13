package org.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Department{

    private int deptid;
    private String name;

    public Department(int deptid, String name) {
        this.deptid = deptid;
        this.name = name;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptid +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student {
    private int id;
    private String name;
    private int dept_id;
    private int cmarks, mmarks, pmarks;

    public Student(int id, String name, int department, int cmarks, int mmarks, int pmarks) {
        super();
        this.id = id;
        this.name = name;
        this.dept_id = department;
        this.cmarks = cmarks;
        this.mmarks = mmarks;
        this.pmarks = pmarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return this.dept_id;
    }

    public void setDepartment(int department) {
        this.dept_id = department;
    }

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getTotal() {
        return mmarks + cmarks + pmarks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", department=" + dept_id + "]";
    }

}

public class TestStudentDepartment {

    public static void main(String[] args){
        //master detail relationship master --dept detail --student

        Department d1 = new Department(111,"CS");
        Department d2 = new Department(222,"EC");
        Department d3 = new Department(333,"IT");
        Department d4 = new Department(444,"EE");

        Student s1 = new Student(101, "Sumit", 111 ,90, 95, 93);
        Student s2 = new Student(102, "Rajesh",111, 65, 85, 83);
        Student s3 = new Student(103, "Suraj",222, 50, 75, 90);
        Student s4 = new Student(104, "Tom",222, 90, 75, 93);
        Student s5 = new Student(104, "Shiva",222, 91, 75, 93);
        Student s6 = new Student(104, "Jay",222, 89, 75, 93);

        Map<Department, List<Student>> sd_map = new HashMap<>();

        sd_map.put(d1, Arrays.asList(s1,s2));
        sd_map.put(d2, Arrays.asList(s3,s4));

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);

        //Map<Integer,List<Student>> group =  students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        Map<Integer,Optional<Student>> group =  students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.maxBy(Comparator.comparing(Student::getTotal))));
        System.out.println(group);

    }
}
