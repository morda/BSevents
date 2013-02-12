package ru.bigstudio.bsevents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btnNew;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnNew = (Button) findViewById(R.id.btnNew);
        btnNew.setOnClickListener(this);
    }
    
    //@Override
    public void onClick(View v) {
      switch (v.getId()) {
      case R.id.btnNew:
    	Intent intent = new Intent(this, NewEvents.class);
        startActivity(intent);
        break;
      default:
        break;
      }
    }
}
