package com.example.tipcalculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText totalBill;
	private Button tenpercent;
	private Button fifteenpercent;
	private Button twentypercent;
	private TextView totalTip;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		totalBill = (EditText) findViewById(R.id.bill);
		totalTip = (TextView) findViewById(R.id.tip);
		tenpercent = (Button) findViewById(R.id.tenpercent);
		fifteenpercent = (Button) findViewById(R.id.fifteenpercent);
		twentypercent = (Button) findViewById(R.id.twentypercent);
		setlisteners();
	}

	private void setlisteners() {
		tenpercent.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setTip(10);
			}
		});
		fifteenpercent.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setTip(15);
			}
		});
		twentypercent.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setTip(20);
			}
		});
				
	}

	private void setTip(int tip) {
		float bill = Float.valueOf(totalBill.getText().toString());
		String totaltip = "$" +  Float.toString(bill*tip/100);
		totalTip.setText(totaltip);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
