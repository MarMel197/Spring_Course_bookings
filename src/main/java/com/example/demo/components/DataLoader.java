package com.example.demo.components;

import com.example.demo.models.Booking;
import com.example.demo.models.Course;
import com.example.demo.models.Customer;
import com.example.demo.repositories.BookingRepository;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Python", "London", 5);
        courseRepository.save(course1);

        Customer customer1 = new Customer("John","Edinburgh", 35);
        customerRepository.save(customer1);

        Booking booking1 = new Booking("01-01-21", course1, customer1);
        bookingRepository.save(booking1);
    }

}
