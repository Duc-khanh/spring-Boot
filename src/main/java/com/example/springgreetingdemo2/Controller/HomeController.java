package com.example.springgreetingdemo2.Controller;

import com.example.springgreetingdemo2.model.Feedback;
import com.example.springgreetingdemo2.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FeedbackService service;

    @GetMapping
    public String home(Model model){

        model.addAttribute(
                "feedback",
                new Feedback()
        );

        model.addAttribute(
                "comments",
                service.getTodayFeedback()
        );

        return "home";
    }

    @PostMapping("/comment")
    public String saveComment(
            @ModelAttribute Feedback feedback){

        service.save(feedback);

        return "redirect:/";
    }

    @GetMapping("/like/{id}")
    public String like(
            @PathVariable Long id){

        service.like(id);

        return "redirect:/";
    }
}