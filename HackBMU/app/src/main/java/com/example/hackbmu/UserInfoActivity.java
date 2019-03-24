package com.example.hackbmu;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hackbmu.SharedPreferenceConfig;

public class UserInfoActivity extends AppCompatActivity  {

    EditText Name , Email , Phone , BloodGroup , EmergencyNumber , Height , Weight , Address ;
    Button Submit ;

    private SharedPreferenceConfig preferenceConfig;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userinfo);

        Name = findViewById(R.id.textPersonName);
        Email = findViewById(R.id.textEmailAddress);
        Phone = findViewById(R.id.phone);
        BloodGroup = findViewById(R.id.bloodGroup);
        EmergencyNumber = findViewById(R.id.EmergencyNumber);
        Height = findViewById(R.id.height);
        Weight = findViewById(R.id.weight);
        Address = findViewById(R.id.Address);

        Submit = findViewById(R.id.submit);
        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
        final Context ctx = this;
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String bloodGroup = BloodGroup.getText().toString() ;
                String phone = Phone.getText().toString();
                String emergencyNumber =  EmergencyNumber.getText().toString() ;
                String height =    Height.getText().toString();
                String weight = Weight.getText().toString();
                String address = Address.getText().toString();

                if(name.length()>0 && emergencyNumber.length()==10){
                    preferenceConfig.setStringPref(SharedPreferenceConfig.Name, name);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.Email , email );
                    preferenceConfig.setStringPref(SharedPreferenceConfig.BloodGroup , bloodGroup);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.Phone, phone);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.EmergencyContact , emergencyNumber);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.height , height);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.weight , weight);
                    preferenceConfig.setStringPref(SharedPreferenceConfig.address , address);

                    Toast.makeText(ctx,"Done",Toast.LENGTH_SHORT).show();
//
                    Intent intent = new Intent(UserInfoActivity.this, MainActivity.class);
                  startActivity(intent);
                }

            }
        });



    }
}
