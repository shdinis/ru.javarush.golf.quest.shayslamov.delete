package ru.javarush.quest.entity;

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
public class AnswerRepository {
    private final Map<Long, Answer> idAnswerMap;

    Optional<Answer> findById(Long id) {
        return Optional.ofNullable(idAnswerMap.get(id));
    }
}
