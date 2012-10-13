jtux
====

Patched version of jtux library, originally available at http://basepath.com/aup/jtux/index.htm

This includes the infamous `jtux.PS3-YDL6.1.patch.txt` patch file, and has also been patched to work
on Raspberry Pi.

You will probably have to change the first line of the `Makefile` to work on other systems.
To find the right value to change it to, after you have installed a Java SDK (openjdk, for example), do
`find /usr -name "jni.h"` to find the name of the directory. (But don't include the `jni.h` file
when you change the line of the `Makefile`.)

Installing on Raspberry Pi
--------------------------

Assuming you are running the latest Debian Wheezy, just do the following.

Download and extract the source of this repo.

<pre>
sudo apt-get install libjna-java openjdk-6-jdk patch make gcc
cd jtux
make
</pre>

(If you are using this in CrashPlan, then copy the new `libjtux.so` into `/usr/local/crashplan/`.

License
-------

This code was all originally written by Marc J. Rochkind, and patched by someone.

It is licensed under the BSD license. http://basepath.com/aup/copyright.htm
