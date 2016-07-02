package com.LightTeam.syntaxhighlight;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

import com.LightTeam.syntaxhighlight.ui.LockableScrollView;

public class MainActivity extends Activity {
	
	private LockableScrollView scrollView;
	private EditText editTextSyn;
	
	private boolean zoomPinch = false;
	private float minimumTextSize;
    private float maximumTextSize;
    private float textSize;
    private float zoomPinchFactor;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		initContent();
    }
	
	public void initContent() {
		scrollView = (LockableScrollView) findViewById(R.id.scroll);
		editTextSyn = (EditText) findViewById(R.id.EditTextSYN);
		float density = getResources().getDisplayMetrics().scaledDensity;
        textSize = editTextSyn.getTextSize()/density;
        minimumTextSize = 9f;
        maximumTextSize = 22f;
		
		//Enable Touch Zoom
		setZoomable(true);
	}
	
	public void setZoomable(boolean zoomable) {
        if(zoomable) {
            scrollView.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent ev) {
                            return pinchZoom(ev);
                    }
                });
        } else {
            scrollView.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent ev) {
                        return false;
                    }
                });
        }
    }
	
	private void setTextSize() {
        editTextSyn.setTextSize(android.util.TypedValue.COMPLEX_UNIT_SP, textSize);
    }

    private void validateTextSize() {
        if(textSize < minimumTextSize)
            textSize = minimumTextSize;
        else if(textSize > maximumTextSize)
            textSize = maximumTextSize;
    }

    private static float getDistanceBetweenTouches(MotionEvent ev) {
        float xx = ev.getX(1)-ev.getX(0);
        float yy = ev.getY(1)-ev.getY(0);
		
        return (float)Math.sqrt(xx*xx+yy*yy);
    }

    private boolean pinchZoom(MotionEvent ev) {
        switch(ev.getAction()) {
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                editTextSyn.setOnLongClickListener(null);
                scrollView.setScrollingEnabled(true);
                zoomPinch = false;
                break;
            case MotionEvent.ACTION_MOVE:
                if(ev.getPointerCount() == 2) {
                    float d = getDistanceBetweenTouches(ev);
                    if(!zoomPinch) {
                        editTextSyn.setOnLongClickListener(
                            new View.OnLongClickListener(){
                                @Override
                                public boolean onLongClick(View v) {
                                    return true;
                                }
                            });
                        scrollView.setScrollingEnabled(false);
                        zoomPinchFactor = textSize/d;
                        zoomPinch = true;
                        break;
                    }
                    textSize = zoomPinchFactor*d;
                    validateTextSize();
                    setTextSize();
                }
                break;
        }
        return zoomPinch;
    }
}