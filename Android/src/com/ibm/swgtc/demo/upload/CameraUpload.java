
package com.ibm.swgtc.demo.upload;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class CameraUpload extends DroidGap {

    /**
     * Constructor
     */
    public CameraUpload() {
        super();
    }

    
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	// Clear our cache (this is used mainly during development - comment out for production)
    this.clearCache();
    	        
        // Load our app
    	super.loadUrl("file:///android_asset/www/index.html");
    }    
}
