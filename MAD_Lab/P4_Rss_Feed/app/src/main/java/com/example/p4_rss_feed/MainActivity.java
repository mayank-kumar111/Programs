package com.example.p4_rss_feed;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<RSSItem> rssItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new LoadRSS().execute();
    }

    class LoadRSS extends AsyncTask<Void, Void, List<RSSItem>> {

        @Override
        protected List<RSSItem> doInBackground(Void... voids) {
            try {

                URL url = new URL("https://codingconnect.net/feed");
               // URL url = new URL("https://example.tumblr.com/rss");

                // URL url = new URL("https://zapier.com/blog/feeds/latest/");
                InputStream inputStream = url.openConnection().getInputStream();

                XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                XmlPullParser xpp = factory.newPullParser();
                xpp.setInput(inputStream, "UTF_8");

                boolean insideItem = false;
                String title = null, link = null;

                int eventType = xpp.getEventType();
                while (eventType != XmlPullParser.END_DOCUMENT) {

                    if (eventType == XmlPullParser.START_TAG) {
                        if (xpp.getName().equalsIgnoreCase("item")) {
                            insideItem = true;
                        } else if (xpp.getName().equalsIgnoreCase("title") && insideItem) {
                            title = xpp.nextText();
                        } else if (xpp.getName().equalsIgnoreCase("link") && insideItem) {
                            link = xpp.nextText();
                        }
                    } else if (eventType == XmlPullParser.END_TAG &&
                            xpp.getName().equalsIgnoreCase("item")) {

                        rssItems.add(new RSSItem(title, link));
                        insideItem = false;
                    }

                    eventType = xpp.next();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return rssItems;
        }

        @Override
        protected void onPostExecute(List<RSSItem> items) {
            RSSAdapter adapter = new RSSAdapter(MainActivity.this, items);
            recyclerView.setAdapter(adapter);
        }
    }
}