package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Activity_Vitals_ScenThree extends AppCompatActivity {

    GraphView graphBP ;
    GraphView graphPulse ;
    GraphView graphRR;
    GraphView graphTemp;
    GraphView graphPAO ;
    TextView BPNum ;
    TextView pulseNum ;
    TextView RRNum ;
    TextView tempNum ;
    TextView PAONum ;
    TextView summaryText ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    LineGraphSeries<DataPoint> seriesPAO ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals_scen_three);


        BPNum = (TextView)  findViewById(R.id.BPNum_Scen3) ;
        pulseNum = (TextView)  findViewById(R.id.pulseNum_Scen3) ;
        RRNum = (TextView)  findViewById(R.id.RRNum_Scen3) ;
        tempNum = (TextView)  findViewById(R.id.tempNum_Scen3) ;
        PAONum = (TextView) findViewById(R.id.PAONum_Scen3) ;
        summaryText = (TextView) findViewById(R.id.summaryText_Scen3) ;

        graphBP = (GraphView) findViewById(R.id.graphBP_Scen3);
        graphBP.getGridLabelRenderer().setTextSize(14f);
        graphBP.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(130);
        graphBP.getViewport().setMaxY(160);
        graphBP.getViewport().setMaxX(60);
        graphBP.getViewport().setMinX(0);

        graphPulse = (GraphView) findViewById(R.id.graphPulse_Scen3);
        graphPulse.getGridLabelRenderer().setTextSize(14f);
        graphPulse.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(100);
        graphPulse.getViewport().setMaxY(140);
        graphPulse.getViewport().setMinX(0);
        graphPulse.getViewport().setMaxX(60);

        graphRR = (GraphView) findViewById(R.id.graphRR_Scen3);
        graphRR.getGridLabelRenderer().setTextSize(14f);
        graphRR.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(18);
        graphRR.getViewport().setMaxY(30);
        graphRR.getViewport().setMinX(0);
        graphRR.getViewport().setMaxX(60);

        graphPAO = (GraphView) findViewById(R.id.graphPAO_Scen3);
        graphPAO.getGridLabelRenderer().setTextSize(14f);
        graphPAO.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPAO.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAO.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAO.getViewport().setYAxisBoundsManual(true);
        graphPAO.getViewport().setMinY(92);
        graphPAO.getViewport().setMaxY(100);
        graphPAO.getViewport().setMinX(0);
        graphPAO.getViewport().setMaxX(60);

        graphTemp = (GraphView) findViewById(R.id.graphTemp_Scen3);
        graphTemp.getGridLabelRenderer().setTextSize(14f);
        graphTemp.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(97.6);
        graphTemp.getViewport().setMaxY(99.6);
        graphTemp.getViewport().setMinX(0);
        graphTemp.getViewport().setMaxX(60);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame_Scen3);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game_Scen3.class);
                startActivity(intent);
            }
        });


        //start of setting patient 1 data by default

        graphBP.removeAllSeries();
        graphPulse.removeAllSeries();
        graphRR.removeAllSeries();
        graphPAO.removeAllSeries();
        graphTemp.removeAllSeries();

        BPNum.setText("141/91 ");
        pulseNum.setText("119 ");
        RRNum.setText("23 ");
        PAONum.setText("96");
        tempNum.setText("98.7 ");
        summaryText.setText("\nSummary: Jack, male, 18 y/o, 2nd & 3rd degree burns- arms, torso.");

        seriesBP = new LineGraphSeries<DataPoint>();
        seriesPulse = new LineGraphSeries<DataPoint>();
        seriesRR = new LineGraphSeries<DataPoint>();
        seriesPAO = new LineGraphSeries<DataPoint>();
        seriesTemp = new LineGraphSeries<DataPoint>();


        patienOneRandomGraphs();

        graphPulse.addSeries(seriesPulse);
        graphBP.addSeries(seriesBP);
        graphRR.addSeries(seriesRR);
        graphPAO.addSeries(seriesPAO);
        graphTemp.addSeries(seriesTemp);


        //end

        final Button patientOne = (Button) findViewById(R.id.patient_one_Button_Scen3) ;
        final Button patientTwo = (Button) findViewById(R.id.patient_two_Button_Scen3) ;
        final Button patientThree = (Button) findViewById(R.id.patient_three_Button_Scen3) ;

        patientOne.setSelected(true);
        patientTwo.setSelected(false);
        patientThree.setSelected(false);


        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphPAO.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("141/91 ");
                pulseNum.setText("119 ");
                RRNum.setText("23 ");
                PAONum.setText("96 ");
                tempNum.setText("98.7 ");
                summaryText.setText("\nSummary: Jack, male, 18 y/o, 2nd & 3rd degree burns- arms, torso.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(true);
                patientTwo.setSelected(false);
                patientThree.setSelected(false);

                patienOneRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphPAO.addSeries(seriesPAO);
                graphTemp.addSeries(seriesTemp);

            }
        });


        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphPAO.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("140/90 ");
                pulseNum.setText("122 ");
                RRNum.setText("23 ");
                PAONum.setText("96 ");
                tempNum.setText("98.5 ");
                summaryText.setText("\nSummary: Sammantha, female, 32 y/o, 2nd degree burns on back, broken arm.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(false);
                patientTwo.setSelected(true);
                patientThree.setSelected(false);

                patientTwoRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphPAO.addSeries(seriesPAO);
                graphTemp.addSeries(seriesTemp);
            }


        });


        patientThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphPAO.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("145/95 ");
                pulseNum.setText("120 ");
                RRNum.setText("22 ");
                PAONum.setText("96 ");
                tempNum.setText("98.6 ");
                summaryText.setText("\nSummary: Sofia, female, 22 y/o, glass in eye, cuts on face – bleeding.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(false);
                patientTwo.setSelected(false);
                patientThree.setSelected(true);

                patientThreeRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphPAO.addSeries(seriesPAO);
                graphTemp.addSeries(seriesTemp);
            }


        });


    }

    private void patienOneRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 139), true, 6);
        seriesBP.appendData(new DataPoint(20, 136), true, 6);
        seriesBP.appendData(new DataPoint(30, 137), true, 6);
        seriesBP.appendData(new DataPoint(40, 140), true, 6);
        seriesBP.appendData(new DataPoint(50, 142), true, 6);
        seriesBP.appendData(new DataPoint(60, 141), true, 6);

        seriesPulse.appendData(new DataPoint(10, 114), true, 6);
        seriesPulse.appendData(new DataPoint(20, 116), true, 6);
        seriesPulse.appendData(new DataPoint(30, 119), true, 6);
        seriesPulse.appendData(new DataPoint(40, 113), true, 6);
        seriesPulse.appendData(new DataPoint(50, 117), true, 6);
        seriesPulse.appendData(new DataPoint(60, 119), true, 6);

        seriesRR.appendData(new DataPoint(10, 22), true, 6);
        seriesRR.appendData(new DataPoint(20, 23), true, 6);
        seriesRR.appendData(new DataPoint(30, 23), true, 6);
        seriesRR.appendData(new DataPoint(40, 22), true, 6);
        seriesRR.appendData(new DataPoint(50, 23), true, 6);
        seriesRR.appendData(new DataPoint(60, 23), true, 6);

        seriesPAO.appendData(new DataPoint(10, 96), true, 6);
        seriesPAO.appendData(new DataPoint(20, 97), true, 6);
        seriesPAO.appendData(new DataPoint(30, 97), true, 6);
        seriesPAO.appendData(new DataPoint(40, 96), true, 6);
        seriesPAO.appendData(new DataPoint(50, 95), true, 6);
        seriesPAO.appendData(new DataPoint(60, 96), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.4), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.4), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.7), true, 6);
    }

    private void patientTwoRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 145), true, 6);
        seriesBP.appendData(new DataPoint(20, 146), true, 6);
        seriesBP.appendData(new DataPoint(30, 141), true, 6);
        seriesBP.appendData(new DataPoint(40, 144), true, 6);
        seriesBP.appendData(new DataPoint(50, 142), true, 6);
        seriesBP.appendData(new DataPoint(60, 140), true, 6);

        seriesPulse.appendData(new DataPoint(10, 120), true, 6);
        seriesPulse.appendData(new DataPoint(20, 124), true, 6);
        seriesPulse.appendData(new DataPoint(30, 121), true, 6);
        seriesPulse.appendData(new DataPoint(40, 126), true, 6);
        seriesPulse.appendData(new DataPoint(50, 123), true, 6);
        seriesPulse.appendData(new DataPoint(60, 122), true, 6);

        seriesRR.appendData(new DataPoint(10, 21), true, 6);
        seriesRR.appendData(new DataPoint(20, 20), true, 6);
        seriesRR.appendData(new DataPoint(30, 23), true, 6);
        seriesRR.appendData(new DataPoint(40, 24), true, 6);
        seriesRR.appendData(new DataPoint(50, 24), true, 6);
        seriesRR.appendData(new DataPoint(60, 23), true, 6);

        seriesPAO.appendData(new DataPoint(10, 98), true, 6);
        seriesPAO.appendData(new DataPoint(20, 97), true, 6);
        seriesPAO.appendData(new DataPoint(30, 96), true, 6);
        seriesPAO.appendData(new DataPoint(40, 97), true, 6);
        seriesPAO.appendData(new DataPoint(50, 96), true, 6);
        seriesPAO.appendData(new DataPoint(60, 96), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.5), true, 6);
    }

    private void patientThreeRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 149), true, 6);
        seriesBP.appendData(new DataPoint(20, 148), true, 6);
        seriesBP.appendData(new DataPoint(30, 147), true, 6);
        seriesBP.appendData(new DataPoint(40, 150), true, 6);
        seriesBP.appendData(new DataPoint(50, 146), true, 6);
        seriesBP.appendData(new DataPoint(60, 145), true, 6);

        seriesPulse.appendData(new DataPoint(10, 130), true, 6);
        seriesPulse.appendData(new DataPoint(20, 129), true, 6);
        seriesPulse.appendData(new DataPoint(30, 125), true, 6);
        seriesPulse.appendData(new DataPoint(40, 124), true, 6);
        seriesPulse.appendData(new DataPoint(50, 123), true, 6);
        seriesPulse.appendData(new DataPoint(60, 120), true, 6);

        seriesRR.appendData(new DataPoint(10, 21), true, 6);
        seriesRR.appendData(new DataPoint(20, 22), true, 6);
        seriesRR.appendData(new DataPoint(30, 23), true, 6);
        seriesRR.appendData(new DataPoint(40, 22), true, 6);
        seriesRR.appendData(new DataPoint(50, 21), true, 6);
        seriesRR.appendData(new DataPoint(60, 22), true, 6);

        seriesPAO.appendData(new DataPoint(10, 97), true, 6);
        seriesPAO.appendData(new DataPoint(20, 96), true, 6);
        seriesPAO.appendData(new DataPoint(30, 97), true, 6);
        seriesPAO.appendData(new DataPoint(40, 97), true, 6);
        seriesPAO.appendData(new DataPoint(50, 96), true, 6);
        seriesPAO.appendData(new DataPoint(60, 96), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.6), true, 6);
    }


}


