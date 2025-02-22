package com.genie.quiz.repo;

import com.genie.quiz.entity.javascript_question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jsRepo extends JpaRepository<javascript_question,Long> {
}
