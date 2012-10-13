package jtux;

/**
	Class for directory system calls.
*/
public class UDir {
	static {
		System.loadLibrary("jtux");
	}

	/**
		Java version of C struct dirent.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#struct_dirent">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static class s_dirent {
					/** i-number */
		public int d_ino;
					/** name */
		public String d_name;
	}

	/**
		Calls closedir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#closedir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static void closedir(long dirp) throws UErrorException;
	/**
		Calls mkdir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#mkdir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static void mkdir(String path, int mode) throws UErrorException;
	/**
		Calls opendir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#opendir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static long opendir(String path) throws UErrorException;
	/**
		Calls readdir_r. Uses passes buffer in to C function and creates a new object to be
		returned on each call.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#readdir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static s_dirent readdir(long dirp) throws UErrorException;
	/**
		Calls rewinddir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#rewinddir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static void rewinddir(long dirp) throws UErrorException;
	/**
		Calls rmdir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#rmdir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static void rmdir(String path) throws UErrorException;
	/**
		Calls seekdir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#seekdir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static void seekdir(long dirp, long loc) throws UErrorException;
	/**
		Calls telldir.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#telldir">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public native static long telldir(long dirp) throws UErrorException;
}
