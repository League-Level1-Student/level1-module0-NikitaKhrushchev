int ballX = 250;
 PImage backgroundImage;
int ballY = 250;
int dir = 0;
int dir2 = 0;
int speed = 5;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup(){
  backgroundImage = loadImage("pong.png");
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav",128);
size(500, 500);
background(125,125,125);
}
void draw(){
  
background(125,125,125);
image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
fill(250,0,0);
stroke(0,250,0);
ellipse(ballX,ballY, 30,30);
fill(0,0,250);
rect(mouseX, 495, 30, 10);
if (dir == 1){
  ballX += speed + random(0,5);
  if (ballX > 495){
    dir = 2;
    sound.trigger();
  }
}
else{
ballX -= speed + random(0,5);
if (ballX < 5){
    dir2 = 1;
    sound.trigger();
  }
}
if (dir2 == 1){
  ballY += speed + random(0,5);
  if (ballY > 495){
    dir2 = 2;
    sound.trigger();
  }
}
else{
ballY -= speed + random(0,5);
if (ballY < 5){
    dir2 = 1;
    sound.trigger();
  }
}
//if (ballX>0){
//ballX -= 3;
if (intersects(ballX,ballY, mouseX, 495,30) == true){
  
}
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
