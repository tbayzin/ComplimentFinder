package geochat.nucleus.com.complimentfinder;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class AddCompliments extends AppCompatActivity {

}
/*
    private DataBaseHelper mydb;

    private TextView TVShow;
    //  private EditText TxtCompliments;
    private Button BtnAddcompliments, BtnShow;
    private ListView LstCompliments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_compliments);


     //   mydb = new DataBaseHelper(this);

        TVShow = (TextView) findViewById(R.id.tvekle);
        BtnShow = (Button) findViewById(R.id.btnShowCompliment);
        BtnAddcompliments = (Button) findViewById(R.id.btnaddCompliments);
        LstCompliments = (ListView) findViewById(R.id.lstcompliements);


        BtnShow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                showCompliments();
            }
        });


        BtnAddcompliments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCompliment();

            }
        });
    }

    /*
    private void showCompliments() {
        Cursor cursor = mydb.getCompliment();

        if (cursor.moveToFirst()) {
            String[] compliments = new String[cursor.getCount()];
            int i = 0;
            do {
                compliments[i] = cursor.getString(cursor.getColumnIndex(DataBaseHelper.COLUMN_USER_NAME));
                i++;
            } while (cursor.moveToNext());
            ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, compliments);
            LstCompliments.setAdapter(adapter);
            cursor.close();
        }
    }


    private void addCompliment() {
        String name = TVShow.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "Add your compliment", Toast.LENGTH_LONG).show();
            return;
        }

        if (mydb.addCompliment(name)) {
            Toast.makeText(this, "Compliment added", Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this, "Compliment didnt add", Toast.LENGTH_LONG).show();
        }
    }

    private void character() {




    }
}

*/