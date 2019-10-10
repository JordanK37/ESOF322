/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;

/**
 *
 * @author dylan
 */
public class EmployeeRecords {
    private String name;
    private int ssc;
    private int salary;
    
    EmployeeRecords(String fl, int code, int income){
        name = fl;
        ssc = code;
        salary = income;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getssc(){
        return ssc;
    }
    public void setssc(int newssc){
        ssc = newssc;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int newSalary){
        salary = newSalary;
    }
}
