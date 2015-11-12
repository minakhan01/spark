// color swirl! connect an RGB LED to the PWM pins as indicated
// in the #defines
// public domain, enjoy!

#include <Bridge.h>
#include <HttpClient.h>
 
#define REDPIN 5
#define GREENPIN 6
#define BLUEPIN 3
 
#define FADESPEED 5     // make this higher to slow down
#define DELAY_CURL 1000
 
void setup() {
  pinMode(REDPIN, OUTPUT);
  pinMode(GREENPIN, OUTPUT);
  pinMode(BLUEPIN, OUTPUT);
  Bridge.begin();   // Initialize the Bridge
  Serial.begin(9600);
}
 
void loop() {
  int r, g, b;
  char picture_bit = '0';
  char off_bit = '0';
  Process p;
  p.runShellCommand("curl -k 'https://confidence-mirror.firebaseio.com/take-a-picture.json'");

  while (p.available()>0) {
      char c = p.read();
      picture_bit = c;
      Serial.print(c);
    }
  Serial.flush();

//  delay(5000);
  Serial.println("Hello");
  Serial.print("Picture bit: "); Serial.println(picture_bit);
  if (picture_bit ==off_bit)
  {
    Serial.println("True bit equals :)");
    analogWrite(REDPIN, 0);
    analogWrite(BLUEPIN, 0);
    analogWrite(GREENPIN, 0);
  }
  else
  {
    // fade from blue to violet
    for (r = 0; r < 256; r++) { 
      analogWrite(REDPIN, r);
      delay(FADESPEED);
    } 
    // fade from violet to red
    for (b = 255; b > 0; b--) { 
      analogWrite(BLUEPIN, b);
      delay(FADESPEED);
    } 
    // fade from red to yellow
    for (g = 0; g < 256; g++) { 
      analogWrite(GREENPIN, g);
      delay(FADESPEED);
    } 
    // fade from yellow to green
    for (r = 255; r > 0; r--) { 
      analogWrite(REDPIN, r);
      delay(FADESPEED);
    } 
    // fade from green to teal
    for (b = 0; b < 256; b++) { 
      analogWrite(BLUEPIN, b);
      delay(FADESPEED);
    } 
    // fade from teal to blue
    for (g = 255; g > 0; g--) { 
      analogWrite(GREENPIN, g);
      delay(FADESPEED);
    } 
  }
  delay(DELAY_CURL);  
}
