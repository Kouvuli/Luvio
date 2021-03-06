package com.android.Luvio1.interfaces;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QuerySnapshot;

public interface CompleteQueryListener {
    void onSuccess(Task<QuerySnapshot> task);
    void onStart();

    void onFailure();

}
