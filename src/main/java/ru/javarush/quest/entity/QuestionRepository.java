package ru.javarush.quest.entity;

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
public class QuestionRepository {
    private final Map<Long, Question> idToQuestion;

    Optional<Question> findById(Long id) {
        return Optional.ofNullable(idToQuestion.get(id));
    }
}
