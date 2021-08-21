package com.fa.bean;

import java.util.Arrays;

public class Marks {
	private int mark[];

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Marks [mark=" + Arrays.toString(mark) + "]";
	}
	
}
