package com.business.springbootexample1.Controller;

import com.business.springbootexample1.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // used to build the Rest API
public class CourseController {

    // Create the handler methods and expose the link that you want to create.

    // First Method :: Retrieve the set of courses and return them back in the response.
    @RequestMapping("/courses")  // Want to map a url to this specific method
    public List<Course> retrieveAllCourses (){

        return Arrays.asList(
                new Course(1, "Learn AWS" , "Anitha"),
                new Course(2, "Learn Devops", "Geetha"),
                new Course(3, "Learn RedHat", "Pavan")
               // new Course(4, "Learn Azure", "Shweta")

        );
    }
}
