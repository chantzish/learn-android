package com.chan.todolist;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ToDoList extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView myListView = (ListView)findViewById(R.id.myListView);
        final EditText myEditText = (EditText)findViewById(R.id.myEditText);
        final Button myButton = (Button)findViewById(R.id.myButton);
        final ArrayList<String> toDoItems = new ArrayList<String>();
        final ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,toDoItems);
        myListView.setAdapter(aa);
        myButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				toDoItems.add(0, myEditText.getText().toString());
				aa.notifyDataSetChanged();
				myEditText.setText("");
			}
		});
    }
}