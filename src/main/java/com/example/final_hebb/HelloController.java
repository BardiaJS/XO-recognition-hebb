package com.example.final_hebb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;








public class HelloController {
    public static double[] weight;
    public static double bias;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Label result;
    public Button btnClear;
    public Button btnGo;
    public Button btnTraining;


    public void btn1Clicked(ActionEvent actionEvent) {
        if(btn1.getText().equals("*")){
            btn1.setText("");
        }else{
            btn1.setText("*");
        }
    }

    public void btn2Clicked(ActionEvent actionEvent) {
        if(btn2.getText().equals("*")){
            btn2.setText("");
        }else{
            btn2.setText("*");
        }
    }

    public void btn3Clicked(ActionEvent actionEvent) {
        if(btn3.getText().equals("*")){
            btn3.setText("");
        }else{
            btn3.setText("*");
        }
    }

    public void btn4Clicked(ActionEvent actionEvent) {
        if(btn4.getText().equals("*")){
            btn4.setText("");
        }else{
            btn4.setText("*");
        }
    }

    public void btn5Clicked(ActionEvent actionEvent) {
        if(btn5.getText().equals("*")){
            btn5.setText("");
        }else{
            btn5.setText("*");
        }
    }

    public void btn6Clicked(ActionEvent actionEvent) {
        if(btn6.getText().equals("*")){
            btn6.setText("");
        }else{
            btn6.setText("*");
        }
    }

    public void btn7Clicked(ActionEvent actionEvent) {
        if(btn7.getText().equals("*")){
            btn7.setText("");
        }else{
            btn7.setText("*");
        }
    }

    public void btn8Clicked(ActionEvent actionEvent) {
        if(btn8.getText().equals("*")){
            btn8.setText("");
        }else{
            btn8.setText("*");
        }
    }

    public void btn9Clicked(ActionEvent actionEvent) {
        if(btn9.getText().equals("*")){
            btn9.setText("");
        }else{
            btn9.setText("*");
        }
    }

    public void btn10Clicked(ActionEvent actionEvent) {
        if(btn10.getText().equals("*")){
            btn10.setText("");
        }else{
            btn10.setText("*");
        }
    }

    public void btn11Clicked(ActionEvent actionEvent) {
        if(btn11.getText().equals("*")){
            btn11.setText("");
        }else{
            btn11.setText("*");
        }
    }

    public void btn12Clicked(ActionEvent actionEvent) {
        if(btn12.getText().equals("*")){
            btn12.setText("");
        }else{
            btn12.setText("*");
        }
    }

    public void btn13Clicked(ActionEvent actionEvent) {
        if(btn13.getText().equals("*")){
            btn13.setText("");
        }else{
            btn13.setText("*");
        }
    }

    public void btn14Clicked(ActionEvent actionEvent) {
        if(btn14.getText().equals("*")){
            btn14.setText("");
        }else{
            btn14.setText("*");
        }
    }

    public void btn15Clicked(ActionEvent actionEvent) {
        if(btn15.getText().equals("*")){
            btn15.setText("");
        }else{
            btn15.setText("*");
        }
    }

    public void btn16Clicked(ActionEvent actionEvent) {
        if(btn16.getText().equals("*")){
            btn16.setText("");
        }else{
            btn16.setText("*");
        }
    }

    public void btn17Clicked(ActionEvent actionEvent) {
        if(btn17.getText().equals("*")){
            btn17.setText("");
        }else{
            btn17.setText("*");
        }
    }

    public void btn18Clicked(ActionEvent actionEvent) {
        if(btn18.getText().equals("*")){
            btn18.setText("");
        }else{
            btn18.setText("*");
        }
    }

    public void btn19Clicked(ActionEvent actionEvent) {
        if(btn19.getText().equals("*")){
            btn19.setText("");
        }else{
            btn19.setText("*");
        }
    }

    public void btn20Clicked(ActionEvent actionEvent) {
        if(btn20.getText().equals("*")){
            btn20.setText("");
        }else{
            btn20.setText("*");
        }
    }

