package com.georgia.gk.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank{

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionList class and pass a question along with options and answers
        final QuestionsList question1 = new QuestionsList("What is the size of int variable?", "16 bit", "8 bit", "32 bit", "64 bit",  "32 bit", "" );
        final QuestionsList question2 = new QuestionsList("What is the default value of Boolean variable?", "true", "false", "null", "not defined",  "false", "" );
        final QuestionsList question3 = new QuestionsList("What of the following is the default value of an instance variable?", "Depends upon the type of variable", "null", "0", "not assigned",  "Depends upon the type of variable", "" );
        final QuestionsList question4 = new QuestionsList("Which is a reserved word in the Java programming language?", "method", "native", "reference", "array",  "native", "" );
        final QuestionsList question5 = new QuestionsList("Which of the following is NOT a keywords or reserved in Java?", "if", "then", "goto", "while",  "then", "" );
        final QuestionsList question6 = new QuestionsList("Which is the valid declaration within an interface definition?", "public double method();", "public final double method();", "static void method(double d1);", "protected void method();",  "public double method", "" );

        //add ll questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

   private static List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answers
        final QuestionsList question1 = new QuestionsList("What does PHP stand for?", "Professional Home Page", "Hypertext Preprocessor", "Pretext Hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?", "Rasmus Lerdorf", "William Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("PHP files have a default file extension of.?", ".html", ".xml", ".php", ".json", ".php", "");
        final QuestionsList question4 = new QuestionsList("A PHP script should start with _______ and end with ______?", "< php >", "<php />", "< ? ? >", "< ?php ? >", "< ?php ? >", "");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced Try/Catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5", "");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will be returned when ($s==12) ? 5 : 1 is executed?", "12", "1", "5", "error", "5", "");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answers
        final QuestionsList question1 = new QuestionsList("HTML stands for?", "Hyper Text Markup Language", "High Text Markup Language", "Hyper Tabular Makrup Language", "None of these", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("Which of the following tag is used to mark a beginning of paragraph?", "<TD>", "<br>", "<P>", "<TR>", "<P>", "");
        final QuestionsList question3 = new QuestionsList("From which tag descriptive list starts?", "<LL>", "<DD>", "<DL>>", "<DS>>", "<DL>", "");
        final QuestionsList question4 = new QuestionsList("Correct HTML tag for the largest heading is", "<head>", "<large>", "<h6>", "<heading>", "<h1>>", "");
        final QuestionsList question5 = new QuestionsList("The attribute of <form> tag", "Method", "Action", "Both (a) and (b)", "None", "Both (a) and (b)", "");
        final QuestionsList question6 = new QuestionsList("Markup tags tell the web browser", "How to organise the page", "How to display the page", "How to display message box on page", "None of these", "How to display the page", "");

        //add all questions to the List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answers
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT part of Android architecture", "Android Framework", "Libraries", "Linux Kerner", "Android Document", "Linux Kernel", "" );
        final QuestionsList question2 = new QuestionsList("A __________ makes a specific set of the application data available to other applications", "Content provider", "Broadcast receiver", "Intent", "None of these", "Content provider", "" );
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik", "" );
        final QuestionsList question4 = new QuestionsList("During an Activity life-cycle, what is the first callback method invoked by the system?", "onStop()", "onStart()", "onCreate()", "onRestore()", "onCreate", "" );
        final QuestionsList question5 = new QuestionsList("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML?", "findViewByReference(int id);", "findViewById(int id);", "findViewById(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "" );
        final QuestionsList question6 = new QuestionsList("The requests from Content Provider class is handled by method", "onCreate", "onSelect", "ContentResolver", "onClick", "ContentResolver", "" );

        //add all questions to the List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Java" :
                return javaQuestions();

            case "PHP" :
                return phpQuestions();
            case "Android" :
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
