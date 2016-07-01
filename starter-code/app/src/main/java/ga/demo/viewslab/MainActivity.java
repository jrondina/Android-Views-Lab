package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    String numViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Put your Java code in here

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (view instanceof Button) {
                //    Toast.makeText(view.getContext(), "You Clicked the Button below views number ", Toast.LENGTH_LONG).show();
                switch (view.getId()) {
                    case R.id.button1:
                        numViews = "1 and 2";
                        break;
                    case R.id.button2:
                        numViews = "3 and 4";
                        break;
                    case R.id.button3:
                        numViews = "5 and 6";
                        break;
                    case R.id.button4:
                        numViews = "7 and 8";
                        break;
                    case R.id.button5:
                        numViews = "9 and 10";
                        break;
                    case R.id.button6:
                        numViews = "11 and 12";
                        break;
                    case R.id.button7:
                        numViews = "13 and 14";
                        break;
                    case R.id.button8:
                        numViews = "15 and 16";
                        break;
                    case R.id.button9:
                        numViews = "17 and 18";
                        break;
                    case R.id.button10:
                        numViews = "19 and 20";
                        break;
                    default:
                        break;


                }
                Toast.makeText(view.getContext(), "You Clicked the Button below views number " + numViews, Toast.LENGTH_LONG).show();
            }
            //}
        };

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);

        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        button7.setOnClickListener(clickListener);
        button8.setOnClickListener(clickListener);
        button9.setOnClickListener(clickListener);
        button10.setOnClickListener(clickListener);






    }

}
