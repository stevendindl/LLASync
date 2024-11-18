package com.languageLearner.questions;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.UUID;
import com.learner.model.innerdata.TextObject; 
import com.learner.model.questions.FITBQuestion;
import com.learner.model.mocks.MockGameManager; 

public class FITBQuestionTest {

    private FITBQuestion question;
    private MockGameManager gameManager; // Ensure this is defined and implemented

    @Test
    void setUp() {
        UUID questionUUID = UUID.fromString("e4e1d515-7baf-4569-8c14-7c663b6e49f5");
        gameManager = new MockGameManager(); // Initialize your mock game manager
        question = new FITBQuestion(questionUUID); // Create a new FITBQuestion instance
        question.setGameManager(gameManager); // Set the game manager

        // Set up a mock TextObject
        TextObject mockTextObject = new TextObject("The sky is blue", questionUUID);
        gameManager.addTextObject(mockTextObject); // Add the mock TextObject to the game manager

        question.generateQuestion(); // Call to generate the question and set the answer
    }

    @Test
    void testValidateAnswer_CorrectAnswer() {
        String userAnswer = "blue";
        assertTrue(question.validateAnswer(userAnswer), "The answer should be valid.");
    }

    // Additional tests...
}
