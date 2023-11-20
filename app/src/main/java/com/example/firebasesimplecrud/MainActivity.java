package com.example.firebasesimplecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private EditText etNoteTitle, etNoteDescription;
    private Button btnSaveNote, btnShowAllNotes;
    private void initUI(){
        etNoteTitle =findViewById(R.id.etNoteTitle);
        etNoteDescription =findViewById(R.id.etNoteDescription);
        btnSaveNote =findViewById(R.id.btnSaveNote);
        btnShowAllNotes =findViewById(R.id.btnShowAllNotes);
    }

    /**
     * Initialisation de Firebase Firestore
     */

    private FirebaseFirestore db;
    private void initFirebaseTools(){
        db = FirebaseFirestore.getInstance();
    }

/*Début des méthodes de l'ACV*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initFirebaseTools();
    }
}