package com.example.springgreetingdemo2.service;

import com.example.springgreetingdemo2.model.Feedback;
import com.example.springgreetingdemo2.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    public void save(Feedback feedback){
        repository.save(feedback);
    }

    public List<Feedback> getTodayFeedback(){
        return repository.findTodayFeedback();
    }

    public void like(Long id){

        Feedback feedback =
                repository.findById(id);

        feedback.setLikes(
                feedback.getLikes()+1
        );

        repository.update(feedback);
    }
}
