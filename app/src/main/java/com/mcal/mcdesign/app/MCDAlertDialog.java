package com.mcal.mcdesign.app;

public class MCDAlertDialog extends android.support.v7.app.AlertDialog
{
	protected MCDAlertDialog(android.content.Context context)
	{
		super(context, android.R.style.Theme_Translucent);
	}

	public static class Builder extends android.support.v7.app.AlertDialog.Builder
	{
		public Builder(android.content.Context context) 
		{
			super(context);
		}

        public Builder(android.content.Context context, int themeResId)
		{
			super(context, themeResId);
		}
	}
}