    public void btn21Clicked(ActionEvent actionEvent) {
        if(btn21.getText().equals("*")){
            btn21.setText("");
        }else{
            btn21.setText("*");
        }
    }

    public void btn22Clicked(ActionEvent actionEvent) {
        if(btn22.getText().equals("*")){
            btn22.setText("");
        }else{
            btn22.setText("*");
        }
    }

    public void btn23Clicked(ActionEvent actionEvent) {
        if(btn23.getText().equals("*")){
            btn23.setText("");
        }else{
            btn23.setText("*");
        }
    }

    public void btn24Clicked(ActionEvent actionEvent) {
        if(btn24.getText().equals("*")){
            btn24.setText("");
        }else{
            btn24.setText("*");
        }
    }

    public void btn25Clicked(ActionEvent actionEvent) {
        if(btn25.getText().equals("*")){
            btn25.setText("");
        }else{
            btn25.setText("*");
        }
    }

    public void btnGoClicked(ActionEvent actionEvent) throws IOException {
       String final_result =  input_array_calculate();
       result.setText(final_result);

    }

    public void btnClearClicked(ActionEvent actionEvent) {
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        btn10.setText(" ");
        btn11.setText(" ");
        btn12.setText(" ");
        btn13.setText(" ");
        btn14.setText(" ");
        btn15.setText(" ");
        btn16.setText(" ");
        btn17.setText(" ");
        btn18.setText(" ");
        btn19.setText(" ");
        btn21.setText(" ");
        btn22.setText(" ");
        btn23.setText(" ");
        btn24.setText(" ");
        btn25.setText(" ");
        result.setText(" ");
    }

    public void btnTrainingClicked(ActionEvent actionEvent) {
        training();
    }

    public String input_array_calculate() throws IOException {
        int [][] input_array = new int[5][5];
        if(btn1.getText().equals("*")){
            input_array[0][0] = 1;
        }else{
            input_array[0][0] = 0;
        }
        if(btn2.getText().equals("*")){
            input_array[1][0] = 1;
        }else{
            input_array[1][0] = 0;
        }
        if(btn3.getText().equals("*")){
            input_array[2][0] = 1;
        }else{
            input_array[2][0] = 0;
        }
        if(btn4.getText().equals("*")){
            input_array[3][0] = 1;
        }else{
            input_array[3][0] = 0;
        }
        if(btn5.getText().equals("*")){
            input_array[4][0] = 1;
        }else{
            input_array[4][0] = 0;
        }
        if(btn6.getText().equals("*")){
            input_array[0][1] = 1;
        }else{
            input_array[0][1] = 0;
        }
        if(btn7.getText().equals("*")){
            input_array[1][1] = 1;
        }else{
            input_array[1][1] = 0;
        }
        if(btn8.getText().equals("*")){
            input_array[2][1] = 1;
        }else{
            input_array[2][1] = 0;
        }
        if(btn9.getText().equals("*")){
            input_array[3][1] = 1;
        }else{
            input_array[3][1] = 0;
        }
        if(btn10.getText().equals("*")){
            input_array[4][1] = 1;
        }else{
            input_array[4][1] = 0;
        }
        if(btn11.getText().equals("*")){
            input_array[0][2] = 1;
        }else{
            input_array[0][2] = 0;
        }
        if(btn12.getText().equals("*")){
            input_array[1][2] = 1;
        }else{
            input_array[1][2] = 0;
        }
        if(btn13.getText().equals("*")){
            input_array[2][2] = 1;
        }else{
            input_array[2][2] = 0;
        }
        if(btn14.getText().equals("*")){
            input_array[3][2] = 1;
        }else{
            input_array[3][2] = 0;
        }
        if(btn15.getText().equals("*")){
            input_array[4][2] = 1;
        }else{
            input_array[4][2] = 0;
        }
        if(btn16.getText().equals("*")){
            input_array[0][3] = 1;
        }else{
            input_array[0][3] = 0;
        }
        if(btn17.getText().equals("*")){
            input_array[1][3] = 1;
        }else{
            input_array[1][3] = 0;
        }
        if(btn18.getText().equals("*")){
            input_array[2][3] = 1;
        }else{
            input_array[2][3] = 0;
        }
        if(btn19.getText().equals("*")){
            input_array[3][3] = 1;
        }else{
            input_array[3][3] = 0;
        }
        if(btn20.getText().equals("*")){
            input_array[4][3] = 1;
        }else{
            input_array[4][3] = 0;
        }
        if(btn21.getText().equals("*")){
            input_array[0][4] = 1;
        }else{
            input_array[0][4] = 0;
        }
        if(btn22.getText().equals("*")){
            input_array[1][4] = 1;
        }else{
            input_array[1][4] = 0;
        }
        if(btn23.getText().equals("*")){
            input_array[2][4] = 1;
        }else{
            input_array[2][4] = 0;
        }
        if(btn24.getText().equals("*")){
            input_array[3][4] = 1;
        }else{
            input_array[3][4] = 0;
        }
        if(btn25.getText().equals("*")){
            input_array[4][4] = 1;
        }else{
            input_array[4][4] = 0;
        }

        String isXO = "";
        double result = hebb(input_array);
        if(result == 1) {
            isXO = "X";
            return isXO;
        }else{
            isXO ="O";
            return isXO;
        }


    }

