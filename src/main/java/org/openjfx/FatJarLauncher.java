package org.openjfx;

public class FatJarLauncher {

    // Shade, Assembly, and other plugins mess with the jar structure and ... threads?
    // We require this little shim
    // https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing

    public static void main(String[] args) {
        SuncorpAusOfxFix.main(args);
    }

}
