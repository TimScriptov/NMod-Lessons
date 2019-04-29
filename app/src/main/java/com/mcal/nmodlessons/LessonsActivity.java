/*
 * Copyright (C) 2019 Тимашков Иван
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mcal.nmodlessons;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import com.mcal.nmodlessons.R;
import android.widget.*;
import android.graphics.*;
import android.media.*;
import android.content.*;
import android.view.*;

//##################################################################
/**
 * @since 1.03.2019
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class LessonsActivity extends Activity
//##################################################################
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lessons);
		
		Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/test.ttf");
		Button lesson1 = findViewById(R.id.lesson1);
		lesson1.setTypeface(createFromAsset);
		Button lesson2 = findViewById(R.id.lesson2);
		lesson2.setTypeface(createFromAsset);
		Button lesson3 = findViewById(R.id.lesson3);
		lesson3.setTypeface(createFromAsset);
		Button lesson4 = findViewById(R.id.lesson4);
		lesson4.setTypeface(createFromAsset);
		Button lesson5 = findViewById(R.id.lesson5);
		lesson5.setTypeface(createFromAsset);
		Button lesson6 = findViewById(R.id.lesson6);
		lesson6.setTypeface(createFromAsset);
		Button lesson7 = findViewById(R.id.lesson7);
		lesson7.setTypeface(createFromAsset);
		Button lesson8 = findViewById(R.id.lesson8);
		lesson8.setTypeface(createFromAsset);
	}
	
	public void lesson1(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons1.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	
	public void lesson2(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons2.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson3(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons3.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson4(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons4.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson5(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons5.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson6(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons6.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson7(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons7.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
	public void lesson8(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LessonsActivity.this, Lessons8.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
}
 