    public static double [] training(){
        String fileName = "xo-data-for-bardi.txt"; // Replace with your file name
        List<int[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split("\\s+"); // Split by whitespace
                int[] row = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    row[i] = Integer.parseInt(numbers[i]);
                }
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the List to a 2D array if needed
        int[][] list_of_inputs_and_targets = data.toArray(new int[data.size()][]);
        int epoch_length = list_of_inputs_and_targets.length;
         weight= new double[list_of_inputs_and_targets[0].length -1];
        int [] data_for_current_epoch = new int[list_of_inputs_and_targets[0].length];
        while(true){
            for(int epoch_index =0 ; epoch_index < epoch_length ; epoch_index++){
                for(int column_index = 0; column_index < list_of_inputs_and_targets[0].length ; column_index++){
                    data_for_current_epoch[column_index] = list_of_inputs_and_targets[epoch_index][column_index];
                }
                for(int value_index = 0 ; value_index < data_for_current_epoch.length -1 ; value_index++){
                    weight[value_index] += data_for_current_epoch[value_index] *  data_for_current_epoch[data_for_current_epoch.length - 1];
                }
                bias +=  data_for_current_epoch[data_for_current_epoch.length - 1];
            }
            break;
        }
        System.out.println("training finished");
        for(int i = 0 ; i < weight.length ; i++){
            System.out.println("w" + (i+1) + " is : " + weight[i]);
        }
        System.out.println("Bias is: " + bias);
        return weight;

    }


    public static double hebb(int[][] main_inputs ) throws IOException {

        System.out.println("Bias second is: " + bias);
        int [] list_of_inputs = new int[main_inputs.length * main_inputs[0].length];
        int length_of_inputs = list_of_inputs.length;
        System.out.println("length is : " + length_of_inputs);
        int i = 0;
            for (int r = 0 ; r < main_inputs.length; r++){
                for (int c = 0 ; c < main_inputs[0].length ; c++){
                    if(i < list_of_inputs.length){
                        list_of_inputs[i] = main_inputs[r][c];
                        System.out.print(list_of_inputs[i]);
                        i++;
                    }
                }
            }

        double net_input = 0;
        for( i = 0 ; i < list_of_inputs.length ; i++){
            net_input += list_of_inputs[i] * weight[i];
        }
        net_input+=bias;
        double f = activation_function(net_input);
        System.out.println("net input is: " + net_input);
        return f;
    }


    public static double activation_function(double net_input){
        if(net_input > 1){
            return 1;
        }else{
            return -1;
        }
    }


}