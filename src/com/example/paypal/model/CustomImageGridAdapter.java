package com.example.paypal.model;

import java.util.ArrayList;

import com.example.paypalexample.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomImageGridAdapter extends BaseAdapter {
	ArrayList<ImageItem> myItems;
	Context context;
	
	public CustomImageGridAdapter(Context context, ArrayList<ImageItem> items) {
		this.context = context;
		myItems = items;
	}

	@Override
	public int getCount() {
		return myItems.size();
	}

	@Override
	public Object getItem(int position) {
		return myItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View gridView;
		
		if (convertView == null) {
			gridView = inflater.inflate(R.layout.image_grid_item, null);
			
			ImageView myImage = (ImageView) gridView.findViewById(R.id.image_grid_item);
			
			// bimatp factory
			BitmapFactory.Options options = new BitmapFactory.Options();

			// downsizing image as it throws OutOfMemory Exception for larger images
			options.inSampleSize = 8;
			final Bitmap bitmap = BitmapFactory.decodeFile(myItems.get(position).getImageUri().getPath(),
					options);

			myImage.setImageBitmap(bitmap);
		} else {
			gridView = (View) convertView;
		}
		return gridView;
	}

}
