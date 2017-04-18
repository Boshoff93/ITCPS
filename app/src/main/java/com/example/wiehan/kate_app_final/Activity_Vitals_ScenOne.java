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

public class Activity_Vitals_ScenOne extends AppCompatActivity {

    GraphView graphBP ;
    GraphView graphPulse ;
    GraphView graphRR;
    GraphView graphTemp;
    GraphView graphPAO ;
    TextView BPNum ;
    TextView pulseNum ;
    TextView RRNum ;
    TextView tempNum ;
    TextView summaryText ;
    TextView PAONum;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    LineGraphSeries<DataPoint> seriesPAO ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals_scen_one);

        BPNum = (TextView)  findViewById(R.id.BPNum_Scen1) ;
        pulseNum = (TextView)  findViewById(R.id.pulseNum_Scen1) ;
        RRNum = (TextView)  findViewById(R.id.RRNum_Scen1) ;
        tempNum = (TextView)  findViewById(R.id.tempNum_Scen1) ;
        PAONum = (TextView) findViewById(R.id.PAONum_Scen1);
        summaryText = (TextView) findViewById(R.id.summaryText_Scen1) ;

        graphBP = (GraphView)findViewById(R.id.graphBP_Scen1) ;
        graphBP.getGridLabelRenderer().setTextSize(14f);
        graphBP.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(120);
        graphBP.getViewport().setMaxY(200);
        graphBP.getViewport().setMaxX(60);
        graphBP.getViewport().setMinX(0);

        graphPulse = (GraphView)findViewById(R.id.graphPulse_Scen1) ;
        graphPulse.getGridLabelRenderer().setTextSize(14f);
        graphPulse.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(100);
        graphPulse.getViewport().setMaxY(140);
        graphPulse.getViewport().setMinX(0);
        graphPulse.getViewport().setMaxX(60);

        graphRR = (GraphView)findViewById(R.id.graphRR_Scen1) ;
        graphRR.getGridLabelRenderer().setTextSize(14f);
        graphRR.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(15);
        graphRR.getViewport().setMaxY(27);
        graphRR.getViewport().setMinX(0);
        graphRR.getViewport().setMaxX(60);

        graphPAO = (GraphView)findViewById(R.id.graphPAO_Scen1) ;
        graphPAO.getGridLabelRenderer().setTextSize(14f);
        graphPAO.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPAO.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAO.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAO.getViewport().setYAxisBoundsManual(true);
        graphPAO.getViewport().setMinY(95);
        graphPAO.getViewport().setMaxY(100);
        graphPAO.getViewport().setMinX(0);
        graphPAO.getViewport().setMaxX(60);

        graphTemp = (GraphView)findViewById(R.id.graphTemp_Scen1) ;
        graphTemp.getGridLabelRenderer().setTextSize(14f);
        graphTemp.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(97.6);
        graphTemp.getViewport().setMaxY(99.6);
        graphTemp.getViewport().setMinX(0);
        graphTemp.getViewport().setMaxX(60);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame_Scen1);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game_Scen1.class);
                startActivity(intent);
            }
        });

        //Start of Setting patient 1 by default

        graphBP.removeAllSeries();
        graphPulse.removeAllSeries();
        graphRR.removeAllSeries();
        graphPAO.removeAllSeries();
        graphTemp.removeAllSeries();

        BPNum.setText("155/103 ");
        pulseNum.setText("119 ");
        RRNum.setText("25 ");
        PAONum.setText("97 ");
        tempNum.setText("98.6 ");
        summaryText.setText("\nPatient 1: 35 y/o Male, broken forearm, head ache, bruise temporal area, 2 min LOC");

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


        final Button patientOne = (Button) findViewById(R.id.patient_one_Button_Scen1) ;
        patientOne.setSelected(true);

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();
                graphPAO.removeAllSeries();

                BPNum.setText("155/103 ");
                pulseNum.setText("119 ");
                RRNum.setText("25 ");
                PAONum.setText("97 ");
                tempNum.setText("98.6 ");
                summaryText.setText("\nPatient 1: 35 y/o Male, broken forearm, head ache, bruise temporal area, 2 min LOC");

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

        seriesBP.appendData(new DataPoint(10, 150), true, 6);
        seriesBP.appendData(new DataPoint(20, 154), true, 6);
        seriesBP.appendData(new DataPoint(30, 152), true, 6);
        seriesBP.appendData(new DataPoint(40, 158), true, 6);
        seriesBP.appendData(new DataPoint(50, 153), true, 6);
        seriesBP.appendData(new DataPoint(60, 155), true, 6);


        seriesPulse.appendData(new DataPoint(10, 121), true, 6);
        seriesPulse.appendData(new DataPoint(20, 125), true, 6);
        seriesPulse.appendData(new DataPoint(30, 123), true, 6);
        seriesPulse.appendData(new DataPoint(40, 120), true, 6);
        seriesPulse.appendData(new DataPoint(50, 119), true, 6);
        seriesPulse.appendData(new DataPoint(60, 119), true, 6);


        seriesRR.appendData(new DataPoint(10, 23), true, 6);
        seriesRR.appendData(new DataPoint(20, 23), true, 6);
        seriesRR.appendData(new DataPoint(30, 22), true, 6);
        seriesRR.appendData(new DataPoint(40, 25), true, 6);
        seriesRR.appendData(new DataPoint(50, 24), true, 6);
        seriesRR.appendData(new DataPoint(60, 25), true, 6);

        seriesPAO.appendData(new DataPoint(10,98), true, 6);
        seriesPAO.appendData(new DataPoint(20,97), true, 6);
        seriesPAO.appendData(new DataPoint(30,98), true, 6);
        seriesPAO.appendData(new DataPoint(40,98), true, 6);
        seriesPAO.appendData(new DataPoint(50,96), true, 6);
        seriesPAO.appendData(new DataPoint(60,97), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.6), true, 6);
    }


}
