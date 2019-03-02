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
import android.webkit.WebView;
import android.webkit.WebViewClient;

//##################################################################
/**
 * @since 1.03.2019
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class LibraryActivity extends Activity
//##################################################################
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
		
		Button libraryColorBtn = findViewById(R.id.libraryColor);
		Button libraryTextureNameBtn = findViewById(R.id.libraryTextureName);
		Button libraryIDBtn = findViewById(R.id.libraryID);
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/test.ttf");
		libraryColorBtn.setTypeface(createFromAsset);
		libraryTextureNameBtn.setTypeface(createFromAsset);
		libraryIDBtn.setTypeface(createFromAsset);
    }

	public void libraryColorBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LibraryActivity.this, ColorsActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }

	public void libraryTextureNameBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LibraryActivity.this, TextureNameActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }

	public void libraryIDBtn(View view)
	{
        MediaPlayer.create(this, R.raw.click).start();
        try
		{
            Intent int1= new Intent(LibraryActivity.this, IDActivity.class);
			startActivity(int1);
        }
		catch (Throwable e)
		{
        }
    }
}
