package com.example.employee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
Button btn;String first,last;
EditText firstName,lastName;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.add);
        firstName=findViewById(R.id.FirstName);
        lastName=findViewById(R.id.LastName);
        txt=findViewById(R.id.data);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("employees");
                first=firstName.getText().toString();
                last=lastName.getText().toString();
                myRef.child("4").setValue(new com.pace.examplefirebase.Employee(first,last));
                myRef=database.getReference().child("employees");
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange( DataSnapshot snapshot) {
                        com.pace.examplefirebase.Employee emp;
                        int counter=0;
                        String now="";
                        for(DataSnapshot ds: snapshot.getChildren())
                        {
                            emp=(com.pace.examplefirebase.Employee) ds.getValue(com.pace.examplefirebase.Employee.class);
                             now= now +counter + " FirstName : " + emp.getFirstName() + "  kokoLastName : " + emp.getLastName() + "\n";
                            counter=counter+1;
                        }
                        txt.setText(now);

                    }

                    @Override
                    public void onCancelled( DatabaseError error) {
                        System.out.println("The read failed: "+ error.getCode());
                    }
                });
            }
        });


    }
}