package com.tejraj.oxgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cnt = 0;
    int flag = 1;

public void Btn_click( View btn) {

    Button tempbtn = findViewById(btn.getId());
    TextView txthid1= findViewById(R.id.txthid1);
    TextView txthid2= findViewById(R.id.txthid2);

    if (tempbtn.getText().equals("")&& flag == 1) {

        txthid1.setVisibility(View.INVISIBLE);
        txthid2.setVisibility(View.INVISIBLE);

        if (cnt % 2 == 0) {
            tempbtn.setText("X");
            tempbtn.setTextColor(Color.parseColor("#356CD8"));

        } else {
            tempbtn.setText("O");
            tempbtn.setTextColor(Color.parseColor("#E80DC3"));
        }
        cnt++;
    }
    if(cnt>4) {
        CheckWin();
    }

}
    public void CheckWin() {

        TextView txtwin = findViewById(R.id.txtWin);
        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);


        if    ( btn1.getText().toString().equals("X")  &&  btn2.getText().toString().equals("X")  &&  btn3.getText().toString().equals("X")   ||
                btn4.getText().toString().equals("X")  &&  btn5.getText().toString().equals("X")  &&  btn6.getText().toString().equals("X")   ||
                btn7.getText().toString().equals("X")  &&  btn8.getText().toString().equals("X")  &&  btn9.getText().toString().equals("X")   ||
                btn1.getText().toString().equals("X")  &&  btn4.getText().toString().equals("X")  &&  btn7.getText().toString().equals("X")   ||
                btn2.getText().toString().equals("X")  &&  btn5.getText().toString().equals("X")  &&  btn8.getText().toString().equals("X")   ||
                btn3.getText().toString().equals("X")  &&  btn6.getText().toString().equals("X")  &&  btn9.getText().toString().equals("X")   ||
                btn1.getText().toString().equals("X")  &&  btn5.getText().toString().equals("X")  &&  btn9.getText().toString().equals("X")   ||
                btn3.getText().toString().equals("X")  &&  btn5.getText().toString().equals("X")  &&  btn7.getText().toString().equals("X")    )
        {
            txtwin.setText("X is WINNER 👑");
            txtwin.setTextColor(Color.parseColor("#3CA5EC"));
            flag=0;
           playagain();

        }

        else if( btn1.getText().toString().equals("O")  &&  btn2.getText().toString().equals("O")  &&  btn3.getText().toString().equals("O")   ||
                btn4.getText().toString().equals("O")  &&  btn5.getText().toString().equals("O")  &&  btn6.getText().toString().equals("O")   ||
                btn7.getText().toString().equals("O")  &&  btn8.getText().toString().equals("O")  &&  btn9.getText().toString().equals("O")   ||
                btn1.getText().toString().equals("O")  &&  btn4.getText().toString().equals("O")  &&  btn7.getText().toString().equals("O")   ||
                btn2.getText().toString().equals("O")  &&  btn5.getText().toString().equals("O")  &&  btn8.getText().toString().equals("O")   ||
                btn3.getText().toString().equals("O")  &&  btn6.getText().toString().equals("O")  &&  btn9.getText().toString().equals("O")   ||
                btn1.getText().toString().equals("O")  &&  btn5.getText().toString().equals("O")  &&  btn9.getText().toString().equals("O")   ||
                btn3.getText().toString().equals("O")  &&  btn5.getText().toString().equals("O")  &&  btn7.getText().toString().equals("O")    )
        {
            txtwin.setText("O is WINNER 👑");
            txtwin.setTextColor(Color.parseColor("#E80DC3"));
            flag=0;
            playagain();

        }

        else if (!(btn1.getText().equals("")) && !(btn2.getText().equals("")) && !(btn3.getText().equals("")) && !(btn4.getText().equals("")) && !(btn5.getText().equals("")) && !(btn6.getText().equals("")) && !(btn7.getText().equals("")) && !(btn8.getText().equals("")) && !(btn9.getText().equals("")))
        {
           txtwin.setText("Match DRAWN 🙁");
            playagain();
            txtwin.setTextColor(Color.parseColor("#FFD80000"));
        }

    }



    public void playagain()
    {
     ImageView replay= findViewById(R.id.btnreplay);
     replay.setVisibility(View.VISIBLE);

     replay.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View rst) {
             TextView txtwin = findViewById(R.id.txtWin);
             Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
             btn1=findViewById(R.id.btn1);
             btn2=findViewById(R.id.btn2);
             btn3=findViewById(R.id.btn3);
             btn4=findViewById(R.id.btn4);
             btn5=findViewById(R.id.btn5);
             btn6=findViewById(R.id.btn6);
             btn7=findViewById(R.id.btn7);
             btn8=findViewById(R.id.btn8);
             btn9=findViewById(R.id.btn9);

             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
             txtwin.setText("");

             cnt = 0;
             flag =1;
             replay.setVisibility(View.INVISIBLE);
//             txthid1.setVisibility(View.VISIBLE);
//             txthid2.setVisibility(View.VISIBLE);
         }
     });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onResume(){
        super.onResume();
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN ;
        decorView.setSystemUiVisibility(uiOptions);             // COPY PASTE CODE

    }


}


