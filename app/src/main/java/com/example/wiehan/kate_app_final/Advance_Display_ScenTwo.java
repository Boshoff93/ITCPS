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

public class Advance_Display_ScenTwo extends AppCompatActivity {

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
    TextView BPSumP1 ;
    TextView pulseSumP1 ;
    TextView RRSumP1 ;
    TextView POASumP1;
    TextView tempSumP1 ;
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
        setContentView(R.layout.activity_advance_display_scen_two);

        BPNumAdvance = (TextView)  findViewById(R.id.BPNumAdvance_Scen2) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen2) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen2) ;
        POANumAdvance = (TextView)  findViewById(R.id.PAONumAdvance_Scen2);
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen2) ;

        textInfo = (TextView) findViewById(R.id.textInfo_Scen2) ;

        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo_Scen2) ;
        textPatientNo = (TextView) findViewById(R.id.textPatientNo_Scen2) ;

        graphBBAdvance = (GraphView)findViewById(R.id.graphBBAdvance_Scen2) ;
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
        graphBBAdvance.getViewport().setMinY(130);
        graphBBAdvance.getViewport().setMaxY(150);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen2) ;
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
        graphPulseAdvance.getViewport().setMinY(120);
        graphPulseAdvance.getViewport().setMaxY(150);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen2) ;
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

        graphPAOAdvance = (GraphView)findViewById(R.id.graphPAOAdvance_Scen2) ;
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
        graphPAOAdvance.getViewport().setMinY(88);
        graphPAOAdvance.getViewport().setMaxY(100);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen2) ;
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

        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance_Scen2);

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
        textPatientInfo.setText("75 y/o male, found unconscious, fractured foot, neck pains, lacs & bruises on forehead");
        BPNumAdvance.setText("136/85 ");
        pulseNumAdvance.setText("122 ");
        RRNumAdvance.setText("14 ");
        POANumAdvance.setText("98 ");
        tempNumAdvance.setText("98.6 ");
        textInfo.setText("Backboard & C Spine protection - min 1\nBasic Neuro Assessment - min 2\nDress wounds- min 4\nO2 - min 5\nGlascow Coma Score - min 6\nSplint & ice foot - min 8");

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


        //end

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen2) ;


        patientOne.setSelected(true);

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 1:");
                textPatientInfo.setText("75 y/o male, found unconscious, fractured foot, neck pains, lacs & bruises on forehead");
                BPNumAdvance.setText("136/85 ");
                pulseNumAdvance.setText("122 ");
                RRNumAdvance.setText("14 ");
                POANumAdvance.setText("98 ");
                tempNumAdvance.setText("98.6 ");
                textInfo.setText("Backboard & C Spine protection - min 1\nBasic Neuro Assessment - min 2\nDress wounds- min 4\nO2 - min 5\nGlascow Coma Score - min 6\nSplint & ice foot - min 8");

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
        seriesBP.appendData(new DataPoint(2, 145), true, 30);
        seriesBP.appendData(new DataPoint(3, 143), true, 30);
        seriesBP.appendData(new DataPoint(4, 139), true, 30);
        seriesBP.appendData(new DataPoint(5, 137), true, 30);
        seriesBP.appendData(new DataPoint(6, 132), true, 30);
        seriesBP.appendData(new DataPoint(7, 137), true, 30);
        seriesBP.appendData(new DataPoint(8, 136), true, 30);
        seriesBP.appendData(new DataPoint(9, 135), true, 30);
        seriesBP.appendData(new DataPoint(10, 135), true, 30);
        seriesBP.appendData(new DataPoint(11, 137), true, 30);
        seriesBP.appendData(new DataPoint(12, 138), true, 30);
        seriesBP.appendData(new DataPoint(13, 134), true, 30);
        seriesBP.appendData(new DataPoint(14, 136), true, 30);
        seriesBP.appendData(new DataPoint(15, 136), true, 30);
        seriesBP.appendData(new DataPoint(15.1, 136), true, 30);

        seriesPulse.appendData(new DataPoint(1, 137), true, 30);
        seriesPulse.appendData(new DataPoint(2, 135), true, 30);
        seriesPulse.appendData(new DataPoint(3, 138), true, 30);
        seriesPulse.appendData(new DataPoint(4, 140), true, 30);
        seriesPulse.appendData(new DataPoint(5, 139), true, 30);
        seriesPulse.appendData(new DataPoint(6, 140), true, 30);
        seriesPulse.appendData(new DataPoint(7, 139), true, 30);
        seriesPulse.appendData(new DataPoint(8, 139), true, 30);
        seriesPulse.appendData(new DataPoint(9, 137), true, 30);
        seriesPulse.appendData(new DataPoint(10, 139), true, 30);
        seriesPulse.appendData(new DataPoint(11, 136), true, 30);
        seriesPulse.appendData(new DataPoint(12, 131), true, 30);
        seriesPulse.appendData(new DataPoint(13, 128), true, 30);
        seriesPulse.appendData(new DataPoint(14, 124), true, 30);
        seriesPulse.appendData(new DataPoint(15, 122), true, 30);
        seriesPulse.appendData(new DataPoint(15.1, 122), true, 30);

        seriesRR.appendData(new DataPoint(1, 23), true, 30);
        seriesRR.appendData(new DataPoint(2, 24), true, 30);
        seriesRR.appendData(new DataPoint(3, 25), true, 30);
        seriesRR.appendData(new DataPoint(4, 24), true, 30);
        seriesRR.appendData(new DataPoint(5, 20), true, 30);
        seriesRR.appendData(new DataPoint(6, 18), true, 30);
        seriesRR.appendData(new DataPoint(7, 19), true, 30);
        seriesRR.appendData(new DataPoint(8, 17), true, 30);
        seriesRR.appendData(new DataPoint(9, 18), true, 30);
        seriesRR.appendData(new DataPoint(10, 16), true, 30);
        seriesRR.appendData(new DataPoint(11, 15), true, 30);
        seriesRR.appendData(new DataPoint(12, 16), true, 30);
        seriesRR.appendData(new DataPoint(13, 14), true, 30);
        seriesRR.appendData(new DataPoint(14, 15), true, 30);
        seriesRR.appendData(new DataPoint(15, 14), true, 30);
        seriesRR.appendData(new DataPoint(15.1, 14), true, 30);

        seriesPAO.appendData(new DataPoint(1, 96), true, 30);
        seriesPAO.appendData(new DataPoint(2, 93), true, 30);
        seriesPAO.appendData(new DataPoint(3, 92), true, 30);
        seriesPAO.appendData(new DataPoint(4, 89), true, 30);
        seriesPAO.appendData(new DataPoint(5, 90), true, 30);
        seriesPAO.appendData(new DataPoint(6, 91), true, 30);
        seriesPAO.appendData(new DataPoint(7, 92), true, 30);
        seriesPAO.appendData(new DataPoint(8, 94), true, 30);
        seriesPAO.appendData(new DataPoint(9, 96), true, 30);
        seriesPAO.appendData(new DataPoint(10, 97), true, 30);
        seriesPAO.appendData(new DataPoint(11, 97), true, 30);
        seriesPAO.appendData(new DataPoint(12, 97), true, 30);
        seriesPAO.appendData(new DataPoint(13, 96), true, 30);
        seriesPAO.appendData(new DataPoint(14, 97), true, 30);
        seriesPAO.appendData(new DataPoint(15, 98), true, 30);
        seriesPAO.appendData(new DataPoint(15.1, 98), true, 30);

        seriesTemp.appendData(new DataPoint(1, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(2, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(3, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(4, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(5, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(6, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(7, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(8, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(9, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(10, 98.4), true, 30);
        seriesTemp.appendData(new DataPoint(11, 98.5), true, 30);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(13, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(14, 98.7), true, 30);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 30);
        seriesTemp.appendData(new DataPoint(15.1, 98.6), true, 30);
    }

}

