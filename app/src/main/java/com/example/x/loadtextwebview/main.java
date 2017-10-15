package com.example.x.loadtextwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class main extends AppCompatActivity {

    WebView wbvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wbvw = (WebView) findViewById(R.id.txtld);

        String datas = "WebView<p>A View that displays web pages. This class is the basis upon which you can roll your own web browser or simply display some online content within your Activity. It uses the WebKit rendering engine to display web pages and includes methods to navigate forward and backward through a history, zoom in and out, perform text searches and more.";

        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw.loadData(String.format(files), "text/html", "utf-8");

    }
}

//        String htmls = " %s ";