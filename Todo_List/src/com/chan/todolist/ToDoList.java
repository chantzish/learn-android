package com.chan.todolist;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ToDoList extends Activity {
	EditText myEditText;
	ArrayList<String> toDoItems;
	ArrayAdapter<String> aa;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView myListView = (ListView)findViewById(R.id.myListView);
        myEditText = (EditText)findViewById(R.id.myEditText);
        //Button myButton = (Button)findViewById(R.id.myButton);
        toDoItems = new ArrayList<String>();
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,toDoItems);
        myListView.setAdapter(aa);
    }
	public void onClick(View v) {
		toDoItems.add(0, myEditText.getText().toString());
		aa.notifyDataSetChanged();
		myEditText.setText("");
	}
}