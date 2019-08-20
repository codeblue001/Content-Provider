package jide.delano.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class MiniContentProvider extends ContentProvider {

    private static final String TAG = MainActivity.class.getSimpleName();

    public String[] mData;

    @Override
    public boolean onCreate() {
        Context context = getContext();
        mData = context.getResources().getStringArray(R.array.words);
        return true;    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        Log.e(TAG, "Not implemented: update uri: " + uri.toString());
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        Log.e(TAG, "Not implemented: update uri: " + uri.toString());
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        Log.e(TAG, "Not implemented: update uri: " + uri.toString());
        return 0;
    }
}
