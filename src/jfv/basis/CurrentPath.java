package jfv.basis;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentPath {
    public static void main(String[] args) {


        Path parentDir = Paths.get("..");
        System.out.println(parentDir);
        // the path that is used by the application for calculation of the relative path for files.
        try{
            String currentPath = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + currentPath);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
