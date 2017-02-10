package com.example.chriscu.visualapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.chriscu.visualapp.R.id.toolbar2;

public class MainActivity extends AppCompatActivity {


    Button button;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate a web view
        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://sports.williamhill.com/betting/en-gb");
        WebSettings webSettings = simpleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        Toolbar toolbar = (Toolbar) findViewById(toolbar2);
        setSupportActionBar(toolbar);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    static final int REQUEST_IMAGE_CAPTURE = 1;

    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }

    }



    public void changeView (View view) {

        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://sports.williamhill.com/betting/en-gb");
        WebSettings webSettings = simpleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Toast.makeText(getApplicationContext(), "webview Sports loading", Toast.LENGTH_LONG).show();


    }


    public void changeView3 (View view) {

        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://promotions.williamhill.com/#!/");
        WebSettings webSettings = simpleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toast.makeText(getApplicationContext(), "webview Promos loading", Toast.LENGTH_LONG).show();

    }



    public void changeView2 (View view) {

        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://mobile.williamhill.com/vegas/en-gb/home");
        WebSettings webSettings = simpleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toast.makeText(getApplicationContext(), "webview Vegas loading", Toast.LENGTH_LONG).show();


    }




  public void Vibrate (View view) {
       //  Get instance of Vibrator from current Context
       Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

    //  Output yes if can vibrate, no otherwise
      if (v.hasVibrator()) {
           Log.v("Can Vibrate", "YES");

         //   Vibrate for 400 milliseconds
           v.vibrate(400);
       } else {
           Log.v("Can Vibrate", "NO");
        }



   }




   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
           Bitmap imageBitmap = (Bitmap) extras.get("data");
           ImageView mImageView = (ImageView) findViewById(R.id.MimageView);
           mImageView.setImageBitmap(imageBitmap);
       }
    }




  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       // Handle action bar item clicks here. The action bar will
//automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
     int id = item.getItemId();

       //noinspection SimplifiableIfStatement
      if (id == R.id.action_settings) {
          return true;
       }

       return super.onOptionsItemSelected(item);
    }
              }


