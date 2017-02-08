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

public class Advance_Display_ScenThree extends AppCompatActivity {

    GraphView graphBPAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView tempNumAdvance ;
    TextView textInfo ;
    TextView textPatient1, textPatient2, textPatient3, textPatient4, textPatient5 ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_display_scen_three);

        BPNumAdvance = (TextView)  findViewById(R.id.BPNumAdvance_Scen3) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen3) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen3) ;
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen3) ;
        textInfo = (TextView) findViewById(R.id.textInfo_Scen3) ;

        textPatient1 = (TextView) findViewById(R.id.textPatient1);
        textPatient2 = (TextView) findViewById(R.id.textPatient2) ;
        textPatient3 = (TextView) findViewById(R.id.textPatient3) ;
        textPatient4 = (TextView) findViewById(R.id.textPatient4) ;
        textPatient5 = (TextView) findViewById(R.id.textPatient5) ;
        

        graphBPAdvance = (GraphView)findViewById(R.id.graphBPAdvance_Scen3) ;
        graphBPAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphBPAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphBPAdvance.getViewport().setScrollableY(false);
        graphBPAdvance.getViewport().setYAxisBoundsManual(true);
        graphBPAdvance.getViewport().setMinY(0);
        graphBPAdvance.getViewport().setMaxY(1.5);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen3) ;
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(0);
        graphPulseAdvance.getViewport().setMaxY(1);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen3) ;
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(0);
        graphRRAdvance.getViewport().setMaxY(1);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen3) ;
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setYAxisBoundsManual(true);
        graphTempAdvance.getViewport().setMinY(0);
        graphTempAdvance.getViewport().setMaxY(1);
        

        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance_Scen3);

        createActionPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Action_Plan.class);
                startActivity(intent);
            }
        });


        //start of setting patient 1 data by default

        graphBPAdvance.removeAllSeries();
        graphPulseAdvance.removeAllSeries();
        graphRRAdvance.removeAllSeries();
        graphTempAdvance.removeAllSeries();

        BPNumAdvance.setText("122/80 ");
        pulseNumAdvance.setText("82 ");
        RRNumAdvance.setText("19 ");
        tempNumAdvance.setText("97.6 ");
        textInfo.setText("\nFentanyl administered : 6:24 pm\nFluids givens : 6:32 pm");

        textPatient1.setText("John 89");
        textPatient2.setText("");
        textPatient3.setText("");
        textPatient4.setText("");
        textPatient5.setText("");


        seriesBP = new LineGraphSeries<DataPoint>();
        seriesPulse = new LineGraphSeries<DataPoint>();
        seriesRR = new LineGraphSeries<DataPoint>();
        seriesTemp = new LineGraphSeries<DataPoint>();


        patienOneRandomGraphs();

        graphPulseAdvance.addSeries(seriesPulse);
        graphBPAdvance.addSeries(seriesBP);
        graphRRAdvance.addSeries(seriesRR);
        graphTempAdvance.addSeries(seriesTemp);

        //end

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen3) ;

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                BPNumAdvance.setText("122/80 ");
                pulseNumAdvance.setText("82 ");
                RRNumAdvance.setText("19 ");
                tempNumAdvance.setText("97.6 ");
                textInfo.setText("\nFentanyl administered : 6:24 pm\nFluids givens : 6:32 pm");

                textPatient1.setText("John 89");
                textPatient2.setText("");
                textPatient3.setText("");
                textPatient4.setText("");
                textPatient5.setText("");


                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patienOneRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });

        final Button patientTwo = (Button) findViewById(R.id.patient_Two_Button_Adv_Scen3) ;

        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                BPNumAdvance.setText("127/82 ");
                pulseNumAdvance.setText("82 ");
                RRNumAdvance.setText("17 ");
                tempNumAdvance.setText("98.4 ");
                textInfo.setText("\nFentanyl administered : 6:21 pm\nFluids givens : 6:35 pm");

                textPatient1.setText("");
                textPatient2.setText("Chris 85");
                textPatient3.setText("");
                textPatient4.setText("");
                textPatient5.setText("");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientTwoRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);
            }


        });

        final Button patientThree = (Button) findViewById(R.id.patient_Three_Button_Adv_Scen3) ;

        patientThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                BPNumAdvance.setText("125/86 ");
                pulseNumAdvance.setText("83 ");
                RRNumAdvance.setText("119 ");
                tempNumAdvance.setText("96.7 ");
                textInfo.setText("\nFentanyl administered : 6:26 pm\nFluids givens : 6:35 pm");

                textPatient1.setText("");
                textPatient2.setText("");
                textPatient3.setText("Marissa 69");
                textPatient4.setText("");
                textPatient5.setText("");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientThreeRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);
            }


        });

        final Button patientFour = (Button) findViewById(R.id.patient_Four_Button_Adv_Scen3) ;

        patientFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                BPNumAdvance.setText("129/85 ");
                pulseNumAdvance.setText("84 ");
                RRNumAdvance.setText("17 ");
                tempNumAdvance.setText("98.1 ");
                textInfo.setText("\nFentanyl administered : 6:19 pm\nFluids givens : 6:30 pm");

                textPatient1.setText("");
                textPatient2.setText("");
                textPatient3.setText("");
                textPatient4.setText("Megan 75");
                textPatient5.setText("");


                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientFourRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);
            }


        });

        final Button patientFive = (Button) findViewById(R.id.patient_Five_Button_Adv_Scen3) ;

        patientFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                BPNumAdvance.setText("122/81 ");
                pulseNumAdvance.setText("85 ");
                RRNumAdvance.setText("18 ");
                tempNumAdvance.setText("97.4 ");
                textInfo.setText("\nFentanyl administered : 6:28 pm\nFluids givens : 6:37 pm");

                textPatient1.setText("");
                textPatient2.setText("");
                textPatient3.setText("");
                textPatient4.setText("");
                textPatient5.setText("Kyle 63");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientFiveRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);
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

