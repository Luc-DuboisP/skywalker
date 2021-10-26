package com.springmsa.skywalker.controller;

import com.springmsa.skywalker.model.Rebels;
import com.springmsa.skywalker.form.BookingsForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Controller
public class RebelsController {

@PostMapping("/addRebel")
    public String addRebelPage(@ModelAttribute("rebelsForm") BookingsForm bookingsForm){

    String lastName = bookingsForm.getLastName();
    String firstName = bookingsForm.getFirstName();
    Date birthDate = bookingsForm.getBirthDate();
    String licenseNumber = bookingsForm.getLicenseNumber();
    Date licenseDate = bookingsForm.getLicenseDate();
    Date startDate = bookingsForm.getStartDate();
    Date endDate = bookingsForm.getEndDate();

    Rebels newRebel = new Rebels(lastName, firstName, birthDate, licenseNumber, licenseDate, startDate, endDate);
    new RestTemplate().postForObject("http://localhost:8080/api/bookings/confirmation", newRebel, Rebels.class);

    return "redirect:/vehicules";
    }

}
