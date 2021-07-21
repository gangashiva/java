package com.sync.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Set;

public class PathManip {

	//String _filePath ="/Users/gmum0001/Desktop/shiva/Test/Test/src/com/sync/test/data.txt";
	static String _filePath="/b";
	public static void main(String[] args) throws FileNotFoundException {
		PathManip pathManip = new PathManip();
		//pathManip.getInputStream();
		System.out.println("Result: "+pathManip.cleanString(_filePath));
		//System.out.println("Result2: "+FilenameUtils.normalize(_filePath));

	}
	
	public InputStream getInputStream() throws FileNotFoundException {
		System.out.println("_filePath: "+_filePath);
        if (!isInSecureDir(Paths.get(_filePath))){
            throw new IllegalArgumentException();
        }
        return new FileInputStream(_filePath);
    }

    public static boolean isInSecureDir(Path file) {
    	System.out.println("isInSecureDirL: "+file);
        return isInSecureDir(file, null);
    }

    public static boolean isInSecureDir(Path file, UserPrincipal user) {
    	System.out.println("isInSecureDirL: "+file+" , "+user);
        return isInSecureDir(file, user, 5);
    }

    /**
     * Indicates whether file lives in a secure directory relative
     * to the program's user
     * @param file Path to test
     * @param user User to test. If null, defaults to current user
     * @param symlinkDepth Number of symbolic links allowed
     * @return true if file's directory is secure.
     */
    public static boolean isInSecureDir(Path file, UserPrincipal user, int symlinkDepth) {
        if (!file.isAbsolute()) {
            file = file.toAbsolutePath();
        }
        if (symlinkDepth <=0){
            // Too many levels of symbolic links
            return false;
        }
        // Get UserPrincipal for specified user and superuser
        FileSystem fileSystem = Paths.get(file.getRoot().toString()).getFileSystem();
        UserPrincipalLookupService upls = fileSystem.getUserPrincipalLookupService();
        UserPrincipal root = null;
        try {
            root = upls.lookupPrincipalByName("root");
            if (user == null){
                user = upls.lookupPrincipalByName(System.getProperty("user.name"));
            }
            if(root == null || user == null){
                return false;
            }
        } catch (IOException e) {
            return  false;
        }
        // If any parent dirs (from root on down) are not secure,
        // dir is not secure

        for (int i = 0; i <= file.getNameCount(); i++){
        	Path partialPath = Paths.get(file.getRoot().toString(),file.subpath(0,i).toString());
            try {
                if (Files.isSymbolicLink(partialPath)) {
                    if (!isInSecureDir(Files.readSymbolicLink(partialPath), user, symlinkDepth - 1)) {
                        // Symbolic link, linked-to dir not secure
                        return false;
                    }
                } else {
                    UserPrincipal owner = Files.getOwner(partialPath);
                    if (!user.equals(owner) && !root.equals(owner)) {
                        // dir owned by someone else, not secure
                        return false;
                    }
                    PosixFileAttributes attr = Files.readAttributes(partialPath, PosixFileAttributes.class);
                    Set<PosixFilePermission> perms = attr.permissions();
                    if (perms.contains(PosixFilePermission.GROUP_WRITE) ||
                        perms.contains(PosixFilePermission.OTHERS_WRITE)) {
                        // Someone else can write files, not secure
                        return false;
                    }
                }
            } catch (IOException x) {
                return false;
            }
        }

        return true;
        }
    
    private static String cleanString(String aString) {
        if (aString == null) return null;
        String cleanString = "";
        for (int i = 0; i < aString.length(); ++i) {
            cleanString += cleanChar(aString.charAt(i));
        }
        return cleanString;
    }


        private static char cleanChar(char aChar) {

            // 0 - 9
            for (int i = 48; i < 58; ++i) {
                if (aChar == i) return (char) i;
                System.out.println("0-9:"+(char) i);
            }

            // 'A' - 'Z'
            for (int i = 65; i < 91; ++i) {
                if (aChar == i) return (char) i;
                System.out.println("A-Z: "+(char) i);
                
            }

            // 'a' - 'z'
            for (int i = 97; i < 123; ++i) {
                if (aChar == i) return (char) i;
                System.out.println("a-z: "+(char) i);
            }

            // other valid characters
            switch (aChar) {
                case '/':
                    return '/';
                case '.':
                    return '.';
                case '-':
                    return '-';
                case '_':
                    return '_';
                case ' ':
                    return ' ';
            }
            return '%';
        }

}
