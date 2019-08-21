package jide.delano.contentprovider;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button buttonList, buttonWord;
    TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonList = findViewById(R.id.btn_list);
        buttonWord = findViewById(R.id.btn_word);
        response = findViewById(R.id.response);
    }

    public void onClickDisplayEntries(View view) {

        String queryUri = Contract.CONTENT_URI.toString();
        String[] projection = new String[] {Contract.CONTENT_PATH};
        String selectionClause;
        String selectionArgs[];
        String sortOrder = null;


        switch (view.getId()) {
            case R.id.btn_list:
                selectionClause = null;
                selectionArgs = null;
                break;
            case R.id.btn_word:
                selectionClause = Contract.WORD_ID + " = ?";
                selectionArgs = new String[]{"0"};
                break;
            default:
                selectionClause = null;
                selectionArgs = null;

        }


//        switch (view.getId()) {
//            case R.id.btn_list:
//                Log.d(TAG, "Yay, I was clicked!");
//                response.setText("Yay, TextView text has changed!");
//                break;
//            case R.id.btn_word:
//                Log.d(TAG, "Ah! It's you again");
//                response.setText("Just kill me now!");
//
//                break;
//    }

        //        Log.d(TAG, "Yay, I was clicked!");
        Cursor cursor = getContentResolver().query(Uri.parse(queryUri), projection, selectionClause, selectionArgs, sortOrder);

        if (cursor != null) {
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex(projection[0]);
                do {
                    String word = cursor.getString(columnIndex);
                    response.append(word + "\n");
                } while (cursor.moveToNext());
            } else {
                Log.d(TAG, "onClickDisplayEntries " + "No data returned.");
                response.append("No data returned." + "\n");
            }
            cursor.close();
        } else {
            Log.d(TAG, "onClickDisplayEntries " + "Cursor is null.");
            response.append("Cursor is null." + "\n");
        }
    }

}

