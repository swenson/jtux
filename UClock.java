package jtux;

public class UClock {
	static {
		System.loadLibrary("jtux");
	}

	/**
		Calls alarm.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#alarm">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native int alarm(int secs);
	/**
		Calls nanosleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#nanosleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native void nanosleep(UProcess.s_timespec nsecs, UProcess.s_timespec remain) throws UErrorException;
	/**
		Calls sleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#sleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native int sleep(int secs);
	/**
		Calls usleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#usleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native void usleep(int usecs) throws UErrorException;
}
