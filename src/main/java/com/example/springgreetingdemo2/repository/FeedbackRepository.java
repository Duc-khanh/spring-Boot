package com.example.springgreetingdemo2.repository;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.example.springgreetingdemo2.model.Feedback;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class FeedbackRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session() {
        return sessionFactory.getCurrentSession();
    }

    public void save(Feedback feedback) {
        session().save(feedback);
    }

    public Feedback findById(Long id) {
        return session().get(Feedback.class,id);
    }

    public void update(Feedback feedback) {
        session().update(feedback);
    }

    public List<Feedback> findTodayFeedback() {

        String hql =
                "FROM Feedback f WHERE f.createdDate=:today";

        return session()
                .createQuery(hql, Feedback.class)
                .setParameter(
                        "today",
                        LocalDate.now()
                )
                .list();
    }
}