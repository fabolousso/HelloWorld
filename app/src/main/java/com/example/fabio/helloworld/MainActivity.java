package com.example.fabio.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MSG_NO_INPUT = "Bitte alle Textfelder ausfüllen";

    private TextView txtOutput = null;
    private EditText txtInputOne = null;
    private EditText txtInputTwo = null;
    private Button cmdMergeButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtOutput = (TextView) findViewById(R.id.txtOutput);

        this.txtInputOne = (EditText) findViewById(R.id.txtInputOne);
        this.txtInputTwo = (EditText) findViewById(R.id.txtInputTwo);

        this.cmdMergeButton = (Button) findViewById(R.id.cmdMergeUserInput);

        cmdMergeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Implementierung
                //txtOutput.setText(txtInputOne.getText().toString() + " " + txtInputTwo.getText().toString());
                String strInputOne = "";
                String strInputTwo = "";

                strInputOne = txtInputOne.getText().toString();
                strInputTwo = txtInputTwo.getText().toString();

                //Überprüfen ob beide Textfelder befüllt sind
                 if (strInputOne.equals("") || strInputTwo.equals(""))
                 {
                    //Meldung ausgeben
                     Toast.makeText(v.getContext(),MSG_NO_INPUT,Toast.LENGTH_LONG).show();
                 }
                else
                 {
                     txtOutput.setText(txtInputOne.getText().toString() + " " + txtInputTwo.getText().toString());
                 }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
