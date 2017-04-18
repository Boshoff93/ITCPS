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

public class Activity_Vitals_ScenTwo extends AppCompatActivity {

    GraphView graphBP;
    GraphView graphPulse;
    GraphView graphRR;
    GraphView graphTemp;
    GraphView graphPAO;
    TextView BPNum;
    TextView pulseNum;
    TextView RRNum;
    TextView tempNum;
    TextView summaryText;
    TextView PAONum;
    LineGraphSeries<DataPoint> seriesBP;
    LineGraphSeries<DataPoint> seriesPulse;
    LineGraphSeries<DataPoint> seriesRR;
    LineGraphSeries<DataPoint> seriesTemp;
    LineGraphSeries<DataPoint> seriesPAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals_scen_two);

        BPNum = (TextView) findViewById(R.id.BPNum_Scen2);
        pulseNum = (TextView) findViewById(R.id.pulseNum_Scen2);
        RRNum = (TextView) findViewById(R.id.RRNum_Scen2);
        tempNum = (TextView) findViewById(R.id.tempNum_Scen2);
        PAONum = (TextView) findViewById(R.id.PAONum_Scen2);
        summaryText = (TextView) findViewById(R.id.summaryText_Scen2);

        graphBP = (GraphView) findViewById(R.id.graphBP_Scen2);
        graphBP.getGridLabelRenderer().setTextSize(14f);
        graphBP.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(120);
        graphBP.getViewport().setMaxY(200);
        graphBP.getViewport().setMaxX(60);
        graphBP.getViewport().setMinX(0);

        graphPulse = (GraphView) findViewById(R.id.graphPulse_Scen2);
        graphPulse.getGridLabelRenderer().setTextSize(14f);
        graphPulse.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(100);
        graphPulse.getViewport().setMaxY(140);
        graphPulse.getViewport().setMinX(0);
        graphPulse.getViewport().setMaxX(60);

        graphRR = (GraphView) findViewById(R.id.graphRR_Scen2);
        graphRR.getGridLabelRenderer().setTextSize(14f);
        graphRR.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(15);
        graphRR.getViewport().setMaxY(27);
        graphRR.getViewport().setMinX(0);
        graphRR.getViewport().setMaxX(60);

        graphPAO = (GraphView) findViewById(R.id.graphPAO_Scen2);
        graphPAO.getGridLabelRenderer().setTextSize(14f);
        graphPAO.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPAO.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAO.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAO.getViewport().setYAxisBoundsManual(true);
        graphPAO.getViewport().setMinY(92);
        graphPAO.getViewport().setMaxY(100);
        graphPAO.getViewport().setMinX(0);
        graphPAO.getViewport().setMaxX(60);

        graphTemp = (GraphView) findViewById(R.id.graphTemp_Scen2);
        graphTemp.getGridLabelRenderer().setTextSize(14f);
        graphTemp.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(97.6);
        graphTemp.getViewport().setMaxY(99.6);
        graphTemp.getViewport().setMinX(0);
        graphTemp.getViewport().setMaxX(60);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame_Scen2);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game_Scen2.class);
                startActivity(intent);
            }
        });

        //start of setting patient 1 data by default

        graphBP.removeAllSeries();
        graphPulse.removeAllSeries();
        graphRR.removeAllSeries();
        graphPAO.removeAllSeries();
        graphTemp.removeAllSeries();

        BPNum.setText("141/90 ");
        pulseNum.setText("137 ");
        RRNum.setText("23 ");
        PAONum.setText("96 ");
        tempNum.setText("98.5 ");
        summaryText.setText("\nPatient 1: 75 y/o male, found unconscious, fractured foot, neck pains, lacs & bruises on forehead.");

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


        final Button patientOne = (Button) findViewById(R.id.patient_one_Button_Scen2);
        patientOne.setSelected(true);

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphPAO.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("141/90 ");
                pulseNum.setText("137 ");
                RRNum.setText("23 ");
                PAONum.setText("96 ");
                tempNum.setText("98.5 ");
                summaryText.setText("\nPatient 1: 75 y/o male, found unconscious, fractured foot, neck pains, lacs & bruises on forehead.");

                patientOne.setSelected(true);

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

            }
        });

    }

    private void patienOneRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 140), true, 6);
        seriesBP.appendData(new DataPoint(20, 142), true, 6);
        seriesBP.appendData(new DataPoint(30, 150), true, 6);
        seriesBP.appendData(new DataPoint(40, 144), true, 6);
        seriesBP.appendData(new DataPoint(50, 139), true, 6);
        seriesBP.appendData(new DataPoint(60, 141), true, 6);

        seriesPulse.appendData(new DataPoint(10, 130), true, 6);
        seriesPulse.appendData(new DataPoint(20, 134), true, 6);
        seriesPulse.appendData(new DataPoint(30, 135), true, 6);
        seriesPulse.appendData(new DataPoint(40, 133), true, 6);
        seriesPulse.appendData(new DataPoint(50, 136), true, 6);
        seriesPulse.appendData(new DataPoint(60, 137), true, 6);

        seriesRR.appendData(new DataPoint(10, 21), true, 6);
        seriesRR.appendData(new DataPoint(20, 23), true, 6);
        seriesRR.appendData(new DataPoint(30, 24), true, 6);
        seriesRR.appendData(new DataPoint(40, 24), true, 6);
        seriesRR.appendData(new DataPoint(50, 23), true, 6);
        seriesRR.appendData(new DataPoint(60, 23), true, 6);

        seriesPAO.appendData(new DataPoint(10, 96), true, 6);
        seriesPAO.appendData(new DataPoint(20, 97), true, 6);
        seriesPAO.appendData(new DataPoint(30, 96), true, 6);
        seriesPAO.appendData(new DataPoint(40, 98), true, 6);
        seriesPAO.appendData(new DataPoint(50, 97), true, 6);
        seriesPAO.appendData(new DataPoint(60, 96), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.5), true, 6);

    }
}

