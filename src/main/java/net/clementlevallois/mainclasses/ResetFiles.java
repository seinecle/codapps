/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.mainclasses;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author C. Levallois
 */
public class ResetFiles {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        System.out.println("deleting previous building docs of book");
        String bookRootFolder = args[0];
        System.out.println("going to delete content of: " + bookRootFolder);
        
        Files.walk(Paths.get(bookRootFolder))
                .map(Path::toFile)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .forEach(File::delete);
        
        Files.createDirectories(Paths.get(bookRootFolder));
        
        Path sourceImageFolder = Paths.get(args[1]+"\\src\\main\\asciidoc\\images");
        Path targetImageFolder = Paths.get(args[1]+"bookRootFolder\\images");
        Files.createDirectory(targetImageFolder);
        
        Files.copy(sourceImageFolder, targetImageFolder, StandardCopyOption .REPLACE_EXISTING);
        
    }
    
}
