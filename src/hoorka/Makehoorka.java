package hoorka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Makehoorka {

    String path;

    public Makehoorka(String path) {
        this.path = path;
    }

    public void makelist() {

    try {
        File f1 = new File(path); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
    }
    catch (Exception e){
            System.out.println("no file");
        }

    String s;
    Scanner myObj = new Scanner(System.in);
    String input = myObj.nextLine();  // Read user input

    int count=0;   //Intialize the word to zero

        while((s=br.readLine())!=null)   //Reading Content from the file
    {
        words=s.split(",");  //Split the word using space
        for (String word : words)
        {
            float i=Float.parseFloat(word);
            if (i < 1.31800 && i> 1.31900) {
                System.out.println(i);
            }
        }
    }
        if(count!=0)  //Check for count not equal to zero
    {
        System.out.println("A keresett szó "+count+ " alkalommal szerepel a szövegben");
    }
        else
    {
        System.out.println("A szó nem található a szövegben.");
    }
        fr.close();

}

}
