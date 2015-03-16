package com.example.spinneradapter;

import com.example.spinneradapter.R;
import com.example.spinneradapter.SpinnerAdapter;
import com.example.spinneradapter.UserModel;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner mySpinner=(Spinner) findViewById(R.id.spinner1);
		SpinnerAdapter myUserAdapter=new SpinnerAdapter(getApplicationContext(),createDummyUserModels());

		mySpinner.setAdapter(myUserAdapter);

	}
	public UserModel[] createDummyUserModels(){
		String[] names={"Sajna","Sree Roopa","Haritha","Adarsh","Ribu","Praveen","Anand","Senthil","Vipin","Sajna","Sree Roopa","Haritha","Adarsh","Haritha","Adarsh","Ribu","Praveen","Anand"};
		String[] emails={"sajnap81@gmail.com","sree@gmail.com","haritha@gmail.com","adarsh@gmail.com","ribu1@gmail.com","praveen@gmail.com","sanand@gmail.com","senthil@gmail.com","vipin@gmail.com","sajnap81@gmail.com","sree@gmail.com","haritha@gmail.com","adarsh@gmail.com","haritha@gmail.com","adarsh@gmail.com","ribu1@gmail.com","praveen@gmail.com","sanand@gmail.com"};
		String[] messages={"haiii","helloo","yupp","hehe","helloo","yupp","hehe","helloo","yupp","hehe","helloo","yupp","hehe","helloo","yupp","hehe","helloo","yupp"};
		UserModel[] userlist=new UserModel[names.length];
		for (int i = 0; i < emails.length; i++) {
			userlist[i]=new UserModel(names[i],emails[i],messages[i]);
		}
		return userlist;
	}



}
