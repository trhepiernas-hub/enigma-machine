# enigma-machine
## This puzzle is maded in codingames.com

# DECLARACIÓN

## OBJETIVO
Durante la Segunda Guerra Mundial, los alemanes usaban un código de cifrado llamado Enigma, que básicamente era una máquina de cifrado que cifraba mensajes para su transmisión. El código Enigma estuvo muchos años sin romperse. Así es como funciona la máquina básica:

Primero se aplica un desplazamiento de César usando un número incremental:
Si la cadena es AAA y el número de inicio es 4, entonces la salida será EFG.
A + 4 = E
A + 4 + 1 = F
A + 4 + 1 + 1 = G

Ahora se mapea EFG al primer ROTOR de esta manera:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
BDFHJLCPRTXVZNYEIWGAKMUSQO
Entonces, EFG se convierte en JLC. Luego se pasa por 2 rotores más para obtener el valor final.

Si el segundo ROTOR es AJDKSIRUXBLHWTMCQGZNPYFVOE, aplicamos el paso de sustitución nuevamente así:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
AJDKSIRUXBLHWTMCQGZNPYFVOE
Entonces, JLC se convierte en BHD.

Si el tercer ROTOR es EKMFLGDQVZNTOWYHXUSPAIBRCJ, entonces la sustitución final es:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
EKMFLGDQVZNTOWYHXUSPAIBRCJ
Entonces, BHD se convierte en KQF.

La salida final se envía a través de un transmisor de radio.
