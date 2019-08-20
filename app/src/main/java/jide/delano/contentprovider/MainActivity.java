package jide.delano.contentprovider;

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
        switch (view.getId()) {
            case R.id.btn_list:
                Log.d(TAG, "Yay, I was clicked!");
                response.setText("Yay, TextView text has changed!");
                break;
            case R.id.btn_word:
                Log.d(TAG, "Ah! It's you again");
                response.setText("Just kill me now!");

                break;
        }
//        Log.d(TAG, "Yay, I was clicked!");
    }


}
