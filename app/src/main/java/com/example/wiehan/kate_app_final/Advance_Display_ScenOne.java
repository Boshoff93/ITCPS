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

public class Advance_Display_ScenOne extends AppCompatActivity {

    GraphView graphBBAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    GraphView graphPAOAdvance ;

    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView tempNumAdvance ;
    TextView PAONumAdvance ;
    TextView textInfo ;

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
        setContentView(R.layout.activity_advance_display_scen_one);

        BPNumAdvance = (TextView)  findViewById(R.id.BPNumAdvance_Scen1) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen1) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen1) ;
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen1) ;
        PAONumAdvance = (TextView) findViewById(R.id.PAONumAdvance_Scen1) ;
        textInfo = (TextView) findViewById(R.id.textInfo_Scen1) ;

        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo_Scen1) ;
        textPatientNo = (TextView) findViewById(R.id.textPatientNo_Scen1) ;

        graphBBAdvance = (GraphView)findViewById(R.id.graphBBAdvance_Scen1) ;
        graphBBAdvance.getGridLabelRenderer().setTextSize(14f);
        graphBBAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphBBAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBBAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBBAdvance.getViewport().setXAxisBoundsManual(true);
        graphBBAdvance.getViewport().setScrollableY(false);
        graphBBAdvance.getViewport().setMinX(10);
        graphBBAdvance.getViewport().setMaxX(15);
        graphBBAdvance.getViewport().setYAxisBoundsManual(true);
        graphBBAdvance.getViewport().setMinY(110);
        graphBBAdvance.getViewport().setMaxY(160);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen1) ;
        graphPulseAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPulseAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulseAdvance.getViewport().setXAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setMinX(10);
        graphPulseAdvance.getViewport().setMaxX(15);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(100);
        graphPulseAdvance.getViewport().setMaxY(120);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen1) ;
        graphRRAdvance.getGridLabelRenderer().setTextSize(14f);
        graphRRAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRRAdvance.getViewport().setXAxisBoundsManual(true);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setMinX(10);
        graphRRAdvance.getViewport().setMaxX(15);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(16);
        graphRRAdvance.getViewport().setMaxY(22);

        graphPAOAdvance = (GraphView)findViewById(R.id.graphPAOAdvance_Scen1) ;
        graphPAOAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPAOAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPAOAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAOAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAOAdvance.getViewport().setXAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setScrollableY(false);
        graphPAOAdvance.getViewport().setMinX(10);
        graphPAOAdvance.getViewport().setMaxX(15);
        graphPAOAdvance.getViewport().setYAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setMinY(94);
        graphPAOAdvance.getViewport().setMaxY(100);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen1) ;
        graphTempAdvance.getGridLabelRenderer().setTextSize(14f);
        graphTempAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTempAdvance.getViewport().setXAxisBoundsManual(true);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setMinX(10);
        graphTempAdvance.getViewport().setMaxX(15);
        graphTempAdvance.getViewport().setYAxisBoundsManual(true);
        graphTempAdvance.getViewport().setMinY(96.6);
        graphTempAdvance.getViewport().setMaxY(99.6);



        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance_Scen1);

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
        graphTempAdvance.removeAllSeries();
        graphPAOAdvance.removeAllSeries();

        textPatientNo.setText("Patient 1:");
        textPatientInfo.setText("35 y/o Male, broken forearm, head ache, bruise temporal area, 2 min LOC");
        BPNumAdvance.setText("120/82 ");
        pulseNumAdvance.setText("102 ");
        RRNumAdvance.setText("17 ");
        PAONumAdvance.setText("98 ");
        tempNumAdvance.setText("98.6 ");
        textInfo.setText("Basic Neuro Assessment - min 3\nIce broken arm - min 4\nO2 - min 5\nAssess arm/Splint arm - min 6 \nGlascow Coma Score - min 8\n");

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

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen1) ;

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
                textPatientInfo.setText("35 y/o Male, broken forearm, head ache, bruise temporal area, 2 min LOC");
                BPNumAdvance.setText("120/82 ");
                pulseNumAdvance.setText("102 ");
                RRNumAdvance.setText("17 ");
                PAONumAdvance.setText("98 ");
                tempNumAdvance.setText("98.6 ");
                textInfo.setText("Basic Neuro Assessment - min 3\nIce broken arm - min 4\nO2 - min 5\nAssess arm/Splint arm - min 6 \nGlascow Coma Score - min 8\n");

                patientOne.setSelected(true);

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();


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


        seriesBP.appendData(new DataPoint(10, 119), true, 15);
        seriesBP.appendData(new DataPoint(11, 123), true, 15);
        seriesBP.appendData(new DataPoint(12, 120), true, 15);
        seriesBP.appendData(new DataPoint(13, 122), true, 15);
        seriesBP.appendData(new DataPoint(14, 125), true, 15);
        seriesBP.appendData(new DataPoint(15, 120), true, 15);

        seriesPulse.appendData(new DataPoint(10, 106), true, 15);
        seriesPulse.appendData(new DataPoint(11, 105), true, 15);
        seriesPulse.appendData(new DataPoint(12, 106), true, 15);
        seriesPulse.appendData(new DataPoint(13, 107), true, 15);
        seriesPulse.appendData(new DataPoint(14, 103), true, 15);
        seriesPulse.appendData(new DataPoint(15, 102), true, 15);

        seriesRR.appendData(new DataPoint(10, 19), true, 15);
        seriesRR.appendData(new DataPoint(11, 17), true, 15);
        seriesRR.appendData(new DataPoint(12, 17), true, 15);
        seriesRR.appendData(new DataPoint(13, 18), true, 15);
        seriesRR.appendData(new DataPoint(14, 19), true, 15);
        seriesRR.appendData(new DataPoint(15, 17), true, 15);

        seriesPAO.appendData(new DataPoint(10, 97), true, 15);
        seriesPAO.appendData(new DataPoint(11, 96), true, 15);
        seriesPAO.appendData(new DataPoint(12, 95), true, 15);
        seriesPAO.appendData(new DataPoint(13, 97), true, 15);
        seriesPAO.appendData(new DataPoint(14, 98), true, 15);
        seriesPAO.appendData(new DataPoint(15, 98), true, 15);

        seriesTemp.appendData(new DataPoint(10, 98.8), true, 15);
        seriesTemp.appendData(new DataPoint(11, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(13, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(14, 98.5), true, 15);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 15);


    }

}

