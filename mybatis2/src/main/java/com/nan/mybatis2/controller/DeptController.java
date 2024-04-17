package com.nan.mybatis2.controller;

import com.nan.mybatis2.bean.*;
import com.nan.mybatis2.mapper.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Null;
import java.util.Arrays;

/**
 * @author shuimiao
 * @date 2020-06-27-14:16
 */
@RestController
@CrossOrigin
public class DeptController {
    @Resource
    DepartmentMapper departmentMapper;
    @Resource
    EmployeeMapper employeeMapper;
    @Resource
    TestMapper testMapper;
    @Resource
    OrdinaryMapper ordinaryMapper;
    @Resource
    CompetitionMapper competitionMapper;
    @Resource
    CoordinateMapper coordinateMapper;
    @GetMapping("/mytest")
    public String test(){
        return "test is ok";
    }
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptByTd(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insrtDeptById(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/test/{id}")
    public Test getTest(@PathVariable("id") Integer id){
        return testMapper.getTest(id);
    }

    @ResponseBody
    @GetMapping("/ordinary")
    public Ordinary insertOrd(Ordinary ordinary){
        if("0".equals(String.valueOf(ordinary.getUser_id())) || "null".equals(String.valueOf(ordinary.getUser_id())) || ordinary.getUser_id() <= 0){
        }else {
            ordinaryMapper.insertOri(ordinary);
        }
        return ordinary;
    }


    @ResponseBody
    @PostMapping("/text")
    public void insertText(String text1,String text2,Integer user_id){
        if("0".equals(String.valueOf(user_id)) || "null".equals(String.valueOf(user_id)) || user_id <= 0){
        }else {
            ordinaryMapper.insertText(text1,text2,user_id);
        }

    }


    @ResponseBody
    @PostMapping("/login")
    public void insertLogin(Integer userId,String userName,Integer success,Integer chance){
        if("0".equals(String.valueOf(userId)) || "null".equals(String.valueOf(userId)) || userId <= 0){
        }else {
            ordinaryMapper.insertLogin(userId,userName,success,chance);
        }
    }

    @ResponseBody
    @GetMapping("/game")
    public void insertGame(Integer angle,Integer vv,Integer top,Integer user_id){
        if("0".equals(String.valueOf(user_id)) || "null".equals(String.valueOf(user_id)) || user_id <= 0){
        }else {
            ordinaryMapper.insertGame(angle,vv,top,user_id);
        }
    }

    @GetMapping("/competition")
    public Competition insertCompe(Competition competition){
        competitionMapper.insertComp(competition);
        return competition;
    }
    @GetMapping("/coordinate")
    public  Coordinate insertCoodi(Coordinate coordinate){
        coordinateMapper.insertCood(coordinate);
        return coordinate;
    }
}
