package de.podfetcher.activity;

import com.actionbarsherlock.app.SherlockListActivity;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import de.podfetcher.feed.*;

/** Displays a List of FeedItems */
public class FeedItemlistActivity extends SherlockListActivity {
	private static final String TAG = "FeedItemlistActivity";

	/** The feed which the activity displays */
	private Feed feed;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
	
	}
}
