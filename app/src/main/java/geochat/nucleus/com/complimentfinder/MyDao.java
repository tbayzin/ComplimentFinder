package geochat.nucleus.com.complimentfinder;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addmysentences2 (mysentences2 mmysentences2) ;

    @Query("select * from mysentences2")
    public List<mysentences2> getmysentences2();

    @Query(  "select * from mysentences2 " + " ORDER BY RANDOM() LIMIT 1" )
    public List<mysentences2> myqueries();

    @Query ("select email,id,name  from mysentences2 " + "ORDER BY RANDOM() LIMIT 1" ) // taking id and name too but only puts email column to screen in Mainactivity
    public List <mysentences2> myCharacter();

}
