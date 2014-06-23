package com.example.paypal.model;

import java.net.URI;

import android.location.Location;
import android.text.format.Time;

public class ImageItem {
	URI imageURI;
	String imageName;
	Time imageDate;
	
	/**
	 * Basic constructor with just image URI
	 * @param (URI) inImage Where the image can be found.
	 */
	public ImageItem (URI inImage) {
		imageURI = inImage;
		imageName = "";
		
	}
	
	/**
	 * Constructor with Image URI and Name
	 * @param (URI) inImage
	 * @param (String) inName
	 */
	public ImageItem(URI inImage, String inName) {
		this(inImage);
		imageName = inName;
	}
	
	/**
	 * Full Constructor of Image Item
	 * @param (URI) inImage
	 * @param (String) inName
	 * @param (Location) inLoc
	 * @param (Time) inTime
	 */
	public ImageItem(URI inImage, String inName, Time inTime) {
		this(inImage, inName);
		imageDate = inTime;
	}
	
	/**
	 * Sets the ImageURI or change it as needed.
	 * @param (URI) inImage
	 */
	public void setImageUri(URI inImage) {
		imageURI = inImage;
	}
	
	/**
	 * Gets the ImageURI 
	 * @return (URI) the URI for this image.
	 */
	public URI getImageUri() {
		return imageURI;
	}
	
	/**
	 * Sets the Image Name.  Use on the Image Display Window Title.
	 * @param (String) inName Image or Photo's Name.
	 */
	public void setImageName(String inName) {
		imageName = inName;
	}
	
	/**
	 * Gets the Image Name.
	 * @return (String) The Image Name
	 */
	public String getImageName() {
		return imageName;
	}
	
	/**
	 * Sets the Image Time stamp.  Used to get the time from Image
	 * @param (Time) inTime
	 */
	public void setImageTime(Time inTime) {
		imageDate = inTime;
	}
	
	/**
	 * Returns the Image Time for Image (Photo)
	 * @return (Time)
	 */
	public Time getImageTime() {
		return imageDate;
	}
}
