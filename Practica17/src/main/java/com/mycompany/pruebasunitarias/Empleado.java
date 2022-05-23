/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;
 import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author amand
 */
public class Empleado {
 
 
    private String nombre;
    private int empId;
    private int salario;
     
    public Empleado(int id, String nombre, int sal){
        this.empId = id;
        this.nombre = nombre;
        this.salario = sal;
    }
     
    @Override
    public boolean equals(Object obj){
        Empleado emp = (Empleado) obj;
        boolean status = false;
        if(this.nombre.equalsIgnoreCase(emp.nombre)
                && this.empId == emp.empId 
                && this.salario == emp.salario){
            status = true;
        }
        return status;
    }
     
    public static String getNombreEmpMejorPagado(){
        /**
         * logic to get Highest paid employee
         */
        return "Nattu";
    }
     
    public static Empleado getEmpleadoMejorPagado(){
        /**
         * hiding logic to get highest paid employee
         */
        return new Empleado(1, "Nattu", 15000);
    }
     
    @Override
    public int hashCode(){
        return this.empId;
    }
     
    public String getName() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getSalary() {
        return salario;
    }
    public void setSalary(int salario) {
        this.salario = salario;
    }


}
