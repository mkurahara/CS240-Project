/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutapp;

/**
 *
 * @author hellothere
 */
public class RunSurvey{

    Survey survey;
    SurveyGuiUI gui;

    public static void main(String args[] ){
        Survey survey = new Survey();
        SurveyGuiUI gui = new SurveyGuiUI(survey);

    }
}
