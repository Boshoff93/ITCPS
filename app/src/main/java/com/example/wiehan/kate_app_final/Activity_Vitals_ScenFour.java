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
        setContentView(R.layout.activity_vitals_scen_four);


        BPNum = (TextView)  findViewById(R.id.BPNum_Scen4) ;
        pulseNum = (TextView)  findViewById(R.id.pulseNum_Scen4) ;
        RRNum = (TextView)  findViewById(R.id.RRNum_Scen4) ;
        tempNum = (TextView)  findViewById(R.id.tempNum_Scen4) ;
        PAONum = (TextView) findViewById(R.id.POANum_Scen4);
        summaryText = (TextView) findViewById(R.id.summaryText_Scen4) ;

        graphBP = (GraphView) findViewById(R.id.graphBP_Scen4);
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(120);
        graphBP.getViewport().setMaxY(200);
        graphBP.getViewport().setMaxX(60);
        graphBP.getViewport().setMinX(0);

        graphPulse = (GraphView) findViewById(R.id.graphPulse_Scen4);
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(100);
        graphPulse.getViewport().setMaxY(140);
        graphPulse.getViewport().setMinX(0);
        graphPulse.getViewport().setMaxX(60);

        graphRR = (GraphView) findViewById(R.id.graphRR_Scen4);
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(15);
        graphRR.getViewport().setMaxY(27);
        graphRR.getViewport().setMinX(0);
        graphRR.getViewport().setMaxX(60);

        graphPAO = (GraphView) findViewById(R.id.graphPAO_Scen4);
        graphPAO.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAO.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAO.getViewport().setYAxisBoundsManual(true);
        graphPAO.getViewport().setMinY(90);
        graphPAO.getViewport().setMaxY(100);
        graphPAO.getViewport().setMinX(0);
        graphPAO.getViewport().setMaxX(60);

        graphTemp = (GraphView) findViewById(R.id.graphTemp_Scen4);
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(97.6);
        graphTemp.getViewport().setMaxY(99.6);
        graphTemp.getViewport().setMinX(0);
        graphTemp.getViewport().setMaxX(60);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame_Scen4);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game_Scen4.class);
                startActivity(intent);
            }
        });
        graphBP.removeAllSeries();
        graphPulse.removeAllSeries();
        graphRR.removeAllSeries();
        graphPAO.removeAllSeries();
        graphTemp.removeAllSeries();

        BPNum.setText("141/91 ");
        pulseNum.setText("119 ");
        RRNum.setText("23 ");
        PAONum.setText("97 ");
        tempNum.setText("98.7 ");
        summaryText.setText("\nSummary: Cindy, female, 47 y/o, 2nd degree burns - arms, torso.");

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


        //end
        final Button patientOne = (Button) findViewById(R.id.patient_one_Button_Scen4) ;
        final Button patientTwo = (Button) findViewById(R.id.patient_two_Button_Scen4) ;
        final Button patientThree = (Button) findViewById(R.id.patient_three_Button_Scen4) ;

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
                PAONum.setText("97 ");
                tempNum.setText("98.7 ");
                summaryText.setText("\nSummary: Cindy, female, 47 y/o, 2nd degree burns - arms, torso.");

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
                pulseNum.setText("124 ");
                RRNum.setText("24 ");
                PAONum.setText("96 ");
                tempNum.setText("98.5 ");
                summaryText.setText("\nSummary: Pete, male, 55 y/o, 2nd degree burns - arms, torso.");

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

                BPNum.setText("143/92 ");
                pulseNum.setText("143 ");
                RRNum.setText("23 ");
                PAONum.setText("92 ");
                tempNum.setText("98.5 ");
                summaryText.setText("\nSummary: Alice, female, 72 y/o, hip fracture from fall.");

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
        seriesBP.appendData(new DataPoint(10, 137), true, 6);
        seriesBP.appendData(new DataPoint(20, 134), true, 6);
        seriesBP.appendData(new DataPoint(30, 137), true, 6);
        seriesBP.appendData(new DataPoint(40, 142), true, 6);
        seriesBP.appendData(new DataPoint(50, 143), true, 6);
        seriesBP.appendData(new DataPoint(60, 141), true, 6);

        seriesPulse.appendData(new DataPoint(10, 113), true, 6);
        seriesPulse.appendData(new DataPoint(20, 118), true, 6);
        seriesPulse.appendData(new DataPoint(30, 120), true, 6);
        seriesPulse.appendData(new DataPoint(40, 111), true, 6);
        seriesPulse.appendData(new DataPoint(50, 113), true, 6);
        seriesPulse.appendData(new DataPoint(60, 119), true, 6);

        seriesRR.appendData(new DataPoint(10, 22), true, 6);
        seriesRR.appendData(new DataPoint(20, 22), true, 6);
        seriesRR.appendData(new DataPoint(30, 25), true, 6);
        seriesRR.appendData(new DataPoint(40, 22), true, 6);
        seriesRR.appendData(new DataPoint(50, 22), true, 6);
        seriesRR.appendData(new DataPoint(60, 23), true, 6);

        seriesPAO.appendData(new DataPoint(10, 96), true, 6);
        seriesPAO.appendData(new DataPoint(20, 96), true, 6);
        seriesPAO.appendData(new DataPoint(30, 97), true, 6);
        seriesPAO.appendData(new DataPoint(40, 97), true, 6);
        seriesPAO.appendData(new DataPoint(50, 95), true, 6);
        seriesPAO.appendData(new DataPoint(60, 97), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.4), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.7), true, 6);
    }

    private void patientTwoRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 143), true, 6);
        seriesBP.appendData(new DataPoint(20, 144), true, 6);
        seriesBP.appendData(new DataPoint(30, 140), true, 6);
        seriesBP.appendData(new DataPoint(40, 141), true, 6);
        seriesBP.appendData(new DataPoint(50, 145), true, 6);
        seriesBP.appendData(new DataPoint(60, 140), true, 6);

        seriesPulse.appendData(new DataPoint(10, 121), true, 6);
        seriesPulse.appendData(new DataPoint(20, 122), true, 6);
        seriesPulse.appendData(new DataPoint(30, 123), true, 6);
        seriesPulse.appendData(new DataPoint(40, 126), true, 6);
        seriesPulse.appendData(new DataPoint(50, 121), true, 6);
        seriesPulse.appendData(new DataPoint(60, 124), true, 6);

        seriesRR.appendData(new DataPoint(10, 21), true, 6);
        seriesRR.appendData(new DataPoint(20, 19), true, 6);
        seriesRR.appendData(new DataPoint(30, 22), true, 6);
        seriesRR.appendData(new DataPoint(40, 23), true, 6);
        seriesRR.appendData(new DataPoint(50, 26), true, 6);
        seriesRR.appendData(new DataPoint(60, 24), true, 6);

        seriesPAO.appendData(new DataPoint(10, 97), true, 6);
        seriesPAO.appendData(new DataPoint(20, 97), true, 6);
        seriesPAO.appendData(new DataPoint(30, 96), true, 6);
        seriesPAO.appendData(new DataPoint(40, 97), true, 6);
        seriesPAO.appendData(new DataPoint(50, 96), true, 6);
        seriesPAO.appendData(new DataPoint(60, 96), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.5), true, 6);
    }

    private void patientThreeRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 145), true, 6);
        seriesBP.appendData(new DataPoint(20, 144), true, 6);
        seriesBP.appendData(new DataPoint(30, 143), true, 6);
        seriesBP.appendData(new DataPoint(40, 146), true, 6);
        seriesBP.appendData(new DataPoint(50, 145), true, 6);
        seriesBP.appendData(new DataPoint(60, 143), true, 6);

        seriesPulse.appendData(new DataPoint(10, 120), true, 6);
        seriesPulse.appendData(new DataPoint(20, 122), true, 6);
        seriesPulse.appendData(new DataPoint(30, 121), true, 6);
        seriesPulse.appendData(new DataPoint(40, 122), true, 6);
        seriesPulse.appendData(new DataPoint(50, 120), true, 6);
        seriesPulse.appendData(new DataPoint(60, 124), true, 6);

        seriesRR.appendData(new DataPoint(10, 24), true, 6);
        seriesRR.appendData(new DataPoint(20, 23), true, 6);
        seriesRR.appendData(new DataPoint(30, 22), true, 6);
        seriesRR.appendData(new DataPoint(40, 23), true, 6);
        seriesRR.appendData(new DataPoint(50, 24), true, 6);
        seriesRR.appendData(new DataPoint(60, 23), true, 6);

        seriesPAO.appendData(new DataPoint(10, 93), true, 6);
        seriesPAO.appendData(new DataPoint(20, 92), true, 6);
        seriesPAO.appendData(new DataPoint(30, 94), true, 6);
        seriesPAO.appendData(new DataPoint(40, 93), true, 6);
        seriesPAO.appendData(new DataPoint(50, 91), true, 6);
        seriesPAO.appendData(new DataPoint(60, 92), true, 6);

        seriesTemp.appendData(new DataPoint(10, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(20, 98.7), true, 6);
        seriesTemp.appendData(new DataPoint(30, 98.5), true, 6);
        seriesTemp.appendData(new DataPoint(40, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(50, 98.6), true, 6);
        seriesTemp.appendData(new DataPoint(60, 98.5), true, 6);
    }
}
