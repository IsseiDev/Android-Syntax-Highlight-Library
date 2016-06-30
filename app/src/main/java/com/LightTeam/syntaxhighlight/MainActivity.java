package com.LightTeam.syntaxhighlight;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	private LockableScrollView scrollView;
	private EditText editTextSyn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		initContent();
    }
	
	public void initContent() {
		editTextSyn = (EditText) findViewById(R.id.EditTextSYN);
	}
}
