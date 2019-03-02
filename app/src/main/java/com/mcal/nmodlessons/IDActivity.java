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
import android.webkit.WebView;
import android.webkit.WebViewClient;

//##################################################################
/**
 * @since 1.03.2019
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class IDActivity extends Activity
//##################################################################
{
	private WebView mWebView;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
		
		mWebView = findViewById(R.id.webView);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.setWebViewClient(new MyWebViewClient());
		mWebView.loadUrl("file:///android_asset/pages/id.html");
    }
	
	private class MyWebViewClient extends WebViewClient
	{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
		}
	}

	@Override
	public void onBackPressed()
	{
		if (mWebView.canGoBack())
		{
			mWebView.goBack();
		}
		else
		{
			super.onBackPressed();
		}
	}
}
 
