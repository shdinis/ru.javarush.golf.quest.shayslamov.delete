package ru.javarush.quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Question {
    private final Long id;
    private final String questionText;
    private final List<Long> idAnswer;
    private String backgroundPicture;
}
