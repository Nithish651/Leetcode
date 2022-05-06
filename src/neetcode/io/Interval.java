package neetcode.io;

import java.util.Objects;

public class Interval {
	 @Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}

	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int hashCode() {
		return Objects.hash(end, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interval other = (Interval) obj;
		return start == other.start;
	}
}
