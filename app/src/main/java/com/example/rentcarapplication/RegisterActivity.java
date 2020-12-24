package com.example.rentcarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.adedom.library.Dru;
import com.adedom.library.ExecuteUpdate;

public class RegisterActivity extends AppCompatActivity {

    private EditText mEdtnaem;
    private EditText mEdtsubname;
    private EditText mEdtusername;
    private EditText mEdtpassword;
    private EditText mEdtrepassword;
    private EditText mEdtemail;
    private EditText mEdttel;
    private EditText mEdthousenumber;
    private EditText mEdtprovince;
    private EditText mEdtdistrict;
    private EditText mEdtsubdistrict;
    private EditText mEdtpostalcode;
    private Button mBtnconfirm;
    private Button mBtncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEdtnaem = (EditText) findViewById(R.id.edt_name);
        mEdtsubname = (EditText) findViewById(R.id.edt_subname);
        mEdtusername = (EditText) findViewById(R.id.edt_username);
        mEdtpassword = (EditText) findViewById(R.id.edt_password);
        mEdtrepassword = (EditText) findViewById(R.id.edt_repassword);
        mEdtemail = (EditText) findViewById(R.id.edt_email);
        mEdttel = (EditText) findViewById(R.id.edt_tel);
        mEdthousenumber = (EditText) findViewById(R.id.edt_housenumber);
        mEdtprovince = (EditText) findViewById(R.id.edt_province);
        mEdtdistrict = (EditText) findViewById(R.id.edt_district);
        mEdtsubdistrict = (EditText) findViewById(R.id.edt_subdistrict);
        mEdtpostalcode = (EditText) findViewById(R.id.edt_postalcode);
        mBtnconfirm = (Button) findViewById(R.id.btn_confirm);
        mBtncancel = (Button) findViewById(R.id.btn_cancel);

        mBtnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEdtnaem.getText().toString().trim();
                String surname = mEdtsubname.getText().toString().trim();
                String username = mEdtusername.getText().toString().trim();
                String password = mEdtpassword.getText().toString().trim();
                String email = mEdtemail.getText().toString().trim();
                String tel = mEdttel.getText().toString().trim();
                String housenumber = mEdthousenumber.getText().toString().trim();
                String province = mEdtprovince.getText().toString().trim();
                String district = mEdtdistrict.getText().toString().trim();
                String subdistrict = mEdtsubdistrict.getText().toString().trim();
                String postalcode = mEdtpostalcode.getText().toString().trim();

                String sql = "INSERT INTO heroku_0d3a793228ba934.customer (`Name`, `SurName`, `UserName`, `Password`, `Email`, `Tel`, `Housenumber`, `Province`, `District`, `Subdistrict`, `Postalcode`)\n" +
                        "VALUES ('" + name + "','" + surname + "','" + username + "','" + password + "','" + email + "','" + tel + "','" + housenumber + "','" + province + "','" + district + "','" + subdistrict + "','" + postalcode + "');";
                Dru.connection(ConnectDB.getConnection())
                        .execute(sql)
                        .commit(new ExecuteUpdate() {
                            @Override
                            public void onComplete() {
                                mEdtnaem.setText("");
                                mEdtsubname.setText("");
                                mEdtusername.setText("");
                                mEdtpassword.setText("");
                                mEdtemail.setText("");
                                mEdttel.setText("");
                                mEdthousenumber.setText("");
                                mEdtprovince.setText("");
                                mEdtdistrict.setText("");
                                mEdtsubdistrict.setText("");
                                mEdtpostalcode.setText("");

                                Toast.makeText(getBaseContext(),"Successful",Toast.LENGTH_SHORT).show();

                            }
                        });
            }
        });


//        INSERT INTO heroku_0d3a793228ba934.customer (`Name`, `SurName`, `UserName`, `Password`, `Email`, `Tel`, `Housenumber`, `Province`, `District`, `Subdistrict`, `Postalcode`)
//        VALUES ('pawinee','patthum','yunjapan','1234','yun@gmail.com','0628870809','496/705 M.5','Praksa','Praksa','Praksa','10280');
    }
}