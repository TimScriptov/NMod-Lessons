package com.mcal.mcdesign.widget;

import android.widget.RelativeLayout;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

import com.mcal.mcdesign.utils.BitmapRepeater;
import com.mcal.nmodlessons.R;

public class MCDActionBarView extends RelativeLayout
{
	public MCDActionBarView(android.content.Context context)
	{
		super(context);
	}

    public MCDActionBarView(android.content.Context context, android.util.AttributeSet attrs)
	{
		super(context, attrs);
	}

    public MCDActionBarView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr)
	{
		super(context, attrs, defStyleAttr);
	}

    public MCDActionBarView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes)
	{
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		super.onSizeChanged(w, h, oldw, oldh);

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mcd_header_bg);  
		setBackgroundDrawable(new BitmapDrawable(BitmapRepeater.repeat(w, h, bitmap)));
	}
}
