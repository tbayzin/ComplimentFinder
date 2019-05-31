package geochat.nucleus.com.complimentfinder;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BlockedNumberContract;

import static android.arch.persistence.room.RoomMasterTable.TABLE_NAME;
import static android.icu.text.MessagePattern.ArgType.SELECT;
import static android.provider.BlockedNumberContract.BlockedNumbers.COLUMN_ID;
import static java.lang.Math.random;

@Database(entities = {mysentences2.class},version = 1)
public abstract class DataBaseHelper extends RoomDatabase {


public abstract MyDao myDao();


}

// Codes down below wont be activated unless I rearrange the app
//  Alttaki kodlar app in su durumunda gerekli değil.

    /*
    public static final String DB_NAME = "mydb";
    public static final String TABLE_NAME = "mysentences2" + "";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USER_NAME = "username";

    public static final int DB_VERSION = 1;

    private static final String LOG = "DatabaseHelper";

    public static final String DB_NAME2 = "mydb";
    public static final String TABLE_NAME2 = "mysentences3" + "";
    public static final String COLUMN_ID2 = "id2";
    public static final String COLUMN_USER_NAME2 = "username2";

    public static final int DB_VERSION2 = 2;


    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public static int generatecompliments() {

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        String sql = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_USER_NAME + " VARCHAR)";
        sqLiteDatabase.execSQL(sql);
        String sql2 = "CREATE TABLE " + TABLE_NAME2 + " (" + COLUMN_ID2 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_USER_NAME2 + " VARCHAR)";

        sqLiteDatabase.execSQL(sql);
        sqLiteDatabase.execSQL(sql2);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String sql = "DROP TABLE IF EXISTS" + TABLE_NAME;
        String sql2 = "DROP TABLE IF EXISTS" + TABLE_NAME2;
        sqLiteDatabase.execSQL(sql);
        sqLiteDatabase.execSQL(sql2);
        onCreate(sqLiteDatabase);

    }

    public boolean addCompliment(String name) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_USER_NAME, name);

        return sqLiteDatabase.insert(TABLE_NAME, null, contentValues) == -1;
    }

        public Cursor getCompliment () {
            SQLiteDatabase sqLiteDatabase1 = getReadableDatabase();
            String sql = "SELECT * FROM " + TABLE_NAME + ";";
            return sqLiteDatabase1.rawQuery(sql, null);

        }


        ContentValues mycontent = new ContentValues();



    public Cursor generatecompliments () {
        SQLiteDatabase sqLiteDatabase2 = getReadableDatabase();
        String sql =    "SELECT " + " "
                + COLUMN_USER_NAME2  + " FROM " + TABLE_NAME2 + " ORDER BY RANDOM() LIMIT 1 ";
        return sqLiteDatabase2.rawQuery(sql, null);
    } }
*/
