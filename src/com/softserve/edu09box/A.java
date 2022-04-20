package com.softserve.edu09box;

import java.io.Serializable;

//public class A implements Serializable {
public class A {
    
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "A [getClass()=" + getClass()
			+ ", hashCode()=" + hashCode()
			+ ", toString()" + "]";
	}

}