package jtux;

/**
	Class for exit status as returned by wait system calls.
	<p>
	Need to augment with native functions to break down returned value.
	What we have is OK for now.
*/
public class UExitStatus {
	private int status;

	public UExitStatus() {
		status = 0;
	}
	public void set(int s) {
		status = s;
	}
	public int get() {
		return status;
	}
	public int toInt() {
		return status;
	}
}
