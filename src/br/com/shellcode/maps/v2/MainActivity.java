package br.com.shellcode.maps.v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private static String TAG = "Maps";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button botao = (Button) findViewById(R.id.button1);
		botao .setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				Log.i(TAG, "clique!");
				// vibrator.vibrate(2000);
				sendMessage(view);
			}

		});
	}
	
	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
		Intent intent = new Intent(this, MapAddressSearchActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
