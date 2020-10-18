package ru.geekbrains.lesson03;

import java.util.Arrays;

public class Group {

    private String GroupName;
    private Employee [] emps = new Employee[10];

    public void DeleteEmp (byte emp_no) {
        emps [emp_no] = null;
    }

    public void DeleteAllEmps () {
        for (byte i=0; i<10; i++) {
            emps [i] = null;
        }
    }

    public void AddEmp (Employee new_emp) {
        for (byte i=0; i<10; i++) {
            if (emps[i] == null) {
                emps[i] = new_emp;
                break;
            }
        }
    }

    public String EmpsInfo () {
        String EmpsList = "";
        for (byte i=0; i<10; i++) {
            if (emps[i] != null) {
                EmpsList += emps[i];
            } break;
        }
        return EmpsList;
    }

    public String info() {
        return (getGroupName() + " " + Arrays.toString(getEmps()));
    }

    public Group(String groupName, Employee[] emps) {
        this.GroupName = groupName;
        this.emps = emps;
    }

    public String getGroupName() {
        return GroupName;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }
}
