package com.example.user.whoareyou;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WhoAreYou extends AppCompatActivity {

    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_are_you);



    }

    public void okClick(View view) {
    //Eks. 1
     /*  Toast toast = Toast.makeText(getApplicationContext(),"okClick!",Toast.LENGTH_LONG);
       toast.setGravity( Gravity.TOP, 0, 0);
        toast.show();
     */
     //Eks. 2
      /*  dialog = new Dialog(this);

        dialog.setTitle("greetings"); //hardcoded - should be in strings.xml!


        TextView textView = new TextView(this);
        textView.setText("okClick");
        textView.setPadding(20, 20, 20, 20);

        dialog.setContentView(textView);

        dialog.show();
        */

      //Eks. 3
        TextView outputText = (TextView)findViewById(R.id.textView);

        EditText nameText = (EditText)findViewById(R.id.editTextName);
        EditText ageText = (EditText)findViewById(R.id.editTextAge);
        outputText.setText(whoAreYou(nameText.getText().toString(), Integer.parseInt(ageText.getText().toString())));
    }

    public void cancelClick(View view) {

        EditText nameText = (EditText)findViewById(R.id.editTextName);
        nameText.setText("  ");

        EditText ageText = (EditText)findViewById(R.id.editTextAge);
        ageText.setText(" ");

        TextView outputText = (TextView)findViewById(R.id.textView);
        outputText.setText(" ");

    }

    public String whoAreYou(String name, int age)
    {
        String output;
        if(age <= 1)
        {
            output = ""+name+" er baby!\n"+name+" ønsker: Praktiske løsninger.\n"+name+" frygter: Kaos.";
        }
        else if(age>=2&&age<=3)
        {
            output = ""+name+" er tumling!\n"+name+" ønsker: Stimulering. \n"+name+" frygter: At være et ikke-stimuleret barn.";
        }
        else if(age>=4&&age<=6)
        {
            output = ""+name+" er i børnehavealder!\n"+name+" ønsker: Socialisering.\n"+name+" frygter: At være et barn der er udenfor.";
        }
        else if(age>=7&&age<=9)
        {
            output = ""+name+" er i den tidlige skolealder!\n"+name+" ønsker: Indlæring – også at være kender af diller/subkulturer. \n"+name+" frygter: at være et barn der har det svært med skolens fag – ikke lærer dillen.";
        }
        else if(age>=10&&age<=13)
        {
            output = ""+name+" er tweens!\n"+name+" ønsker: Se ældre ud.\n"+name+" frygter: At blive opfattet som barnlig.";
        }
        else if(age>=14&&age<=18)
        {
            output = ""+name+" er teenager!\n"+name+" ønsker: Anerkendelse. \n"+name+" frygter: Misforståelse, afsvisning.";
        }
        else if(age>=19&&age<=25)
        {
            output = ""+name+" er i identitet fase!\n"+name+" ønsker: Udvikling og udseende. \n"+name+" frygter: Stilstand og mislykket udseende.";
        }
        else if(age>=26&&age<=30)
        {
            output = ""+name+" er i etablering fase!\n"+name+" ønsker: Forankring.\n"+name+" frygter: Rodløshed.";
        }

        else if(age>=31&&age<=35)
        {
            output = ""+name+" er i familie med små børn fase!\n"+name+" ønsker: Nemt og bekvemt - at finde balance ml. familie og karriere.\n"+name+" frygter: Dyrt, upraktisk, uholdbart. ";
        }
        else if(age>=36&&age<=40)
        {
            output = ""+name+" er i familie med skolebørn/tweens fase!\n"+name+" ønsker: Panik og aflad.\n"+name+" frygter: Dårlig samvittighed. ";
        }
        else if(age>=41&&age<=45)
        {
            output = ""+name+" er i familie med teens fase!\n"+name+" ønsker: Frihed og kamp.\n"+name+" frygter: Fx 'tab' af barnet til misbrug.";
        }
        else if(age>=46&&age<=60)
        {
            output = ""+name+" er i selvrealisering fase!\n"+name+" ønsker: Udvikling .\n"+name+" frygter: Afvikling.";
        }
        else if(age>=61&&age<=70)
        {
            output = ""+name+" er ny senior!\n"+name+" ønsker: Det gode liv.\n"+name+" frygter: Det sølle liv.";
        }
        else if(age>=71&&age<=75)
        {
            output = ""+name+" er rutinesenior!\n"+name+" ønsker: Tryghed.\n"+name+" frygter: Utryghed.";
        }
        else if(age>=76&&age<=80)
        {
            output = ""+name+" er hjemmegående senior!\n"+name+" ønsker: Magelighed og sikkerhed.\n"+name+" frygter: Problemer og usikkerhed.";
        }
        else
        {
            output = ""+name+" er afhængige\n"+name+" ønsker: Afhængighed og omsorg.\n"+name+" frygter: Ensomhed og udsathed.";
        }


        return output;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_who_are_you, menu);
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
