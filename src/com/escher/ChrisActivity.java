package com.escher;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

public class ChrisActivity extends DroidGap {
    /** Called when the activity is first created. */
	private Handler mHandler = new Handler();
	private AdView adView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        
        adView = new AdView(this, AdSize.BANNER, "66b50f0134b1458d");      
    	LinearLayout layout = super.root;
    	layout.addView(adView);
    	layout.setHorizontalGravity(android.view.Gravity.CENTER_HORIZONTAL);              //This centers the ads in landscape mode.
    	adView.loadAd(new AdRequest());
        
//        mHandler.postDelayed(new Runnable() {
//            public void run() {
//                //doAdMob();
//            }
//        }, 5000);  
    }
    
   
    
    private void doAdMob() {
    	
    	

    	
//        // Create the adView
//        adView = new AdView(this, AdSize.BANNER, "66b50f0134b1458d");
//        // Lookup your LinearLayout - get the super.root
//        LinearLayout layout = super.root;
//        // Add the adView to it
//        layout.addView(adView);
//        // This centers the ads in landscape mode.        
//        layout.setHorizontalGravity(android.view.Gravity.CENTER_HORIZONTAL);
//        // Initiate a generic request to load it with an ad
//        AdRequest request = new AdRequest();
//        // and finally...     
//        adView.loadAd(request);            
            
    }
}