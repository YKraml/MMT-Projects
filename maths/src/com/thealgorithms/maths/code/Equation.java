package com.thealgorithms.maths.code;

import java.util.Objects;

public class Equation {
	public final int a;
	public final int b;
	public final int c;

	public Equation(int c, int b, int a) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equation other = (Equation) obj;
		return a == other.a && b == other.b && c == other.c;
	}

	public int a() {
		return a;
	}

	public int b() {
		return b;
	}

	public int c() {
		return c;
	}
	
	
	

}
