package com.cherish.nigeriansenator.activites;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.widget.SearchView;

import com.cherish.nigeriansenator.R;
import com.cherish.nigeriansenator.adapter.SenatorAdapter;
import com.cherish.nigeriansenator.adapter.SenatorList;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SenatorAdapter senatorAdapter;
    SearchView searchView;
    ListView listView;
    ArrayList<SenatorList> senatorList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.your_layout);


        JSONObject senator1 = new JSONObject();
        try {
            senator1.put("first", "Sen.");
            senator1.put("middle", " T");
            senator1.put("second", ".Orji");
            senator1.put("email", "bdyaroe@gmail.com");
            senator1.put("state", "Abia");
            senator1.put("number", "08076547382");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator2 = new JSONObject();
        try {
            senator2.put("first", "Sen.");
            senator2.put("middle", " B");
            senator2.put("second", ".Yaroe");
            senator2.put("email", "bdyaroe@gmail.com");
            senator2.put("state", "Adamawa");
            senator2.put("number", "09087654637");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator3 = new JSONObject();
        try {
            senator3.put("first", "Sen.");
            senator3.put("middle", " I");
            senator3.put("second", ".Abbo");
            senator3.put("email", "faradigun@gmail.com");
            senator3.put("state", "Adamawa");
            senator3.put("number", "0807654327");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator4 = new JSONObject();
        try {
            senator4.put("first", "Sen.");
            senator4.put("middle", "A");
            senator4.put("second", ".Ahmed");
            senator4.put("email", "aishatu.ahmed@nav.gov.ng");
            senator4.put("state", "Adamawa");
            senator4.put("number", "0908765432");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator5 = new JSONObject();
        try {
            senator5.put("first", "Sen.");
            senator5.put("middle", " B");
            senator5.put("second", ".Akpan");
            senator5.put("email", "akpanalbert@hotmail.com");
            senator5.put("state", "AkwaIbom");
            senator5.put("number", "08134567896");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator6 = new JSONObject();
        try {
            senator6.put("first", "Sen.");
            senator6.put("middle", " A");
            senator6.put("second", ".Eyakenye");
            senator6.put("email", "kanssie@yahoo.com");
            senator6.put("state", "AkwaIbom");
            senator6.put("number", "07098765432");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator7 = new JSONObject();
        try {
            senator7.put("first", "Sen.");
            senator7.put("middle", " C");
            senator7.put("second", " .Ekpeyoung");
            senator7.put("email", "crisepegy@yahoo.com");
            senator7.put("state", "AkwaIbom");
            senator7.put("number", "09087650909");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator8 = new JSONObject();
        try {
            senator8.put("first", "Sen.");
            senator8.put("middle", " I");
            senator8.put("second", ".Ubah");
            senator8.put("email", "senatorifeanyiubah@gmail.com");
            senator8.put("state", "Anambra");
            senator8.put("number", "07067543287");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONObject senator9 = new JSONObject();
        try {
            senator9.put("first", "Sen.");
            senator9.put("middle", " E");
            senator9.put("second", ".Uche");
            senator9.put("email", "uekwunife@yahoo.com");
            senator9.put("state", "Anambra");
            senator9.put("number", "08078654326");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject senator10 = new JSONObject();
        try {
            senator10.put("first", "Sen.");
            senator10.put("middle", " A");
            senator10.put("second", ".Oduah");
            senator10.put("email", "senatorstella@gmail.com");
            senator10.put("state", "Anambra");
            senator10.put("number", "0908765432");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        final JSONArray array = new JSONArray();
        array.put(senator1);
        array.put(senator2);
        array.put(senator3);
        array.put(senator4);
        array.put(senator5);
        array.put(senator6);
        array.put(senator7);
        array.put(senator8);
        array.put(senator9);
        array.put(senator10);
        array.put(senator6);
        array.put(senator8);
        array.put(senator4);
        array.put(senator7);
        array.put(senator4);
        array.put(senator3);
        array.put(senator4);
        array.put(senator2);
        array.put(senator1);


        for (int i = 0; i < array.length(); i++) {

            try {
                Log.i("message", array.toString());

                JSONObject object = array.getJSONObject(i);
                String first = object.getString("first");
                String middle = object.getString("middle");
                String second = object.getString("second");
                String state = object.getString("state");
                String gmail = object.getString("email");
                String number = object.getString("number");


                senatorList.add(new SenatorList(first, middle, second, gmail, state, number));


            } catch (Exception e) {
                e.printStackTrace();

            }
        }

        senatorAdapter = new SenatorAdapter(MainActivity.this, senatorList);
        listView.setAdapter(senatorAdapter);

        listView.setTextFilterEnabled(true);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
                String second = ((TextView) view.findViewById(R.id.second)).getText().toString();
                String first = ((TextView) view.findViewById(R.id.first)).getText().toString();
                String middle = ((TextView) view.findViewById(R.id.middle)).getText().toString();
                String gmail = ((TextView) view.findViewById(R.id.gmail)).getText().toString();
                final String number = ((TextView) view.findViewById(R.id.number)).getText().toString();
//                Log.i("info", number);

                BottomSheetDialog bottomSheet = new BottomSheetDialog(MainActivity.this);
                View bottomView = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
                TextView secondName = bottomView.findViewById(R.id.second);
                TextView firstName = bottomView.findViewById(R.id.firstname);
                TextView middleName = bottomView.findViewById(R.id.middle);
                TextView email = bottomView.findViewById(R.id.gmail);
                final TextView phoneNumber = bottomView.findViewById(R.id.number);
                final ImageView call = bottomView.findViewById(R.id.call);
                final ImageView mail = bottomView.findViewById(R.id.mail);

                secondName.setText(second);
                firstName.setText(first);
                middleName.setText(middle);
                email.setText(gmail);
                phoneNumber.setText(number);
                bottomSheet.setContentView(bottomView);
                bottomSheet.show();


                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{
                            Intent calling = new Intent(Intent.ACTION_DIAL);
                            calling.setData(Uri.parse("tel:"+number));
                            startActivity(calling);

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                });


                mail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{
                            Log.i("mailling","you have just sent a message" );
                            Intent mailing = new Intent(Intent.ACTION_VIEW);
                            mailing.setData(Uri.parse("sms:"+number));
                            startActivity(mailing);

                        }catch (Exception e){
                            e.printStackTrace();
                        }


                    }
                });



            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        MenuItem searchItem = menu.findItem(R.id.listView);
        searchView = (SearchView)menu.findItem(R.id.search).getActionView();
        searchView.setQueryHint("Search");
//        searchView.setIconifiedByDefault(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                if (TextUtils.isEmpty(newText)) {
//                    listView.clearTextFilter();
//                } else {
//                    listView.setFilterText(newText);
//                }

                senatorAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }



}
