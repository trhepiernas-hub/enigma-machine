import java.util.*;

public class enigma {

    static String message = "AAA";

    static ArrayList<Integer> position = new ArrayList<Integer>();
    static String caesartext = "";
    static String textlits = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String rotor1 = "BDFHJLCPRTXVZNYEIWGAKMUSQO", rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE",rotor3 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String operation = "ENCODE";
        

        int pseudoRandomNumber = 4;

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

            rotorcoding1();
            rotorcoding2();
            rotorcoding3();
            
        } else if (operation.equals("DECODE")) {

            decoding1();
            decoding2();
            decoding3();

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
    

    static void rotorcoding1(){

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
                char temp = rotor1.charAt(temp2);
            caesartext += temp;

        }
        position.clear();

        System.err.println(caesartext);
        
    }

    static void rotorcoding2() {

        for (int i = 0; i < caesartext.length(); i++) {

            for (int j = 0; j < rotor1.length(); j++) {

                if (caesartext.charAt(i) == textlits.charAt(j)) {

                    position.add(j);
                    break;

                }

            }

        }
        caesartext = "";
        for (int i = 0; i < position.size(); i++) {

            int temp2 = position.get(i);
            char temp = rotor2.charAt(temp2);
            caesartext += temp;

        }
        position.clear();

        System.err.println(caesartext);
    }

    static void rotorcoding3() {

        for (int i = 0; i < caesartext.length(); i++) {

            for (int j = 0; j < rotor2.length(); j++) {

                if (caesartext.charAt(i) == textlits.charAt(j)) {

                    position.add(j);
                    break;

                }

            }

        }
        caesartext = "";
        for (int i = 0; i < position.size(); i++) {

            int temp2 = position.get(i);
            char temp = rotor3.charAt(temp2);
            caesartext += temp;

        }
        position.clear();

        System.err.println(caesartext);
        System.out.println(caesartext);
    }

    static void decoding1() {

        for (int i = 0; i < message.length(); i++) {

            for (int j = 0; j < textlits.length(); j++) {

                if (message.charAt(i) == rotor3.charAt(j)) {

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

    static void decoding2() {

        for (int i = 0; i < caesartext.length(); i++) {

            for (int j = 0; j < textlits.length(); j++) {

                if (caesartext.charAt(i) == rotor2.charAt(j)) {

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

    static void decoding3() {

        for (int i = 0; i < caesartext.length(); i++) {

            for (int j = 0; j < textlits.length(); j++) {

                if (caesartext.charAt(i) == rotor1.charAt(j)) {

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