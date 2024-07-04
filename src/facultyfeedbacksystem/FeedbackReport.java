/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultyfeedbacksystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sunishka Sharma
 */
public class FeedbackReport {

    DatabaseConnection obj = new DatabaseConnection();

    public FeedbackReport(int teacherID, String teachername) {

        int score; //to store the score 
        double average_score[] = new double[16]; //to store the average score for each question for a teacher
        String question[] = new String[16]; //to store the full 16 questions

        try {
            Connection con = DatabaseConnection.getConnect();
            Statement st = con.createStatement();
            int q_count = 1;//question id of first question
            int index = 0; //for the arrays
            while (q_count < 17) {
                int total_scores = 0; //counting total scores for average
                int total_students = 0; //counting total students for average
                //fetching the scores of questions one by one given to the teacher 
                ResultSet rt = st.executeQuery(String.format("select * from teacher_feedback_tbl where question_id=" 
                        + q_count + " and teacher_id=" + teacherID + "")); 
                while (rt.next()) {
                    score = rt.getInt(4); 
                    total_scores = total_scores + score; //adding all the scores for each question seperately 
                    total_students++; 
                }
                double average = total_scores / total_students; //calculating the average
                average_score[index] = average;
                question[index] = getQuestion(q_count); //storing the full question to display in the graph
                index++;
                q_count++; //to go to the next question id
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            //using the arrays to display the values and question in the chart
            dataset.addValue(average_score[0], question[0], "Score");
            dataset.addValue(average_score[1], question[1], "Score");
            dataset.addValue(average_score[2], question[2], "Score");
            dataset.addValue(average_score[3], question[3], "Score");
            dataset.addValue(average_score[4], question[4], "Score");
            dataset.addValue(average_score[5], question[5], "Score");
            dataset.addValue(average_score[6], question[6], "Score");
            dataset.addValue(average_score[7], question[7], "Score");
            dataset.addValue(average_score[8], question[8], "Score");
            dataset.addValue(average_score[9], question[9], "Score");
            dataset.addValue(average_score[10], question[10], "Score");
            dataset.addValue(average_score[11], question[11], "Score");
            dataset.addValue(average_score[12], question[12], "Score");
            dataset.addValue(average_score[13], question[13], "Score");
            dataset.addValue(average_score[14], question[14], "Score");
            dataset.addValue(average_score[15], question[15], "Score");
            JFreeChart chart = ChartFactory.createBarChart("Teacher Feedback Report", "Questions", "Score", dataset, 
                    PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.BLACK);
            ChartFrame f = new ChartFrame(teachername, chart);
            f.setVisible(true);
            f.setSize(1500, 600);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR  " + e.getMessage());
        }
    }

    //method to fetch the question from the questions_tbl
    public String getQuestion(int q_count) {
        String question = null;
        try {
            Connection con = DatabaseConnection.getConnect();
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery(String.format("select question from questions_tbl where question_id=" + q_count));
            if (rt.next()) {
                question = rt.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return question;
    }
}
