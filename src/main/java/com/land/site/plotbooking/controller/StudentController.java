package com.land.site.plotbooking.controller;

import java.util.List;

import com.land.site.plotbooking.models.Student;
import com.land.site.plotbooking.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//creating RestController
@RestController
public class StudentController
{
    //autowired the StudentService class
    @Autowired
    StudentService studentService;
    //creating a get mapping that retrieves all the students detail from the database
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/student")
    private List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }
    //creating a delete mapping that deletes a specific student
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        studentService.delete(id);
    }
    //creating post mapping that post the student detail in the database
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student.getId();
    }

    int f(int[] wt, int W, int n){
        if(n==0)return 0;
        if(W-wt[n-1]>=0){
            return Math.max(wt[n-1]+f(wt,W-wt[n-1],n-1),f(wt,W,n-1));
        }
        else{
            return f(wt,W,n-1);
        }
    }

    @GetMapping("/knapsack")
    private int test(){
        int wt[] = new int[]{1,3,5};
        int W = 7;
        int n = wt.length;
        return f(wt,W,n);
    }
}
