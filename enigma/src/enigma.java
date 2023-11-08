import java.util.*;

public class enigma {

    static String message = "PQSACVVTOISXFXCIAMQEM";

    static ArrayList<Integer> position = new ArrayList<Integer>();
    static String caesartext = "";
    static String textlits = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String rotor1 = "BDFHJLCPRTXVZNYEIWGAKMUSQO", rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE",rotor3 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String operation = "DECODE";
        

        int pseudoRandomNumber = 9;

        /*
          for (int i = 0; i < 3; i++) {
          String rotor = "";
          
          switch (i) {
          case 0:
          
          rotor1 = rotor;
          break;
          
          case 1:
          rotor2 = rotor;
          break;
          
          case 2:
          rotor3 = rotor;
          break;
          
         }
         }
         */
        if (operation.equals("ENCODE")) {
                for (int i = 0; i < message.length(); i++) {
                int temp = Character.valueOf(message.charAt(i));
                temp += pseudoRandomNumber + i;
                while (temp > 90) {
                    temp -= 26;              
                }
                sb.append((char) temp);
            }
            caesartext = sb.toString();
            rotorcoding(rotor1);
            rotorcoding(rotor2);
            rotorcoding(rotor3);           
        } else if (operation.equals("DECODE")) {
            caesartext = message;
            decoding(rotor3);
            decoding(rotor2);
            decoding(rotor1);
            for (int i = 0; i < message.length(); i++) {
                int temp = Character.valueOf(caesartext.charAt(i));
                temp -= pseudoRandomNumber + i;
                while (temp < 65) {
                    temp += 26;           
                }
                sb.append((char) temp);
            }
            caesartext = sb.toString();
            System.out.println(caesartext);
         }
    }
    static void rotorcoding(String a) {
        for (int i = 0; i < caesartext.length(); i++) {
            for (int j = 0; j < textlits.length(); j++) {
                if (caesartext.charAt(i) == textlits.charAt(j)) {
                    position.add(j);
                    break;                
                }            
            }     
        }
            caesartext = "";
         for (int i = 0; i < position.size(); i++) {
            int temp2 = position.get(i);
                char temp = a.charAt(temp2);
            caesartext += temp;
        }
        position.clear();
        System.err.println(caesartext);
    }
    static void decoding(String a) {
        for (int i = 0; i < caesartext.length(); i++) {
            for (int j = 0; j < textlits.length(); j++) {
                if (caesartext.charAt(i) == a.charAt(j)) {
                    position.add(j);
                    break;
                }
            }
        }
        caesartext = "";
        for (int i = 0; i < position.size(); i++) {
            int temp2 = position.get(i);
            char temp = textlits.charAt(temp2);
            caesartext += temp;
        }
        position.clear();
        System.err.println(caesartext);
    }
    }