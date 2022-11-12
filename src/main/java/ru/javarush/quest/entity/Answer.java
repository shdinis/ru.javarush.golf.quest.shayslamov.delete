package ru.javarush.quest.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Answer {
    private Long id;
    private String answerText;
    private Long nextQuestion;
}
