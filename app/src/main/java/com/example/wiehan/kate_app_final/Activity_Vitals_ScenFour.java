package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Activity_Vitals_ScenFour extends AppCompatActivity {

    GraphView graphBP ;
    GraphView graphPulse ;
    GraphView graphRR;
    GraphView graphTemp;
    TextView BPNum ;
    TextView pulseNum ;
    TextView RRNum ;
    TextView tempNum ;
    TextView summaryText ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals_scen_four);


        BPNum = (TextView)  findViewById(R.id.BPNum_Scen4) ;
        pulseNum = (TextView)  findViewById(R.id.pulseNum_Scen4) ;
        RRNum = (TextView)  findViewById(R.id.RRNum_Scen4) ;
        tempNum = (TextView)  findViewById(R.id.tempNum_Scen4) ;
        summaryText = (TextView) findViewById(R.id.summaryText_Scen4) ;

        graphBP = (GraphView)findViewById(R.id.graphBP_Scen4) ;
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(0);
        graphBP.getViewport().setMaxY(1.5);



        graphPulse = (GraphView)findViewById(R.id.graphPulse_Scen4) ;
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(0);
        graphPulse.getViewport().setMaxY(1);

        graphRR = (GraphView)findViewById(R.id.graphRR_Scen4) ;
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(0);
        graphRR.getViewport().setMaxY(1);

        graphTemp = (GraphView)findViewById(R.id.graphTemp_Scen4) ;
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(0);
        graphTemp.getViewport().setMaxY(1);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame_Scen4);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game_Scen4.class);
                startActivity(intent);
            }
        });
        //start of setting patient 1 data by default
        graphBP.removeAllSeries();
        graphPulse.removeAllSeries();
        graphRR.removeAllSeries();
        graphTemp.removeAllSeries();

        BPNum.setText("122/80 ");
        pulseNum.setText("82 ");
        RRNum.setText("19 ");
        tempNum.setText("97.6 ");
        summaryText.setText("\nSummary: 89 y/o Male, Minor head injuries, Bruises and discoloration in temporal area.");

        seriesBP = new LineGraphSeries<DataPoint>();
        seriesPulse = new LineGraphSeries<DataPoint>();
        seriesRR = new LineGraphSeries<DataPoint>();
        seriesTemp = new LineGraphSeries<DataPoint>();


        patienOneRandomGraphs();

        graphPulse.addSeries(seriesPulse);
        graphBP.addSeries(seriesBP);
        graphRR.addSeries(seriesRR);
        graphTemp.addSeries(seriesTemp);


        //end
        final Button patientOne = (Button) findViewById(R.id.patient_one_Button_Scen4) ;

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("122/80 ");
                pulseNum.setText("82 ");
                RRNum.setText("19 ");
                tempNum.setText("97.6 ");
                summaryText.setText("\nSummary: 89 y/o Male, Minor head injuries, Bruises and discoloration in temporal area.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patienOneRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);

            }
        });

        final Button patientTwo = (Button) findViewById(R.id.patient_two_Button_Scen4) ;

        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("127/82 ");
                pulseNum.setText("82 ");
                RRNum.setText("17 ");
                tempNum.setText("98.4 ");
                summaryText.setText("\nSummary: 85 y/o Male, Severe burns on left arm.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientTwoRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);
            }


        });

        final Button patientThree = (Button) findViewById(R.id.patient_three_Button_Scen4) ;

        patientThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("125/86 ");
                pulseNum.setText("83 ");
                RRNum.setText("119 ");
                tempNum.setText("96.7 ");
                summaryText.setText("\nSummary: 69 y/o Female, Broken collarbone, Minor burns on right arm.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientThreeRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);
            }


        });

        final Button patientFour = (Button) findViewById(R.id.patient_four_Button_Scen4) ;

        patientFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("129/85 ");
                pulseNum.setText("84 ");
                RRNum.setText("17 ");
                tempNum.setText("98.1 ");
                summaryText.setText("\nSummary: 75 y/o Female, Broken ribs, Sever burns on right shoulder.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientFourRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);
            }


        });

        final Button patientFive = (Button) findViewById(R.id.patient_five_Button_Scen4) ;

        patientFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("122/81 ");
                pulseNum.setText("85 ");
                RRNum.setText("18 ");
                tempNum.setText("97.4 ");
                summaryText.setText("\nSummary: 63 y/o Male, Left foot broken, Minor facial burns, Minor bruises.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientFiveRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);
            }


        });

    }

    private void patienOneRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.005;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.4;
            y = Math.cos(x) * 0.8;

            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.5) {
                y +=0.002;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 20) {
                if(y<0.9) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

    private void patientTwoRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.0025;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.4;
            y = Math.cos(x)*0.6;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.4) {
                y +=0.00125;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 25) {
                if(y<0.8) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

    private void patientThreeRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.8) {
                y +=0.0015;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            y = Math.cos(x)*0.75;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.5) {
                y +=0.0012;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 30) {
                if(y<0.9) {
                    y += 0.002;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }
    private void patientFourRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.25;
            if(y <= 0.75) {
                y +=0.001;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.45;
            y = Math.cos(x)*0.9;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.215;
            if(y <= 0.5) {
                y +=0.00125;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 40) {
                if(y<0.85) {
                    y += 0.002;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }
    private void patientFiveRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.6) {
                y +=0.0005;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.25;
            y = Math.cos(x)*0.68;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.25;
            if(y <= 0.4) {
                y +=0.00225;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 20) {
                if(y<0.8) {
                    y += 0.002;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }
}
