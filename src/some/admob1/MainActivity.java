package some.admob1;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity 
{
	private AdView adView;
	private final String unitid = "ca-app-pub-1682279992310349/6255355515";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final LinearLayout rootLayout = (LinearLayout) findViewById(R.id.rootViewGroup1);
		adView = new AdView(this);
		adView.setAdSize(AdSize.SMART_BANNER);
		adView.setAdUnitId(unitid);
		rootLayout.addView(adView, 0);
		
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adView.destroy();
				//rootLayout.removeView(adView);
			}
		});
		

    }

}
