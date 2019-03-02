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

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Toast;
import android.widget.Button;
import android.graphics.Typeface;
import android.content.Intent;

//##################################################################
/**
 * @since 1.03.2019
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class MainActivity extends Activity
//##################################################################
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button nModAPIDocumentationBtn = findViewById(R.id.nModAPIDocumentation);
		Button lessonsNModBtn = findViewById(R.id.lessonsNMod);
		Button libraryNModBtn = findViewById(R.id.libraryNMod);
		Button openAideBtn = findViewById(R.id.openAide);
        Button openModdedPEBtn = findViewById(R.id.openModdedPE);
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/test.ttf");
		nModAPIDocumentationBtn.setTypeface(createFromAsset);
		lessonsNModBtn.setTypeface(createFromAsset);
		libraryNModBtn.setTypeface(createFromAsset);
		openAideBtn.setTypeface(createFromAsset);
		openModdedPEBtn.setTypeface(createFromAsset);
    }

	public void nModAPIDocumentationBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(MainActivity.this, DocumentationActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }

	public void lessonsNModBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(MainActivity.this, LessonsActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }

	public void libraryNModBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(MainActivity.this, LibraryActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }

	public void openAide(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            startActivity(getPackageManager().getLaunchIntentForPackage("com.aide.ui"));
        }
		catch (Exception e)
		{
            Toast.makeText(getApplicationContext(), "AIDE не установлен на устройстве.", 1).show();
        }
    }

	public void openModdedPE(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            startActivity(getPackageManager().getLaunchIntentForPackage("com.mcal.mcpelauncher"));
        }
		catch (Exception e)
		{
            Toast.makeText(getApplicationContext(), "ModdedPE не установлен на устройстве.", 1).show();
        }
    }

}
