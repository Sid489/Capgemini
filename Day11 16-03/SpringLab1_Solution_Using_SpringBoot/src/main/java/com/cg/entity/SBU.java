package com.cg.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
public class SBU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sbuName;
    private String sbuHead;
    @OneToMany(mappedBy = "sbu", cascade = CascadeType.ALL)
    private List<Employee> empList;

    public SBU(){}
    public SBU(String sbuName, String sbuHead) {
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void printSbuDetailsWithList(){
        System.out.println("SBU details");
        System.out.println("-----------------------------");
        System.out.printf("sbu details=SBU [sbuCode=%s, sbuHead=%s, sbuName=%s]", id, sbuHead, sbuName);
        System.out.println();
        System.out.println(" Employee details:---------------");
        System.out.println(empList);
    }

}
