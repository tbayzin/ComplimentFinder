package geochat.nucleus.com.complimentfinder;


import android.arch.persistence.room.Room;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;
import android.provider.BlockedNumberContract;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

//import static geochat.nucleus.com.complimentfinder.DataBaseHelper.TABLE_NAME;
// import static geochat.nucleus.com.complimentfinder.DataBaseHelper.TABLE_NAME2;


public class MainActivity extends AppCompatActivity   {

 public static DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        final TextView shwtxt;
        final Button btnGenerate, btnCompliments;
        final RadioGroup radiogroup;
        final RadioButton rbRomantic, rbCharacter, rbAppereance;

        dataBaseHelper = Room.databaseBuilder(getApplicationContext(), DataBaseHelper.class, "mydb").allowMainThreadQueries().build();


        shwtxt = (TextView) findViewById(R.id.textView); // BU SIRA HEP PUBLIC VOID DI VE IMPLEMENTS EXTENDSLERIN HEMEN ALINTDAYDI
        btnCompliments = (Button) findViewById(R.id.btncompliments);
        btnGenerate = (Button) findViewById(R.id.btngenerate);
        rbCharacter = (RadioButton) findViewById(R.id.radio1);
        rbRomantic = (RadioButton) findViewById(R.id.radio2);
        rbAppereance = (RadioButton) findViewById(R.id.radio3);
        radiogroup = (RadioGroup) findViewById(R.id.radiogroupp);





        /// ŞUAN PROGRAM ÇALIŞIR VAZİYETTE ŞİMDİ RADIOBUTONLARDAN SQL SORGUSU ÇALIŞTIRMAK GEREKİYOR.ÖNCE FONKSYINO YAZACAZ.
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int selectedId) {


                if (selectedId == R.id.radio1) {
                    RBgenerateCharacter();


                }

                if (selectedId == R.id.radio2) {
                            shwtxt.setText("You chose ' option");

                } else if (selectedId == R.id.radio2) {

                            shwtxt.setText("You chose  option");

                } else {

                         //  shwtxt.setText("You chose  option");
                }

            }

            public void RBgenerateCharacter () {
                List<mysentences2> mysentences2 = MainActivity.dataBaseHelper.myDao().myCharacter();

                String info2 = "";


                for (mysentences2 usr2: mysentences2) {

                    String email = usr2.getEmail();


                    info2 = info2 + " " + email  ;
                }
                shwtxt.setText(info2);
                return;
            }

          });



        /// OPENS NEW ACTIVITY     ///////
        btnCompliments.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  startActivity(new Intent(MainActivity.this, AddCompliments.class));
                                              }
                                          });


                btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

          //   List<mysentences2> mysentences2 = MainActivity.dataBaseHelper.myDao().getmysentences2();

                List<mysentences2> mysentences2 = MainActivity.dataBaseHelper.myDao().myqueries(); // Burda DAO daki myqueries çağrılıyor sorgu yaptırılıyor

         //       StringBuilder sb = new StringBuilder();

String info = "";


            for (mysentences2 usr: mysentences2) {
                //   int id = usr.getId();
                String name= usr.getName();
             //   String email = usr.getEmail();


           info = info + " " + name + " " + " "  ;
            }
            shwtxt.setText(info);
return;
            }
        }); }



        // mysentences  classından sonradan gelenler.Şu durumda işe yaramıyorlar.

    public void addmysentences2(mysentences2 mmysentences2) {

    }


    public List<mysentences2> getmysentences2() {
        return null;
    }
}

