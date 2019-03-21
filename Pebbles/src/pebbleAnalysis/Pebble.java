package pebbleAnalysis;

public class Pebble {

	private double width;
	private double length;
	private double depth;
	
	public Pebble(double width, double length, double depth) {
		
		setWidth(width);
		setLength(length);
		setDepth(depth);
		
	}
	
	public static double sphericityIndex(Pebble P1) {
		
		double a;
		double b;
		double c;
		
		double width = P1.getWidth();
		double length = P1.getLength();
		double depth = P1.getDepth();
		
		boolean isWidthUsed = false;
		boolean isLengthUsed = false;
		boolean isDepthUsed = false;
		
		if (width <= length && width <= depth) {
		    c = width;
		    isWidthUsed = true;
		} else if (length <= depth && length <= width) {
		    c = length;
		    isLengthUsed = true;
		} else {
		    c = depth;
		    isDepthUsed = true;
		}
		
		if (width >= length && width >= depth) {
		    a = width;
		    isWidthUsed = true;
		} else if (length >= depth && length >= width) {
		    a = length;
		    isLengthUsed = true;
		} else {
		    a = depth;
		    isDepthUsed = true;
		}
		
		if (isWidthUsed == false) {
			b = width;
		} else if (isLengthUsed == false) {
			b = length;
		}else {
			b = depth;
		}
		
		double sphericity = Math.pow(((b*c)/Math.pow(a,2)),(0.3));
		
		return sphericity;
		
		
	}
	
	public static double meanSize(Pebble P1) {
		
		double width = P1.getWidth();
		double length = P1.getLength();
		double depth = P1.getDepth();
		
		
		double mSize = ((width * length * depth) / 3);
		return mSize;
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	
}
