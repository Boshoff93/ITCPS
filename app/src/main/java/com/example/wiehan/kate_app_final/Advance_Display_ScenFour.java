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
        graphBBAdvance.getViewport().setMinY(110);
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
        graphPulseAdvance.getViewport().setMinY(80);
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
        graphRRAdvance.getViewport().setMinY(12);
        graphRRAdvance.getViewport().setMaxY(26);

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
        graphPAOAdvance.getViewport().setMinY(90);
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
        graphTempAdvance.getViewport().setMinY(97.6);
        graphTempAdvance.getViewport().setMaxY(99.6);

        BPSumP1.setText("BP 124/82");
        pulseSumP1.setText("Pulse 98");
        RRSumP1.setText("RR 14");
        POASumP1.setText("PaO2 97");
        tempSumP1.setText("Temp 98.6");

        BPSumP2.setText("BP 142/93");
        pulseSumP2.setText("Pulse 98");
        RRSumP2.setText("RR 16");
        POASumP2.setText("PaO2 96");
        tempSumP2.setText("Temp 98.8");

        BPSumP3.setText("BP 125/82");
        pulseSumP3.setText("Pulse 87");
        RRSumP3.setText("RR 16");
        POASumP3.setText("PaO2 94");
        tempSumP3.setText("Temp 98.5");

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
        textPatientInfo.setText("Cindy, female, 47 y/o, 2nd degree burns - arms, torso.");
        BPNumAdvance.setText("124/82 ");
        pulseNumAdvance.setText("98 ");
        RRNumAdvance.setText("14 ");
        POANumAdvance.setText("97 ");
        tempNumAdvance.setText("98.6 ");
        textInfo.setText("Dressing burns - min 2\nStart IV - min 4\nPain control - min 7\n");

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
                textPatientInfo.setText("Cindy, female, 47 y/o, 2nd degree burns - arms, torso.");
                BPNumAdvance.setText("124/82 ");
                pulseNumAdvance.setText("98 ");
                RRNumAdvance.setText("14 ");
                POANumAdvance.setText("97 ");
                tempNumAdvance.setText("98.6 ");
                textInfo.setText("Dressing burns - min 2\nStart IV - min 4\nPain control - min 7\n");

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
                textPatientInfo.setText("Pete, male, 55 y/o, 2nd degree burns - arms, torso.");
                BPNumAdvance.setText("142/93 ");
                pulseNumAdvance.setText("98 ");
                RRNumAdvance.setText("16 ");
                POANumAdvance.setText("96 ");
                tempNumAdvance.setText("98.8 ");
                textInfo.setText("Dressing burns - min 2\nStart IV - min 6\nSplint broken arm - min 8");

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
                textPatientInfo.setText("Alice, female, 72 y/o, hip fracture from fall.");
                BPNumAdvance.setText("125/82 ");
                pulseNumAdvance.setText("87 ");
                RRNumAdvance.setText("16 ");
                POANumAdvance.setText("94 ");
                tempNumAdvance.setText("98.5 ");
                textInfo.setText("Assess Hip – min 2\nBack protection - min 4\nStabilizen - min 4\nO2- 5\nPain control - min 8");

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

        seriesBP.appendData(new DataPoint(1, 141), true, 30);
        seriesBP.appendData(new DataPoint(2, 144), true, 30);
        seriesBP.appendData(new DataPoint(3, 140), true, 30);
        seriesBP.appendData(new DataPoint(4, 139), true, 30);
        seriesBP.appendData(new DataPoint(5, 135), true, 30);
        seriesBP.appendData(new DataPoint(6, 133), true, 30);
        seriesBP.appendData(new DataPoint(7, 135), true, 30);
        seriesBP.appendData(new DataPoint(8, 132), true, 30);
        seriesBP.appendData(new DataPoint(9, 125), true, 30);
        seriesBP.appendData(new DataPoint(10, 120), true, 30);
        seriesBP.appendData(new DataPoint(11, 121), true, 30);
        seriesBP.appendData(new DataPoint(12, 124), true, 30);
        seriesBP.appendData(new DataPoint(13, 122), true, 30);
        seriesBP.appendData(new DataPoint(14, 127), true, 30);
        seriesBP.appendData(new DataPoint(15, 124), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 124), true, 30);

        seriesPulse.appendData(new DataPoint(1, 119), true, 30);
        seriesPulse.appendData(new DataPoint(2, 117), true, 30);
        seriesPulse.appendData(new DataPoint(3, 116), true, 30);
        seriesPulse.appendData(new DataPoint(4, 117), true, 30);
        seriesPulse.appendData(new DataPoint(5, 119), true, 30);
        seriesPulse.appendData(new DataPoint(6, 114), true, 30);
        seriesPulse.appendData(new DataPoint(7, 110), true, 30);
        seriesPulse.appendData(new DataPoint(8, 106), true, 30);
        seriesPulse.appendData(new DataPoint(9, 104), true, 30);
        seriesPulse.appendData(new DataPoint(10, 100), true, 30);
        seriesPulse.appendData(new DataPoint(11, 98), true, 30);
        seriesPulse.appendData(new DataPoint(12, 96), true, 30);
        seriesPulse.appendData(new DataPoint(13, 99), true, 30);
        seriesPulse.appendData(new DataPoint(14, 94), true, 30);
        seriesPulse.appendData(new DataPoint(15, 98), false, 30);
        seriesPulse.appendData(new DataPoint(15.1, 98), false, 30);

        seriesRR.appendData(new DataPoint(1, 23), true, 30);
        seriesRR.appendData(new DataPoint(2, 24), true, 30);
        seriesRR.appendData(new DataPoint(3, 25), true, 30);
        seriesRR.appendData(new DataPoint(4, 24), true, 30);
        seriesRR.appendData(new DataPoint(5, 23), true, 30);
        seriesRR.appendData(new DataPoint(6, 21), true, 30);
        seriesRR.appendData(new DataPoint(7, 19), true, 30);
        seriesRR.appendData(new DataPoint(8, 18), true, 30);
        seriesRR.appendData(new DataPoint(9, 17), true, 30);
        seriesRR.appendData(new DataPoint(10, 17), true, 30);
        seriesRR.appendData(new DataPoint(11, 15), true, 30);
        seriesRR.appendData(new DataPoint(12, 16), true, 30);
        seriesRR.appendData(new DataPoint(13, 17), true, 30);
        seriesRR.appendData(new DataPoint(14, 18), true, 30);
        seriesRR.appendData(new DataPoint(15, 14), false, 30);
        seriesRR.appendData(new DataPoint(15.1, 14), false, 30);

        seriesPAO.appendData(new DataPoint(1, 97), true, 30);
        seriesPAO.appendData(new DataPoint(2, 95), true, 30);
        seriesPAO.appendData(new DataPoint(3, 96), true, 30);
        seriesPAO.appendData(new DataPoint(4, 98), true, 30);
        seriesPAO.appendData(new DataPoint(5, 98), true, 30);
        seriesPAO.appendData(new DataPoint(6, 96), true, 30);
        seriesPAO.appendData(new DataPoint(7, 97), true, 30);
        seriesPAO.appendData(new DataPoint(8, 97), true, 30);
        seriesPAO.appendData(new DataPoint(9, 95), true, 30);
        seriesPAO.appendData(new DataPoint(10, 96), true, 30);
        seriesPAO.appendData(new DataPoint(11, 97), true, 30);
        seriesPAO.appendData(new DataPoint(12, 97), true, 30);
        seriesPAO.appendData(new DataPoint(13, 96), true, 30);
        seriesPAO.appendData(new DataPoint(14, 96), true, 30);
        seriesPAO.appendData(new DataPoint(15, 97), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 97), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(7, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(8, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(9, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(10, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(11, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(13, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(14, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 98.6), true, 30);


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

        seriesBP.appendData(new DataPoint(1, 140), true, 30);
        seriesBP.appendData(new DataPoint(2, 140), true, 30);
        seriesBP.appendData(new DataPoint(3, 144), true, 30);
        seriesBP.appendData(new DataPoint(4, 139), true, 30);
        seriesBP.appendData(new DataPoint(5, 139), true, 30);
        seriesBP.appendData(new DataPoint(6, 139), true, 30);
        seriesBP.appendData(new DataPoint(7, 135), true, 30);
        seriesBP.appendData(new DataPoint(8, 132), true, 30);
        seriesBP.appendData(new DataPoint(9, 124), true, 30);
        seriesBP.appendData(new DataPoint(10, 120), true, 30);
        seriesBP.appendData(new DataPoint(11, 141), true, 30);
        seriesBP.appendData(new DataPoint(12, 142), true, 30);
        seriesBP.appendData(new DataPoint(13, 140), true, 30);
        seriesBP.appendData(new DataPoint(14, 140), true, 30);
        seriesBP.appendData(new DataPoint(15, 142), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 142), true, 30);

        seriesPulse.appendData(new DataPoint(1, 124), true, 30);
        seriesPulse.appendData(new DataPoint(2, 121), true, 30);
        seriesPulse.appendData(new DataPoint(3, 119), true, 30);
        seriesPulse.appendData(new DataPoint(4, 120), true, 30);
        seriesPulse.appendData(new DataPoint(5, 123), true, 30);
        seriesPulse.appendData(new DataPoint(6, 124), true, 30);
        seriesPulse.appendData(new DataPoint(7, 125), true, 30);
        seriesPulse.appendData(new DataPoint(8, 124), true, 30);
        seriesPulse.appendData(new DataPoint(9, 126), true, 30);
        seriesPulse.appendData(new DataPoint(10, 123), true, 30);
        seriesPulse.appendData(new DataPoint(11, 120), true, 30);
        seriesPulse.appendData(new DataPoint(12, 117), true, 30);
        seriesPulse.appendData(new DataPoint(13, 113), true, 30);
        seriesPulse.appendData(new DataPoint(14, 100), true, 30);
        seriesPulse.appendData(new DataPoint(15, 98), true, 30);
        seriesPulse.appendData(new DataPoint(15.1, 98), true, 30);

        seriesRR.appendData(new DataPoint(1, 24), true, 30);
        seriesRR.appendData(new DataPoint(2, 23), true, 30);
        seriesRR.appendData(new DataPoint(3, 20), true, 30);
        seriesRR.appendData(new DataPoint(4, 22), true, 30);
        seriesRR.appendData(new DataPoint(5, 23), true, 30);
        seriesRR.appendData(new DataPoint(6, 21), true, 30);
        seriesRR.appendData(new DataPoint(7, 19), true, 30);
        seriesRR.appendData(new DataPoint(8, 15), true, 30);
        seriesRR.appendData(new DataPoint(9, 15), true, 30);
        seriesRR.appendData(new DataPoint(10, 17), true, 30);
        seriesRR.appendData(new DataPoint(11, 18), true, 30);
        seriesRR.appendData(new DataPoint(12, 17), true, 30);
        seriesRR.appendData(new DataPoint(13, 19), true, 30);
        seriesRR.appendData(new DataPoint(14, 15), true, 30);
        seriesRR.appendData(new DataPoint(15, 16), true, 30);
        seriesRR.appendData(new DataPoint(15.1, 16), true, 30);

        seriesPAO.appendData(new DataPoint(1, 96), true, 30);
        seriesPAO.appendData(new DataPoint(2, 97), true, 30);
        seriesPAO.appendData(new DataPoint(3, 97), true, 30);
        seriesPAO.appendData(new DataPoint(4, 96), true, 30);
        seriesPAO.appendData(new DataPoint(5, 96), true, 30);
        seriesPAO.appendData(new DataPoint(6, 97), true, 30);
        seriesPAO.appendData(new DataPoint(7, 98), true, 30);
        seriesPAO.appendData(new DataPoint(8, 97), true, 30);
        seriesPAO.appendData(new DataPoint(9, 96), true, 30);
        seriesPAO.appendData(new DataPoint(10, 96), true, 30);
        seriesPAO.appendData(new DataPoint(11, 95), true, 30);
        seriesPAO.appendData(new DataPoint(12, 98), true, 30);
        seriesPAO.appendData(new DataPoint(13, 96), true, 30);
        seriesPAO.appendData(new DataPoint(14, 97), true, 30);
        seriesPAO.appendData(new DataPoint(15, 96), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 96), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(7, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(8, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(9, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(10, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(11, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(13, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(14, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15, 98.8), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 98.8), true, 30);
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

}

