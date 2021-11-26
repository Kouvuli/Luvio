package com.android.Luvio.firebase;

import com.android.Luvio.models.User;
import com.android.Luvio.utilities.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.HashMap;

public class RealTimeDBManager {

    private DatabaseReference databaseReference;
    public RealTimeDBManager(){
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Constants.KEY_COLLECTION_USER);

    }
    public Task<Void> add(User emp)
    {
        return databaseReference.push().setValue(emp);
    }

    public Task<Void> update(String key, HashMap<String ,Object> hashMap)
    {
        return databaseReference.child(key).updateChildren(hashMap);
    }
    public Task<Void> remove(String key)
    {
        return databaseReference.child(key).removeValue();
    }

    public Query get(String key)
    {
        if(key == null)
        {
            return databaseReference.orderByKey().limitToFirst(8);
        }
        return databaseReference.orderByKey().startAfter(key).limitToFirst(8);
    }

    public Query get()
    {
        return databaseReference;
    }
}
