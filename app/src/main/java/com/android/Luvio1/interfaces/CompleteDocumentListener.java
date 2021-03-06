package com.android.Luvio1.interfaces;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;

public interface CompleteDocumentListener {
    void onSuccess(Task<DocumentSnapshot> task);
    void onFailure();
}
