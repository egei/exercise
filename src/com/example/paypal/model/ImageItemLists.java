package com.example.paypal.model;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;

import android.text.format.Time;

public class ImageItemLists {
	ArrayList<ImageItem> myItems;
	
	/**
	 * Constructor: Just creates new empty ArrayList
	 */
	public ImageItemLists() {
		myItems = new ArrayList<ImageItem>();
	}
	
	/**
	 * Add files based off of root Directory.
	 * @param (File) source
	 */
	public void addImages(File source) {
		File[] myFiles = source.listFiles();
		if (myFiles != null) {
			for (File imageFile: myFiles) {
				if (imageFile.isDirectory()) {
					addImages(imageFile);
				} else {
					String fileName = imageFile.getName();
					if (fileName.endsWith("png")) {
						URI fileURI = imageFile.toURI();
						Time fileCreateTime = new Time();
						fileCreateTime.set(imageFile.lastModified());
						myItems.add(new ImageItem(fileURI, fileName, fileCreateTime));
					} else if (fileName.endsWith("jpg")) {
						URI fileURI = imageFile.toURI();
						Time fileCreateTime = new Time();
						fileCreateTime.set(imageFile.lastModified());
						myItems.add(new ImageItem(fileURI, fileName, fileCreateTime));
					} else if (fileName.endsWith("jpeg")) {
						URI fileURI = imageFile.toURI();
						Time fileCreateTime = new Time();
						fileCreateTime.set(imageFile.lastModified());
						myItems.add(new ImageItem(fileURI, fileName, fileCreateTime));
					}
				}
			}
		}
	}
	
	/**
	 * Gets the whole List of Items
	 * @return ArrayList<ImageItem>
	 */
	public ArrayList<ImageItem> getItemsList() {
		return myItems;
	}
	
	/**
	 * Gets the ImageItem located at.
	 * @param (int) position The Position of the Image Item you want
	 * @return (ImageItem)
	 */
	public ImageItem getItem(int position) {
		return myItems.get(position);
	}
}
