package com.example.checkbox.GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class CheckboxControlleur {

    public javafx.scene.control.TextField TextField;
    public javafx.scene.control.Label Label;
    public TitledPane Choice;
    public VBox ContainerChoice;
    public CheckBox CheckboxBackground;
    public CheckBox CheckboxText;
    public CheckBox CheckboxCase;
    public TitledPane Background;
    public VBox ContainerBackground;
    public RadioButton BackgroundRed;
    public RadioButton BackgroundGreen;
    public RadioButton BackgroundBlue;
    public TitledPane Text;
    public VBox ContainerText;
    public RadioButton TextRed;
    public RadioButton TextWhite;
    public RadioButton TextBlack;
    public TitledPane Case;
    public VBox ContainerCase;
    public RadioButton Min;
    public RadioButton Maj;
    public ToggleGroup Text_Radio;
    public ToggleGroup Background_Radio;
    public ToggleGroup Case_Radio;

    public void On_Key_Typed(ActionEvent actionEvent)
    {
        String text = TextField.getText();
        Label.setText(text);
        if(Objects.equals(Label.getText(), "")){
            Choice.setDisable(true);
            Background.setDisable(true);
            Text.setDisable(true);
            Case.setDisable(true);
            CheckboxBackground.setSelected(false);
            CheckboxText.setSelected(false);
            CheckboxCase.setSelected(false);
            Background_Radio.selectToggle(null);
            Text_Radio.selectToggle(null);
            Case_Radio.selectToggle(null);
            Label.setStyle(null);
        }else {
            Choice.setDisable(false);
        }
    }

    public void Check_Background(ActionEvent actionEvent)
    {
        if(CheckboxBackground.isSelected()){
            Background.setDisable(false);
        }else {
            Background.setDisable(true);
            Label.setStyle(Label.getStyle()+";-fx-background-color: null ");
            Background_Radio.selectToggle(null);
        }
    }
    public void Check_Text(ActionEvent actionEvent)
    {
        if(CheckboxText.isSelected()){
            Text.setDisable(false);
        }else{
            Text.setDisable(true);
            Label.setStyle(Label.getStyle()+";-fx-text-fill: black ");
            Text_Radio.selectToggle(null);

        }
    }
    public void Check_Case(ActionEvent actionEvent){
        if (CheckboxCase.isSelected()){
            Case.setDisable(false);
        }else {
            Case.setDisable(true);
            String Text = TextField.getText().toLowerCase();
            Label.setText(Text);
            Case_Radio.selectToggle(null);
        }
    }
    public void Select_Bg_Color(ActionEvent actionEvent)
    {
        if(BackgroundRed.isSelected()){
            Label.setStyle(Label.getStyle()+";-fx-background-color: red ");
        } else if (BackgroundGreen.isSelected()) {
            Label.setStyle(Label.getStyle()+";-fx-background-color: green ");
        } else if (BackgroundBlue.isSelected()) {
            Label.setStyle(Label.getStyle()+";-fx-background-color: blue ");
        }
    }
    public void Select_Text_Color(ActionEvent actionEvent) {
        if (TextRed.isSelected()) {
            Label.setStyle(Label.getStyle()+";-fx-text-fill: red ");
        } else if (TextWhite.isSelected()) {
            Label.setStyle(Label.getStyle()+";-fx-text-fill: white ");
        } else if (TextBlack.isSelected()) {
            Label.setStyle(Label.getStyle()+";-fx-text-fill: black ");
        }
    }
    public void Select_Case(ActionEvent actionEvent){
        if (Min.isSelected()){
            String Text = TextField.getText().toLowerCase();
            Label.setText(Text);
        }else if (Maj.isSelected()){
            String Text = TextField.getText().toUpperCase();
            Label.setText(Text);
        }

    }
}