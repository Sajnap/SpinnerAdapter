package com.example.spinneradapter;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerAdapter extends ArrayAdapter<UserModel>{
	UserModel[] usersList;
	Context myContext;

	public SpinnerAdapter(Context context,UserModel[] usersList){
		super(context, R.layout.spinner_list, usersList);
		this.usersList=usersList;
		this.myContext=context;
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		return getCustomView(position, convertView, parent);
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return getCustomView(position, convertView, parent);
	}


	private View getCustomView(final int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			LayoutInflater mLayoutInflater = LayoutInflater.from(myContext);
			convertView = mLayoutInflater.inflate(R.layout.spinner_list, parent, false);
		}

		TextView nameTextView = (TextView) convertView.findViewById(R.id.txtview_name);
		TextView emailTextView = (TextView) convertView.findViewById(R.id.txtview_email);
		TextView msgTextView=(TextView) convertView.findViewById(R.id.txtview_msg);

		nameTextView.setText(usersList[position].getName());
		emailTextView.setText(usersList[position].getEmail());
		msgTextView.setText(usersList[position].getMessage());

		convertView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(), "Clicked "+(position+1), Toast.LENGTH_SHORT).show(); 
			}
			
		});
		return convertView;
		
	}
	
	
}


