package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Advance_Display_ScenFour extends AppCompatActivity {
    GraphView graphBBAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    GraphView graphPAOAdvance ;
    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView POANumAdvance ;
    TextView tempNumAdvance ;
    TextView textInfo ;
    TextView BPSumP1,BPSumP2,BPSumP3 ;
    TextView pulseSumP1, pulseSumP2, pulseSumP3 ;
    TextView RRSumP1, RRSumP2, RRSumP3 ;
    TextView POASumP1, POASumP2, POASumP3;
    TextView tempSumP1, tempSumP2, tempSumP3 ;
    TextView textPatientNo ;
    TextView textPatientInfo ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    LineGraphSeries<DataPoint> seriesPAO ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_display_scen_four);
        BPNumAdvance = (TextView)  findViewById(R.id.BPNumAdvance_Scen4) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen4) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen4) ;
        POANumAdvance = (TextView)  findViewById(R.id.PAONumAdvance_Scen4);
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen4) ;

        textInfo = (TextView) findViewById(R.id.textInfo_Scen4) ;

        BPSumP1 = (TextView) findViewById(R.id.BPsumP1_Scen4)  ;
        pulseSumP1 = (TextView) findViewById(R.id.pulseSumP1_Scen4) ;
        RRSumP1 = (TextView) findViewById(R.id.RRSumP1_Scen4) ;
        POASumP1 = (TextView) findViewById(R.id.POASumP1_Scen4) ;
        tempSumP1 = (TextView) findViewById(R.id.tempSumP1_Scen4) ;

        BPSumP2 = (TextView) findViewById(R.id.BPsumP2_Scen4)  ;
        pulseSumP2 = (TextView) findViewById(R.id.pulseSumP2_Scen4) ;
        RRSumP2 = (TextView) findViewById(R.id.RRSumP2_Scen4) ;
        POASumP2 = (TextView) findViewById(R.id.POASumP2_Scen4) ;
        tempSumP2 = (TextView) findViewById(R.id.tempSumP2_Scen4) ;

        BPSumP3 = (TextView) findViewById(R.id.BPsumP3_Scen4)  ;
        pulseSumP3 = (TextView) findViewById(R.id.pulseSumP3_Scen4) ;
        RRSumP3 = (TextView) findViewById(R.id.RRSumP3_Scen4) ;
        POASumP3 = (TextView) findViewById(R.id.POASumP3_Scen4) ;
        tempSumP3 = (TextView) findViewById(R.id.tempSumP3_Scen4) ;

        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo_Scen4) ;
        textPatientNo = (TextView) findViewById(R.id.textPatientNo_Scen4) ;

        graphBBAdvance = (GraphView)findViewById(R.id.graphBBAdvance_Scen4) ;
        graphBBAdvance.getGridLabelRenderer().setTextSize(14f);
        graphBBAdvance.getGridLabelRenderer().setNumHorizontalLabels(10);
        graphBBAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBBAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBBAdvance.getViewport().setScrollable(true);
        graphBBAdvance.getViewport().setXAxisBoundsManual(true);
        graphBBAdvance.getViewport().setScrollableY(false);
        graphBBAdvance.getViewport().setMinX(1);
        graphBBAdvance.getViewport().setMaxX(10);
        graphBBAdvance.getViewport().setYAxisBoundsManual(true);
        graphBBAdvance.getViewport().setMinY(50);
        graphBBAdvance.getViewport().setMaxY(160);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen4) ;
        graphPulseAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPulseAdvance.getGridLabelRenderer().setNumHorizontalLabels(10);
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulseAdvance.getViewport().setScrollable(true);
        graphPulseAdvance.getViewport().setXAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setMinX(1);
        graphPulseAdvance.getViewport().setMaxX(10);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(55);
        graphPulseAdvance.getViewport().setMaxY(130);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen4) ;
        graphRRAdvance.getGridLabelRenderer().setTextSize(14f);
        graphRRAdvance.getGridLabelRenderer().setNumHorizontalLabels(10);
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRRAdvance.getViewport().setScrollable(true);
        graphRRAdvance.getViewport().setXAxisBoundsManual(true);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setMinX(1);
        graphRRAdvance.getViewport().setMaxX(10);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(8);
        graphRRAdvance.getViewport().setMaxY(30);

        graphPAOAdvance = (GraphView)findViewById(R.id.graphPAOAdvance_Scen4) ;
        graphPAOAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPAOAdvance.getGridLabelRenderer().setNumHorizontalLabels(10);
        graphPAOAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAOAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAOAdvance.getViewport().setScrollable(true);
        graphPAOAdvance.getViewport().setXAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setScrollableY(false);
        graphPAOAdvance.getViewport().setMinX(1);
        graphPAOAdvance.getViewport().setMaxX(10);
        graphPAOAdvance.getViewport().setYAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setMinY(65);
        graphPAOAdvance.getViewport().setMaxY(100);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen4) ;
        graphTempAdvance.getGridLabelRenderer().setTextSize(14f);
        graphTempAdvance.getGridLabelRenderer().setNumHorizontalLabels(10);
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTempAdvance.getViewport().setScrollable(true);
        graphTempAdvance.getViewport().setXAxisBoundsManual(true);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setMinX(1);
        graphTempAdvance.getViewport().setMaxX(10);
        graphTempAdvance.getViewport().setYAxisBoundsManual(true);
        graphTempAdvance.getViewport().setMinY(95.6);
        graphTempAdvance.getViewport().setMaxY(99.6);

        BPSumP1.setText("BP 125/82");
        BPSumP1.setTextColor(Color.parseColor("#ffff4c"));
        pulseSumP1.setText("Pulse 87");
        pulseSumP1.setTextColor(Color.parseColor("#1bca00"));
        RRSumP1.setText("RR 16");
        RRSumP1.setTextColor(Color.parseColor("#1bca00"));
        POASumP1.setText("PaO2 94");
        POASumP1.setTextColor(Color.parseColor("#ffff4c"));
        tempSumP1.setText("Temp 98.5");
        tempSumP1.setTextColor(Color.parseColor("#1bca00"));

        BPSumP2.setText("BP 133/85");
        BPSumP2.setTextColor(Color.parseColor("#ffff4c"));
        pulseSumP2.setText("Pulse 117");
        pulseSumP2.setTextColor(Color.parseColor("#ffff4c"));
        RRSumP2.setText("RR 14");
        RRSumP2.setTextColor(Color.parseColor("#1bca00"));
        POASumP2.setText("PaO2 96");
        POASumP2.setTextColor(Color.parseColor("#1bca00"));
        tempSumP2.setText("Temp 98.6");
        tempSumP2.setTextColor(Color.parseColor("#1bca00"));

        BPSumP3.setText("BP 110/70");
        BPSumP3.setTextColor(Color.parseColor("#ffff4c"));
        pulseSumP3.setText("Pulse 81");
        pulseSumP3.setTextColor(Color.parseColor("#1bca00"));
        RRSumP3.setText("RR 10");
        RRSumP3.setTextColor(Color.parseColor("#ffff4c"));
        POASumP3.setText("PaO2 97");
        POASumP3.setTextColor(Color.parseColor("#1bca00"));
        tempSumP3.setText("Temp 97.5");
        tempSumP3.setTextColor(Color.parseColor("#ffff4c"));

        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance_Scen4);

        createActionPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Action_Plan.class);
                startActivity(intent);
            }
        });

        //start of setting patient 1 data by default
        graphBBAdvance.removeAllSeries();
        graphPulseAdvance.removeAllSeries();
        graphRRAdvance.removeAllSeries();
        graphPAOAdvance.removeAllSeries();
        graphTempAdvance.removeAllSeries();

        textPatientNo.setText("Patient 1:");
        textPatientInfo.setText("72 y/o female, hip fracture");
        BPNumAdvance.setText("125/82 ");
        BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
        pulseNumAdvance.setText("87 ");
        pulseNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        RRNumAdvance.setText("16 ");
        RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        POANumAdvance.setText("94 ");
        POANumAdvance.setTextColor(Color.parseColor("#ffff4c"));
        tempNumAdvance.setText("98.5 ");
        tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        textInfo.setText("Assess Hip - min 2\nBackboard & C Spine protection - min 4\nO2 - min 5\nPain control - min 8");

        seriesBP = new LineGraphSeries<DataPoint>();
        seriesPulse = new LineGraphSeries<DataPoint>();
        seriesRR = new LineGraphSeries<DataPoint>();
        seriesPAO = new LineGraphSeries<DataPoint>();
        seriesTemp = new LineGraphSeries<DataPoint>();


        patienOneRandomGraphs();

        graphPulseAdvance.addSeries(seriesPulse);
        graphBBAdvance.addSeries(seriesBP);
        graphRRAdvance.addSeries(seriesRR);
        graphPAOAdvance.addSeries(seriesPAO);
        graphTempAdvance.addSeries(seriesTemp);


        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen4) ;
        final Button patientTwo = (Button) findViewById(R.id.patient_Two_Button_Adv_Scen4) ;
        final Button patientThree = (Button) findViewById(R.id.patient_Three_Button_Adv_Scen4) ;

        patientOne.setSelected(true);
        patientTwo.setSelected(false);
        patientThree.setSelected(false);

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 1:");
                textPatientInfo.setText("72 y/o female, hip fracture");
                BPNumAdvance.setText("125/82 ");
                BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                pulseNumAdvance.setText("87 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                RRNumAdvance.setText("16 ");
                RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                POANumAdvance.setText("94 ");
                POANumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                tempNumAdvance.setText("98.5 ");
                tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                textInfo.setText("Assess Hip - min 2\nBackboard & C Spine protection - min 4\nO2 - min 5\nPain control - min 8");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(true);
                patientTwo.setSelected(false);
                patientThree.setSelected(false);

                patienOneRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBBAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });

        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 2:");
                textPatientInfo.setText("70 y/o male, SOB - smoke inhalation.");
                BPNumAdvance.setText("133/85 ");
                BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                pulseNumAdvance.setText("117 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                RRNumAdvance.setText("14 ");
                RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                POANumAdvance.setText("96 ");
                POANumAdvance.setTextColor(Color.parseColor("#1bca00"));
                tempNumAdvance.setText("98.6 ");
                tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                textInfo.setText("Tripod position/get patient in position they feel okay breathing - min 1\nO2 - min 4");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(false);
                patientTwo.setSelected(true);
                patientThree.setSelected(false);

                patienTwoRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBBAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });

        patientThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 3:");
                textPatientInfo.setText("77 y/o male, SOB - smoke inhalation - LOC 1 min ");
                BPNumAdvance.setText("110/70 ");
                BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                pulseNumAdvance.setText("81 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                RRNumAdvance.setText("10 ");
                RRNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                POANumAdvance.setText("97 ");
                POANumAdvance.setTextColor(Color.parseColor("#1bca00"));
                tempNumAdvance.setText("97.5 ");
                tempNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                textInfo.setText("Tripod position/get patient in position they feel okay breathing - min 1\nRapid Sequence Intubation - min 8\nSupplemental heat - min 13");
                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                patientOne.setSelected(false);
                patientTwo.setSelected(false);
                patientThree.setSelected(true);

                patienThreeRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBBAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });

    }

    private void patienOneRandomGraphs() {

        //Just resets the graphs so view is from 1 to 10 on x axis
        graphBBAdvance.getViewport().setMinX(1);
        graphBBAdvance.getViewport().setMaxX(10);
        graphPulseAdvance.getViewport().setMinX(1);
        graphPulseAdvance.getViewport().setMaxX(10);
        graphRRAdvance.getViewport().setMinX(1);
        graphRRAdvance.getViewport().setMaxX(10);
        graphPAOAdvance.getViewport().setMinX(1);
        graphPAOAdvance.getViewport().setMaxX(10);
        graphTempAdvance.getViewport().setMinX(1);
        graphTempAdvance.getViewport().setMaxX(10);

        seriesBP.appendData(new DataPoint(1, 143), true, 30);
        seriesBP.appendData(new DataPoint(2, 147), true, 30);
        seriesBP.appendData(new DataPoint(3, 152), true, 30);
        seriesBP.appendData(new DataPoint(4, 148), true, 30);
        seriesBP.appendData(new DataPoint(5, 144), true, 30);
        seriesBP.appendData(new DataPoint(6, 140), true, 30);
        seriesBP.appendData(new DataPoint(7, 136), true, 30);
        seriesBP.appendData(new DataPoint(8, 122), true, 30);
        seriesBP.appendData(new DataPoint(9, 121), true, 30);
        seriesBP.appendData(new DataPoint(10, 124), true, 30);
        seriesBP.appendData(new DataPoint(11, 122), true, 30);
        seriesBP.appendData(new DataPoint(12, 125), true, 30);
        seriesBP.appendData(new DataPoint(13, 123), true, 30);
        seriesBP.appendData(new DataPoint(14, 124), true, 30);
        seriesBP.appendData(new DataPoint(15, 125), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 125), true, 30);

        seriesPulse.appendData(new DataPoint(1, 124), true, 30);
        seriesPulse.appendData(new DataPoint(2, 122), true, 30);
        seriesPulse.appendData(new DataPoint(3, 121), true, 30);
        seriesPulse.appendData(new DataPoint(4, 121), true, 30);
        seriesPulse.appendData(new DataPoint(5, 119), true, 30);
        seriesPulse.appendData(new DataPoint(6, 114), true, 30);
        seriesPulse.appendData(new DataPoint(7, 107), true, 30);
        seriesPulse.appendData(new DataPoint(8, 103), true, 30);
        seriesPulse.appendData(new DataPoint(9, 99), true, 30);
        seriesPulse.appendData(new DataPoint(10, 98), true, 30);
        seriesPulse.appendData(new DataPoint(11, 96), true, 30);
        seriesPulse.appendData(new DataPoint(12, 90), true, 30);
        seriesPulse.appendData(new DataPoint(13, 89), true, 30);
        seriesPulse.appendData(new DataPoint(14, 86), true, 30);
        seriesPulse.appendData(new DataPoint(15, 87), true, 30);
        seriesPulse.appendData(new DataPoint(15.1, 87), true, 30);

        seriesRR.appendData(new DataPoint(1, 23), true, 30);
        seriesRR.appendData(new DataPoint(2, 22), true, 30);
        seriesRR.appendData(new DataPoint(3, 25), true, 30);
        seriesRR.appendData(new DataPoint(4, 24), true, 30);
        seriesRR.appendData(new DataPoint(5, 23), true, 30);
        seriesRR.appendData(new DataPoint(6, 22), true, 30);
        seriesRR.appendData(new DataPoint(7, 21), true, 30);
        seriesRR.appendData(new DataPoint(8, 19), true, 30);
        seriesRR.appendData(new DataPoint(9, 16), true, 30);
        seriesRR.appendData(new DataPoint(10, 17), true, 30);
        seriesRR.appendData(new DataPoint(11, 15), true, 30);
        seriesRR.appendData(new DataPoint(12, 14), true, 30);
        seriesRR.appendData(new DataPoint(13, 15), true, 30);
        seriesRR.appendData(new DataPoint(14, 13), true, 30);
        seriesRR.appendData(new DataPoint(15, 16), true, 30);
        seriesRR.appendData(new DataPoint(15.1, 16), true, 30);

        seriesPAO.appendData(new DataPoint(1, 92), true, 30);
        seriesPAO.appendData(new DataPoint(2, 93), true, 30);
        seriesPAO.appendData(new DataPoint(3, 94), true, 30);
        seriesPAO.appendData(new DataPoint(4, 96), true, 30);
        seriesPAO.appendData(new DataPoint(5, 95), true, 30);
        seriesPAO.appendData(new DataPoint(6, 96), true, 30);
        seriesPAO.appendData(new DataPoint(7, 98), true, 30);
        seriesPAO.appendData(new DataPoint(8, 97), true, 30);
        seriesPAO.appendData(new DataPoint(9, 94), true, 30);
        seriesPAO.appendData(new DataPoint(10, 96), true, 30);
        seriesPAO.appendData(new DataPoint(11, 94), true, 30);
        seriesPAO.appendData(new DataPoint(12, 95), true, 30);
        seriesPAO.appendData(new DataPoint(13, 97), true, 30);
        seriesPAO.appendData(new DataPoint(14, 95), true, 30);
        seriesPAO.appendData(new DataPoint(15, 94), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 94), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(7, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(8, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(9, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(10, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(11, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(12, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(13, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(14, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 98.5), true, 30);


    }

    private void patienTwoRandomGraphs() {

        //Just resets the graphs so view is from 1 to 10 on x axis
        graphBBAdvance.getViewport().setMinX(1);
        graphBBAdvance.getViewport().setMaxX(10);
        graphPulseAdvance.getViewport().setMinX(1);
        graphPulseAdvance.getViewport().setMaxX(10);
        graphRRAdvance.getViewport().setMinX(1);
        graphRRAdvance.getViewport().setMaxX(10);
        graphPAOAdvance.getViewport().setMinX(1);
        graphPAOAdvance.getViewport().setMaxX(10);
        graphTempAdvance.getViewport().setMinX(1);
        graphTempAdvance.getViewport().setMaxX(10);

        seriesBP.appendData(new DataPoint(1, 120), true, 30);
        seriesBP.appendData(new DataPoint(2, 136), true, 30);
        seriesBP.appendData(new DataPoint(3, 137), true, 30);
        seriesBP.appendData(new DataPoint(4, 140), true, 30);
        seriesBP.appendData(new DataPoint(5, 139), true, 30);
        seriesBP.appendData(new DataPoint(6, 134), true, 30);
        seriesBP.appendData(new DataPoint(7, 135), true, 30);
        seriesBP.appendData(new DataPoint(8, 132), true, 30);
        seriesBP.appendData(new DataPoint(9, 130), true, 30);
        seriesBP.appendData(new DataPoint(10, 136), true, 30);
        seriesBP.appendData(new DataPoint(11, 137), true, 30);
        seriesBP.appendData(new DataPoint(12, 134), true, 30);
        seriesBP.appendData(new DataPoint(13, 132), true, 30);
        seriesBP.appendData(new DataPoint(14, 138), true, 30);
        seriesBP.appendData(new DataPoint(15, 133), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 133), true, 30);

        seriesPulse.appendData(new DataPoint(1, 123), true, 30);
        seriesPulse.appendData(new DataPoint(2, 121), true, 30);
        seriesPulse.appendData(new DataPoint(3, 119), true, 30);
        seriesPulse.appendData(new DataPoint(4, 115), true, 30);
        seriesPulse.appendData(new DataPoint(5, 125), true, 30);
        seriesPulse.appendData(new DataPoint(6, 122), true, 30);
        seriesPulse.appendData(new DataPoint(7, 117), true, 30);
        seriesPulse.appendData(new DataPoint(8, 119), true, 30);
        seriesPulse.appendData(new DataPoint(9, 126), true, 30);
        seriesPulse.appendData(new DataPoint(10, 122), true, 30);
        seriesPulse.appendData(new DataPoint(11, 121), true, 30);
        seriesPulse.appendData(new DataPoint(12, 120), true, 30);
        seriesPulse.appendData(new DataPoint(13, 114), true, 30);
        seriesPulse.appendData(new DataPoint(14, 118), true, 30);
        seriesPulse.appendData(new DataPoint(15, 117), true, 30);
        seriesPulse.appendData(new DataPoint(15.1, 117), true, 30);

        seriesRR.appendData(new DataPoint(1, 24), true, 30);
        seriesRR.appendData(new DataPoint(2, 23), true, 30);
        seriesRR.appendData(new DataPoint(3, 25), true, 30);
        seriesRR.appendData(new DataPoint(4, 21), true, 30);
        seriesRR.appendData(new DataPoint(5, 22), true, 30);
        seriesRR.appendData(new DataPoint(6, 20), true, 30);
        seriesRR.appendData(new DataPoint(7, 18), true, 30);
        seriesRR.appendData(new DataPoint(8, 16), true, 30);
        seriesRR.appendData(new DataPoint(9, 17), true, 30);
        seriesRR.appendData(new DataPoint(10, 23), true, 30);
        seriesRR.appendData(new DataPoint(11, 24), true, 30);
        seriesRR.appendData(new DataPoint(12, 22), true, 30);
        seriesRR.appendData(new DataPoint(13, 23), true, 30);
        seriesRR.appendData(new DataPoint(14, 18), true, 30);
        seriesRR.appendData(new DataPoint(15, 14), true, 30);
        seriesRR.appendData(new DataPoint(15.1, 14), true, 30);

        seriesPAO.appendData(new DataPoint(1, 92), true, 30);
        seriesPAO.appendData(new DataPoint(2, 90), true, 30);
        seriesPAO.appendData(new DataPoint(3, 89), true, 30);
        seriesPAO.appendData(new DataPoint(4, 93), true, 30);
        seriesPAO.appendData(new DataPoint(5, 91), true, 30);
        seriesPAO.appendData(new DataPoint(6, 91), true, 30);
        seriesPAO.appendData(new DataPoint(7, 96), true, 30);
        seriesPAO.appendData(new DataPoint(8, 97), true, 30);
        seriesPAO.appendData(new DataPoint(9, 96), true, 30);
        seriesPAO.appendData(new DataPoint(10, 94), true, 30);
        seriesPAO.appendData(new DataPoint(11, 95), true, 30);
        seriesPAO.appendData(new DataPoint(12, 97), true, 30);
        seriesPAO.appendData(new DataPoint(13, 97), true, 30);
        seriesPAO.appendData(new DataPoint(14, 96), true, 30);
        seriesPAO.appendData(new DataPoint(15, 96), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 96), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(7, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(8, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(9, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(10, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(11, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(13, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(14, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 98.6), true, 30);
    }

    private void patienThreeRandomGraphs() {

        //Just resets the graphs so view is from 1 to 10 on x axis
        graphBBAdvance.getViewport().setMinX(1);
        graphBBAdvance.getViewport().setMaxX(10);
        graphPulseAdvance.getViewport().setMinX(1);
        graphPulseAdvance.getViewport().setMaxX(10);
        graphRRAdvance.getViewport().setMinX(1);
        graphRRAdvance.getViewport().setMaxX(10);
        graphPAOAdvance.getViewport().setMinX(1);
        graphPAOAdvance.getViewport().setMaxX(10);
        graphTempAdvance.getViewport().setMinX(1);
        graphTempAdvance.getViewport().setMaxX(10);

        seriesBP.appendData(new DataPoint(1, 120), true, 30);
        seriesBP.appendData(new DataPoint(2, 123), true, 30);
        seriesBP.appendData(new DataPoint(3, 125), true, 30);
        seriesBP.appendData(new DataPoint(4, 120), true, 30);
        seriesBP.appendData(new DataPoint(5, 119), true, 30);
        seriesBP.appendData(new DataPoint(6, 118), true, 30);
        seriesBP.appendData(new DataPoint(7, 124), true, 30);
        seriesBP.appendData(new DataPoint(8, 113), true, 30);
        seriesBP.appendData(new DataPoint(9, 99), true, 30);
        seriesBP.appendData(new DataPoint(10, 90), true, 30);
        seriesBP.appendData(new DataPoint(11, 93), true, 30);
        seriesBP.appendData(new DataPoint(12, 89), true, 30);
        seriesBP.appendData(new DataPoint(13, 98), true, 30);
        seriesBP.appendData(new DataPoint(14, 103), true, 30);
        seriesBP.appendData(new DataPoint(15, 110), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 110), true, 30);

        seriesPulse.appendData(new DataPoint(1, 100), true, 30);
        seriesPulse.appendData(new DataPoint(2, 96), true, 30);
        seriesPulse.appendData(new DataPoint(3, 98), true, 30);
        seriesPulse.appendData(new DataPoint(4, 117), true, 30);
        seriesPulse.appendData(new DataPoint(5, 125), true, 30);
        seriesPulse.appendData(new DataPoint(6, 123), true, 30);
        seriesPulse.appendData(new DataPoint(7, 122), true, 30);
        seriesPulse.appendData(new DataPoint(8, 111), true, 30);
        seriesPulse.appendData(new DataPoint(9, 96), true, 30);
        seriesPulse.appendData(new DataPoint(10, 84), true, 30);
        seriesPulse.appendData(new DataPoint(11, 60), true, 30);
        seriesPulse.appendData(new DataPoint(12, 67), true, 30);
        seriesPulse.appendData(new DataPoint(13, 70), true, 30);
        seriesPulse.appendData(new DataPoint(14, 84), true, 30);
        seriesPulse.appendData(new DataPoint(15, 81), true, 30);
        seriesPulse.appendData(new DataPoint(15.1, 81), true, 30);

        seriesRR.appendData(new DataPoint(1, 22), true, 30);
        seriesRR.appendData(new DataPoint(2, 23), true, 30);
        seriesRR.appendData(new DataPoint(3, 25), true, 30);
        seriesRR.appendData(new DataPoint(4, 27), true, 30);
        seriesRR.appendData(new DataPoint(5, 28), true, 30);
        seriesRR.appendData(new DataPoint(6, 28), true, 30);
        seriesRR.appendData(new DataPoint(7, 27), true, 30);
        seriesRR.appendData(new DataPoint(8, 26), true, 30);
        seriesRR.appendData(new DataPoint(9, 27), true, 30);
        seriesRR.appendData(new DataPoint(10, 24), true, 30);
        seriesRR.appendData(new DataPoint(11, 22), true, 30);
        seriesRR.appendData(new DataPoint(12, 13), true, 30);
        seriesRR.appendData(new DataPoint(13, 14), true, 30);
        seriesRR.appendData(new DataPoint(14, 11), true, 30);
        seriesRR.appendData(new DataPoint(15, 10), true, 30);
        seriesRR.appendData(new DataPoint(15.1, 10), true, 30);

        seriesPAO.appendData(new DataPoint(1, 93), true, 30);
        seriesPAO.appendData(new DataPoint(2, 91), true, 30);
        seriesPAO.appendData(new DataPoint(3, 92), true, 30);
        seriesPAO.appendData(new DataPoint(4, 93), true, 30);
        seriesPAO.appendData(new DataPoint(5, 92), true, 30);
        seriesPAO.appendData(new DataPoint(6, 84), true, 30);
        seriesPAO.appendData(new DataPoint(7, 80), true, 30);
        seriesPAO.appendData(new DataPoint(8, 77), true, 30);
        seriesPAO.appendData(new DataPoint(9, 71), true, 30);
        seriesPAO.appendData(new DataPoint(10, 86), true, 30);
        seriesPAO.appendData(new DataPoint(11, 93), true, 30);
        seriesPAO.appendData(new DataPoint(12, 96), true, 30);
        seriesPAO.appendData(new DataPoint(13, 97), true, 30);
        seriesPAO.appendData(new DataPoint(14, 97), true, 30);
        seriesPAO.appendData(new DataPoint(15, 97), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 97), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.2), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.1), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.0), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.0), true, 30);
        seriesTemp.appendData(new DataPoint(7, 97.7), true, 30);
        seriesTemp.appendData(new DataPoint(8, 97.3), true, 30);
        seriesTemp.appendData(new DataPoint(9, 97.1), true, 30);
        seriesTemp.appendData(new DataPoint(10, 97.1), true, 30);
        seriesTemp.appendData(new DataPoint(11, 96.6), true, 30);
        seriesTemp.appendData(new DataPoint(12, 96.0), true, 30);
        seriesTemp.appendData(new DataPoint(13, 96.2), true, 30);
        seriesTemp.appendData(new DataPoint(14, 96.8), true, 30);
        seriesTemp.appendData(new DataPoint(15, 97.5), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 97.5), true, 30);
    }

}

