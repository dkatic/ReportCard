package com.example.david.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private List<ReportCard> reportCardList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reportCardList.add(new ReportCard("Hrvatski jezik", 5));
        reportCardList.add(new ReportCard("Engleski jezik", 3));
        reportCardList.add(new ReportCard("Matematika", 4));
        reportCardList.add(new ReportCard("Biologija", 4));
        reportCardList.add(new ReportCard("Kemija", 5));
        reportCardList.add(new ReportCard("Fizika", 4));
        reportCardList.add(new ReportCard("Elektrotehnika", 3));

        TextView textView = (TextView) findViewById(R.id.text_view);

        StringBuilder builder = new StringBuilder();

        for (int i=0; i<reportCardList.size(); i++){
            builder.append(String.format(Locale.getDefault(), "%s %d\n", reportCardList.get(i).getSubject(), reportCardList.get(i).getGrade()));
        }

        textView.setText(builder.toString());

    }

}
