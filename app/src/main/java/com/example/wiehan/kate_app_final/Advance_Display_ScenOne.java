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
        graphBBAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBBAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBBAdvance.getViewport().setXAxisBoundsManual(true);
        graphBBAdvance.getViewport().setScrollableY(false);
        graphBBAdvance.getViewport().setMinX(10);
        graphBBAdvance.getViewport().setMaxX(17);
        graphBBAdvance.getViewport().setYAxisBoundsManual(true);
        graphBBAdvance.getViewport().setMinY(110);
        graphBBAdvance.getViewport().setMaxY(160);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen1) ;
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulseAdvance.getViewport().setXAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setMinX(10);
        graphPulseAdvance.getViewport().setMaxX(17);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(100);
        graphPulseAdvance.getViewport().setMaxY(130);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen1) ;
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRRAdvance.getViewport().setXAxisBoundsManual(true);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setMinX(10);
        graphRRAdvance.getViewport().setMaxX(17);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(16);
        graphRRAdvance.getViewport().setMaxY(28);

        graphPAOAdvance = (GraphView)findViewById(R.id.graphPAOAdvance_Scen1) ;
        graphPAOAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAOAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAOAdvance.getViewport().setXAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setScrollableY(false);
        graphPAOAdvance.getViewport().setMinX(10);
        graphPAOAdvance.getViewport().setMaxX(17);
        graphPAOAdvance.getViewport().setYAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setMinY(94);
        graphPAOAdvance.getViewport().setMaxY(100);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen1) ;
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTempAdvance.getViewport().setXAxisBoundsManual(true);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setMinX(10);
        graphTempAdvance.getViewport().setMaxX(17);
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
        textPatientInfo.setText("John, Male, 35 y/o, broken arm, head pains, shock");
        BPNumAdvance.setText("120/82 ");
        pulseNumAdvance.setText("102 ");
        RRNumAdvance.setText("17 ");
        PAONumAdvance.setText("98 ");
        tempNumAdvance.setText("98.6 ");
        textInfo.setText("Basic Neuro Assessment – min 3\nIce broken arm- min 4\nO2- min 5\nAssess arm/Splint arm –min 6");

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
                textPatientInfo.setText("John, Male, 35 y/o, broken arm, head pains, shock");
                BPNumAdvance.setText("120/82 ");
                pulseNumAdvance.setText("102 ");
                RRNumAdvance.setText("17 ");
                PAONumAdvance.setText("98 ");
                tempNumAdvance.setText("98.6 ");
                textInfo.setText("Basic Neuro Assessment – min 3\nIce broken arm- min 4\nO2- min 5\nAssess arm/Splint arm –min 6");

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

        seriesBP.appendData(new DataPoint(1, 155), true, 15);
        seriesBP.appendData(new DataPoint(2, 155), true, 15);
        seriesBP.appendData(new DataPoint(3, 152), true, 15);
        seriesBP.appendData(new DataPoint(4, 148), true, 15);
        seriesBP.appendData(new DataPoint(5, 144), true, 15);
        seriesBP.appendData(new DataPoint(6, 140), true, 15);
        seriesBP.appendData(new DataPoint(7, 134), true, 15);
        seriesBP.appendData(new DataPoint(8, 132), true, 15);
        seriesBP.appendData(new DataPoint(9, 120), true, 15);
        seriesBP.appendData(new DataPoint(10, 119), true, 15);
        seriesBP.appendData(new DataPoint(11, 123), true, 15);
        seriesBP.appendData(new DataPoint(12, 120), true, 15);
        seriesBP.appendData(new DataPoint(13, 122), true, 15);
        seriesBP.appendData(new DataPoint(14, 125), true, 15);
        seriesBP.appendData(new DataPoint(15, 120), true, 15);

        seriesPulse.appendData(new DataPoint(1, 119), true, 15);
        seriesPulse.appendData(new DataPoint(2, 123), true, 15);
        seriesPulse.appendData(new DataPoint(3, 122), true, 15);
        seriesPulse.appendData(new DataPoint(4, 119), true, 15);
        seriesPulse.appendData(new DataPoint(5, 115), true, 15);
        seriesPulse.appendData(new DataPoint(6, 115), true, 15);
        seriesPulse.appendData(new DataPoint(7, 114), true, 15);
        seriesPulse.appendData(new DataPoint(8, 113), true, 15);
        seriesPulse.appendData(new DataPoint(9, 110), true, 15);
        seriesPulse.appendData(new DataPoint(10, 106), true, 15);
        seriesPulse.appendData(new DataPoint(11, 105), true, 15);
        seriesPulse.appendData(new DataPoint(12, 106), true, 15);
        seriesPulse.appendData(new DataPoint(13, 107), true, 15);
        seriesPulse.appendData(new DataPoint(14, 103), true, 15);
        seriesPulse.appendData(new DataPoint(15, 102), true, 15);

        seriesRR.appendData(new DataPoint(1, 25), true, 15);
        seriesRR.appendData(new DataPoint(2, 26), true, 15);
        seriesRR.appendData(new DataPoint(3, 27), true, 15);
        seriesRR.appendData(new DataPoint(4, 24), true, 15);
        seriesRR.appendData(new DataPoint(5, 24), true, 15);
        seriesRR.appendData(new DataPoint(6, 23), true, 15);
        seriesRR.appendData(new DataPoint(7, 22), true, 15);
        seriesRR.appendData(new DataPoint(8, 22), true, 15);
        seriesRR.appendData(new DataPoint(9, 21), true, 15);
        seriesRR.appendData(new DataPoint(10, 19), true, 15);
        seriesRR.appendData(new DataPoint(11, 17), true, 15);
        seriesRR.appendData(new DataPoint(12, 17), true, 15);
        seriesRR.appendData(new DataPoint(13, 18), true, 15);
        seriesRR.appendData(new DataPoint(14, 19), true, 15);
        seriesRR.appendData(new DataPoint(15, 17), true, 15);

        seriesPAO.appendData(new DataPoint(1, 97), true, 15);
        seriesPAO.appendData(new DataPoint(2, 98), true, 15);
        seriesPAO.appendData(new DataPoint(3, 97), true, 15);
        seriesPAO.appendData(new DataPoint(4, 98), true, 15);
        seriesPAO.appendData(new DataPoint(5, 96), true, 15);
        seriesPAO.appendData(new DataPoint(6, 98), true, 15);
        seriesPAO.appendData(new DataPoint(7, 96), true, 15);
        seriesPAO.appendData(new DataPoint(8, 97), true, 15);
        seriesPAO.appendData(new DataPoint(9, 96), true, 15);
        seriesPAO.appendData(new DataPoint(10, 97), true, 15);
        seriesPAO.appendData(new DataPoint(11, 96), true, 15);
        seriesPAO.appendData(new DataPoint(12, 95), true, 15);
        seriesPAO.appendData(new DataPoint(13, 97), true, 15);
        seriesPAO.appendData(new DataPoint(14, 98), true, 15);
        seriesPAO.appendData(new DataPoint(15, 98), true, 15);


        seriesTemp.appendData(new DataPoint(1, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(2, 98.5), true, 15);
        seriesTemp.appendData(new DataPoint(3, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(4, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(5, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(6, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(7, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(8, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(9, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(10, 98.8), true, 15);
        seriesTemp.appendData(new DataPoint(11, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(13, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(14, 98.5), true, 15);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 15);


    }

}

