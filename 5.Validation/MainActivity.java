package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Fname,Lname,password;
    RadioGroup gender;
    RadioButton male,female;
    Switch newmem;
    CheckBox Agree;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fname=findViewById(R.id.editText1);
        Lname=findViewById(R.id.editText2);
        password=findViewById(R.id.Password);
        gender=findViewById(R.id.Rg1);
        male=findViewById(R.id.radioButton1);
        female=findViewById(R.id.radioButton2);
        newmem=findViewById(R.id.switch1);
        Agree=findViewById(R.id.checkBox);
        button=findViewById(R.id.button);


    }

    public void submit(View view) {
        if(validate()){
            Toast.makeText(this, "Registration Success !", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Registration Failed !", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validate() {
        boolean valid=false;
        String firstname,lastname;
        firstname=Fname.getText().toString();
        lastname=Lname.getText().toString();

        if(firstname.equals("")){
            Toast.makeText(this, "First name is empty !", Toast.LENGTH_SHORT).show();
        }
        else if (lastname.equals("")) {
            Toast.makeText(this, "Last name is empty !", Toast.LENGTH_SHORT).show();

        }
        else if (!male.isChecked() && !female.isChecked()){
            Toast.makeText(this, "Please choose the gender !", Toast.LENGTH_SHORT).show();
        }
        else if (password.length()<4){
            Toast.makeText(this, "Password should contain at-least 4 characters !", Toast.LENGTH_SHORT).show();

        }
        else if (!newmem.isChecked()){
            Toast.makeText(this, "Switch on to new member !", Toast.LENGTH_SHORT).show();
        }
        else if (!Agree.isChecked()){
            Toast.makeText(this, "Agree the terms and conditions", Toast.LENGTH_SHORT).show();
        }
        else{
            valid=true;
        }
        return valid;

    }
}
